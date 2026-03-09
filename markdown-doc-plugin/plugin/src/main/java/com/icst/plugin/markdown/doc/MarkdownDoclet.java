/*
 *  This file is part of Block IDLE.
 *
 *  Block IDLE is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  Block IDLE is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *   along with Block IDLE.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.icst.plugin.markdown.doc;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import javax.lang.model.SourceVersion;
import javax.lang.model.element.*;

import com.sun.source.doctree.DocCommentTree;
import com.sun.source.doctree.DocTree;
import com.sun.source.doctree.LinkTree;
import com.sun.source.doctree.ParamTree;
import com.sun.source.doctree.ReturnTree;

import jdk.javadoc.doclet.Doclet;
import jdk.javadoc.doclet.DocletEnvironment;
import jdk.javadoc.doclet.Reporter;

public class MarkdownDoclet implements Doclet {
	private static String outputDir = "build/markdown-docs";
	private DocletEnvironment environment;

	@Override
	public void init(Locale locale, Reporter reporter) {
	}

	@Override
	public String getName() {
		return "MarkdownDoclet";
	}

	@Override
	public Set<Option> getSupportedOptions() {
		return Set.of(
				new Option() {

					@Override
					public int getArgumentCount() {
						return 1;
					}

					@Override
					public String getDescription() {
						return "Output directory for markdown files";
					}

					@Override
					public Option.Kind getKind() {
						return Option.Kind.STANDARD;
					}

					@Override
					public List<String> getNames() {
						return List.of("-outputDir");
					}

					@Override
					public String getParameters() {
						return "<directory>";
					}

					@Override
					public boolean process(String option, List<String> arguments) {
						outputDir = arguments.get(0);
						return true;
					}
				});
	}

	@Override
	public SourceVersion getSupportedSourceVersion() {
		return SourceVersion.latest();
	}

	@Override
	public boolean run(DocletEnvironment environment) {
		this.environment = environment;

		for (Element element : environment.getIncludedElements()) {
			if (element.getKind() == ElementKind.CLASS) {
				try {
					generateMarkdownForClass((TypeElement) element);
				} catch (IOException e) {
					e.printStackTrace();
					return false; // fail doclet
				}
			}
		}

		return true;
	}

	private void generateMarkdownForClass(TypeElement classElement) throws IOException {
		String className = classElement.getSimpleName().toString();
		String packageName = environment
				.getElementUtils()
				.getPackageOf(classElement)
				.getQualifiedName()
				.toString();

		Path outputPath = createOutputPath(packageName, className);

		try (BufferedWriter writer = Files.newBufferedWriter(outputPath)) {

			writeClassHeader(writer, classElement, className);

			writer.write("## Methods");
			writer.newLine();
			writer.newLine();

			for (Element enclosed : classElement.getEnclosedElements()) {
				if (enclosed.getKind() == ElementKind.METHOD) {
					writeMethod(writer, (ExecutableElement) enclosed);
				}
			}
		}
	}

	private Path createOutputPath(String packageName, String className) throws IOException {
		Path baseDir = Paths.get(outputDir);
		Path packageDir = baseDir.resolve(packageName.replace('.', '/'));
		Files.createDirectories(packageDir);
		return packageDir.resolve(className + ".md");
	}

	private void writeClassHeader(BufferedWriter writer, TypeElement classElement, String className)
			throws IOException {

		// Extract class-level Javadoc
		var docTree = environment.getDocTrees().getDocCommentTree(classElement);
		String classDescription = "";
		if (docTree != null) {
			classDescription = parseDocTree(docTree.getFullBody());
		}

		// Generate YAML frontmatter
		writer.write("---");
		writer.newLine();
		writer.write("title: \"" + escapeForClassHeader(className) + "\"");
		writer.newLine();

		if (!classDescription.isBlank()) {
			// Take first 1-2 lines for description
			String summary = classDescription.split("\\.")[0] + ".";
			writer.write("description: \"" + escapeForClassHeader(summary.trim()) + "\"");
			writer.newLine();
		}

		writer.write("package: \"" + escapeForClassHeader(
				environment.getElementUtils()
						.getPackageOf(classElement)
						.getQualifiedName()
						.toString())
				+ "\"");
		writer.newLine();
		writer.write("---");
		writer.newLine();
		writer.newLine();

		// Add class header
		writer.write("# " + className);
		writer.newLine();
		writer.newLine();

		// Write full class description after frontmatter
		if (!classDescription.isBlank()) {
			writer.write(escape(classDescription));
			writer.newLine();
			writer.newLine();
		}

		writer.newLine();
		writer.newLine();
	}

	private String escapeForClassHeader(String input) {
		return input.replace("\"", "\\\"")
				.replaceAll("\\{@\\w+\\s+(.*?)\\}", "$1");
	}

	private void writeMethod(BufferedWriter writer, ExecutableElement method) throws IOException {
		var methodDoc = environment.getDocTrees().getDocCommentTree(method);

		StringBuilder signature = new StringBuilder("### ");
		signature.append(method.getSimpleName());
		writer.write(signature.toString());
		writer.newLine();
		writer.newLine();

		writeMethodDescription(writer, methodDoc);
		writeMethodParams(writer, methodDoc, method);
		writeMethodReturn(writer, methodDoc);
		writeMethodSignature(writer, method);
	}

	private void writeMethodDescription(BufferedWriter writer, DocCommentTree methodDoc)
			throws IOException {
		if (methodDoc != null) {
			String mainDescription = parseDocTree(methodDoc.getFullBody());

			if (!mainDescription.isBlank()) {
				writer.write(escape(mainDescription));
				writer.newLine();
				writer.newLine();
			}
		}
	}

	private void writeMethodParams(
			BufferedWriter writer, DocCommentTree methodDoc, ExecutableElement method)
			throws IOException {
		if (methodDoc == null)
			return;

		for (DocTree tag : methodDoc.getBlockTags()) {
			if (tag.getKind() == DocTree.Kind.PARAM) {
				ParamTree paramTag = (ParamTree) tag;
				String paramName = paramTag.getName().getName().toString();

				VariableElement paramElement = method.getParameters().stream()
						.filter(p -> p.getSimpleName().contentEquals(paramName))
						.findFirst()
						.orElse(null);

				String simpleType = paramElement != null
						? paramElement.asType().toString().replaceAll(".+\\.", "")
						: "Unknown";

				String paramDesc = parseDocTree(paramTag.getDescription());

				writer.write("- `" + paramName + "`: `" + simpleType + "` — " + escape(paramDesc));
				writer.newLine();
			}
		}
		writer.newLine();
	}

	private String parseDocTree(List<? extends DocTree> docTrees) {
		StringBuilder sb = new StringBuilder();

		for (DocTree tree : docTrees) {
			sb.append(parseDocTreeItem(tree));
		}

		return sb.toString().trim();
	}

	public String parseDocTreeItem(DocTree tree) {
		switch (tree.getKind()) {
			case LINK:
				LinkTree linkTree = (LinkTree) tree;
				String signature = linkTree.getReference().getSignature();
				return new StringBuilder("<LinkRef name=\"").append(signature).append("\" />").toString();
			case RETURN:
				ReturnTree returnTree = (ReturnTree) tree;
				return parseDocTree(returnTree.getDescription());
			default:
				return tree.toString();
		}
	}

	private void writeMethodReturn(BufferedWriter writer, DocCommentTree methodDoc)
			throws IOException {
		if (methodDoc == null)
			return;

		for (DocTree tag : methodDoc.getBlockTags()) {
			if (tag.getKind() == DocTree.Kind.RETURN) {
				String returnDesc = parseDocTreeItem(tag);
				writer.write("- `return`: " + escape(returnDesc));
				writer.newLine();
			}
		}
		writer.newLine();
	}

	private void writeMethodSignature(BufferedWriter writer, ExecutableElement method)
			throws IOException {
		StringBuilder signature = new StringBuilder();
		signature.append(method.getSimpleName()).append("(");

		for (int i = 0; i < method.getParameters().size(); i++) {
			VariableElement param = method.getParameters().get(i);
			String fullType = param.asType().toString();
			String simpleType = fullType.contains(".")
					? fullType.substring(fullType.lastIndexOf('.') + 1)
					: fullType;

			signature.append(simpleType).append(" ").append(param.getSimpleName());
			if (i < method.getParameters().size() - 1)
				signature.append(", ");
		}
		signature.append(")");

		writer.write("```java");
		writer.newLine();
		writer.write(signature.toString());
		writer.newLine();
		writer.write("```");
		writer.newLine();
		writer.newLine();
	}

	private String escape(String input) {
		return input.replaceAll("\\{@code\\s+([^}]+)\\}", "`$1`")
				.replace("\\", "\\\\")
				.replace("${", "\\${")
				.replace("{", "\\{")
				.replace("@", "\\@")
				.replace("}", "\\}");
	}
}

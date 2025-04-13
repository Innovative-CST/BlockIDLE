package com.icst.blockidle;

import java.io.IOException;
import java.io.Writer;
import java.util.*;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.*;
import javax.lang.model.util.Elements;
import javax.tools.Diagnostic;
import javax.tools.JavaFileObject;

@SupportedAnnotationTypes({ "com.icst.blockidle.Extension", "com.icst.blockidle.ExtensionItem" })
@SupportedSourceVersion(SourceVersion.RELEASE_17)
public class ExtensionProcessor extends AbstractProcessor {

	private Filer filer;
	private Messager messager;
	private Elements elementUtils;

	@Override
	public synchronized void init(ProcessingEnvironment processingEnv) {
		super.init(processingEnv);
		filer = processingEnv.getFiler();
		messager = processingEnv.getMessager();
		elementUtils = processingEnv.getElementUtils();
	}

	@Override
	public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
		boolean error = false;
		for (Element element : roundEnv.getElementsAnnotatedWith(ExtensionItem.class)) {
			ExecutableElement method = ((ExecutableElement) element);
			if (method.getEnclosingElement().getAnnotation(Extension.class) == null) {
				String methodName = method.getSimpleName().toString();
				String classNameOfMethod = element.getEnclosingElement().getSimpleName().toString();
				String errorMessage = "Method".concat(methodName).concat(" is annotated with @ExtensionItem but ")
						.concat(classNameOfMethod).concat(" class is not annotated with @Extension");
				messager.printMessage(Diagnostic.Kind.ERROR, errorMessage, element);
				error = true;
			}
		}

		if (error) {
			return error;
		}
		for (Element element : roundEnv.getElementsAnnotatedWith(Extension.class)) {

			TypeElement classElement = (TypeElement) element;
			String className = classElement.getSimpleName().toString();
			String packageName = elementUtils.getPackageOf(classElement).getQualifiedName().toString();
			String generatedClassName = className + "ExtensionOutputStream";

			try {
				JavaFileObject file = filer.createSourceFile(packageName + "." + generatedClassName);
				try (Writer writer = file.openWriter()) {
					classWriter(writer, packageName, generatedClassName, classElement);
				}
			} catch (Exception e) {
				String errorMessage = "Failed to write class: ".concat(e.getMessage());
				messager.printMessage(Diagnostic.Kind.ERROR, errorMessage);
			}
		}

		return true;
	}

	public static void classWriter(Writer writer, String packageName, String generatedClassName,
			TypeElement classElement) throws IOException {
		writer.write("package " + packageName + ";\n\n");
		writer.write("public class " + generatedClassName + " {\n");
		writer.write("\tpublic static void generateExtension(java.io.File file) {\n");
		writer.write("\t\tExtensionZipOutputStream mExtensionZipOutputStream = new ExtensionZipOutputStream(file);\n");
		for (Element enclosed : classElement.getEnclosedElements()) {
			if (enclosed.getAnnotation(ExtensionItem.class) == null)
				continue;
			writer.write("\t\tmExtensionZipOutputStream.writeObjectToZipEntry(".concat("\"")
					.concat(enclosed.getAnnotation(ExtensionItem.class).extensionItemName()).concat("\", ")
					.concat(enclosed.getSimpleName().toString()).concat("());\n"));
		}
		writer.write("\tmExtensionZipOutputStream.close();\n");
		writer.write("\t}\n");
		writer.write("}\n");
	}
}

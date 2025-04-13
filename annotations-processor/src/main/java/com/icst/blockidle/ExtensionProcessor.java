package com.icst.blockidle;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.*;
import javax.lang.model.util.Elements;
import javax.tools.Diagnostic;
import javax.tools.JavaFileObject;
import java.io.Writer;
import java.util.*;

@SupportedAnnotationTypes({"com.icst.blockidle.Extension", "com.icst.blockidle.ExtensionItem"})
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
	
		for (Element element : roundEnv.getElementsAnnotatedWith(ExtensionItem.class)) {
			ExecutableElement method = ((ExecutableElement)element.getEnclosingElement());
			if(method.getAnnotation(Extension.class) == null) {
				messager.printMessage(Diagnostic.Kind.ERROR, "Method " + method.getSimpleName().toString() + " is annotated with @ExtensionItem but " + element.getClass().getSimpleName() + " class is not annotated with @Extension", element);
			}
			
		}
		
        for (Element element : roundEnv.getElementsAnnotatedWith(Extension.class)) {
			
            TypeElement classElement = (TypeElement) element;
            String className = classElement.getSimpleName().toString();
            String packageName =
                    elementUtils.getPackageOf(classElement).getQualifiedName().toString();
            String generatedClassName = className + "ExtensionOutputStream";

            try {
                JavaFileObject file = filer.createSourceFile(packageName + "." + generatedClassName);
                try (Writer writer = file.openWriter()) {
                    writer.write("package " + packageName + ";\n\n");
                    writer.write("public class " + generatedClassName + " {\n");
                    writer.write("    public static void generateExtension() {\n");
                    writer.write(
                            "        ExtensionZipOutputStream mExtensionZipOutputStream = new ExtensionZipOutputStream();\n");
                    for (Element enclosed : classElement.getEnclosedElements()) {
                        if (enclosed.getKind() == ElementKind.METHOD
                                && enclosed.getAnnotation(ExtensionItem.class) != null) {
                            writer.write(
                                    "        mExtensionZipOutputStream.writeObjectToZipEntry("
                                            + "\""
                                            + enclosed.getAnnotation(ExtensionItem.class)
                                                    .extensionItemName()
                                            + "\", "
                                            + enclosed.getSimpleName().toString()
                                            + "());\n");
                        }
                    }
					writer.write("        mExtensionZipOutputStream.close();\n");
                    writer.write("    }\n");
                    writer.write("}\n");
                }
            } catch (Exception e) {
                messager.printMessage(
                        Diagnostic.Kind.ERROR, "Failed to write class: " + e.getMessage());
            }
        }

        return true;
    }
}

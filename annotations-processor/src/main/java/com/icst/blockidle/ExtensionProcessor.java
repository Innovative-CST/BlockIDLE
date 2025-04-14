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

package com.icst.blockidle;

import java.io.IOException;
import java.io.Writer;
import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Filer;
import javax.annotation.processing.Messager;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.TypeElement;
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
        // Process ExtensionItem
        if (processExtensionItem(roundEnv)) return true;
        
        //Process Extension
        if (processExtension(roundEnv)) return true;
        
        
        try {
            JavaFileObject file = filer.createSourceFile("com.icst.blockidle.extension.ExtensionsZipWriter");
            try (Writer writer = file.openWriter()){
                
                StringBuilder generateMethodsCodeBlock = new StringBuilder();
                StringBuilder importsCodeBlock = new StringBuilder();
                
                for (Element element : roundEnv.getElementsAnnotatedWith(Extension.class)) {
                    
                    TypeElement classElement = (TypeElement) element;
                    String className = classElement.getSimpleName().toString();
                    String packageName = elementUtils.getPackageOf(classElement).getQualifiedName().toString();
                    String generatedClassName = className + "ExtensionOutputStream";
                    
                    importsCodeBlock.append("import ".concat(packageName).concat(".").concat(generatedClassName).concat(";\n"));
                    generateMethodsCodeBlock.append("\t\t".concat(generatedClassName).concat(".generateExtension(outputFolder);\n"));
                }
                
                writer.write("package com.icst.blockidle.extension;\n\n");
                writer.write(importsCodeBlock.toString());
                writer.write("\n");
                writer.write("public class ExtensionsZipWriter {\n");
                writer.write("\tpublic static void main(String[] args) {\n");
                writer.write("java.io.File outputFolder = new java.io.File(args[0]);");
                writer.write(generateMethodsCodeBlock.toString());
                writer.write("\t}\n\n}\n");
            }
            
        } catch(IOException e) {
            messager.printMessage(Diagnostic.Kind.ERROR, "Failed to create ExtensionsZipWriter " + e.getMessage());
        }
        
        return true;
    }
    
    private boolean processExtensionItem(RoundEnvironment roundEnv) {
        boolean error = false;
        
        // Process ExtensionItem
        for (Element element : roundEnv.getElementsAnnotatedWith(ExtensionItem.class)) {
            if (!(element instanceof ExecutableElement)) {
                messager.printMessage(Diagnostic.Kind.ERROR,
                  "@ExtensionItem can only be applied to methods.",
                  element);
                error = true;
                
                continue;
            }
            
            ExecutableElement method = ((ExecutableElement) element);
            if (method.getEnclosingElement().getAnnotation(Extension.class) == null) {
                String methodName = method.getSimpleName().toString();
                String classNameOfMethod = element.getEnclosingElement().getSimpleName().toString();
                String errorMessage = "Method ".concat(methodName).concat(" is annotated with @ExtensionItem but ")
                        .concat(classNameOfMethod).concat(" class is not annotated with @Extension");
                messager.printMessage(Diagnostic.Kind.ERROR, errorMessage, element);
                error = true;
            }
            
            if (!method.getModifiers().contains(Modifier.STATIC)) {
                String methodName = method.getSimpleName().toString();
                String errorMessage = methodName.concat(" is annotated with @ExtensionItem so must be static.");
                messager.printMessage(Diagnostic.Kind.ERROR, errorMessage, element);
                error = true;
            }
            
            if (!processingEnv.getTypeUtils().isAssignable(method.getReturnType(),
                    elementUtils.getTypeElement("java.io.Serializable").asType())) {
                String methodName = method.getSimpleName().toString();
                String errorMessage = methodName
                        .concat(" is annotated with @ExtensionItem so it must return a object that can be serialised.");
                messager.printMessage(Diagnostic.Kind.ERROR, errorMessage, element);
                error = true;
            }
            
            if (!method.getParameters().isEmpty()) {
                String methodName = method.getSimpleName().toString();
                String errorMessage = methodName
                        .concat(" is annotated with @ExtensionItem so it must be a parameterless method.");
                messager.printMessage(Diagnostic.Kind.ERROR, errorMessage, element);
                error = true;
            }
        }
        
        return error;
    }
    
    private boolean processExtension(RoundEnvironment roundEnv) {
        boolean error = false;
        
        //Process Extension
        for (Element element : roundEnv.getElementsAnnotatedWith(Extension.class)) {
            if (!(element instanceof TypeElement)) {
                messager.printMessage(Diagnostic.Kind.ERROR,
                  "@Extension can only be applied to classes.",
                  element);
                error = true;
                
                continue;
            }
            
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
                error = true;
            }
        }
        
        return error;
    }
    
    
    
    public static void classWriter(Writer writer, String packageName, String generatedClassName,
                                   TypeElement classElement) throws IOException {
        writer.write("package " + packageName + ";\n\n");
        writer.write("import java.io.File;\n\n");
        writer.write("public class " + generatedClassName + " {\n");
        writer.write("\tpublic static void generateExtension(File file) {\n");
        writer.write("\t\tExtensionZipOutputStream mExtensionZipOutputStream = new ExtensionZipOutputStream(new File(file, ");
        writer.write("\"".concat(classElement.getAnnotation(Extension.class).extensionFileName()).concat("\""));
        writer.write("));\n");
        for (Element enclosed : classElement.getEnclosedElements()) {
            if (enclosed.getAnnotation(ExtensionItem.class) == null)
                continue;
            writer.write("\t\tmExtensionZipOutputStream.writeObjectToZipEntry(".concat("\"")
                    .concat(enclosed.getAnnotation(ExtensionItem.class).extensionItemName()).concat("\", ")
                    .concat(enclosed.getEnclosingElement().getSimpleName().toString()).concat(".")
                    .concat(enclosed.getSimpleName().toString()).concat("());\n"));
        }
        writer.write("\t\tmExtensionZipOutputStream.close();\n");
        writer.write("\t}\n");
        writer.write("}\n");
    }
}

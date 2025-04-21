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

import com.google.testing.compile.*;
import com.google.testing.compile.Compiler;
import org.junit.Test;

import java.io.File;

import static com.google.testing.compile.CompilationSubject.assertThat;
import static org.junit.Assert.fail;

public class extensionProcessorTester {



    @Test
    public void testInvalidAnnotationUsage() {
        //the class doesn't have the @Extension annotation
        String sourceCode1 = """
            package test;

            import com.icst.blockidle.Extension;
            import com.icst.blockidle.ExtensionItem;
            import java.io.Serializable;

            public class MyTestClass {
               @ExtensionItem(extensionItemName = "")
               public static String myValidMethod() {
                   return "TestValue";
            }
        }
        """;

        //the method has parameters
        String sourceCode2 = """
            package test;

            import com.icst.blockidle.Extension;
            import com.icst.blockidle.ExtensionItem;
            import java.io.Serializable;

            @Extension(extensionFileName = "")
            public class MyTestClass {
               @ExtensionItem(extensionItemName = "")
               public static String myValidMethod(String param) {
                   System.out.println(param);
                   return "TestValue";
            }
        }
        """;

        //the method is not public
        String sourceCode3 = """
            package test;

            import com.icst.blockidle.Extension;
            import com.icst.blockidle.ExtensionItem;
            import java.io.Serializable;

            @Extension(extensionFileName = "")
            private class MyTestClass {
               @ExtensionItem(extensionItemName = "")
               public static String myValidMethod() {
                   return "TestValue";
            }
        }
        """;

        //the method has bad return type/doesn't return anything
        String sourceCode4 = """
            package test;

            import com.icst.blockidle.Extension;
            import com.icst.blockidle.ExtensionItem;
            import java.io.Serializable;

            @Extension(extensionFileName = "")
            public class MyTestClass {
               @ExtensionItem(extensionItemName = "")
               public static void myValidMethod() {
               System.out.println("something");
            }
        }
        """;

        //the method is not static
        String sourceCode5 = """
            package test;

            import com.icst.blockidle.Extension;
            import com.icst.blockidle.ExtensionItem;
            import java.io.Serializable;

            @Extension(extensionFileName = "")
            public class MyTestClass {
               @ExtensionItem(extensionItemName = "")
               public String myValidMethod() {
                   return "TestValue";
            }
        }
        """;


        Compilation compilationNoAnnotation = Compiler.javac()
                .withProcessors(new ExtensionProcessor())
                .compile(JavaFileObjects.forSourceString(
                        "test.MyTestClass", sourceCode1
                ));

        Compilation compilationHasParameters = Compiler.javac()
                .withProcessors(new ExtensionProcessor())
                        .compile(JavaFileObjects.forSourceString(
                                "test.MyTestClass", sourceCode2
                        ));

        Compilation compilationNotPublic = Compiler.javac()
                .withProcessors(new ExtensionProcessor())
                        .compile(JavaFileObjects.forSourceString(
                            "test.MyTestClass", sourceCode3
                        ));

        Compilation compilationBadReturnType = Compiler.javac()
                .withProcessors(new ExtensionProcessor())
                        .compile(JavaFileObjects.forSourceString(
                                "test.MyTestClass", sourceCode4
                        ));

        Compilation compilationNotStatic = Compiler.javac()
                .withProcessors(new ExtensionProcessor())
                        .compile(JavaFileObjects.forSourceString(
                                "test.MyTestClass", sourceCode5
                        ));

        // Asserting the compilations
        assertThat(compilationNoAnnotation).failed();
        assertThat(compilationHasParameters).failed();
        assertThat(compilationNotPublic).failed();
        assertThat(compilationBadReturnType).failed();
        assertThat(compilationNotStatic).failed();
    }

    @Test
    public void testValidAnnotationUsage() {
        // Valid annotated class and method
        String sourceCode = """
                package com.icst.blockidle.extension;

                import com.icst.blockidle.Extension;
                import com.icst.blockidle.ExtensionItem;

                @Extension(extensionFileName = "MyClass") // The class is annotated with @Extension
                public class MyClass {

                    // A valid method annotated with @ExtensionItem
                    @ExtensionItem(extensionItemName = "exampleItem")
                    public static String myMethod() { // The method is static, has no parameters, and returns a valid type
                        return "Hello, world!";
                    }
                }
                """;

        Compilation compilation = Compiler.javac()
                .withProcessors(new ExtensionProcessor()) // Pass a new instance of your processor
                .compile(JavaFileObjects.forSourceString(
                        "com.icst.blockidle.extension.MyClass", sourceCode));

        // Assert that the compilation succeeds
        assertThat(compilation).succeeded();

        // Optionally, check the generated source file
        assertThat(compilation)
                .generatedSourceFile("com.icst.blockidle.extension.MyClassExtensionOutputStream")
                .contentsAsUtf8String()
                .contains("package com.icst.blockidle.extension;");
        
        File zipFile = new File("BlockIDLE/extensions/build/extensions/MyClass");
        if (!zipFile.exists()) fail();
    }
}

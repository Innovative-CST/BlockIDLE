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

import java.io.*;
import java.io.File;
import java.util.ArrayList;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParserConfiguration;
import com.github.javaparser.ast.body.*;
import com.github.javaparser.symbolsolver.JavaSymbolSolver;
import com.github.javaparser.symbolsolver.resolution.typesolvers.AarTypeSolver;
import com.github.javaparser.symbolsolver.resolution.typesolvers.CombinedTypeSolver;
import com.github.javaparser.symbolsolver.resolution.typesolvers.JarTypeSolver;
import com.github.javaparser.symbolsolver.resolution.typesolvers.JavaParserTypeSolver;
import com.icst.blockidle.bean.BlockBean;
import com.icst.blockidle.bean.BlockPaletteBean;

public class BlocksGenerator {

	public static void generateBlocks(File[] mClasses, String[] colors, String[] paletteNames, String[] entryNames,
			File[] sourceCode, File[] jarFiles, File[] aarFiles, File outputFile) {

		ArrayList<BlockBean> blocks = new ArrayList<BlockBean>();
		ExtensionZipOutputStream os = new ExtensionZipOutputStream(outputFile);

		CombinedTypeSolver combinedTypeSolver = new CombinedTypeSolver();
		for (File file : sourceCode) {
			combinedTypeSolver.add(new JavaParserTypeSolver(file.toPath(),
					new ParserConfiguration().setLanguageLevel(ParserConfiguration.LanguageLevel.JAVA_17)));
		}

		if (jarFiles != null) {
			for (File file : jarFiles) {
				try {
					combinedTypeSolver.add(new JarTypeSolver(file));
				} catch (IOException e) {
				}
			}
		}

		if (aarFiles != null) {
			for (File file : aarFiles) {
				try {
					combinedTypeSolver.add(new AarTypeSolver(file));
				} catch (IOException e) {
				}
			}
		}
		// Configure parser with symbol solver
		ParserConfiguration config = new ParserConfiguration();
		config.setSymbolResolver(new JavaSymbolSolver(combinedTypeSolver));
		config.setLanguageLevel(ParserConfiguration.LanguageLevel.JAVA_17);

		JavaParser parser = new JavaParser(config);

		for (int i = 0; i < mClasses.length; ++i) {
			File mClass = mClasses[i];
			String color = colors[i];
			String paletteName = paletteNames[i];
			String entryName = entryNames[i];
			try {
				parser.parse(mClass).ifSuccessful(cu -> {

					cu.findAll(ClassOrInterfaceDeclaration.class).forEach(clazz -> {
						System.out.println("Creating blocks for class " + clazz.resolve().getQualifiedName());
						clazz.getMethods().forEach(method -> {
							if (method.isPublic() || method.isProtected()) {
								BlockBean block = MethodBlocksGenerator.generateBlockForMethod(method, color);

								if (block != null) {
									blocks.add(block);
								} else {
									System.err.println(method.getNameAsString() + " - block failed to create");
								}
							}
						});

						clazz.getConstructors().forEach(constructor -> {
							if (constructor.isPublic() || constructor.isProtected()) {
								BlockBean block = ConstructorBlockGenerator.generateBlockForConstructor(constructor,
										color);

								if (block != null) {
									blocks.add(block);
								} else {
									System.err.println(constructor.getNameAsString() + " - block failed to create");
								}
							}
						});
					});
				});
			} catch (Exception e) {
			}

			BlockPaletteBean mPalette = new BlockPaletteBean();
			mPalette.setColor(color);
			mPalette.setName(paletteName);
			mPalette.setBlocks(blocks);
			os.writeObjectToZipEntry(entryName, mPalette);
			blocks.clear();
		}
		os.close();
	}
}

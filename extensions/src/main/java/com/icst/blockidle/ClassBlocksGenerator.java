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

import java.io.File;

public class ClassBlocksGenerator {

	public static void execute(File outputFolder, String[] args) {
		File openJdkSource = new File(args[1]);
		File androidSdk = new File(args[2]);
		File appCompat = new File(args[3]);
		
		BlocksGenerator.generateBlocks(
				new File[] { new File(appCompat, "androidx/appcompat/app/AppCompatActivity.java") },
				new String[] { "#3366CC" },
				new String[] { "AppCompatActivity" },
				new String[] { "block_palette/appcompatactivity" },
				new File[] { androidSdk, appCompat }, null, null,
				new File(outputFolder, "Appcompat-1.7.0.bidle"));

        BlocksGenerator.generateBlocks(
				new File[] { new File(androidSdk, "android/app/Activity.java") },
				new String[] { "#FF0033" },
				new String[] { "Activity" },
				new String[] { "block_palette/activity" },
				new File[] { androidSdk }, null, null,
				new File(outputFolder, "android-sdk-35.bidle"));

		BlocksGenerator.generateBlocks(
				new File[] {
						new File(openJdkSource, "java.base/java/lang/String.java"),
						new File(openJdkSource, "java.base/java/lang/Byte.java"),
						new File(openJdkSource, "java.base/java/lang/Short.java"),
						new File(openJdkSource, "java.base/java/lang/Integer.java"),
						new File(openJdkSource, "java.base/java/lang/Long.java"),
						new File(openJdkSource, "java.base/java/lang/Float.java"),
						new File(openJdkSource, "java.base/java/lang/Double.java"),
						new File(openJdkSource, "java.base/java/lang/Character.java"),
						new File(openJdkSource, "java.base/java/lang/Boolean.java")
				},
				new String[] {
						"#36D954", // String
						"#A65CFF", // Byte
						"#FF5CA5", // Short
						"#5CA9FF", // Integer
						"#FFAC5C", // Long
						"#5CFFC1", // Float
						"#FF5C5C", // Double
						"#5C5CFF", // Character
						"#FFD95C" // Boolean
				},
				new String[] {
						"String",
						"Byte",
						"Short",
						"Integer",
						"Long",
						"Float",
						"Double",
						"Character",
						"Boolean"
				},
				new String[] {
						"block_palette/string",
						"block_palette/byte",
						"block_palette/short",
						"block_palette/integer",
						"block_palette/long",
						"block_palette/float",
						"block_palette/double",
						"block_palette/character",
						"block_palette/boolean"
				},
				new File[] { new File(openJdkSource, "java.base") },
				null,
				null,
				new File(outputFolder, "BaseDatatypes.bidle"));

		BlocksGenerator.generateBlocks(
				new File[] { new File(openJdkSource, "java.base/java/lang/System.java") },
				new String[] { "#009688" },
				new String[] { "System" },
				new String[] { "block_palette/system" },
				new File[] { new File(openJdkSource, "java.base") }, null, null,
				new File(outputFolder, "SystemExtension.bidle"));

		BlocksGenerator.generateBlocks(
				new File[] { new File(openJdkSource, "java.base/java/lang/Object.java") },
				new String[] { "#009688" },
				new String[] { "Object" },
				new String[] { "block_palette/object" },
				new File[] { new File(openJdkSource, "java.base") }, null, null,
				new File(outputFolder, "ObjectExtension.bidle"));

		BlocksGenerator.generateBlocks(
				new File[] { new File(openJdkSource, "java.base/java/util/ArrayList.java") },
				new String[] { "#5362FB" },
				new String[] { "ArrayList" },
				new String[] { "block_palette/array_list" },
				new File[] { new File(openJdkSource, "java.base") }, null, null,
				new File(outputFolder, "ArrayListExtension.bidle"));
	}
}

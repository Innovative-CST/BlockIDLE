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

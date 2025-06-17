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

package com.icst.blockidle.bean.utils;

/**
 * Utility class providing methods for formatting and analyzing code strings, such as generating
 * syntax keys, applying indentation, and calculating indentation levels.
 *
 * <p>This class is not intended to be instantiated or extended.
 */
public final class CodeFormatterUtils {

	/**
	 * Formats the given key as a custom syntax string in the format {@code <CodeKey : key>} which
	 * is used by Block IDLE application.
	 *
	 * @param key the key to be wrapped in the syntax format
	 * @return a formatted string containing the given key
	 */
	public static String getKeySyntaxString(String key) {
		return new String("<CodeKey : ").concat(key).concat(">");
	}

	/**
	 * Adds tab-based indentation to each line of the given code string.
	 *
	 * <p>The first line is kept as-is, and all subsequent lines are prefixed with the specified
	 * number of tab characters. Read {@link #getIntendation} to know why intendation is nog applied
	 * to first line.
	 *
	 * @param code the multi-line code string to format
	 * @param intendation the number of tab characters to prepend to each line (except the first)
	 * @return the indented code string
	 */
	public static String addIntendation(String code, int intendation) {
		StringBuilder intendedCode = new StringBuilder();
		String[] lines = code.split("\n");
		for (int i = 0; i < lines.length; ++i) {
			String line = lines[i];
			if (i != 0) {
				intendedCode.append("\t".repeat(intendation));
			}
			intendedCode.append(line);
			intendedCode.append("\n");
		}
		return intendedCode.toString();
	}

	/**
	 * Calculates the indentation (leading space count) of the first line in the given code that
	 * contains the specified item.
	 *
	 * @param codeSyntax the full code block to search through
	 * @param item the string to locate in the code
	 * @return the number of leading spaces (indentation level) before the item, or {@code 0} if the
	 *     item is not found
	 */
	public static int getIntendation(String codeSyntax, String item) {

		String[] codeLines = codeSyntax.split("\n");
		for (String line : codeLines) {
			if (line.contains(item)) {
				int spaceCount = line.indexOf(item);
				return spaceCount;
			}
		}

		return 0;
	}
}

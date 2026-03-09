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

package com.icst.blockidle.util;

import java.util.Set;
import java.util.regex.Pattern;

public class JavaValidators {

	// TODO: To be completed for java class name validation.
	public static final String JAVA_CLASS_NAME_REGEX = "^[A-Z\\$_][a-zA-Z0-9_\\$]*$";

	public static final boolean isValidJavaClassName(String className) {
		if (className == null) {
			return false;
		}

		if (!Pattern.compile(JAVA_CLASS_NAME_REGEX).matcher(className).matches()) {
			return false;
		}

		// Copied from https://stackoverflow.com/questions/24265110/get-a-list-of-all-java-reserved-keywords
		Set<String> reservedKeywords = Set.of("abstract", "assert", "boolean",
				"break", "byte", "case", "catch", "char", "class", "const",
				"continue", "default", "do", "double", "else", "extends", "false",
				"final", "finally", "float", "for", "goto", "if", "implements",
				"import", "instanceof", "int", "interface", "long", "native",
				"new", "null", "package", "private", "protected", "public",
				"return", "short", "static", "strictfp", "super", "switch",
				"synchronized", "this", "throw", "throws", "transient", "true",
				"try", "void", "volatile", "while");

		if (reservedKeywords.contains(className)) {
			return false;
		}

		return true;
	}
}

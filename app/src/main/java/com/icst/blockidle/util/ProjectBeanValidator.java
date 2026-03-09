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

public class ProjectBeanValidator {

	public static final String PACKAGE_NAME_REGEX = "^[a-zA-Z][a-zA-Z0-9]*(\\.[a-z][a-z0-9]*(\\_)*[a-z0-9]*)*$";
	private static final String PROJECT_NAME_REGEX = "^[A-Z][a-zA-Z0-9]*$";

	public static final boolean isValidPackageName(String packageName) {
		if (packageName == null || packageName.length() > 255) { // Android package names must be <= 255 chars
			return false;
		}

		if (!Pattern.compile(PACKAGE_NAME_REGEX).matcher(packageName).matches()) {
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

		for (String segment : packageName.split("\\.")) {
			if (reservedKeywords.contains(segment)) {
				return false;
			}
			if (segment.length() > 63) { // Max segment length in a domain name
				return false;
			}
		}

		return true;
	}

	public static boolean isValidProjectName(String projectName) {
		if (projectName == null) {
			return false;
		}

		if (!Pattern.compile(PROJECT_NAME_REGEX).matcher(projectName).matches()) {
			return false;
		}
		return true;
	}

}

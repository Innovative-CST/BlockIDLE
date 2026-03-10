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

import java.util.regex.Pattern;

/**
 * Utility class for validating folder names.
 */
public final class FolderValidators {

	private static final Pattern INVALID_CHARS = Pattern.compile("[\\\\/:*?\"<>|]");

	private FolderValidators() {
	}

	/**
	 * Checks if the folder name is empty.
	 */
	public static boolean isEmpty(String name) {
		return name == null || name.trim().isEmpty();
	}

	/**
	 * Checks for invalid characters in the folder name.
	 */
	public static boolean hasInvalidCharacters(String name) {
		return INVALID_CHARS.matcher(name).find();
	}

	/**
	 * Checks if the folder name length exceeds the limit.
	 */
	public static boolean isTooLong(String name) {
		return name.length() > 255;
	}

	/**
	 * Checks invalid edges.
	 * Allows hidden folders (.git, .config)
	 */
	public static boolean hasInvalidEdges(String name) {

		if (name.startsWith(" ") || name.endsWith(" "))
			return true;

		// Windows restriction
		if (name.endsWith("."))
			return true;

		// Disallow special directory references
		if (name.equals(".") || name.equals(".."))
			return true;

		return false;
	}

	/**
	 * Validates the folder name completely.
	 */
	public static boolean isValid(String name) {

		if (isEmpty(name))
			return false;

		if (hasInvalidCharacters(name))
			return false;

		if (isTooLong(name))
			return false;

		if (hasInvalidEdges(name))
			return false;

		return true;
	}
}
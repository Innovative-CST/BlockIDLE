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

package com.icst.blockidle.bean.enums;

import java.io.Serializable;

/**
 * Represents supported programming languages by a component.
 *
 * Enums in Java are implicitly serializable, but we explicitly declare
 * {@link Serializable} for architectural clarity.
 */
public enum ProgrammingLanguage implements Serializable {

	JAVA, GRADLE;

	public String getId() {
		return name().toLowerCase();
	}

	/**
	 * Returns a ProgrammingLanguage from string safely.
	 *
	 * @param value language name (case-insensitive)
	 * @return matching ProgrammingLanguage
	 * @throws IllegalArgumentException if no match found
	 */
	public static ProgrammingLanguage fromString(String value) {
		return ProgrammingLanguage.valueOf(value.trim().toUpperCase());
	}
}
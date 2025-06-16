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
 * Contains {@code serialVersionUID} constants for bean classes to ensure
 * serialization compatibility across different versions of those classes.
 *
 * These IDs are used during Java object serialization and deserialization
 * to verify that the sender and receiver of a serialized object have loaded
 * classes for that object that are compatible with respect to serialization.
 */

public class BeansUIDConstants {

	/**
	* {@code serialVersionUID} for the {@code ArtifactBean} class.
	* Ensures serialization compatibility.
	*/
	public static final long ARTIFACT_BEAN = 1L;

	/**
	* {@code serialVersionUID} for the {@code DatatypeBean} class.
	* Ensures serialization compatibility.
	*/
	public static final long DATATYPE_BEAN_BEAN = 1L;

	/**
	* {@code serialVersionUID} for the {@code VariableBean} class.
	* Ensures serialization compatibility.
	*/
	public static final long VARIABLE_BEAN = 1L;
}

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

package com.icst.blockidle.bean;

import java.io.Serializable;

/**
 * Represents a Java-related file (e.g., class or interface) in the Block IDLE file system.
 * Extends {@link IDLEFileBean} and implements {@link Serializable}.
 */
public class IDLEJavaFileBean extends IDLEFileBean implements Serializable {

	/** Serial version UID for serialization compatibility. */
	public static final long serialVersionUID = 1;

	/** Constant representing the file type for a Java class file. */
	public static final String FILE_TYPE = "JavaClass";

	/** Constant representing the file type for a Java class file. */
	public static final String JAVA_CLASS = "JavaClass";

	/** Constant representing the file type name for a Java interface. */
	public static final String JAVA_INTERFACE = "JavaInterface";

	/**
	 * Constructs a new {@code IDLEJavaFileBean} with the given file name.
	 *
	 * @param name the name of the Java file
	 */
	public IDLEJavaFileBean(String name) {
		super(name);
	}

	/**
	 * Returns the file type of this Java file, always {@code "JavaClass"}.
	 *
	 * @return a string representing the file type
	 */
	@Override
	public String getFileType() {
		return FILE_TYPE;
	}
}

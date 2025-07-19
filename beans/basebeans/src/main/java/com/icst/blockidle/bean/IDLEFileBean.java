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
 * Represents a base file in the Block IDLE file system. This class serves as a base model for all
 * file-like structures in the system and provides basic metadata such as the file name.
 *
 * <p>This class implements {@link Serializable} to allow instances to be serialized and passed
 * between components or stored persistently.
 */
public class IDLEFileBean implements Serializable {

	/** Serial version UID for serialization compatibility. */
	public static final long serialVersionUID = 1;

	/** The name of the file. */
	protected String name;

	/**
	 * Constructs an {@code IDLEFileBean} with the specified file name.
	 *
	 * @param name the name of the file
	 */
	public IDLEFileBean(String name) {
		this.name = name;
	}

	/**
	 * Returns the file type associated with this file.
	 *
	 * <p>This method can be overridden by subclasses to provide specific file types.
	 *
	 * @return the file type as a string, or an empty string if undefined
	 */
	public String getFileType() {
		return "";
	}
}

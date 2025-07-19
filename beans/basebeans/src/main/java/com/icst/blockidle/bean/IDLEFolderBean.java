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
 * Represents a folder in the Block IDLE file system. This class extends {@link IDLEFileBean} and
 * provides a specific implementation for folder-type files.
 *
 * <p>This class implements {@link Serializable} to allow instances to be serialized and passed
 * between components or stored persistently.
 */
public class IDLEFolderBean extends IDLEFileBean implements Serializable {

	/**
	 * Serial version UID for serialization compatibility.
	 */
	public static final long serialVersionUID = 1;

	/**
	 * Constant representing the file type for this class.
	 */
	public static final String FILE_TYPE = "folder";

	/**
	 * Constructs an {@code IDLEFolderBean} with the specified folder name.
	 *
	 * @param name the name of the folder
	 */
	public IDLEFolderBean(String name) {
		super(name);
	}

	/**
	 * Returns the file type of this object, which is always {@code "folder"}.
	 *
	 * @return a string representing the file type, i.e., {@code "folder"}
	 */
	@Override
	public String getFileType() {
		return FILE_TYPE;
	}
}

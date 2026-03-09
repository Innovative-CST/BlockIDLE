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

import com.icst.blockidle.bean.utils.GradleBeansUIDConstants;

/**
 * Represents a Gradle-related file (e.g., class or interface) in the Block IDLE file system.
 * Extends {@link IDLEFileBean} and implements {@link Serializable}.
 */
public class IDLEGradleFileBean extends IDLEFileBean implements Serializable {

	/** Serial version UID for serialization compatibility. */
	public static final long serialVersionUID = GradleBeansUIDConstants.GRADLE_FILE_BEAN;

	/** Constant representing the file type for a Gradle file. */
	public static final String FILE_TYPE = "GradleFile";

	/**
	 * Constructs a new {@code IDLEGradleFileBean} with the given file name.
	 *
	 * @param name the name of the Gradle file
	 */
	public IDLEGradleFileBean(String name) {
		super(name);
	}

	/**
	 * Returns the file type of this Gradle file, always {@code "Gradle"}.
	 *
	 * @return a string representing the file type
	 */
	@Override
	public String getFileType() {
		return FILE_TYPE;
	}
}

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

import java.io.File;

import com.icst.blockidle.bean.IDLEFileBean;
import com.icst.blockidle.bean.IDLEFolderBean;

/**
 * Represents a generic file entity in the Block IDLE.
 *
 * <p>This class acts as a base abstraction for all IDLE file types such as
 * {@link IDLEFolder}, {@link IDLEGradleFolder}, {@link IDLEGradleModule}, and other custom file types
 * used within the Block IDLE project environment.</p>
 *
 * <p>Each {@code IDLEFile} corresponds to a directory on disk that contains
 * metadata describing the file. The metadata is stored in special marker
 * files defined by {@link ProjectEnvironment#IDLEFILE} or
 * {@link ProjectEnvironment#IDLEFOLDER}.</p>
 *
 * <p>Subclasses extend this class to provide more specialized behavior
 * for different file types within the Block IDLE project structure.</p>
 */
public class IDLEFile {

	protected File file;

	/**
	 * Creates a new {@code IDLEFile} wrapper for the given physical file.
	 *
	 * <p>This constructor does not create the file on disk. It only associates
	 * the provided {@link File} object with the IDLE file abstraction.</p>
	 *
	 * @param file The physical file or directory representing this IDLE file.
	 */
	public IDLEFile(File file) {
		this.file = file;
	}

	/**
	 * Returns the name of this file.
	 *
	 * <p>The returned value corresponds to the name of the underlying
	 * {@link File} object on disk.</p>
	 *
	 * @return The name of the file.
	 */
	public String getFileName() {
		return file.getName();
	}

	/**
	 * Checks whether this IDLE file exists and contains valid metadata.
	 *
	 * <p>The method verifies that the underlying directory exists and then
	 * checks for the presence of either the {@code IDLEFOLDER} or
	 * {@code IDLEFILE} metadata file.</p>
	 *
	 * <p>If the metadata file exists, it attempts to deserialize the
	 * corresponding bean ({@link IDLEFolderBean} or {@link IDLEFileBean}).
	 * The file is considered valid only if deserialization succeeds.</p>
	 *
	 * @return {@code true} if the file exists and contains valid IDLE metadata,
	 *         otherwise {@code false}.
	 */
	public boolean exists() {
		if (!file.exists()) {
			return false;
		}

		File idleFolderFile = new File(file, ProjectEnvironment.IDLEFOLDER);
		File idleFile = new File(file, ProjectEnvironment.IDLEFILE);

		if (idleFolderFile.exists()) {
			IDLEFolderBean fileBean = SerializationUtils.deserialize(idleFolderFile, IDLEFolderBean.class);
			return fileBean != null;
		} else if (idleFile.exists()) {
			IDLEFileBean fileBean = SerializationUtils.deserialize(idleFolderFile, IDLEFileBean.class);
			return fileBean != null;
		} else
			return false;
	}

	/**
	 * Deletes this IDLE file or folder from the file system.
	 *
	 * <p>This method removes the entire directory associated with this
	 * {@code IDLEFile}, including all nested files and folders.</p>
	 *
	 * @return {@code true} if the file was successfully deleted,
	 *         otherwise {@code false}.
	 */
	public boolean delete() {
		return FileUtils.deleteFolder(file);
	}
}

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

public class IDLEFile {

	protected File file;

	public IDLEFile(File file) {
		this.file = file;
	}

	public String getFileName() {
		return file.getName();
	}

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
}

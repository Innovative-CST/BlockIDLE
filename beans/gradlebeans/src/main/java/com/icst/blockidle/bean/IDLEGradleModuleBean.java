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

import com.icst.blockidle.bean.utils.GradleBeansUIDConstants;

public class IDLEGradleModuleBean extends IDLEFolderBean {

	/** Serial version UID for serialization compatibility. */
	public static final long serialVersionUID = GradleBeansUIDConstants.GRADLE_MODULE_BEAN;

	/**
	 * Constant representing the file type for this class.
	 */
	public static final String FILE_TYPE = "GradleModule";

	public IDLEGradleModuleBean(String moduleName) {
		super(moduleName);
	}

	@Override
	public String getFileType() {
		return FILE_TYPE;
	}
}

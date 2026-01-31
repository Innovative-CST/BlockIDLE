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

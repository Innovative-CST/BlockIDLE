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
 * Represents a project with a name, version name, and version number. This class implements {@link
 * Serializable} to allow object serialization.
 *
 * <p>It is used to store and retrieve project details in the application.
 *
 * @version 1.0
 */
public class ProjectBean implements Serializable {

	/** Serial version UID for ensuring compatibility during serialization. */
	public static final long serialVersionUID = 1L;

	private String projectName;
	private String projectVersionName;
	private String projectVersion;
	private String packageName;

	/**
	 * Gets the project name.
	 *
	 * @return the name of the project.
	 */
	public String getProjectName() {
		return this.projectName;
	}

	/**
	 * Sets the project name.
	 *
	 * @param projectName the name of the project to set.
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	/**
	 * Gets the project version name.
	 *
	 * @return the version name of the project.
	 */
	public String getProjectVersionName() {
		return this.projectVersionName;
	}

	/**
	 * Sets the project version name.
	 *
	 * @param projectVersionName the version name of the project to set.
	 */
	public void setProjectVersionName(String projectVersionName) {
		this.projectVersionName = projectVersionName;
	}

	/**
	 * Gets the project version number.
	 *
	 * @return the version number of the project.
	 */
	public String getProjectVersion() {
		return this.projectVersion;
	}

	/**
	 * Sets the project version number.
	 *
	 * @param projectVersion the version number of the project to set.
	 */
	public void setProjectVersion(String projectVersion) {
		this.projectVersion = projectVersion;
	}

	/**
	 * Returns a string representation of the project.
	 *
	 * @return a formatted string containing project details.
	 */
	@Override
	public String toString() {
		return "ProjectBean{"
				+ "projectName='"
				+ projectName
				+ '\''
				+ ", projectVersionName='"
				+ projectVersionName
				+ '\''
				+ ", projectVersion='"
				+ projectVersion
				+ '\''
				+ ", packageName='"
				+ packageName
				+ '\''
				+ '}';
	}

	/**
	 * Gets the project package name.
	 *
	 * @return the package name of the project.
	 */
	public String getProjectPackageName() {
		return this.packageName;
	}

	/**
	 * Sets the project package name.
	 *
	 * @param packageName the package name of the project to set.
	 */
	public void setProjectPackageName(String packageName) {
		this.packageName = packageName;
	}
}

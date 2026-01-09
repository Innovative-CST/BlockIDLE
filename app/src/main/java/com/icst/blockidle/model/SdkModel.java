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

package com.icst.blockidle.model;

public final class SdkModel {

	private String version;
	private String minSdkSupported;
	private double versionNumber;
	private String versionType;
	private double subVersion;
	private String versionName;
	private double minApiLevel;
	private double javaVersion;
	private String minSdk;

	public String getVersion() {
		return this.version;
	}

	public String getMinSdkSupported() {
		return this.minSdkSupported;
	}

	public double getVersionNumber() {
		return this.versionNumber;
	}

	public String getVersionType() {
		return this.versionType;
	}

	public double getSubVersion() {
		return this.subVersion;
	}

	public String getVersionName() {
		return this.versionName;
	}

	public double getMinApiLevel() {
		return this.minApiLevel;
	}

	public double getJavaVersion() {
		return this.javaVersion;
	}

	public String getMinSdk() {
		return this.minSdk;
	}
}

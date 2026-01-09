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

import java.util.List;
import java.util.Map;

public class PluginModel {

	private String pluginName;
	private String appPluginClass;
	private String applicationId;
	private String versionName;
	private SdkModel sdk;
	private String variant;
	private String buildType;
	private Map<String, String> flavors;
	private int appMinSdk;
	private int appTargetSdk;
	private List<Output> outputs;

	public String getPluginName() {
		return pluginName;
	}

	public String getAppPluginClass() {
		return appPluginClass;
	}

	public String getApplicationId() {
		return applicationId;
	}

	public String getVersionName() {
		return versionName;
	}

	public SdkModel getSdk() {
		return sdk;
	}

	public String getVariant() {
		return variant;
	}

	public String getBuildType() {
		return buildType;
	}

	public Map<String, String> getFlavors() {
		return flavors;
	}

	public int getAppMinSdk() {
		return appMinSdk;
	}

	public int getAppTargetSdk() {
		return appTargetSdk;
	}

	public List<Output> getOutputs() {
		return outputs;
	}

	public static class Output {

		private String apkPath;
		private List<String> filters;

		public String getApkPath() {
			return apkPath;
		}

		public List<String> getFilters() {
			return filters;
		}
	}
}
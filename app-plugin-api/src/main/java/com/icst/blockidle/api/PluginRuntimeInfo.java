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

package com.icst.blockidle.api;

/**
 * Provides information about the Block IDLE plugin runtime environment,
 * including detailed SDK metadata.
 * <p>
 * This class exposes metadata about the host application and its SDK,
 * allowing plugins to determine compatibility and retrieve versioning
 * information safely. Plugins should use {@link #getSdkInfo()} for
 * detailed SDK version and type checks.
 * </p>
 *
 * <h3>Usage example:</h3>
 * <pre>{@code
 * PluginRuntimeInfo info = pluginApplication.getRuntimeInfo();
 * RuntimeSdkInfo sdk = info.getSdkInfo();
 *
 * if (sdk.getVersionNumber() >= 3) {
 *     // Safe to use features introduced in SDK 3.x.x
 * }
 *
 * pluginApplication.log("Running on SDK " + sdk.getVersionName());
 * }</pre>
 *
 * @see RuntimeSdkInfo
 */
public final class PluginRuntimeInfo {

	/**
	 * Human-readable version name of the host Block IDLE application.
	 * <p>
	 * For display purposes only; do not rely on this for compatibility checks.
	 * </p>
	 */
	private final String versionName;

	/**
	 * Internal version code of the host Block IDLE application.
	 * <p>
	 * This value increases monotonically with each release and may be
	 * used for internal diagnostics or logging.
	 * </p>
	 */
	private final int versionCode;

	/**
	 * Detailed SDK metadata exposed to plugins.
	 * <p>
	 * This includes semantic version, min SDK supported, release type,
	 * and human-readable version name.
	 * </p>
	 */
	private final RuntimeSdkInfo sdkInfo;

	/**
	 * Creates a new {@code PluginRuntimeInfo} instance.
	 *
	 * @param versionName human-readable version name of the host application
	 * @param versionCode internal version code of the host application
	 * @param sdkInfo     detailed runtime SDK metadata
	 */
	public PluginRuntimeInfo(String versionName, int versionCode, RuntimeSdkInfo sdkInfo) {
		this.versionName = versionName;
		this.versionCode = versionCode;
		this.sdkInfo = sdkInfo;
	}

	/**
	 * Returns the human-readable version name of the host application.
	 *
	 * @return the host application's version name
	 */
	public String getVersionName() {
		return versionName;
	}

	/**
	 * Returns the internal version code of the host application.
	 *
	 * @return the host application's version code
	 */
	public int getVersionCode() {
		return versionCode;
	}

	/**
	 * Returns detailed runtime SDK information.
	 * <p>
	 * Plugins should use this for version and release-type checks instead of
	 * relying on application version names.
	 * </p>
	 *
	 * @return the {@link RuntimeSdkInfo} describing the SDK
	 */
	public RuntimeSdkInfo getSdkInfo() {
		return sdkInfo;
	}
}

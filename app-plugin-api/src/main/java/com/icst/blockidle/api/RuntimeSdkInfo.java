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
 * Provides detailed information about the Block IDLE SDK
 * available to plugins at runtime.
 * <p>
 * This class exposes structured SDK metadata such as versioning,
 * release type, and compatibility constraints. Plugins may use
 * this information for diagnostics, feature gating, or displaying
 * SDK-related details to users.
 * </p>
 *
 * <p>
 * For compatibility checks, plugins should primarily rely on the
 * API level exposed via {@link PluginRuntimeInfo#getApiLevel()}.
 * This class is intended for extended version awareness and
 * informational purposes.
 * </p>
 *
 * <h3>Immutability</h3>
 * <p>
 * Instances of this class are immutable and thread-safe.
 * </p>
 *
 * @see PluginRuntimeInfo
 */
public final class RuntimeSdkInfo {

	/**
	 * Full semantic version of the SDK.
	 * <p>
	 * Example: {@code "0.0.1"}
	 * </p>
	 */
	private final String version;

	/**
	 * Minimum SDK version required by plugins to run safely.
	 * <p>
	 * Example: {@code "0.0.1"}
	 * </p>
	 */
	private final String minSdkSupported;

	/**
	 * Internal numeric representation of the SDK version.
	 * <p>
	 * This value increases monotonically across releases.
	 * </p>
	 */
	private final int versionNumber;

	/**
	 * SDK release channel or stability level.
	 * <p>
	 * Common values include {@code alpha (0))}, {@code beta(2)}, and {@code release(3)}.
	 * </p>
	 */
	private final String versionType;

	/**
	 * Sub-version or patch identifier within the same release channel.
	 */
	private final int subVersion;

	/**
	 * Human-readable SDK version name.
	 * <p>
	 * Example: {@code "0-alpha-1"}
	 * </p>
	 */
	private final String versionName;

	/**
	 * Creates a new {@code RuntimeSdkInfo} instance.
	 *
	 * @param version           full semantic SDK version
	 * @param minSdkSupported   minimum SDK version supported
	 * @param versionNumber     internal numeric SDK version
	 * @param versionType       release type (0, 1, 2)
	 * @param subVersion        sub-version or patch level
	 * @param versionName       human-readable SDK version name
	 */
	public RuntimeSdkInfo(
			String version,
			String minSdkSupported,
			int versionNumber,
			String versionType,
			int subVersion,
			String versionName) {
		this.version = version;
		this.minSdkSupported = minSdkSupported;
		this.versionNumber = versionNumber;
		this.versionType = versionType;
		this.subVersion = subVersion;
		this.versionName = versionName;
	}

	/** @return the full semantic SDK version */
	public String getVersion() {
		return version;
	}

	/** @return the minimum supported SDK version */
	public String getMinSdkSupported() {
		return minSdkSupported;
	}

	/** @return the internal numeric SDK version */
	public int getVersionNumber() {
		return versionNumber;
	}

	/** @return the SDK release type (alpha, beta, stable) */
	public String getVersionType() {
		return versionType;
	}

	/** @return the SDK sub-version or patch number */
	public int getSubVersion() {
		return subVersion;
	}

	/** @return the human-readable SDK version name */
	public String getVersionName() {
		return versionName;
	}
}
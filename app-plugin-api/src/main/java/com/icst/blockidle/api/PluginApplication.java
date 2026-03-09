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

import android.app.Application;

/**
 * Provides a controlled wrapper around the host Android
 * {@link android.app.Application} instance for Block IDLE plugins.
 * <p>
 * This class acts as the primary entry point for plugins at the
 * application level. It exposes plugin-safe utility methods and
 * runtime metadata while preventing direct, unrestricted access
 * to internal host application APIs.
 * </p>
 *
 * <p>
 * In addition to the underlying {@link Application}, this wrapper
 * supplies a {@link PluginRuntimeInfo} object that describes the
 * execution environment, including the host application's version
 * and the supported plugin API level.
 * </p>
 *
 * <h3>Lifecycle</h3>
 * <p>
 * An instance of {@code PluginApplication} is created by the host
 * application and passed to plugins during initialization via
 * {@link AppPlugin#onCreateApplication(PluginApplication)}.
 * </p>
 *
 * <h3>Compatibility</h3>
 * <p>
 * Plugin developers should rely on the API level exposed through
 * {@link #getRuntimeInfo()} when performing compatibility checks,
 * rather than comparing application version names or codes.
 * </p>
 *
 * <h3>Design Notes</h3>
 * <ul>
 *   <li>Mirrors Android's {@code Context} + {@code Build} separation</li>
 *   <li>Provides a stable ABI boundary for plugins</li>
 *   <li>Allows future non-Android runtimes to reuse the same API</li>
 * </ul>
 *
 * @see PluginRuntimeInfo
 * @see AppPlugin
 */
public class PluginApplication {

	private final Application application;

	private final PluginRuntimeInfo runtimeInfo;

	/**
	 * Creates a new {@code PluginApplication} wrapper.
	 * <p>
	 * This constructor is called by the host application when initializing
	 * a plugin. It provides controlled access to the host
	 * {@link android.app.Application} instance along with runtime metadata
	 * describing the plugin execution environment.
	 * </p>
	 *
	 * <p>
	 * Plugin developers should avoid holding strong references to the
	 * underlying {@link Application} and instead rely on the exposed
	 * plugin-safe APIs.
	 * </p>
	 *
	 * @param application  the host application's {@link Application} instance
	 * @param runtimeInfo  information about the Block IDLE plugin runtime,
	 *                     including version and supported API level
	 *
	 * @see PluginRuntimeInfo
	 */
	public PluginApplication(Application application, PluginRuntimeInfo runtimeInfo) {
		this.application = application;
		this.runtimeInfo = runtimeInfo;
	}

	/**
	 * Returns information about the current plugin runtime environment.
	 *
	 * @return runtime metadata for the host application
	 */
	public PluginRuntimeInfo getRuntimeInfo() {
		return runtimeInfo;
	}

	/**
	 * Logs a message to the standard output stream prefixed with "[Plugin]".
	 *
	 * @param msg The message to log.
	 */
	public void log(String msg) {
		System.out.println("[Plugin] " + msg);
	}

	/**
	 * Returns the wrapped Android {@link Application} instance.
	 *
	 * @return The host application.
	 */
	public Application getAndroidApplication() {
		return this.application;
	}
}

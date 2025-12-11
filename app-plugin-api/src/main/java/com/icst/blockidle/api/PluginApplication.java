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
 * Wraps the Android {@link Application} object and exposes
 * plugin-safe utility methods.
 */
public class PluginApplication {

	private final Application application;

	/**
	 * Creates a new {@code PluginApplication} wrapper.
	 *
	 * @param application The host application's {@link Application} instance.
	 */
	public PluginApplication(Application application) {
		this.application = application;
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

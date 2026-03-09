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

import androidx.appcompat.app.AppCompatActivity;

/**
 * Wraps an {@link AppCompatActivity} instance and exposes a safe interface
 * for plugin developers to interact with the host application's activities.
 */
public class PluginActivity {

	private final AppCompatActivity appCompatActivity;
	private final String TAG;

	/**
	 * Creates a new {@code PluginActivity} wrapper.
	 *
	 * @param appCompatActivity The activity instance the plugin is interacting with.
	 * @param TAG              A tag identifier useful for knowing the full class name of appCompatActivity.
	 */
	public PluginActivity(AppCompatActivity appCompatActivity, String TAG) {
		this.appCompatActivity = appCompatActivity;
		this.TAG = TAG;
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
	 * Returns the underlying {@link AppCompatActivity} instance.
	 *
	 * @return The host activity.
	 */
	public AppCompatActivity getAppCompatActivity() {
		return this.appCompatActivity;
	}

	/**
	 * Returns the log tag assigned to this activity wrapper.
	 *
	 * @return A tag used for plugin-related logging.
	 */
	public String getTAG() {
		return this.TAG;
	}
}

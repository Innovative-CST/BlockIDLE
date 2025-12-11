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
 * Represents the base interface for creating BlockIdle plugins.
 * <p>
 * Implementations of this interface define lifecycle callbacks
 * that are invoked by the host application.
 * </p>
 */
public interface AppPlugin {

	/**
	 * Called when the plugin is initialized at the application level.
	 * <p>
	 * This method is invoked when the host application's {@link android.app.Application}
	 * is created. Plugins can use this callback to perform global setup such as
	 * initializing libraries, loading configuration, or registering services.
	 * </p>
	 *
	 * @param pluginApplication Wrapper around the host Android {@link android.app.Application}
	 *                          instance for plugin-safe access.
	 */
	void onCreateApplication(PluginApplication pluginApplication);

	/**
	 * Called when a new Activity is created in the host application.
	 * <p>
	 * Plugins can use this callback to modify the UI, show dialogs,
	 * attach listeners, or perform activity-specific logic.
	 * </p>
	 *
	 * @param pluginActivity Wrapper around the current {@link androidx.appcompat.app.AppCompatActivity}
	 *                       allowing the plugin to interact safely with it.
	 */
	void onCreateActivity(PluginActivity pluginActivity);
}

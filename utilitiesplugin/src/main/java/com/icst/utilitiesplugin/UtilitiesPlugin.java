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

package com.icst.utilitiesplugin;

import com.icst.blockidle.api.AppPlugin;
import com.icst.blockidle.api.PluginActivity;
import com.icst.blockidle.api.PluginApplication;

import android.util.Log;
import android.widget.Toast;

public class UtilitiesPlugin implements AppPlugin {

	private static boolean initialized = false;

	@Override
	public void onCreateApplication(PluginApplication pluginApplication) {
		Log.info("UtilitiesPlugin", "Plugin application started");

		// Only run once
		if (!initialized) {
			initialized = true;
			Toast.i(
					pluginApplication.getAndroidApplication(),
					"Utilities Plugin initialized",
					Toast.LENGTH_SHORT).show();
		}
	}

	@Override
	public void onCreateActivity(PluginActivity pluginActivity) {
		Log.i("UtilitiesPlugin", "Plugin received activity with TAG={".concat(pluginActivity.getTAG()).concat("}"));
	}
}

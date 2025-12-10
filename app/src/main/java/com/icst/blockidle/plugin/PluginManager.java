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

package com.icst.blockidle.plugin;

import java.io.File;
import java.util.ArrayList;

import com.icst.blockidle.model.PluginModel;
import com.icst.blockidle.util.PluginUtils;
import com.icst.blockidle.util.ProjectEnvironment;

import android.app.Application;
import android.content.Context;

import androidx.appcompat.app.AppCompatActivity;

public class PluginManager {
	private final File pluginDir;

	// List of compatible plugins only
	private ArrayList<PluginModel> plugins;
	private static PluginManager pluginManagerInstance;

	private PluginManager() {
		this.pluginDir = ProjectEnvironment.pluginsDirectory;
		if (!pluginDir.exists())
			pluginDir.mkdirs();

		File[] pluginsFolderList = pluginDir.listFiles();
		if (pluginsFolderList == null)
			return;

		plugins = new ArrayList<PluginModel>();

		for (File pluginDir : pluginsFolderList) {
			// Load plugins from directory
			PluginModel plugin = PluginUtils.buildPluginModel(pluginDir);
			if (plugin == null)
				continue;
			plugins.add(plugin);
		}
	}

	public static PluginManager getInstance() {
		if (pluginManagerInstance == null) {
			pluginManagerInstance = new PluginManager();
		}
		return pluginManagerInstance;
	}

	public void initializePlugins(Context context) {
		plugins.forEach(plugin -> {
			if (plugin.isCompatible())
				plugin.tryLoadPlugin(context);
		});
	}

	public void notifyOnCreateApplication(Application application) {
		plugins.forEach(plugin -> plugin.notifyOnCreateApplication(application));
	}

	public void notifyOnCreateActivity(AppCompatActivity activity, String TAG) {
		plugins.forEach(plugin -> plugin.notifyOnCreateActivity(activity, TAG));
	}
}

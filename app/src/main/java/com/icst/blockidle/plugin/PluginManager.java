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

import com.icst.blockidle.api.PluginRuntimeInfo;
import com.icst.blockidle.model.PluginModel;
import com.icst.blockidle.util.PluginEnvironment;
import com.icst.blockidle.util.PluginUtils;

import android.app.Application;
import android.content.Context;

import androidx.appcompat.app.AppCompatActivity;

public class PluginManager {
	private final File pluginDir;

	// List of compatible plugins only
	private ArrayList<PluginRuntimeManager> plugins;
	private static PluginManager pluginManagerInstance;

	private PluginManager() {
		this.pluginDir = PluginEnvironment.pluginsDirectory;
		if (!pluginDir.exists())
			pluginDir.mkdirs();

		plugins = new ArrayList<PluginRuntimeManager>();

		File[] pluginsFolderList = pluginDir.listFiles();
		if (pluginsFolderList == null)
			return;

		for (File pluginDir : pluginsFolderList) {
			// Load plugins from directory which are selected
			String variant = PluginUtils.getSelectedVariant(pluginDir);

			if (variant == null) {
				continue;
			}
			PluginModel pluginModel = PluginUtils.buildPluginModel(pluginDir, variant);
			if (pluginModel == null)
				continue;
			PluginRuntimeManager plugin = new PluginRuntimeManager(pluginModel, new File(pluginDir, variant));
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

	public void notifyOnCreateApplication(Application application, PluginRuntimeInfo pluginRuntimeInfo) {
		plugins.forEach(plugin -> plugin.notifyOnCreateApplication(application, pluginRuntimeInfo));
	}

	public void notifyOnCreateActivity(AppCompatActivity activity, String TAG) {
		plugins.forEach(plugin -> plugin.notifyOnCreateActivity(activity, TAG));
	}
}

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

import com.icst.blockidle.BuildConfig;
import com.icst.blockidle.api.AppPlugin;
import com.icst.blockidle.api.PluginActivity;
import com.icst.blockidle.api.PluginApplication;
import com.icst.blockidle.api.PluginRuntimeInfo;
import com.icst.blockidle.model.PluginModel;
import com.icst.blockidle.util.SdkVersionUtils;

import android.app.Application;
import android.content.Context;

import androidx.appcompat.app.AppCompatActivity;

import dalvik.system.DexClassLoader;

public class PluginRuntimeManager {

	private PluginModel plugin;
	private boolean isLoaded;
	private AppPlugin pluginInstance;
	private File pluginDir;

	public PluginRuntimeManager(PluginModel plugin, File pluginDir) {
		this.plugin = plugin;
		this.pluginDir = pluginDir;
	}

	public boolean isCompatible() {
		String minSdkSupportedPlugin = plugin.getSdk().getMinSdkSupported();
		if (SdkVersionUtils.compareVersions(BuildConfig.SDK_VERSION, minSdkSupportedPlugin) == -1) {
			// min sdk required by plugin sdk is not met
			return false;
		}

		String minSdkPlugin = plugin.getSdk().getMinSdk();
		if (SdkVersionUtils.compareVersions(BuildConfig.SDK_VERSION, minSdkPlugin) == -1) {
			// min sdk requested by plugin dev is not met
			return false;
		}

		String pluginSdk = plugin.getSdk().getVersion();
		String appMinSdk = BuildConfig.SDK_MIN_SUPPORTED;
		if (SdkVersionUtils.compareVersions(pluginSdk, appMinSdk) == -1) {
			// min sdk version of plugin required by app is not met
			return false;
		}
		return true;
	}

	public boolean isPluginLoaded() {
		return isLoaded;
	}

	public void tryLoadPlugin(Context context) {
		if (isLoaded)
			return;
		if (!isCompatible())
			return;
		try {
			File optimizedDir = context.getDir("dex_opt", Context.MODE_PRIVATE);
			File apkPath = new File(pluginDir, plugin.getOutputs().get(0).getApkPath());

			DexClassLoader loader = new DexClassLoader(
					apkPath.getAbsolutePath(),
					optimizedDir.getAbsolutePath(),
					null,
					context.getClassLoader());

			Class<?> clazz = loader.loadClass(plugin.getAppPluginClass());
			Object pluginObj = clazz.newInstance();

			if (pluginObj instanceof AppPlugin) {
				pluginInstance = (AppPlugin) pluginObj;
				isLoaded = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void notifyOnCreateApplication(Application application, PluginRuntimeInfo runtimeInfo) {
		if (isLoaded) {
			pluginInstance.onCreateApplication(new PluginApplication(application, runtimeInfo));
		}
	}

	public void notifyOnCreateActivity(AppCompatActivity activity, String TAG) {
		if (isLoaded) {
			pluginInstance.onCreateActivity(new PluginActivity(activity, TAG));
		}
	}

}

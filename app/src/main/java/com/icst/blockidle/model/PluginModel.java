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

package com.icst.blockidle.model;

import java.io.File;

import com.icst.blockidle.BuildConfig;
import com.icst.blockidle.api.AppPlugin;
import com.icst.blockidle.api.PluginActivity;
import com.icst.blockidle.api.PluginApplication;

import android.app.Application;
import android.content.Context;

import androidx.appcompat.app.AppCompatActivity;

import dalvik.system.DexClassLoader;

public class PluginModel {
	private final String name;
	private final String packageName;
	private final String mainClassName;
	private final Integer minSdk;
	private final Integer targetSdk;
	private final File apkFile;

	private boolean isLoaded;
	private AppPlugin plugin;

	public PluginModel(
			String name,
			String packageName,
			String mainClassName,
			Integer minSdk,
			Integer targetSdk,
			File apkFile) {
		this.name = name;
		this.packageName = packageName;
		this.mainClassName = mainClassName;
		this.minSdk = minSdk;
		this.targetSdk = targetSdk;
		this.apkFile = apkFile;
	}

	public boolean isCompatible() {
		return !(minSdk > BuildConfig.PLUGIN_SDK_VERSION);
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

			DexClassLoader loader = new DexClassLoader(
					getApkFile().getAbsolutePath(),
					optimizedDir.getAbsolutePath(),
					null,
					context.getClassLoader());

			Class<?> clazz = loader.loadClass(getMainClassName());
			Object pluginObj = clazz.newInstance();

			if (pluginObj instanceof AppPlugin) {
				plugin = (AppPlugin) pluginObj;
				isLoaded = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void notifyOnCreateApplication(Application application) {
		if (isLoaded) {
			plugin.onCreateApplication(new PluginApplication(application));
		}
	}

	public void notifyOnCreateActivity(AppCompatActivity activity, String TAG) {
		if (isLoaded) {
			plugin.onCreateActivity(new PluginActivity(activity, TAG));
		}
	}

	public String getName() {
		return this.name;
	}

	public String getPackageName() {
		return this.packageName;
	}

	public String getMainClassName() {
		return this.mainClassName;
	}

	public Integer getMinSdk() {
		return this.minSdk;
	}

	public Integer getTargetSdk() {
		return this.targetSdk;
	}

	public File getApkFile() {
		return this.apkFile;
	}
}

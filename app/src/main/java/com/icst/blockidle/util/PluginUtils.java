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

package com.icst.blockidle.util;

import java.io.File;
import java.io.FileInputStream;

import org.json.JSONObject;

import com.icst.blockidle.model.PluginModel;

public final class PluginUtils {

	public static PluginModel buildPluginModel(File pluginDir) {
		File pluginMetadata = new File(pluginDir, ProjectEnvironment.PLUGINS_METADATA_FILE);
		File pluginApkFile = new File(pluginDir, ProjectEnvironment.PLUGINS_FILE);
		if (!(pluginMetadata.exists() && pluginApkFile.exists()))
			return null;

		try {
			FileInputStream fis = new FileInputStream(pluginMetadata);

			byte[] data = new byte[(int) pluginMetadata.length()];
			fis.read(data);
			fis.close();

			String json = new String(data, "UTF-8");
			JSONObject jsonObject = new JSONObject(json);
			String name = jsonObject.getString("name");
			String packageName = jsonObject.getString("packageName");
			String mainClassName = jsonObject.getString("mainClassName");
			Integer minSdk = jsonObject.getInt("minSdk");
			Integer targetSdk = jsonObject.getInt("targetSdk");
			return new PluginModel(name, packageName, mainClassName, minSdk, targetSdk, pluginApkFile);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}

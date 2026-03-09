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
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;
import com.icst.blockidle.beans.PluginConfigurationBean;
import com.icst.blockidle.model.PluginModel;

public final class PluginUtils {

	public static String getSelectedVariant(File pluginDir) {
		File pluginConfigFile = new File(pluginDir, PluginEnvironment.PLUGINS_CONFIG_FILE);
		PluginConfigurationBean config = SerializationUtils.deserialize(pluginConfigFile,
				PluginConfigurationBean.class);
		if (config == null) {
			return null;
		}
		return config.getSelectedVariant();
	}

	public static PluginModel buildPluginModel(File pluginDir, String variant) {
		return buildPluginModel(new File(pluginDir, variant));
	}

	private static PluginModel buildPluginModel(File variantDir) {
		File pluginMetadata = new File(variantDir, PluginEnvironment.PLUGINS_METADATA_FILE);
		if (!(pluginMetadata.exists()))
			return null;

		PluginModel plugin = null;
		try (FileReader reader = new FileReader(pluginMetadata)) {
			Gson gson = new Gson();
			plugin = gson.fromJson(reader, PluginModel.class);
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return plugin;
	}

}

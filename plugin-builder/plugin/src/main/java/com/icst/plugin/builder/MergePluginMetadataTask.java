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

package com.icst.plugin.builder;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import org.gradle.api.DefaultTask;
import org.gradle.api.file.DirectoryProperty;
import org.gradle.api.file.RegularFileProperty;
import org.gradle.api.tasks.InputDirectory;
import org.gradle.api.tasks.OutputFile;
import org.gradle.api.tasks.TaskAction;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public abstract class MergePluginMetadataTask extends DefaultTask {

	@InputDirectory
	public abstract DirectoryProperty getInputDir();

	@OutputFile
	public abstract RegularFileProperty getOutputFile();

	@TaskAction
	public void merge() throws Exception {
		File dir = getInputDir().get().getAsFile();

		List<JsonElement> variants = new ArrayList<>();

		if (dir.exists()) {
			for (File file : dir.listFiles()) {
				if (file.isDirectory()) {
					collectJsonFiles(file, variants);
				}
			}
		}

		Gson gson = new GsonBuilder().setPrettyPrinting().create();

		File out = getOutputFile().get().getAsFile();
		out.getParentFile().mkdirs();

		try (FileWriter writer = new FileWriter(out)) {
			gson.toJson(variants, writer);
		}
	}

	private void collectJsonFiles(File dir, List<JsonElement> out) throws Exception {
		for (File file : dir.listFiles()) {
			if (file.isDirectory()) {
				collectJsonFiles(file, out);
			} else if (file.getName().equals("plugin-metadata.json")) {
				try (FileReader reader = new FileReader(file)) {
					out.add(JsonParser.parseReader(reader));
				}
			}
		}
	}
}
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

import org.gradle.api.Project;
import org.gradle.api.file.DirectoryProperty;
import org.gradle.api.tasks.Delete;

public class PluginTaskRegistrar {

	public static void register(Project project) {
		DirectoryProperty buildDir = project.getLayout().getBuildDirectory();

		project.getTasks().register("cleanPluginOutputs", Delete.class, t -> {
			t.delete(buildDir.dir("outputs/plugin"));
		});

		project.getTasks().register("mergePluginMetadata", MergePluginMetadataTask.class, t -> {
			t.getInputDir().set(buildDir.dir("outputs/plugin"));
			t.getOutputFile().set(buildDir.file("outputs/plugin/plugin-metadata.json"));
			t.dependsOn("cleanPluginOutputs");
			t.mustRunAfter("cleanPluginOutputs");
		});

		project.getTasks().register("buildPlugin", task -> {
			task.setGroup("block-idle");
			task.setDescription("Build all debug plugin variants and generates ready to publish plugin");
			task.dependsOn("mergePluginMetadata");
		});
	}
}

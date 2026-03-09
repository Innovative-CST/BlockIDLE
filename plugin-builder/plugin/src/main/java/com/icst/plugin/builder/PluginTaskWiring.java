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

import com.android.build.api.variant.Variant;

public class PluginTaskWiring {

	public static void wire(Project project, Variant variant) {
		String taskName = "buildPlugin" + Utilities.capitalize(variant.getName());
		String cleanTaskName = "cleanPlugin" + Utilities.capitalize(variant.getName());
		project.getTasks().named("mergePluginMetadata").configure(t -> t.dependsOn(taskName));
		project.getTasks().named(taskName).configure(t -> {
			t.dependsOn(cleanTaskName);
			t.mustRunAfter(cleanTaskName);
		});
	}

}

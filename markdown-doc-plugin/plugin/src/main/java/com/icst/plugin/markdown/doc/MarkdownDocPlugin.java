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

package com.icst.plugin.markdown.doc;

import java.io.File;

import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.api.tasks.Exec;

public class MarkdownDocPlugin implements Plugin<Project> {

	@Override
	public void apply(Project project) {

		project.getTasks().register("generateMarkdownDocs", Exec.class, task -> {

			task.setGroup("documentation");
			task.setDescription("Generates Markdown documentation");

			File pluginJar = new File(
					MarkdownDocPlugin.class
							.getProtectionDomain()
							.getCodeSource()
							.getLocation()
							.getPath());

			task.commandLine(
					"javadoc",
					"-doclet", "com.icst.plugin.markdown.doc.MarkdownDoclet",
					"-docletpath", pluginJar.getAbsolutePath(),
					"-sourcepath", "src/main/java",
					"-subpackages", "com.icst.blockidle",
					"-outputDir", project.getBuildDir() + "/markdown-docs");
		});
	}
}
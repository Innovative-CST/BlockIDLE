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

import java.util.regex.Pattern;

import org.gradle.api.GradleException;
import org.gradle.api.Project;
import org.gradle.api.artifacts.Configuration;

public class PluginExtensionConfigurator {

	public static void configure(Project project) {
		project.getExtensions().create("blockIdlePlugin", BlockIdleSdkExtension.class);

		BlockIdleSdkExtension ext = project.getExtensions().getByType(BlockIdleSdkExtension.class);

		Configuration sdkCfg = project.getConfigurations().maybeCreate("blockIdlePluginSdk");
		sdkCfg.setCanBeResolved(true);
		sdkCfg.setCanBeConsumed(false);

		project.afterEvaluate(t -> {
			StringBuilder error = new StringBuilder("We got following error in your plugin:\n");
			boolean containsError = false;
			if (!ext.getPluginName().isPresent()) {
				containsError = true;
				error.append("> Please provide a plugin name\n");
			}
			if (!ext.getSdkVersion().isPresent()) {
				containsError = true;
				error.append("> Please provide sdk version for building plugin for BlockIDLE\n");
			}

			if (!ext.getAppPluginClass().isPresent()) {
				containsError = true;
				error.append("> Please provide appPluginClass as entry point of plugin for BlockIDLE\n");
			}

			if (!ext.getVersionName().isPresent()) {
				containsError = true;
				error.append("> Please provide versionName of plugin as entry point of plugin for BlockIDLE\n");
			}

			if (containsError) {
				throw new GradleException(error.toString());
			}

			validateFqcn(ext.getAppPluginClass().get(), "appPluginClass");

			String sdkVersion = ext.getSdkVersion().get();

			project.getDependencies().add(
					"blockIdlePluginSdk",
					"io.github.devvigilante:blockidle-plugin-sdk:" + sdkVersion);

			project.getDependencies().add(
					"compileOnly",
					"io.github.devvigilante:blockidle-plugin-sdk:" + sdkVersion);
		});
	}

	private static final Pattern FQCN_PATTERN = Pattern.compile(
			"^[a-zA-Z_$][a-zA-Z\\d_$]*(\\.[a-zA-Z_$][a-zA-Z\\d_$]*)+$");

	private static void validateFqcn(String value, String propertyName) {
		if (value == null || value.isEmpty()) {
			throw new GradleException(propertyName + " must not be empty");
		}

		if (!FQCN_PATTERN.matcher(value).matches()) {
			throw new GradleException(
					propertyName + " must be a fully qualified class name. " +
							"Example: com.example.MyPlugin");
		}
	}

}

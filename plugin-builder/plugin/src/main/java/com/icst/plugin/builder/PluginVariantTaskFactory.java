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

import java.util.HashMap;
import java.util.Map;

import org.gradle.api.Project;
import org.gradle.api.file.DirectoryProperty;
import org.gradle.api.file.RegularFile;
import org.gradle.api.provider.Provider;
import org.gradle.api.tasks.Delete;

import com.android.build.api.artifact.SingleArtifact;
import com.android.build.api.variant.ApplicationVariant;
import com.android.build.api.variant.Variant;

public class PluginVariantTaskFactory {

	private static final String PLUGIN_OUTPUT_DIR = "outputs/plugin";
	private static final String PLUGIN_METADATA_FILE = "plugin-metadata.json";

	public static void create(Project project, Variant variant) {
		String buildTaskName = "buildPlugin" + Utilities.capitalize(variant.getName());

		project.getTasks().register(buildTaskName, BuildPluginTask.class, task -> {
			registerBuildTaskForVariant(project, variant, task);
		});

		String cleanTaskName = "cleanPlugin" + Utilities.capitalize(variant.getName());

		project.getTasks().register(cleanTaskName, Delete.class, t -> {
			DirectoryProperty buildDir = project.getLayout().getBuildDirectory();
			StringBuilder apkOutputDirPath = new StringBuilder(PLUGIN_OUTPUT_DIR);
			apkOutputDirPath.append("/");
			apkOutputDirPath.append(variant.getName());

			t.delete(buildDir.dir(apkOutputDirPath.toString()));
		});
	}

	private static void registerBuildTaskForVariant(Project project, Variant variant, BuildPluginTask task) {
		BlockIdleSdkExtension ext = project.getExtensions().getByType(BlockIdleSdkExtension.class);

		DirectoryProperty buildDir = project.getLayout().getBuildDirectory();

		StringBuilder metadataFilePath = new StringBuilder(PLUGIN_OUTPUT_DIR);
		metadataFilePath.append("/");
		metadataFilePath.append(variant.getName());
		metadataFilePath.append("/");
		metadataFilePath.append(PLUGIN_METADATA_FILE);

		Provider<RegularFile> metadataFile = buildDir.file(metadataFilePath.toString());

		StringBuilder apkOutputDirPath = new StringBuilder(PLUGIN_OUTPUT_DIR);
		apkOutputDirPath.append("/");
		apkOutputDirPath.append(variant.getName());

		Provider<RegularFile> apkOutputDir = buildDir.file(apkOutputDirPath.toString());

		Integer minSdk = variant.getMinSdk().getApiLevel();
		Integer targetSdk = variant.getTargetSdkVersion().getApiLevel();

		// APK artifacts
		task.getApkFolder().set(variant.getArtifacts().get(SingleArtifact.APK.INSTANCE));
		task.getBuiltArtifactsLoader().set(variant.getArtifacts().getBuiltArtifactsLoader());

		// Variant metadata
		task.getVariantName().set(variant.getName());
		task.getVersionName().set(ext.getVersionName());
		task.getBuildType().set(variant.getBuildType());

		Map<String, String> flavors = new HashMap<>();
		variant.getProductFlavors().forEach(pf -> flavors.put(pf.getFirst(), pf.getSecond()));

		task.getProductFlavors().set(flavors);
		task.getMinSdk().set(ext.getMinSdkVersion());
		task.getAppMinSdk().set(minSdk);
		task.getAppTargetSdk().set(targetSdk);
		task.getMetadataFile().set(metadataFile);
		task.getPluginOutputDir().set(apkOutputDir);
		task.getApplicationId().set(((ApplicationVariant) variant).getApplicationId());
	}
}

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
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.gradle.api.DefaultTask;
import org.gradle.api.GradleException;
import org.gradle.api.file.DirectoryProperty;
import org.gradle.api.file.RegularFileProperty;
import org.gradle.api.provider.MapProperty;
import org.gradle.api.provider.Property;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.InputFiles;
import org.gradle.api.tasks.Internal;
import org.gradle.api.tasks.OutputDirectory;
import org.gradle.api.tasks.OutputFile;
import org.gradle.api.tasks.TaskAction;

import com.android.build.api.variant.BuiltArtifacts;
import com.android.build.api.variant.BuiltArtifactsLoader;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public abstract class BuildPluginTask extends DefaultTask {

	@InputFiles
	public abstract DirectoryProperty getApkFolder();

	@Internal
	public abstract Property<BuiltArtifactsLoader> getBuiltArtifactsLoader();

	// ===== Variant metadata =====

	@Input
	public abstract Property<String> getVariantName();

	@Input
	public abstract Property<String> getVersionName();

	@Input
	public abstract Property<String> getBuildType();

	@Input
	public abstract MapProperty<String, String> getProductFlavors();

	@Input
	public abstract Property<String> getMinSdk();

	@Input
	public abstract Property<Integer> getAppTargetSdk();

	@Input
	public abstract Property<Integer> getAppMinSdk();

	@Input
	public abstract Property<String> getApplicationId();

	@OutputFile
	public abstract RegularFileProperty getMetadataFile();

	@OutputDirectory
	public abstract RegularFileProperty getPluginOutputDir();

	@TaskAction
	public void execute() {
		BuiltArtifacts builtArtifacts = getBuiltArtifactsLoader().get().load(getApkFolder().get());

		if (builtArtifacts == null) {
			throw new RuntimeException("No APKs found!");
		}

		BlockIdleSdkExtension ext = getProject().getExtensions().getByType(BlockIdleSdkExtension.class);
		File sdkMetadataFile = Utilities.extractSdkMetadata(getProject());
		SdkMetadata sdkMetadata = Utilities.readSdkMetadata(sdkMetadataFile);

		Map<String, Object> root = new LinkedHashMap<>();

		root.put("pluginName", ext.getPluginName().get());
		root.put("appPluginClass", ext.getAppPluginClass().get());
		root.put("applicationId", getApplicationId().get());
		root.put("versionName", getVersionName().get());

		Gson gson = new Gson();
		@SuppressWarnings("unchecked")
		Map<String, Object> sdkMap = gson.fromJson(gson.toJson(sdkMetadata), Map.class);
		sdkMap.put("minSdk", ext.getMinSdkVersion().get());

		root.put("sdk", sdkMap);
		root.put("variant", getVariantName().get());
		root.put("buildType", getBuildType().get());
		root.put("flavors", getProductFlavors().get());
		root.put("appMinSdk", getAppMinSdk().get());
		root.put("appTargetSdk", getAppTargetSdk().get());

		List<Map<String, Object>> outputs = new ArrayList<>();

		builtArtifacts.getElements().forEach(artifact -> {
			try {
				File sourceApk = new File(artifact.getOutputFile());
				File targetApk = new File(getPluginOutputDir().get().getAsFile(), sourceApk.getName());

				Files.copy(
						sourceApk.toPath(),
						targetApk.toPath(),
						StandardCopyOption.REPLACE_EXISTING);

				Map<String, Object> apk = new LinkedHashMap<>();
				apk.put("apkPath", targetApk.getName()); // RELATIVE PATH ✔
				apk.put("filters", artifact.getFilters());

				outputs.add(apk);

			} catch (IOException e) {
				throw new GradleException("Failed to copy APK", e);
			}
		});

		root.put("outputs", outputs);

		try {
			writeJson(getMetadataFile().get().getAsFile(), root);
		} catch (IOException e) {
			throw new GradleException(e.getMessage());
		}
	}

	private void writeJson(File file, Map<String, Object> data) throws IOException {
		file.getParentFile().mkdirs();

		try (Writer writer = new OutputStreamWriter(
				new FileOutputStream(file), StandardCharsets.UTF_8)) {

			writer.write(new GsonBuilder()
					.setPrettyPrinting()
					.create()
					.toJson(data));
		}
	}
}

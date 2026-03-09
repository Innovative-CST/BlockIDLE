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
import java.io.InputStream;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import org.gradle.api.GradleException;
import org.gradle.api.Project;
import org.gradle.api.artifacts.Configuration;
import org.gradle.api.attributes.Attribute;

import com.google.gson.Gson;

public final class Utilities {
	public static String capitalize(String str) {
		return str.substring(0, 1).toUpperCase() + str.substring(1);
	}

	protected static SdkMetadata readSdkMetadata(File json) {
		try (Reader r = new FileReader(json)) {
			return new Gson().fromJson(r, SdkMetadata.class);
		} catch (Exception e) {
			throw new GradleException("Invalid SDK metadata", e);
		}
	}

	protected static File extractSdkMetadata(Project project) {
		Configuration cfg = project.getConfigurations().getByName("blockIdlePluginSdk");

		File aar = cfg.getIncoming()
				.artifactView(view -> {
					view.attributes(attrs -> attrs.attribute(
							Attribute.of("artifactType", String.class),
							"aar"));
				})
				.getArtifacts()
				.getArtifactFiles()
				.getSingleFile();
		if (!aar.getName().endsWith(".aar")) {
			throw new GradleException("Resolved SDK is not an AAR: " + aar);
		}

		File outDir = new File(project.getLayout().getBuildDirectory().getAsFile().get(), "plugin-sdk-metadata");
		outDir.mkdirs();

		try (ZipFile zip = new ZipFile(aar)) {
			ZipEntry classesJarEntry = zip.getEntry("classes.jar");
			File classesJar = new File(outDir, "classes.jar");

			try (InputStream in = zip.getInputStream(classesJarEntry)) {
				Files.copy(in, classesJar.toPath(), StandardCopyOption.REPLACE_EXISTING);
			}

			try (ZipFile classesZip = new ZipFile(classesJar)) {
				ZipEntry metadata = classesZip.getEntry("META-INF/sdk-metadata.json");
				File metadataOut = new File(outDir, "sdk-metadata.json");

				try (InputStream in = classesZip.getInputStream(metadata)) {
					Files.copy(in, metadataOut.toPath(), StandardCopyOption.REPLACE_EXISTING);
				}

				return metadataOut;
			}
		} catch (Exception e) {
			throw new GradleException("Failed to extract SDK metadata", e);
		}
	}
}
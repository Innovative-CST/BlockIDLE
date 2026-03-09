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

import org.gradle.api.GradleException;
import org.gradle.api.Project;

import com.android.build.api.variant.Variant;

public class PluginVariantValidator {

	public static void validate(Project project, Variant variant) {
		Integer minSdk = variant.getMinSdk().getApiLevel();
		Integer targetSdk = variant.getTargetSdkVersion().getApiLevel();

		if (minSdk < 26) {
			throw new GradleException("minSdk must be >= 26 for variant " + variant.getName());
		}

		if (targetSdk != 28) {
			throw new GradleException("targetSdk must be 28 for variant " + variant.getName());
		}
	}
}

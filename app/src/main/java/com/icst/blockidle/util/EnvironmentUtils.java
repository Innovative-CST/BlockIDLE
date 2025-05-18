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

import android.content.Context;

public class EnvironmentUtils {

	public static final String PROJECT_BEAN_FILE = "ProjectBean";
	public static final String EVENT_FOLDER = "events";
	public static final String INSTANCE_VARIABLE_FILE = "InstanceVariable";

	public static File projectDirectory;
	public static File extensionsDirectory;

	public static void init(Context context) {
		projectDirectory = context.getExternalFilesDir("Projects");
		projectDirectory.mkdirs();

		extensionsDirectory = context.getExternalFilesDir("Extensions");
		extensionsDirectory.mkdirs();
	}
}

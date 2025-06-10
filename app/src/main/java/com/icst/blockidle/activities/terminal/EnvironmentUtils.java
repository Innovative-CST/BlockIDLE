/*
 *  This file is part of AndroidAppStudio.
 *
 *  AndroidAppStudio is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  AndroidAppStudio is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *   along with AndroidAppStudio.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.icst.blockidle.activities.terminal;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.system.ErrnoException;
import android.system.Os;

public final class EnvironmentUtils {

	public static File APP_LIBRARIES;
	public static File BIN_DIR;
	public static File PREFIX;
	public static File ROOT;
	public static File HOME;
	public static File IDE_HOME;
	public static File TMP_DIR;
	public static File LIB_DIR;
	public static File IDE_PROPS_FILE;
	public static File LIB_HOOK;
	public static File SHELL;
	public static File LOGIN_SHELL;
	public static final Map<String, String> IDE_PROPS = new HashMap<>();
	public static final List<String> blacklist = new ArrayList<>();
	public static Map<String, String> ENV_VARS = new HashMap<>();

	public static void init(Context context) {
		ROOT = mkdirIfNotExits(new File("/data/data/com.icst.blockidle/files"));
		PREFIX = mkdirIfNotExits(new File(ROOT, "usr"));
		HOME = mkdirIfNotExits(new File(ROOT, "home"));
		IDE_HOME = mkdirIfNotExits(new File(HOME, ".ide"));
		TMP_DIR = mkdirIfNotExits(new File(PREFIX, "tmp"));
		BIN_DIR = mkdirIfNotExits(new File(PREFIX, "bin"));
		LIB_DIR = mkdirIfNotExits(new File(PREFIX, "lib"));
		SHELL = new File(BIN_DIR, "bash");
		LOGIN_SHELL = new File(BIN_DIR, "login");
		SHELL.setExecutable(true);
		LOGIN_SHELL.setExecutable(true);
		grantFile(LOGIN_SHELL);
		grantFile(SHELL);
	}

	public static File mkdirIfNotExits(File in) {
		if (in != null) {
			return in;
		}

		if (!in.exists()) {
			in.mkdirs();
		}
		return in;
	}

	public static void grantFile(File path) {
		try {
			Os.chmod(path.getAbsolutePath(), 0700);
		} catch (ErrnoException e) {
		}
	}

	public static Map<String, String> getEnvironment() {

		if (!ENV_VARS.isEmpty()) {
			return ENV_VARS;
		}

		ENV_VARS.put("PREFIX", PREFIX.getAbsolutePath());
		ENV_VARS.put("HOME", HOME.getAbsolutePath());
		ENV_VARS.put("ANDROID_USER_HOME", HOME.getAbsolutePath() + "/.android");
		ENV_VARS.put("TMPDIR", TMP_DIR.getAbsolutePath());
		ENV_VARS.put("LANG", "en_US.UTF-8");
		ENV_VARS.put("LC_ALL", "en_US.UTF-8");

		ENV_VARS.put("SYSROOT", PREFIX.getAbsolutePath());

		ENV_VARS.put("SHELL", SHELL.getAbsolutePath());
		ENV_VARS.put("CONFIG_SHELL", SHELL.getAbsolutePath());
		ENV_VARS.put("TERM", "screen");
		ENV_VARS.put("PATH", BIN_DIR.getAbsolutePath());

		String ld = System.getenv("LD_LIBRARY_PATH");
		if (ld == null || ld.trim().length() <= 0) {
			ld = "";
		} else {
			ld += File.pathSeparator;
		}
		ld += LIB_DIR.getAbsolutePath();
		ENV_VARS.put("LD_LIBRARY_PATH", ld);

		// https://github.com/termux/termux-tools/blob/f2736f7f8232cd19cf52bca9b0ac9afb8ad9e562/scripts/termux-setup-package-manager.in#L3
		ENV_VARS.put("TERMUX_APP_PACKAGE_MANAGER", "apt");
		ENV_VARS.put("TERMUX_PKG_NO_MIRROR_SELECT", "true");

		addToEnvIfPresent(ENV_VARS, "ANDROID_ART_ROOT");
		addToEnvIfPresent(ENV_VARS, "DEX2OATBOOTCLASSPATH");
		addToEnvIfPresent(ENV_VARS, "ANDROID_I18N_ROOT");
		addToEnvIfPresent(ENV_VARS, "ANDROID_RUNTIME_ROOT");
		addToEnvIfPresent(ENV_VARS, "ANDROID_TZDATA_ROOT");
		addToEnvIfPresent(ENV_VARS, "ANDROID_DATA");
		addToEnvIfPresent(ENV_VARS, "ANDROID_ROOT");

		for (String key : IDE_PROPS.keySet()) {
			if (!blacklistedVariables().contains(key.trim())) {
				ENV_VARS.put(key, readProp(key, ""));
			}
		}

		return ENV_VARS;
	}

	private static List<String> blacklistedVariables() {
		if (blacklist.isEmpty()) {
			blacklist.add("HOME");
			blacklist.add("SYSROOT");
		}
		return blacklist;
	}

	public static String readProp(String key, String defaultValue) {
		String value = IDE_PROPS.getOrDefault(key, defaultValue);
		if (value == null) {
			return defaultValue;
		}
		if (value.contains("$HOME")) {
			value = value.replace("$HOME", HOME.getAbsolutePath());
		}
		if (value.contains("$SYSROOT")) {
			value = value.replace("$SYSROOT", PREFIX.getAbsolutePath());
		}
		if (value.contains("$PATH")) {
			value = value.replace("$PATH", BIN_DIR.getAbsolutePath());
		}
		return value;
	}

	public static void addToEnvIfPresent(Map<String, String> environment, String name) {
		String value = System.getenv(name);
		if (value != null) {
			environment.put(name, value);
		}
	}

	public static String getDataDir(Context context) {
		PackageManager pm = context.getPackageManager();
		String packageName = context.getPackageName();
		PackageInfo packageInfo;
		try {
			packageInfo = pm.getPackageInfo(packageName, 0);
			return packageInfo.applicationInfo.dataDir;
		} catch (PackageManager.NameNotFoundException e) {
			return "";
		}
	}
}

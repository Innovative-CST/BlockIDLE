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

package com.icst.blockidle.tooling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.function.Consumer;

import com.icst.blockidle.util.EnvironmentUtils;

import android.content.Context;

public class ToolingProcess {

	private final Context context;
	private Process process;
	private Consumer<String> notifier;

	public ToolingProcess(Context context, Consumer<String> notifier) {
		this.context = context;
		this.notifier = notifier;
	}

	public void start() {
		try {
			File jar = copyJarFromAssets();

			ProcessBuilder pb = new ProcessBuilder(
					EnvironmentUtils.PREFIX.getAbsolutePath() + "/bin/java",
					"--add-opens",
					"java.base/java.lang=ALL-UNNAMED",
					"--add-opens",
					"java.base/java.io=ALL-UNNAMED",
					"--add-opens",
					"java.base/java.util=ALL-UNNAMED",
					"-jar",
					jar.getAbsolutePath());

			Map<String, String> env = pb.environment();

			env.put("PREFIX", EnvironmentUtils.PREFIX.getAbsolutePath());
			env.put("HOME", EnvironmentUtils.HOME.getAbsolutePath());
			env.put("PATH", EnvironmentUtils.PREFIX.getAbsolutePath() + "/bin:"
					+ EnvironmentUtils.PREFIX.getAbsolutePath() + "/bin/applets:/system/bin");
			env.put("LD_LIBRARY_PATH", EnvironmentUtils.LIB_DIR.getAbsolutePath());
			env.put("JAVA_HOME", EnvironmentUtils.PREFIX.getAbsolutePath() + "/lib/jvm/java-17-openjdk");
			env.put("TMPDIR", EnvironmentUtils.TMP_DIR.getAbsolutePath());
			env.put("LANG", "en_US.UTF-8");
			env.put("LC_ALL", "en_US.UTF-8");
			env.put("GRADLE_USER_HOME", EnvironmentUtils.GRADLE_USER_HOME.getAbsolutePath());

			process = pb.start();

			RpcClient client = new RpcClient(
					process.getInputStream(),
					process.getOutputStream(),
					notifier);

			client.testCalls();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private File copyJarFromAssets() throws IOException {
		File out = new File(EnvironmentUtils.IDE_HOME, "tooling-server-all.jar");

		File parent = out.getParentFile();
		if (!parent.exists()) {
			if (!parent.mkdirs()) {
				throw new IOException("Failed to create directory: " + parent.getAbsolutePath());
			}
		}

		if (out.exists())
			out.delete();

		try (InputStream in = context.getAssets().open("tooling-server-all.jar");
				OutputStream os = new FileOutputStream(out)) {
			byte[] buf = new byte[8192];
			int r;
			while ((r = in.read(buf)) != -1)
				os.write(buf, 0, r);
		}
		return out;
	}

	public void stop() {
		if (process != null)
			process.destroy();
	}
}
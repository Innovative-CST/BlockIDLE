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

package com.icst.blockidle.application;

import com.icst.blockidle.BuildConfig;
import com.icst.blockidle.activities.crash_handler.CrashHandlerActivity;
import com.icst.blockidle.util.EnvironmentUtils;
import com.icst.blockidle.util.ProjectEnvironment;
import com.icst.editor.editors.sora.lang.textmate.provider.TextMateProvider;

import android.app.AlarmManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.util.Log;
import android.widget.Toast;

import io.github.rosemoe.sora.langs.textmate.registry.FileProviderRegistry;
import io.github.rosemoe.sora.langs.textmate.registry.provider.AssetsFileResolver;

public class MyApplication extends Application {

	private static Context mApplicationContext;
	private Thread.UncaughtExceptionHandler uncaughtExceptionHandler;

	@Override
	public void onCreate() {
		super.onCreate();
		mApplicationContext = getApplicationContext();
		uncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();

		ProjectEnvironment.init(this);
		EnvironmentUtils.init();

		FileProviderRegistry fileProviderRegistry = FileProviderRegistry.getInstance();
		AssetsFileResolver assetsFileResolver = new AssetsFileResolver(getAssets());
		fileProviderRegistry.addFileProvider(assetsFileResolver);
		try {
			TextMateProvider.loadGrammars();
		} catch (Exception e) {
			Toast.makeText(this, e.getMessage(), Toast.LENGTH_LONG).show();
		}

		Thread.setDefaultUncaughtExceptionHandler(
				new Thread.UncaughtExceptionHandler() {
					@Override
					public void uncaughtException(Thread thread, Throwable throwable) {
						Intent intent = new Intent(getApplicationContext(), CrashHandlerActivity.class);
						intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);

						intent.putExtra("error", getError(throwable));
						PendingIntent pendingIntent = PendingIntent.getActivity(
								getApplicationContext(),
								11111,
								intent,
								PendingIntent.FLAG_ONE_SHOT);

						AlarmManager am = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
						am.set(AlarmManager.ELAPSED_REALTIME_WAKEUP, 1000, pendingIntent);

						Process.killProcess(Process.myPid());
						System.exit(1);

						uncaughtExceptionHandler.uncaughtException(thread, throwable);
					}
				});

		super.onCreate();
	}

	private static String getError(Throwable throwable) {
		StringBuilder error = new StringBuilder();
		error.append("App Version: ")
				.append(BuildConfig.VERSION_NAME)
				.append("\n")
				.append("Build Type: ")
				.append(BuildConfig.BUILD_TYPE)
				.append("\n")
				.append("SDK: ")
				.append(Build.VERSION.SDK_INT)
				.append("\n")
				.append("Android: ")
				.append(Build.VERSION.RELEASE)
				.append("\n")
				.append("Model: ")
				.append(Build.VERSION.INCREMENTAL)
				.append("\n")
				.append("Base OS: ")
				.append(Build.VERSION.BASE_OS)
				.append("\n")
				.append("SUPPORTED_ABIS: ")
				.append(Build.SUPPORTED_ABIS)
				.append("\n")
				.append("SUPPORTED_32_BIT_ABIS: ")
				.append(Build.SUPPORTED_32_BIT_ABIS)
				.append("\n")
				.append("SUPPORTED_64_BIT_ABIS: ")
				.append(Build.SUPPORTED_64_BIT_ABIS)
				.append("\n")
				.append("Manufacturer: ")
				.append(Build.MANUFACTURER)
				.append("\n")
				.append("Device External Storage: ")
				.append(Environment.getExternalStorageDirectory())
				.append("\n\n")
				.append(Log.getStackTraceString(throwable));
		return error.toString();
	}
}

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

package com.icst.blockidle.service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.icst.blockidle.R;
import com.icst.blockidle.tooling.ToolingProcess;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;

import androidx.core.app.NotificationCompat;

public class ToolingService extends Service {

	private ExecutorService executor;
	private ToolingProcess toolingProcess;

	private static final String CHANNEL_ID = "tooling_server";
	private static final int NOTIFICATION_ID = 1;

	@Override
	public void onCreate() {
		super.onCreate();
		createNotificationChannel();
		executor = Executors.newCachedThreadPool();
	}

	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		startForeground(NOTIFICATION_ID, buildNotification("Tooling server starting…"));

		executor.execute(() -> {
			toolingProcess = new ToolingProcess(this, this::updateNotification);
			toolingProcess.start();
		});

		return START_STICKY;
	}

	@Override
	public void onDestroy() {
		if (toolingProcess != null)
			toolingProcess.stop();
		executor.shutdownNow();
		super.onDestroy();
	}

	private final ToolingBinder binder = new ToolingBinder();

	@Override
	public IBinder onBind(Intent intent) {
		return binder;
	}

	public class ToolingBinder extends Binder {
		public ToolingService getService() {
			return ToolingService.this;
		}
	}

	private Notification buildNotification(String text) {
		Log.i("ToolingService", text);
		return new NotificationCompat.Builder(this, CHANNEL_ID)
				.setContentTitle("BlockIdle Tooling Server")
				.setContentText(text)
				.setSmallIcon(R.drawable.console_line)
				.setOnlyAlertOnce(true)
				.setOngoing(true)
				.build();
	}

	private void updateNotification(String text) {
		new Handler(Looper.getMainLooper()).post(() -> {
			NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
			nm.notify(NOTIFICATION_ID, buildNotification(text));
		});
	}

	private void createNotificationChannel() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
			NotificationChannel channel = new NotificationChannel(
					CHANNEL_ID,
					"Tooling Server",
					NotificationManager.IMPORTANCE_LOW);
			channel.setDescription("Gradle / Tooling API server");
			getSystemService(NotificationManager.class)
					.createNotificationChannel(channel);
		}
	}
}
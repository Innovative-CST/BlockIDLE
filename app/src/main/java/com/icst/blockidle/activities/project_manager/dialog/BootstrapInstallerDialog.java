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

package com.icst.blockidle.activities.project_manager.dialog;

import java.util.concurrent.CompletableFuture;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.icst.blockidle.activities.terminal.EnvironmentUtils;
import com.icst.blockidle.activities.terminal.TerminalActivity;
import com.icst.blockidle.databinding.DialogBootstrapInstallerBinding;
import com.icst.blockidle.terminal.BootstrapInstaller;
import com.icst.editor.tools.Language;
import com.icst.editor.tools.Themes;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class BootstrapInstallerDialog extends MaterialAlertDialogBuilder {
	private Activity activity;
	private AlertDialog dialog;
	private DialogBootstrapInstallerBinding binding;

	public BootstrapInstallerDialog(
			AppCompatActivity activity, BootstrapInstallCompletionListener listener) {
		super(activity);
		this.activity = activity;
		binding = DialogBootstrapInstallerBinding.inflate(LayoutInflater.from(activity));
		binding.editor.setEditable(false);
		binding.editor.setLanguageMode(Language.BOOTSTRAP_INSTALLER_LOG);
		binding.editor.setTheme(Themes.SoraEditorTheme.Light.Quietlight);
		setView(binding.getRoot());
		setTitle("Installing Bootstrap");
		setCancelable(false);
		StringBuilder log = new StringBuilder();

		final CompletableFuture<Void> future = BootstrapInstaller.install(
				activity,
				new BootstrapInstaller.ProgressListener() {
					@Override
					public void onProgress(String message) {
						log.append(message);
						log.append("\n");
						activity.runOnUiThread(
								() -> {
									binding.editor.setText(log.toString());
								});
					}
				},
				EnvironmentUtils.PREFIX);

		future.whenComplete(
				(voidResult, throwable) -> {
					activity.runOnUiThread(
							() -> {
								listener.onComplete();
								binding.install.setVisibility(View.VISIBLE);
							});
				});
		dialog = create();
		dialog.show();
		binding.install.setOnClickListener(v -> launchTerminal());
	}

	public void launchTerminal() {
		Intent terminal = new Intent(activity, TerminalActivity.class);
		activity.startActivity(terminal);
	}

	public interface BootstrapInstallCompletionListener {
		void onComplete();
	}
}

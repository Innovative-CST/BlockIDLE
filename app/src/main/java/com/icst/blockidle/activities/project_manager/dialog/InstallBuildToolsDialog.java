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

import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.icst.blockidle.R;
import com.termux.app.TermuxActivity;

import android.app.Activity;
import android.content.Intent;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class InstallBuildToolsDialog extends MaterialAlertDialogBuilder {
	private Activity activity;
	private AlertDialog dialog;

	public InstallBuildToolsDialog(AppCompatActivity activity) {
		super(activity);
		this.activity = activity;
		setTitle("Install Build Tools");
		setIcon(R.drawable.console_line);
		setMessage(
				"Please install the build tools to continue using app. Build tools are required to provide essential files and binaries to app, please contact developer for any help or open issue on GitHub.");
		setCancelable(false);
		setPositiveButton("Terminal", (v, which) -> launchTerminal());
	}

	public void launchTerminal() {
		Intent terminal = new Intent(activity, TermuxActivity.class);
		activity.startActivity(terminal);
	}
}

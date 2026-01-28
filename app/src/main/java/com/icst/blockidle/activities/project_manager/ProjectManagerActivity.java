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

package com.icst.blockidle.activities.project_manager;

import java.io.File;
import java.util.Objects;

import com.icst.blockidle.R;
import com.icst.blockidle.activities.BaseActivity;
import com.icst.blockidle.activities.project_manager.adapter.ProjectListAdapter;
import com.icst.blockidle.activities.project_manager.dialog.InstallBuildToolsDialog;
import com.icst.blockidle.databinding.ActivityProjectManagerBinding;
import com.icst.blockidle.service.ToolingService;
import com.icst.blockidle.util.EnvironmentUtils;
import com.icst.blockidle.viewmodel.ProjectManagerViewModel;
import com.termux.app.TermuxActivity;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.core.graphics.Insets;
import androidx.core.splashscreen.SplashScreen;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

public class ProjectManagerActivity extends BaseActivity {

	private ActivityProjectManagerBinding binding;
	private ProjectListAdapter adapter;
	private ProjectManagerViewModel mProjectManagerViewModel;
	private InstallBuildToolsDialog dialog;
	private ToolingService toolingService;
	private boolean bound = false;
	private ServiceConnection connection = new ServiceConnection() {
		@Override
		public void onServiceConnected(ComponentName name, IBinder service) {
			ToolingService.ToolingBinder binder = (ToolingService.ToolingBinder) service;
			toolingService = binder.getService();
			bound = true;
		}

		@Override
		public void onServiceDisconnected(ComponentName name) {
			bound = false;
		}
	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		SplashScreen.installSplashScreen(this);
		EdgeToEdge.enable(this);
		super.onCreate(savedInstanceState);

		mProjectManagerViewModel = new ViewModelProvider(this).get(ProjectManagerViewModel.class);
		mProjectManagerViewModel.setActivity(this);
		// Inflate and get instance of binding
		binding = ActivityProjectManagerBinding.inflate(getLayoutInflater());
		binding.setViewModel(mProjectManagerViewModel);

		// set content view to binding's root
		setContentView(binding.getRoot());

		// Calling Methods
		UI();

		Intent intent = new Intent(this, ToolingService.class);
		startForegroundService(intent);
		bindService(intent, connection, Context.BIND_AUTO_CREATE);
	}

	@SuppressLint("NotifyDataSetChanged")
	private void UI() {
		// System Padding
		ViewCompat.setOnApplyWindowInsetsListener(binding.getRoot(), (v, insets) -> {
			Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
			v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
			return insets;
		});

		// Toolbar
		setSupportActionBar(binding.toolbar);
		Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
		binding.toolbar.setTitle(R.string.app_name);

		mProjectManagerViewModel.getProjects()
				.observe(this, data -> {
					adapter.notifyDataSetChanged();
					projectUI();
				});

		// List
		adapter = new ProjectListAdapter(mProjectManagerViewModel.getProjects().getValue());
		binding.projectList.setLayoutManager(new LinearLayoutManager(this));
		binding.projectList.setAdapter(adapter);
		projectUI();

		final File bash = new File(EnvironmentUtils.BIN_DIR, "bash");
		if (!(EnvironmentUtils.PREFIX.exists()
				&& EnvironmentUtils.PREFIX.isDirectory()
				&& bash.exists()
				&& bash.isFile()
				&& bash.canExecute())) {
			dialog = new InstallBuildToolsDialog(this);
			dialog.create().show();
		}
	}

	private void projectUI() {
		if (mProjectManagerViewModel.getProjects().getValue().size() == 0) {
			binding.projectList.setVisibility(View.GONE);
			binding.noProjectsYet.setVisibility(View.VISIBLE);
		} else {
			binding.projectList.setVisibility(View.VISIBLE);
			binding.noProjectsYet.setVisibility(View.GONE);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.project_manager_menu, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem menuItem) {
		if (R.id.terminal == menuItem.getItemId()) {
			Intent terminal = new Intent(this, TermuxActivity.class);
			startActivity(terminal);
		}
		return true;
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		this.binding = null;
		stopService(new Intent(this, ToolingService.class));
	}
}
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

import androidx.lifecycle.ViewModelProvider;
import com.icst.blockidle.plugin.PluginManager;
import java.io.File;
import java.util.Objects;

import com.icst.blockidle.R;
import com.icst.blockidle.activities.BaseActivity;
import com.icst.blockidle.activities.project_manager.adapter.ProjectListAdapter;
import com.icst.blockidle.activities.project_manager.dialog.BootstrapInstallerDialog;
import com.icst.blockidle.activities.terminal.TerminalActivity;
import com.icst.blockidle.databinding.ActivityProjectManagerBinding;
import com.icst.blockidle.util.EnvironmentUtils;
import com.icst.blockidle.viewmodel.ProjectManagerViewModel;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.core.graphics.Insets;
import androidx.core.splashscreen.SplashScreen;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;

public class ProjectManagerActivity extends BaseActivity {

	private ActivityProjectManagerBinding binding;
	private ProjectListAdapter adapter;
	private ProjectManagerViewModel mProjectManagerViewModel;
	private BootstrapInstallerDialog dialog;

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
			dialog = new BootstrapInstallerDialog(
					this,
					new BootstrapInstallerDialog.BootstrapInstallCompletionListener() {
						@Override
						public void onComplete() {
							dialog.setPositiveButton("Dismiss", null);
							dialog.setCancelable(true);
						}
					});
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
			Intent terminal = new Intent(this, TerminalActivity.class);
			startActivity(terminal);
		}
		return true;
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		this.binding = null;
	}
}
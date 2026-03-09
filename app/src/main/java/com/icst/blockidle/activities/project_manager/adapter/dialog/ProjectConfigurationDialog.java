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

package com.icst.blockidle.activities.project_manager.adapter.dialog;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.icst.blockidle.bean.ProjectBean;
import com.icst.blockidle.databinding.DialogProjectConfigBinding;
import com.icst.blockidle.listener.ProjectConfigurationDialogListener;
import com.icst.blockidle.util.ProjectBeanValidator;
import com.icst.blockidle.viewmodel.ProjectConfigurationDialogViewModel;

import android.view.LayoutInflater;

import androidx.appcompat.app.AppCompatActivity;

public class ProjectConfigurationDialog extends MaterialAlertDialogBuilder {

	private ProjectBean projectBean;
	private ProjectConfigurationDialogListener listener;
	private DialogProjectConfigBinding binding;
	private AppCompatActivity activity;
	private ProjectConfigurationDialogViewModel viewModel;

	public ProjectConfigurationDialog(
			AppCompatActivity activity,
			ProjectBean projectBean,
			ProjectConfigurationDialogListener listener) {
		super(activity);
		this.projectBean = projectBean;
		this.listener = listener;
		this.activity = activity;
		init();
	}

	public ProjectConfigurationDialog(
			AppCompatActivity activity,
			ProjectConfigurationDialogListener listener) {
		super(activity);
		this.listener = listener;
		this.activity = activity;
		init();
	}

	private void init() {
		binding = DialogProjectConfigBinding.inflate(LayoutInflater.from(getContext()));

		viewModel = new ProjectConfigurationDialogViewModel();
		viewModel.setProjectBean(projectBean);
		viewModel.setListener(listener);

		binding.setViewModel(viewModel);
		setView(binding.getRoot());

		viewModel.getPackageName().observe(activity, packageName -> {
			boolean isValidPackageName = ProjectBeanValidator.isValidPackageName(packageName);

			binding.packageNameTextInputLayout.setErrorEnabled(!isValidPackageName);
			if (!isValidPackageName) {
				binding.packageNameTextInputLayout.setError("Invalid package name");
			}
		});

		viewModel.getProjectName().observe(activity, projectName -> {
			boolean isValidProjectName = ProjectBeanValidator.isValidProjectName(projectName);
			binding.projectNameTextInputLayout.setErrorEnabled(!isValidProjectName);
			if (!isValidProjectName) {
				binding.projectNameTextInputLayout.setError("Invalid project name");
			}
		});

		binding.packageNameTextInputLayout.setErrorEnabled(false);
		binding.projectNameTextInputLayout.setErrorEnabled(false);
	}
}

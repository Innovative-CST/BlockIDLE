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

package com.icst.blockidle.activities.project_editor.dialog;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.icst.blockidle.activities.project_editor.ProjectEditorActivity;
import com.icst.blockidle.databinding.DialogCreateJavaFileBinding;
import com.icst.blockidle.util.IDLEFolder;
import com.icst.blockidle.util.JavaValidators;
import com.icst.blockidle.util.ProjectBeanValidator;
import com.icst.blockidle.util.ProjectFile;
import com.icst.blockidle.viewmodel.NewJavaClassDialogViewModel;

import android.view.LayoutInflater;

import androidx.appcompat.app.AlertDialog;

public class NewJavaClassDialog extends MaterialAlertDialogBuilder {

	private DialogCreateJavaFileBinding binding;
	private NewJavaClassDialogViewModel viewModel;
	private ProjectEditorActivity projectEditorActivity;
	private IDLEFolder javaDir;
	private ProjectFile projectFile;

	public NewJavaClassDialog(
			ProjectEditorActivity projectEditorActivity,
			IDLEFolder javaDir,
			ProjectFile projectFile) {
		super(projectEditorActivity);
		this.projectEditorActivity = projectEditorActivity;
		this.javaDir = javaDir;
		this.projectFile = projectFile;

		viewModel = new NewJavaClassDialogViewModel();
		viewModel.setProjectEditorActivity(projectEditorActivity);
		viewModel.setProjectFile(projectFile);
		viewModel.setJavaDir(javaDir);
		binding = DialogCreateJavaFileBinding.inflate(LayoutInflater.from(projectEditorActivity));
		binding.setViewModel(viewModel);
		binding.setLifecycleOwner(projectEditorActivity);

		setView(binding.getRoot());

		AlertDialog alertDialog = create();
		alertDialog.show();
		viewModel.setAlertDialog(alertDialog);

		viewModel.getPackageName().observe(projectEditorActivity, packageName -> {
			boolean isValidPackageName = ProjectBeanValidator.isValidPackageName(packageName);

			binding.packageNameTextInputLayout.setErrorEnabled(!isValidPackageName);
			if (!isValidPackageName) {
				binding.packageNameTextInputLayout.setError("Invalid package name");
			}
		});

		viewModel.getJavaClassName().observe(projectEditorActivity, className -> {
			boolean isValidClassName = JavaValidators.isValidJavaClassName(className);

			binding.classNameTextInputLayout.setErrorEnabled(!isValidClassName);
			if (!isValidClassName) {
				binding.classNameTextInputLayout.setError("Invalid class name");
			}
		});

		// Do not show error initially
		binding.classNameTextInputLayout.setErrorEnabled(false);
	}

}

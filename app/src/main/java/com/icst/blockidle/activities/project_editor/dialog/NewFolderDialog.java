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
import com.icst.blockidle.activities.project_editor.viewmodel.NewFolderDialogViewModel;
import com.icst.blockidle.databinding.DialogCreateFolderBinding;
import com.icst.blockidle.util.FolderValidators;
import com.icst.blockidle.util.IDLEFolder;

import android.view.LayoutInflater;

import androidx.appcompat.app.AlertDialog;

public class NewFolderDialog extends MaterialAlertDialogBuilder {

	private DialogCreateFolderBinding binding;
	private NewFolderDialogViewModel viewModel;

	public NewFolderDialog(ProjectEditorActivity activity, IDLEFolder parent) {
		super(activity);
		LayoutInflater layoutInflator = LayoutInflater.from(activity);

		viewModel = new NewFolderDialogViewModel();
		viewModel.setParentDirectory(parent);
		viewModel.setContext(activity);
		binding = DialogCreateFolderBinding.inflate(layoutInflator);
		binding.setViewModel(viewModel);
		binding.setLifecycleOwner(activity);

		setView(binding.getRoot());

		AlertDialog alertDialog = create();
		alertDialog.show();
		viewModel.setAlertDialog(alertDialog);

		viewModel.getFolderName().observe(activity, folderName -> {
			boolean isValidFolderName = FolderValidators.isValid(folderName);
			boolean isFolderAlreadyExists = parent.exists(folderName);

			binding.folderNameTextInputLayout.setErrorEnabled(!isValidFolderName || isFolderAlreadyExists);
			if (!isValidFolderName) {
				binding.folderNameTextInputLayout.setError("Invalid folder name");
			}

			if (isFolderAlreadyExists) {
				binding.folderNameTextInputLayout.setError("Folder/file already exists");
			}
		});

		// Do not show error initially
		binding.folderNameTextInputLayout.setErrorEnabled(false);
	}
}

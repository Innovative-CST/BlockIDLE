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

package com.icst.blockidle.activities.project_editor.java_editor.variable_manager.dialog;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.icst.blockidle.databinding.DialogVariableConfigurationBinding;
import com.icst.blockidle.viewmodel.VariableConfigDialogViewModel;

import android.view.LayoutInflater;
import android.widget.ArrayAdapter;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

public class VariableConfigurationDialog extends MaterialAlertDialogBuilder {

	private DialogVariableConfigurationBinding binding;
	private VariableConfigDialogViewModel viewModel;
	private AlertDialog alertDialog;

	public VariableConfigurationDialog(Fragment fragmenet) {
		super(fragmenet.getContext());

		LayoutInflater inflator = LayoutInflater.from(fragmenet.getContext());
		binding = DialogVariableConfigurationBinding.inflate(inflator);

		viewModel = new VariableConfigDialogViewModel();

		binding.setViewModel(viewModel);
		setView(binding.getRoot());

		String[] suggestions = { "String", "Integer", "Float", "Double" };

		ArrayAdapter<String> adapter = new ArrayAdapter<String>(
				getContext(),
				android.R.layout.simple_dropdown_item_1line,
				suggestions);

		binding.datatypeTextInputAutoCompletion.setAdapter(adapter);
		binding.datatypeTextInputAutoCompletion
				.setOnClickListener(v -> binding.datatypeTextInputAutoCompletion.showDropDown());

		alertDialog = create();
		viewModel.setAlertDialog(alertDialog);
		alertDialog.show();
	}
}

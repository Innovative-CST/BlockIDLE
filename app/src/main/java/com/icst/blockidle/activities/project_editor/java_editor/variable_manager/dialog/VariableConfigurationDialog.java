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
import com.icst.blockidle.activities.project_editor.java_editor.variable_manager.BaseVariableManagerFragment;
import com.icst.blockidle.bean.VariableBean;
import com.icst.blockidle.databinding.DialogVariableConfigurationBinding;
import com.icst.blockidle.repository.VariableRepository;
import com.icst.blockidle.viewmodel.VariableConfigDialogViewModel;

import android.view.LayoutInflater;

import androidx.appcompat.app.AlertDialog;

public class VariableConfigurationDialog extends MaterialAlertDialogBuilder {

	private DialogVariableConfigurationBinding binding;
	private VariableConfigDialogViewModel viewModel;
	private AlertDialog alertDialog;
	public String initialVariableName;

	public VariableConfigurationDialog(BaseVariableManagerFragment fragment, VariableBean variableBean, boolean isNew,
			VariableRepository.REPO repo) {
		super(fragment.getContext());

		LayoutInflater inflator = LayoutInflater.from(fragment.getContext());
		binding = DialogVariableConfigurationBinding.inflate(inflator);
		initialVariableName = isNew ? null : variableBean.getProcessedVariableName();
		viewModel = new VariableConfigDialogViewModel();
		viewModel.setOnVariableConfigChangeListener(new VariableConfigDialogViewModel.OnVariableConfigChangeListener() {
			@Override
			public void onConfigurationSave(VariableBean variableBean) {
				if (variableBean != null) {
					if (isNew) {
						fragment.getVariableRepository().createVariable(variableBean, repo);
					} else {
						fragment.getVariableRepository().updateVariable(variableBean, initialVariableName, repo);
					}
				}
			}
		});
		if (isNew) {
			VariableBean newVariableBean = new VariableBean();
			newVariableBean.setAccessModifier(VariableBean.ACCESS_MODIFIER_PUBLIC);
			newVariableBean.setIsStaticVariable(repo == VariableRepository.REPO.STATIC_VARIABLE);
			viewModel.setVariableBean(newVariableBean);
		} else {
			viewModel.setVariableBean(variableBean);
		}

		binding.setViewModel(viewModel);
		setView(binding.getRoot());

		binding.selectDatatype
				.setOnClickListener(v -> {
					DatatypeSelectorDialog dialog = new DatatypeSelectorDialog(
							fragment.getActivity(),
							(dtype) -> {
								binding.selectDatatypeText.setText(dtype.getFullClassName());
								viewModel.getVariableBean().setVariableDataType(dtype);
							});
				});

		alertDialog = create();
		viewModel.setAlertDialog(alertDialog);
		alertDialog.show();
	}
}

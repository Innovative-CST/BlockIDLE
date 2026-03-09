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

package com.icst.blockidle.viewmodel;

import com.icst.blockidle.bean.VariableBean;

import androidx.appcompat.app.AlertDialog;
import androidx.lifecycle.ViewModel;

public class VariableConfigDialogViewModel extends ViewModel {

	private VariableBean variableBean;
	private AlertDialog alertDialog;
	private OnVariableConfigChangeListener listener;

	public interface OnVariableConfigChangeListener {
		void onConfigurationSave(VariableBean variableBean);
	}

	public void setOnVariableConfigChangeListener(OnVariableConfigChangeListener listener) {
		this.listener = listener;
	}

	public VariableBean getVariableBean() {
		return this.variableBean;
	}

	public void setVariableBean(VariableBean variableBean) {
		this.variableBean = variableBean;
	}

	public String getVariableName() {
		// Return a empty string instead of null value
		if (variableBean == null)
			return "";
		if (variableBean.getNonFixedVariableName() == null)
			return "";

		return variableBean.getNonFixedVariableName();
	}

	public void setVariableName(String name) {
		variableBean.setVariableName(name);
	}

	public AlertDialog getAlertDialog() {
		return this.alertDialog;
	}

	public void setAlertDialog(AlertDialog alertDialog) {
		this.alertDialog = alertDialog;
	}

	public void save() {
		listener.onConfigurationSave(variableBean);
		alertDialog.dismiss();
	}

	public void cancel() {
		alertDialog.dismiss();
	}
}

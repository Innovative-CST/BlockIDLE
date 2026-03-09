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

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class VariableViewModel extends ViewModel {

	private final MutableLiveData<VariableBean> variable;

	public VariableViewModel(VariableBean variable) {
		this.variable = new MutableLiveData<VariableBean>(variable);
	}

	public MutableLiveData<VariableBean> getVariable() {
		return this.variable;
	}

	public void openVariableConfig() {
		// TODO: Displah dialog for configuring variable
	}

	public String getVariableTypeFirstLetter() {
		String dataType = variable.getValue().getVariableDataType().getClassName();

		if (dataType == null) {
			dataType = "null";
		} else if (dataType.isEmpty()) {
			dataType = "null";
		}

		return String.valueOf(dataType.charAt(0));
	}

	public String getVariableName() {
		return variable.getValue().getVariableName();
	}

	public String getVariableDatatype() {
		return variable.getValue().getVariableDataType().getFullClassName();
	}
}

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

package com.icst.blockidle.repository;

import java.io.File;
import java.util.ArrayList;

import com.icst.blockidle.bean.VariableBean;
import com.icst.blockidle.util.SerializationUtils;

import androidx.lifecycle.MutableLiveData;

public class VariableRepository {

	private File variableFile;
	private ArrayList<VariableBean> variables;
	private final MutableLiveData<ArrayList<VariableBean>> data;

	public VariableRepository(File file) {
		this.variableFile = file;
		loadVariables();
		data = new MutableLiveData<ArrayList<VariableBean>>(variables);
	}

	@SuppressWarnings("unchecked")
	private void loadVariables() {
		variables = SerializationUtils.deserialize(variableFile, ArrayList.class);
		if (variables == null) {
			variables = new ArrayList<VariableBean>();
		}
	}

	public void reload() {
		loadVariables();
		data.postValue(variables);
	}

	public MutableLiveData<ArrayList<VariableBean>> getData() {
		return this.data;
	}
}

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

import java.util.ArrayList;

import com.icst.blockidle.bean.VariableBean;
import com.icst.blockidle.util.IDLEJavaFile;
import com.icst.blockidle.util.SerializationUtils;

import androidx.lifecycle.MutableLiveData;

public class VariableRepository {

	private IDLEJavaFile javaFile;
	private ArrayList<VariableBean> variables;
	private ArrayList<VariableBean> instanceVariable;
	private ArrayList<VariableBean> staticVariable;
	private final MutableLiveData<ArrayList<VariableBean>> instanceVariableData;
	private final MutableLiveData<ArrayList<VariableBean>> staticVariableData;

	public VariableRepository(IDLEJavaFile javaFile) {
		this.javaFile = javaFile;
		loadVariables();
		instanceVariableData = new MutableLiveData<ArrayList<VariableBean>>(instanceVariable);
		staticVariableData = new MutableLiveData<ArrayList<VariableBean>>(staticVariable);
	}

	@SuppressWarnings("unchecked")
	private void loadVariables() {
		variables = new ArrayList<VariableBean>();
		instanceVariable = SerializationUtils.deserialize(javaFile.getInstanceVariableFile(), ArrayList.class);
		staticVariable = SerializationUtils.deserialize(javaFile.getStaticVariableFile(), ArrayList.class);

		if (instanceVariable == null) {
			instanceVariable = new ArrayList<VariableBean>();
		}

		if (staticVariable == null) {
			staticVariable = new ArrayList<VariableBean>();
		}

		variables.addAll(instanceVariable);
		variables.addAll(staticVariable);
	}

	public boolean canCreateVariable(String name) {
		return variables.stream().map(VariableBean::getVariableName).anyMatch(name::equals);
	}

	public void reload() {
		loadVariables();
		instanceVariableData.postValue(instanceVariable);
		staticVariableData.postValue(staticVariable);
	}

	public MutableLiveData<ArrayList<VariableBean>> getInstanceVariableData() {
		return this.instanceVariableData;
	}

	public MutableLiveData<ArrayList<VariableBean>> getStaticVariableData() {
		return this.staticVariableData;
	}
}

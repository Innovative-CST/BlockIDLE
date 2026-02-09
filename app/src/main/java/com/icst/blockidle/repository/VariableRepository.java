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
import com.icst.blockidle.listener.SerializationListener;
import com.icst.blockidle.util.IDLEJavaFile;
import com.icst.blockidle.util.SerializationUtils;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

public class VariableRepository {

	private IDLEJavaFile javaFile;
	private ArrayList<VariableBean> variables;
	private ArrayList<VariableBean> instanceVariable;
	private ArrayList<VariableBean> staticVariable;
	private final MutableLiveData<ArrayList<VariableBean>> instanceVariableData;
	private final MutableLiveData<ArrayList<VariableBean>> staticVariableData;
	private final MutableLiveData<ArrayList<VariableBean>> variableData;

	public enum REPO {
		STATIC_VARIABLE, INSTANCE_VARIABLE
	}

	public VariableRepository(IDLEJavaFile javaFile) {
		this.javaFile = javaFile;
		loadVariables();
		instanceVariableData = new MutableLiveData<ArrayList<VariableBean>>(instanceVariable);
		staticVariableData = new MutableLiveData<ArrayList<VariableBean>>(staticVariable);
		variableData = new MutableLiveData<ArrayList<VariableBean>>(variables);
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
		return !variables.stream().map(VariableBean::getVariableName).anyMatch(name::equals);
	}

	public boolean createVariable(VariableBean variable, REPO repo) {
		if (variable == null || !canCreateVariable(variable.getProcessedVariableName())) {
			return false;
		}
		if (REPO.STATIC_VARIABLE == repo) {
			staticVariable.add(variable);
			variables.add(variable);
			variableData.postValue(variables);
			staticVariableData.postValue(staticVariable);
			SerializationUtils.serialize(staticVariable, javaFile.getStaticVariableFile(), new SerializationListener() {
				public void onSerializationFailed(Exception exception) {
					Log.e("VariableRepository", exception.getMessage());
				}

				public void onSerializationSucess() {
				}
			});
			return true;
		} else if (REPO.INSTANCE_VARIABLE != repo) {
			return true;
		} else {
			instanceVariable.add(variable);
			variables.add(variable);
			instanceVariableData.postValue(instanceVariable);
			variableData.postValue(variables);
			SerializationUtils.serialize(instanceVariable, javaFile.getInstanceVariableFile(),
					new SerializationListener() {
						public void onSerializationFailed(Exception exception) {
							Log.e("VariableRepository", exception.getMessage());
						}

						public void onSerializationSucess() {
						}
					});
			return true;
		}
	}

	public boolean updateVariable(VariableBean variable, String initialName, REPO repo) {
		if (variable == null || initialName == null) {
			return false;
		}
		if (!initialName.equals(variable.getVariableName())
				&& !canCreateVariable(variable.getProcessedVariableName())) {
			return false;
		}
		if (REPO.STATIC_VARIABLE == repo) {
			staticVariableData.postValue(staticVariable);
			variableData.postValue(variables);
			SerializationUtils.serialize(staticVariable, javaFile.getStaticVariableFile(), new SerializationListener() {
				public void onSerializationFailed(Exception exception) {
					Log.e("VariableRepository", exception.getMessage());
				}

				public void onSerializationSucess() {
				}
			});
			return true;
		} else if (REPO.INSTANCE_VARIABLE != repo) {
			return true;
		} else {
			instanceVariableData.postValue(instanceVariable);
			variableData.postValue(variables);
			SerializationUtils.serialize(instanceVariable, javaFile.getInstanceVariableFile(),
					new SerializationListener() {
						public void onSerializationFailed(Exception exception) {
							Log.e("VariableRepository", exception.getMessage());
						}

						public void onSerializationSucess() {
						}
					});
			return true;
		}
	}

	public void reload() {
		loadVariables();
		instanceVariableData.postValue(instanceVariable);
		staticVariableData.postValue(staticVariable);
		variableData.postValue(variables);
	}

	public MutableLiveData<ArrayList<VariableBean>> getInstanceVariableData() {
		return this.instanceVariableData;
	}

	public MutableLiveData<ArrayList<VariableBean>> getStaticVariableData() {
		return this.staticVariableData;
	}
}

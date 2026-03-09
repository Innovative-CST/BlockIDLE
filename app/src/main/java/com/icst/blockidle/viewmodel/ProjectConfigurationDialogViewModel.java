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

import com.icst.blockidle.bean.ProjectBean;
import com.icst.blockidle.listener.ProjectConfigurationDialogListener;
import com.icst.blockidle.util.ProjectBeanValidator;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ProjectConfigurationDialogViewModel extends ViewModel {

	private ProjectBean projectBean;
	private ProjectConfigurationDialogListener listener;
	private final MutableLiveData<String> projectName = new MutableLiveData<>("");
	private final MutableLiveData<String> packageName = new MutableLiveData<>("");

	public String getConfigMode() {
		if (projectBean == null) {
			return "Create";
		} else {
			return "Update";
		}
	}

	public void onCancel() {
		listener.onCancel();
	}

	public void onCreate() {
		boolean isValidPackageName = ProjectBeanValidator.isValidPackageName(packageName.getValue());
		boolean isValidProjectName = ProjectBeanValidator.isValidProjectName(projectName.getValue());

		if (isValidProjectName && isValidPackageName) {
			if (projectBean == null) {
				ProjectBean projectBean = new ProjectBean();
				projectBean.setProjectPackageName(packageName.getValue() == null ? "null" : packageName.getValue());
				projectBean.setProjectName(projectName.getValue() == null ? "null" : projectName.getValue());
				listener.onCreateNewProject(projectBean);
			} else {
				projectBean.setProjectPackageName(packageName.getValue() == null ? "null" : packageName.getValue());
				projectBean.setProjectName(projectName.getValue() == null ? "null" : projectName.getValue());
				listener.onProjectConfigChange(projectBean);
			}
		} else {
			projectName.postValue(projectName.getValue());
			packageName.postValue(packageName.getValue());
		}

	}

	public ProjectBean getProjectBean() {
		return this.projectBean;
	}

	public void setProjectBean(ProjectBean projectBean) {
		this.projectBean = projectBean;
		if (projectBean != null) {
			projectName.postValue(projectBean.getProjectName());
			packageName.postValue(projectBean.getProjectPackageName());
		}
	}

	public ProjectConfigurationDialogListener getListener() {
		return this.listener;
	}

	public void setListener(ProjectConfigurationDialogListener listener) {
		this.listener = listener;
	}

	public MutableLiveData<String> getProjectName() {
		return this.projectName;
	}

	public MutableLiveData<String> getPackageName() {
		return this.packageName;
	}
}

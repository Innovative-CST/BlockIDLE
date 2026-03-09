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

import com.icst.blockidle.activities.project_editor.ProjectEditorActivity;
import com.icst.blockidle.activities.project_manager.adapter.dialog.ProjectConfigurationDialog;
import com.icst.blockidle.bean.ProjectBean;
import com.icst.blockidle.exception.ProjectUpdateException;
import com.icst.blockidle.listener.ProjectConfigurationDialogListener;
import com.icst.blockidle.repository.ProjectRepository;
import com.icst.blockidle.util.ProjectFile;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ProjectAdapterViewModel extends ViewModel {

	//ViewModel
	private ProjectFile projectFile;
	@SuppressLint("StaticFieldLeak")
	private AppCompatActivity activity;

	private final MutableLiveData<String> projectName = new MutableLiveData<>("Null");
	private final MutableLiveData<String> packageName = new MutableLiveData<>("Null");

	// Dialog
	private AlertDialog alertDialog;
	private ProjectConfigurationDialog dialog;
	private final ProjectConfigurationDialogListener projectDialogConfigListener;

	public ProjectAdapterViewModel() {
		projectDialogConfigListener = new ProjectConfigurationDialogListener() {

			@Override
			public void onCreateNewProject(ProjectBean newProjectBean) {
				ProjectRepository.getInstance().createProject(newProjectBean);
				alertDialog.dismiss();
			}

			@Override
			public void onProjectConfigChange(ProjectBean projectBean) {
				projectFile.setProjectBean(projectBean);
				try {
					ProjectRepository.getInstance().updateProject(projectFile);
					projectName.postValue(projectBean.getProjectName());
					packageName.postValue(projectBean.getProjectPackageName());
					alertDialog.dismiss();
				} catch (ProjectUpdateException e) {
					Toast.makeText(activity, e.getMessage(), Toast.LENGTH_SHORT).show();
				}
			}

			@Override
			public void onCancel() {
				alertDialog.dismiss();
			}

		};
	}

	public void setProjectFile(ProjectFile projectFile) {
		this.projectFile = projectFile;
		projectName.postValue(projectFile.getProjectBean().getProjectName());
		packageName.postValue(projectFile.getProjectBean().getProjectPackageName());
	}

	public MutableLiveData<String> getProjectName() {
		return projectName;
	}

	public MutableLiveData<String> getPackageName() {
		return packageName;
	}

	public String getProjectNameFirstLetter() {
		return String.valueOf(getProjectName().getValue().charAt(0));
	}

	public void onProjectConfigSelected() {
		if (alertDialog != null) {
			alertDialog.dismiss();
		}
		dialog = new ProjectConfigurationDialog(activity, projectFile.getProjectBean(), projectDialogConfigListener);
		alertDialog = dialog.create();
		alertDialog.show();
	}

	public void onProjectSelected() {
		Intent intent = new Intent(activity, ProjectEditorActivity.class);
		intent.putExtra("projectFile", projectFile);
		activity.startActivity(intent);
	}

	public void setActivity(AppCompatActivity activity) {
		this.activity = activity;
	}
}

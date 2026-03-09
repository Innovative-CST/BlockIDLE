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

import java.util.ArrayList;

import com.icst.blockidle.activities.project_manager.adapter.dialog.ProjectConfigurationDialog;
import com.icst.blockidle.bean.ProjectBean;
import com.icst.blockidle.listener.ProjectConfigurationDialogListener;
import com.icst.blockidle.repository.ProjectRepository;
import com.icst.blockidle.util.ProjectFile;

import android.annotation.SuppressLint;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ProjectManagerViewModel extends ViewModel {

	private final MutableLiveData<ArrayList<ProjectFile>> projects;
	private final ProjectRepository repository;

	@SuppressLint("StaticFieldLeak")
	private AppCompatActivity activity;

	private AlertDialog alertDialog;
	private ProjectConfigurationDialog dialog;
	private ProjectConfigurationDialogListener projectDialogConfigListener;

	public ProjectManagerViewModel() {
		repository = ProjectRepository.getInstance();
		projects = repository.getMutableLiveProjects();
	}

	public LiveData<ArrayList<ProjectFile>> getProjects() {
		return projects;
	}

	public void refreshProjects() {
		projects.postValue(repository.getMutableLiveProjects().getValue());
	}

	public void createNewProject() {
		if (alertDialog != null) {
			alertDialog.dismiss();
		}
		dialog = new ProjectConfigurationDialog(activity, projectDialogConfigListener);
		alertDialog = dialog.create();
		alertDialog.show();
	}

	public AppCompatActivity getActivity() {
		return this.activity;
	}

	public void setActivity(AppCompatActivity activity) {
		this.activity = activity;

		projectDialogConfigListener = new ProjectConfigurationDialogListener() {

			@Override
			public void onCreateNewProject(ProjectBean newProjectBean) {
				ProjectRepository.getInstance().createProject(newProjectBean);
				alertDialog.dismiss();
			}

			@Override
			public void onProjectConfigChange(ProjectBean projectBean) {
				// Ignore, it is not gonna execute
			}

			@Override
			public void onCancel() {
				alertDialog.dismiss();
			}
		};
	}
}

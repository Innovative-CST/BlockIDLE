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
import java.io.Serializable;
import java.util.ArrayList;

import com.icst.blockidle.bean.ProjectBean;
import com.icst.blockidle.exception.ProjectUpdateException;
import com.icst.blockidle.listener.DeserializationListener;
import com.icst.blockidle.listener.SerializationListener;
import com.icst.blockidle.util.ProjectEnvironment;
import com.icst.blockidle.util.ProjectFile;
import com.icst.blockidle.util.SerializationUtils;

import androidx.lifecycle.MutableLiveData;

public class ProjectRepository {

	private ArrayList<ProjectFile> mProjects;
	private MutableLiveData<ArrayList<ProjectFile>> data;
	private static ProjectRepository projectRepository;

	public static final ProjectRepository getInstance() {
		if (projectRepository == null) {
			projectRepository = new ProjectRepository();
			projectRepository.loadProjects();
		}
		return projectRepository;
	}

	public MutableLiveData<ArrayList<ProjectFile>> getMutableLiveProjects() {
		return data;
	}

	public void loadProjects() {
		mProjects = new ArrayList<ProjectFile>();
		File projectsDir = ProjectEnvironment.projectDirectory;

		for (File file : projectsDir.listFiles()) {
			File projectBean = new File(file, ProjectEnvironment.PROJECT_BEAN_FILE);
			if (!projectBean.exists()) {
				continue;
			}

			SerializationUtils.deserialize(
					projectBean,
					new DeserializationListener() {

						@Override
						public void onDeserializationSucess(Serializable object) {
							if (!ProjectBean.class.isInstance(object)) {
								return;
							}
							ProjectFile projectFile = new ProjectFile(file, ProjectBean.class.cast(object));
							mProjects.add(projectFile);
						}

						@Override
						public void onDeserializationFailed(int errorCode, Exception e) {
						}
					});
		}

		if (data == null) {
			data = new MutableLiveData<ArrayList<ProjectFile>>();
			data.setValue(mProjects);
		} else {
			data.postValue(mProjects);
		}
	}

	public void createProject(ProjectBean project) {
		File newProjectDir;
		do {
			String dir = String.valueOf(System.currentTimeMillis());
			newProjectDir = new File(ProjectEnvironment.projectDirectory, dir);
		} while (newProjectDir.exists());

		newProjectDir.mkdirs();
		SerializationUtils.serialize(
				project,
				new File(newProjectDir, ProjectEnvironment.PROJECT_BEAN_FILE),
				new SerializationListener() {

					@Override
					public void onSerializationSucess() {
					}

					@Override
					public void onSerializationFailed(Exception exception) {
					}
				});

		ProjectFile projectFile = new ProjectFile(newProjectDir, project);
		mProjects.add(projectFile);
		getMutableLiveProjects().postValue(mProjects);
	}

	public void updateProject(ProjectFile projectFile) throws ProjectUpdateException {
		File projectBeanFile = new File(projectFile.getFile(), ProjectEnvironment.PROJECT_BEAN_FILE);

		if (!projectBeanFile.exists()) {
			throw new ProjectUpdateException(ProjectUpdateException.PROJECT_NOT_FOUND);
		}

		SerializationUtils.serialize(
				projectFile.getProjectBean(),
				projectBeanFile,
				new SerializationListener() {

					@Override
					public void onSerializationSucess() {
					}

					@Override
					public void onSerializationFailed(Exception exception) {
						// Not gonna fail...
					}
				});
	}
}

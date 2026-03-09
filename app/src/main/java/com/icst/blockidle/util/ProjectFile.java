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

package com.icst.blockidle.util;

import java.io.File;

import com.icst.blockidle.bean.ProjectBean;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;

/* stores ProjectBan file along with file */
public class ProjectFile implements Parcelable {

	private File file;
	private ProjectBean projectBean;

	public ProjectFile(File file, ProjectBean projectBean) {
		this.file = file;
		this.projectBean = projectBean;
	}

	@SuppressWarnings("deprecation")
	protected ProjectFile(Parcel in) {
		this.file = new File(in.readString());

		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
			this.projectBean = in.readSerializable(ProjectBean.class.getClassLoader(), ProjectBean.class);
		} else {
			this.projectBean = (ProjectBean) in.readSerializable();
		}
	}

	public File getFile() {
		return this.file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public ProjectBean getProjectBean() {
		return this.projectBean;
	}

	public void setProjectBean(ProjectBean projectBean) {
		this.projectBean = projectBean;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(file.getAbsolutePath());
		dest.writeSerializable(projectBean);
	}

	@Override
	public int describeContents() {
		return 0;
	}

	public static final Creator<ProjectFile> CREATOR = new Creator<ProjectFile>() {
		@Override
		public ProjectFile createFromParcel(Parcel in) {
			return new ProjectFile(in);
		}

		@Override
		public ProjectFile[] newArray(int size) {
			return new ProjectFile[size];
		}
	};
}

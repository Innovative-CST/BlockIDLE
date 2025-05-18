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

import com.icst.blockidle.repository.VariableRepository;

import android.os.Parcel;
import android.os.Parcelable;

public class IDLEJavaFile extends IDLEFile implements Parcelable {

	private VariableRepository instanceVariableRepository;

	public IDLEJavaFile(File file) {
		super(file);
	}

	public VariableRepository getInstanceVariableRepository() {
		if (instanceVariableRepository == null) {
			File instanceVariableFile = new File(file, EnvironmentUtils.INSTANCE_VARIABLE_FILE);
			instanceVariableRepository = new VariableRepository(instanceVariableFile);
		}
		return instanceVariableRepository;
	}

	@SuppressWarnings("deprecation")
	protected IDLEJavaFile(Parcel in) {
		super(new File(in.readString()));
	}

	public File getEventDirectory() {
		File eventDir = new File(file, EnvironmentUtils.EVENT_FOLDER);
		if (!eventDir.exists()) {
			eventDir.mkdir();
		}
		return eventDir;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(file.getAbsolutePath());
	}

	@Override
	public int describeContents() {
		return 0;
	}

	public static final Creator<IDLEJavaFile> CREATOR = new Creator<IDLEJavaFile>() {
		@Override
		public IDLEJavaFile createFromParcel(Parcel in) {
			return new IDLEJavaFile(in);
		}

		@Override
		public IDLEJavaFile[] newArray(int size) {
			return new IDLEJavaFile[size];
		}
	};
}

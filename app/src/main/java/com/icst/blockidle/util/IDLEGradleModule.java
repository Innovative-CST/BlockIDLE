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

import com.icst.blockidle.bean.IDLEGradleModuleBean;

import android.os.Parcel;
import android.os.Parcelable;

public class IDLEGradleModule extends IDLEFolder implements Parcelable {

	public IDLEGradleModule(File file) {
		super(file);
		IDLEGradleModuleBean fileBean = SerializationUtils.deserialize(new File(file, ProjectEnvironment.IDLEFOLDER),
				IDLEGradleModuleBean.class);
		if (fileBean == null) {
			fileBean = new IDLEGradleModuleBean(file.getName());
		}
		setFileBean(fileBean);
	}

	public IDLEGradleModule(File moduleDir, IDLEGradleModuleBean moduleBean) {
		super(moduleDir, moduleBean);
	}

	@SuppressWarnings("deprecation")
	protected IDLEGradleModule(Parcel in) {
		super(new File(in.readString()));
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(file.getAbsolutePath());
	}

	@Override
	public int describeContents() {
		return 0;
	}

	public static final Creator<IDLEGradleModule> CREATOR = new Creator<IDLEGradleModule>() {
		@Override
		public IDLEGradleModule createFromParcel(Parcel in) {
			return new IDLEGradleModule(in);
		}

		@Override
		public IDLEGradleModule[] newArray(int size) {
			return new IDLEGradleModule[size];
		}
	};
}

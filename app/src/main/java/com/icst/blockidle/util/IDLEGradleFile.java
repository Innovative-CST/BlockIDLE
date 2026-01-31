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

import android.os.Parcel;
import android.os.Parcelable;

public class IDLEGradleFile extends IDLEFile implements Parcelable {

	public IDLEGradleFile(File file) {
		super(file);
	}

	@SuppressWarnings("deprecation")
	protected IDLEGradleFile(Parcel in) {
		super(new File(in.readString()));
	}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(file.getAbsolutePath());
	}

	public static final Creator<IDLEGradleFile> CREATOR = new Creator<IDLEGradleFile>() {
		@Override
		public IDLEGradleFile createFromParcel(Parcel in) {
			return new IDLEGradleFile(in);
		}

		@Override
		public IDLEGradleFile[] newArray(int size) {
			return new IDLEGradleFile[size];
		}
	};
}

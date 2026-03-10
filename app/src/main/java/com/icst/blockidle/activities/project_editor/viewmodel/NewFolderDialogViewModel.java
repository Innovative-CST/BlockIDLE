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

package com.icst.blockidle.activities.project_editor.viewmodel;

import com.icst.blockidle.exception.IDLEFileAlreadyExistsException;
import com.icst.blockidle.util.FolderValidators;
import com.icst.blockidle.util.IDLEFolder;

import android.content.Context;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NewFolderDialogViewModel extends ViewModel {
	private AlertDialog alertDialog;
	private IDLEFolder parentDirectory;
	private Context context;
	private final MutableLiveData<String> folderName = new MutableLiveData<>("");

	public void createFolder() {
		boolean isValidFolderName = FolderValidators.isValid(folderName.getValue());
		boolean isFolderAlreadyExists = parentDirectory.exists(folderName.getValue());

		if (isValidFolderName && !isFolderAlreadyExists) {
			alertDialog.dismiss();
			createFolderInParent();
		} else {
			if (!isValidFolderName || isFolderAlreadyExists) {
				folderName.postValue(folderName.getValue());
			}
		}
	}

	public void createFolderInParent() {
		try {
			parentDirectory.createFolder(folderName.getValue());
		} catch (IDLEFileAlreadyExistsException e) {
			Toast.makeText(context, "IDLEFileAlreadyExistsException occurred", Toast.LENGTH_SHORT).show();
		}
	}

	public void dismissDialog() {
		alertDialog.dismiss();
	}

	public void setAlertDialog(AlertDialog alertDialog) {
		this.alertDialog = alertDialog;
	}

	public void setContext(Context context) {
		this.context = context;
	}

	public void setParentDirectory(IDLEFolder parentDirectory) {
		this.parentDirectory = parentDirectory;
	}

	public MutableLiveData<String> getFolderName() {
		return this.folderName;
	}
}

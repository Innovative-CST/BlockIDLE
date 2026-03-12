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

package com.icst.blockidle.activities.project_editor.sheet;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.icst.blockidle.R;
import com.icst.blockidle.activities.project_editor.ProjectEditorActivity;
import com.icst.blockidle.activities.project_editor.dialog.NewFolderDialog;
import com.icst.blockidle.databinding.BottomsheetFileActionBinding;
import com.icst.blockidle.databinding.LayoutFileActionItemBinding;
import com.icst.blockidle.util.IDLEFile;
import com.icst.blockidle.util.IDLEFolder;

import android.view.LayoutInflater;

public class FileActionBottomSheet extends BottomSheetDialog {
	private BottomsheetFileActionBinding binding;
	private LayoutInflater layoutInflater;
	private IDLEFile file;
	private ProjectEditorActivity activity;

	public FileActionBottomSheet(ProjectEditorActivity activity, IDLEFile file) {
		super(activity);
		this.file = file;
		this.activity = activity;

		layoutInflater = LayoutInflater.from(activity);
		binding = BottomsheetFileActionBinding.inflate(layoutInflater);
		setContentView(binding.getRoot());

		if (file instanceof IDLEFolder folder) {
			addFolderAction(folder);
		}
		binding.dismiss.setOnClickListener(v -> dismiss());
		show();
	}

	public void addFolderAction(IDLEFolder folder) {
		LayoutFileActionItemBinding itemBinding = LayoutFileActionItemBinding.inflate(layoutInflater);

		itemBinding.icon.setImageResource(R.drawable.folder_outline);
		itemBinding.text.setText(R.string.new_folder);
		itemBinding.desc.setText(R.string.creates_a_new_folder_in_the_selected_folder);

		binding.content.addView(itemBinding.getRoot());

		itemBinding.getRoot().setOnClickListener(v -> {
			new NewFolderDialog(activity, folder);
		});
	}
}

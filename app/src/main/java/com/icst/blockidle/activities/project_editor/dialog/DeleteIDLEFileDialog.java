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

package com.icst.blockidle.activities.project_editor.dialog;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.icst.blockidle.R;
import com.icst.blockidle.util.IDLEFile;

import android.content.Context;

public class DeleteIDLEFileDialog extends MaterialAlertDialogBuilder {
	public DeleteIDLEFileDialog(Context context, IDLEFile file) {
		super(context);
		setTitle("Delete File?");
		setIcon(R.drawable.delete_24px);
		setMessage("Are you sure that you want to delete selected file? This action cannot be undone");
		setPositiveButton("Delete", (v, which) -> file.delete());
		setNegativeButton("Cancel", (v, which) -> {
		});
		create().show();
	}
}

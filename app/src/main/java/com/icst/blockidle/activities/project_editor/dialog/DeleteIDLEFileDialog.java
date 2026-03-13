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
import com.icst.blockidle.databinding.DialogDeleteFileBinding;
import com.icst.blockidle.util.IDLEFile;

import android.content.Context;
import android.view.LayoutInflater;

import androidx.core.util.Consumer;

public class DeleteIDLEFileDialog extends MaterialAlertDialogBuilder {

	private Consumer<Void> dismissCallback;

	public DeleteIDLEFileDialog(Context context, IDLEFile file, Consumer<Void> dismissCallback) {
		super(context);
		this.dismissCallback = dismissCallback;

		LayoutInflater layoutInflater = LayoutInflater.from(context);
		DialogDeleteFileBinding binding = DialogDeleteFileBinding.inflate(layoutInflater);
		binding.cancel.setOnClickListener(v -> dismissCallback.accept(null));
		binding.delete.setOnClickListener(v -> {
			file.delete();
			dismissCallback.accept(null);
		});
		setView(binding.getRoot());
	}
}

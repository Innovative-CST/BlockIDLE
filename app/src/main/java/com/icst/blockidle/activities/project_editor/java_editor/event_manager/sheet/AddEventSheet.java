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

package com.icst.blockidle.activities.project_editor.java_editor.event_manager.sheet;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.icst.blockidle.databinding.BottomsheetAddEventBinding;

import android.content.Context;
import android.view.LayoutInflater;

public class AddEventSheet extends BottomSheetDialog {

	private BottomsheetAddEventBinding binding;

	public AddEventSheet(Context context) {
		super(context);

		LayoutInflater layoutInflator = LayoutInflater.from(context);
		binding = BottomsheetAddEventBinding.inflate(layoutInflator);

		setContentView(binding.getRoot());

		show();
	}

}

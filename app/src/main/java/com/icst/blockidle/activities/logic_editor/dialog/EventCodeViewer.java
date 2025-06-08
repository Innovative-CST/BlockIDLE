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

package com.icst.blockidle.activities.logic_editor.dialog;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.icst.blockidle.activities.logic_editor.LogicEditorActivity;
import com.icst.blockidle.bean.EventBean;
import com.icst.blockidle.bean.JavaImportDeclarationBean;
import com.icst.blockidle.databinding.DialogEventCodeBinding;
import com.icst.editor.tools.Themes;

import android.view.LayoutInflater;

public class EventCodeViewer extends MaterialAlertDialogBuilder {

	private DialogEventCodeBinding binding;

	public EventCodeViewer(LogicEditorActivity activity, EventBean event) {
		super(activity);
		LayoutInflater layoutInflator = LayoutInflater.from(activity);
		binding = DialogEventCodeBinding.inflate(layoutInflator);
		binding.eventCode.setEditable(false);
		binding.eventCode.setTheme(Themes.SoraEditorTheme.Light.Default);
		binding.eventCode.setLanguageMode("java");
		binding.eventCode.setText(event.getProcessedCode());

		StringBuilder imports = new StringBuilder();
		event.getAllMetadata(JavaImportDeclarationBean.class).forEach(importDeclaration -> {
			imports.append(importDeclaration.getCode());
			imports.append("\n");
		});

		binding.eventImports.setEditable(false);
		binding.eventImports.setTheme(Themes.SoraEditorTheme.Light.Default);
		binding.eventImports.setLanguageMode("java");
		binding.eventImports.setText(imports.toString());

		setView(binding.getRoot());
		setPositiveButton("Close", null);
	}

}

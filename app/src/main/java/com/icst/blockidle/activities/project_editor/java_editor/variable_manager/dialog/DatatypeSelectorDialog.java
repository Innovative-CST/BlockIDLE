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

package com.icst.blockidle.activities.project_editor.java_editor.variable_manager.dialog;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.zip.ZipInputStream;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.icst.blockidle.ExtensionZipInputStream;
import com.icst.blockidle.activities.project_editor.java_editor.variable_manager.adapter.DatatypeAdapter;
import com.icst.blockidle.bean.DatatypeBean;
import com.icst.blockidle.databinding.DialogDatatypeSelectorBinding;
import com.icst.blockidle.util.ProjectEnvironment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.LinearLayoutManager;

public class DatatypeSelectorDialog extends MaterialAlertDialogBuilder {

	private DialogDatatypeSelectorBinding binding;
	private DatatypeAdapter adapter;
	private DatatypeCallBackListener listener;
	private AlertDialog alertDialog;

	public DatatypeSelectorDialog(Context context, DatatypeCallBackListener listener) {
		super(context);

		LayoutInflater inflator = LayoutInflater.from(context);
		binding = DialogDatatypeSelectorBinding.inflate(inflator);
		this.listener = listener;
		setView(binding.getRoot());

		binding.list.setAdapter(adapter);
		binding.list.setLayoutManager(new LinearLayoutManager(context));

		binding.list.setVisibility(View.GONE);
		loadDatatypes();

		alertDialog = create();
		alertDialog.show();
	}

	private void loadDatatypes() {
		new Thread(() -> {
			ArrayList<DatatypeBean> datatypeBeans = getDatatypeBeans();

			binding.getRoot().post(() -> {
				adapter = new DatatypeAdapter(datatypeBeans, listener, alertDialog);
				binding.list.setAdapter(adapter);
				binding.list.setLayoutManager(new LinearLayoutManager(getContext()));

				binding.list.setVisibility(View.VISIBLE);
				binding.progressbar.setVisibility(View.GONE);
			});
		}).start();
	}

	public interface DatatypeCallBackListener {
		void onDatatypeSelected(DatatypeBean bean);
	}

	public ArrayList<DatatypeBean> getDatatypeBeans() {
		ArrayList<DatatypeBean> datatypes = new ArrayList<DatatypeBean>();

		for (File file : ProjectEnvironment.extensionsDirectory.listFiles()) {
			if (file.isDirectory())
				continue;

			try {
				FileInputStream fis = new FileInputStream(file);
				ZipInputStream zis = new ZipInputStream(fis);
				if (fis != null) {
					fis.close();
				}
				if (zis != null) {
					zis.close();
				}
			} catch (IOException e) {
				continue;
			}

			ExtensionZipInputStream extensionZipInputStream = new ExtensionZipInputStream(file);
			datatypes.addAll(extensionZipInputStream.getListOf(DatatypeBean.class));
			extensionZipInputStream.close();
		}

		return datatypes;
	}

}

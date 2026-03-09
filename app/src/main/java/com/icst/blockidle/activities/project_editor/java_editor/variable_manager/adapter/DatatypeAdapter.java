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

package com.icst.blockidle.activities.project_editor.java_editor.variable_manager.adapter;

import java.util.ArrayList;

import com.icst.blockidle.activities.project_editor.java_editor.variable_manager.dialog.DatatypeSelectorDialog;
import com.icst.blockidle.bean.DatatypeBean;
import com.icst.blockidle.databinding.AdapterDatatypeBinding;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.RecyclerView;

public class DatatypeAdapter extends RecyclerView.Adapter<DatatypeAdapter.DatatypeViewHolder> {

	private ArrayList<DatatypeBean> datatypeBeans;
	private DatatypeSelectorDialog.DatatypeCallBackListener listener;
	private AlertDialog dialog;

	public DatatypeAdapter(ArrayList<DatatypeBean> datatypeBeans,
			DatatypeSelectorDialog.DatatypeCallBackListener listener,
			AlertDialog dialog) {
		this.datatypeBeans = datatypeBeans;
		this.listener = listener;
		this.dialog = dialog;
	}

	@NonNull @Override
	public DatatypeAdapter.DatatypeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
		AdapterDatatypeBinding binding = AdapterDatatypeBinding.inflate(LayoutInflater.from(parent.getContext()));
		return new DatatypeViewHolder(binding);
	}

	@Override
	public void onBindViewHolder(@NonNull final DatatypeViewHolder holder, int position) {
		DatatypeBean datatype = datatypeBeans.get(position);
		holder.binding.dtypeIcon.setLetter(datatype.getClassName().charAt(0));
		holder.binding.dtypeName.setText(datatype.getClassName());
		holder.binding.dtypeFullName.setText(datatype.getFullClassName());
		holder.binding.getRoot().setOnClickListener(v -> {
			listener.onDatatypeSelected(datatype);
			dialog.dismiss();
		});
	}

	@Override
	public int getItemCount() {
		return datatypeBeans.size();
	}

	public static class DatatypeViewHolder extends RecyclerView.ViewHolder {
		public AdapterDatatypeBinding binding;

		public DatatypeViewHolder(@NonNull AdapterDatatypeBinding binding) {
			super(binding.getRoot());
			this.binding = binding;
		}
	}

}

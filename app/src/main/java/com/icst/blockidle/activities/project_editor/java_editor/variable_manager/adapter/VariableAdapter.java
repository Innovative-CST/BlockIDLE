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

import com.icst.blockidle.bean.VariableBean;
import com.icst.blockidle.databinding.AdapterVariableBinding;
import com.icst.blockidle.util.IDLEJavaFile;
import com.icst.blockidle.viewmodel.VariableViewModel;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class VariableAdapter extends RecyclerView.Adapter<VariableAdapter.VariableViewHolder> {

	private IDLEJavaFile javaFile;

	public VariableAdapter(IDLEJavaFile javaFile) {
		this.javaFile = javaFile;
	}

	@NonNull @Override
	public VariableAdapter.VariableViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
		AdapterVariableBinding binding = AdapterVariableBinding.inflate(LayoutInflater.from(parent.getContext()));
		return new VariableViewHolder(binding);
	}

	@Override
	public void onBindViewHolder(@NonNull final VariableViewHolder holder, int position) {
		VariableBean variableBean = javaFile.getInstanceVariableRepository().getData().getValue().get(position);
		VariableViewModel variableViewModel = new VariableViewModel(variableBean);
		holder.binding.setViewModel(variableViewModel);
	}

	@Override
	public int getItemCount() {
		return javaFile.getInstanceVariableRepository().getData().getValue().size();
	}

	public static class VariableViewHolder extends RecyclerView.ViewHolder {
		public AdapterVariableBinding binding;

		public VariableViewHolder(@NonNull AdapterVariableBinding binding) {
			super(binding.getRoot());
			this.binding = binding;
		}
	}
}

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

package com.icst.blockidle.activities.project_manager.adapter;

import java.util.ArrayList;

import com.icst.blockidle.databinding.ProjectListItemBinding;
import com.icst.blockidle.util.ProjectFile;
import com.icst.blockidle.viewmodel.ProjectAdapterViewModel;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class ProjectListAdapter extends RecyclerView.Adapter<ProjectListAdapter.ViewHolder> {

	private final ArrayList<ProjectFile> data;

	public ProjectListAdapter(ArrayList<ProjectFile> data) {
		this.data = data;
	}

	@NonNull @Override
	public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
		ProjectListItemBinding binding = ProjectListItemBinding.inflate(LayoutInflater.from(parent.getContext()));
		return new ViewHolder(binding);
	}

	@Override
	public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
		ProjectAdapterViewModel mProjectAdapterViewModel = new ProjectAdapterViewModel();
		mProjectAdapterViewModel.setProjectFile(data.get(position));
		mProjectAdapterViewModel.setActivity(AppCompatActivity.class.cast(holder.binding.getRoot().getContext()));
		holder.binding.setViewModel(mProjectAdapterViewModel);
		mProjectAdapterViewModel.getPackageName()
				.observe(AppCompatActivity.class.cast(holder.binding.getRoot().getContext()), packageName -> {
					holder.binding.subtitleTextView.setText(packageName);
				});
		mProjectAdapterViewModel.getProjectName()
				.observe(AppCompatActivity.class.cast(holder.binding.getRoot().getContext()), projectName -> {
					holder.binding.titleTextView.setText(projectName);
					holder.binding.letterImageView.setLetter(projectName.charAt(0));
				});
	}

	@Override
	public int getItemCount() {
		return data.size();
	}

	public static class ViewHolder extends RecyclerView.ViewHolder {
		public ProjectListItemBinding binding;

		public ViewHolder(@NonNull ProjectListItemBinding binding) {
			super(binding.getRoot());
			this.binding = binding;
		}
	}
}

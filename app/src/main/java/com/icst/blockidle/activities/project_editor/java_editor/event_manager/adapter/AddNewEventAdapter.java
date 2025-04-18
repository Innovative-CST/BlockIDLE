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

package com.icst.blockidle.activities.project_editor.java_editor.event_manager.adapter;

import java.util.ArrayList;

import com.icst.blockidle.bean.EventBean;
import com.icst.blockidle.databinding.AdapterEventBinding;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AddNewEventAdapter extends RecyclerView.Adapter<AddNewEventAdapter.ViewHolder> {

	private final ArrayList<EventBean> data;

	public AddNewEventAdapter(ArrayList<EventBean> data) {
		this.data = data;
	}

	@NonNull @Override
	public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
		AdapterEventBinding binding = AdapterEventBinding.inflate(LayoutInflater.from(parent.getContext()));
		return new ViewHolder(binding);
	}

	@Override
	public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
		EventBean eventBean = data.get(position);
		holder.binding.title.setText(eventBean.getTitle());
		holder.binding.description.setText(eventBean.getDescription());

		if (eventBean.getIcon() != null) {
			Context context = holder.binding.getRoot().getContext();
			Drawable icon = new BitmapDrawable(
					context.getResources(),
					BitmapFactory.decodeByteArray(eventBean.getIcon(), 0, eventBean.getIcon().length));
			holder.binding.icon.setImageDrawable(icon);
		}
	}

	@Override
	public int getItemCount() {
		return data.size();
	}

	public static class ViewHolder extends RecyclerView.ViewHolder {
		public AdapterEventBinding binding;

		public ViewHolder(@NonNull AdapterEventBinding binding) {
			super(binding.getRoot());
			this.binding = binding;
		}
	}
}

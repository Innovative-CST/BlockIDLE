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

import com.icst.blockidle.activities.project_editor.java_editor.event_manager.interfaces.OnAddEventListener;
import com.icst.blockidle.bean.EventBean;
import com.icst.blockidle.databinding.AdapterAddNewEventBinding;

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
	private OnAddEventListener listener;

	public AddNewEventAdapter(ArrayList<EventBean> data, OnAddEventListener listener) {
		this.data = data;
		this.listener = listener;
	}

	@NonNull @Override
	public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
		AdapterAddNewEventBinding binding = AdapterAddNewEventBinding.inflate(LayoutInflater.from(parent.getContext()));
		RecyclerView.LayoutParams lp = new RecyclerView.LayoutParams(RecyclerView.LayoutParams.MATCH_PARENT,
				RecyclerView.LayoutParams.WRAP_CONTENT);
		binding.getRoot().setLayoutParams(lp);
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

		holder.binding.getRoot().setOnClickListener(v -> {
			listener.onEventChoosen(eventBean);
			data.remove(position);
			notifyItemRemoved(position);
		});
	}

	@Override
	public int getItemCount() {
		return data.size();
	}

	public static class ViewHolder extends RecyclerView.ViewHolder {
		public AdapterAddNewEventBinding binding;

		public ViewHolder(@NonNull AdapterAddNewEventBinding binding) {
			super(binding.getRoot());
			this.binding = binding;
		}
	}
}

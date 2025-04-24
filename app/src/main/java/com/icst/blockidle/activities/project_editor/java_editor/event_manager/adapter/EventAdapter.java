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

import java.io.File;
import java.util.ArrayList;

import com.icst.blockidle.activities.logic_editor.LogicEditorActivity;
import com.icst.blockidle.bean.EventBean;
import com.icst.blockidle.databinding.AdapterEventBinding;

import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.core.util.Pair;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;

public class EventAdapter extends RecyclerView.Adapter<EventAdapter.ViewHolder> {

	private final MutableLiveData<ArrayList<Pair<File, EventBean>>> data;

	public EventAdapter(MutableLiveData<ArrayList<Pair<File, EventBean>>> data) {
		this.data = data;
	}

	@NonNull @Override
	public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
		AdapterEventBinding binding = AdapterEventBinding.inflate(LayoutInflater.from(parent.getContext()));
		RecyclerView.LayoutParams lp = new RecyclerView.LayoutParams(RecyclerView.LayoutParams.MATCH_PARENT,
				RecyclerView.LayoutParams.WRAP_CONTENT);
		binding.getRoot().setLayoutParams(lp);
		return new ViewHolder(binding);
	}

	@Override
	public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
		EventBean eventBean = data.getValue().get(position).second;
		holder.binding.title.setText(eventBean.getTitle());
		holder.binding.description.setText(eventBean.getDescription());

		Context context = holder.binding.getRoot().getContext();

		if (eventBean.getIcon() != null) {
			Drawable icon = new BitmapDrawable(
					context.getResources(),
					BitmapFactory.decodeByteArray(eventBean.getIcon(), 0, eventBean.getIcon().length));
			holder.binding.icon.setImageDrawable(icon);
		}

		holder.binding.cardView.setOnClickListener(v -> {
			Intent logicEditor = new Intent(context, LogicEditorActivity.class);
			logicEditor.putExtra(LogicEditorActivity.EVENT_FILE_ARGUMEMT,
					data.getValue().get(position).first.getAbsolutePath());
			context.startActivity(logicEditor);
		});
	}

	@Override
	public int getItemCount() {
		return data.getValue().size();
	}

	public static class ViewHolder extends RecyclerView.ViewHolder {
		public AdapterEventBinding binding;

		public ViewHolder(@NonNull AdapterEventBinding binding) {
			super(binding.getRoot());
			this.binding = binding;
		}
	}
}

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

package com.icst.blockidle.pane.gradle_editor_pane;

import java.io.File;
import java.util.ArrayList;

import com.icst.blockidle.bean.EventBean;
import com.icst.blockidle.databinding.PaneGradleFileEditorBinding;
import com.icst.blockidle.pane.gradle_editor_pane.adapter.EventAdapter;
import com.icst.blockidle.repository.EventRepository;
import com.icst.blockidle.util.IDLEGradleFile;
import com.icst.blockidle.view.PaneView;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.util.Pair;
import androidx.recyclerview.widget.LinearLayoutManager;

public class GradleFileEditorPane extends LinearLayout implements PaneView {

	private AppCompatActivity activity;
	private IDLEGradleFile gradleFile;
	private PaneGradleFileEditorBinding binding;

	private EventAdapter eventAdapter;
	private EventRepository eventRepo;

	private static final int EVENTS_LIST = 0;
	private static final int INFO_SECTION = 1;
	private static final int LOADING = 2;

	public GradleFileEditorPane(AppCompatActivity activity, IDLEGradleFile gradleFile) {
		super(activity);
		this.activity = activity;
		this.gradleFile = gradleFile;

		LayoutInflater inflator = LayoutInflater.from(activity);
		binding = PaneGradleFileEditorBinding.inflate(inflator);

		eventRepo = EventRepository.getInstance(gradleFile);
		eventRepo.loadEvents();
		eventAdapter = new EventAdapter(eventRepo.getMutableLiveEvents());
		binding.list.setLayoutManager(new LinearLayoutManager(activity));
		binding.list.setAdapter(eventAdapter);
		eventRepo.getMutableLiveEvents().observe(activity, data -> {
			onDataUpdate(data);
		});

		LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT,
				LayoutParams.MATCH_PARENT);
		binding.getRoot().setLayoutParams(lp);
		addView(binding.getRoot());
	}

	private void showLayout(int layout) {
		binding.listSection.setVisibility(layout == EVENTS_LIST ? VISIBLE : GONE);
		binding.infoSection.setVisibility(layout == INFO_SECTION ? VISIBLE : GONE);
		binding.loadingSection.setVisibility(layout == LOADING ? VISIBLE : GONE);
	}

	public void onDataUpdate(ArrayList<Pair<File, EventBean>> data) {
		if (data.size() == 0) {
			binding.info.setText("No events yet");
			showLayout(INFO_SECTION);
		} else {
			showLayout(EVENTS_LIST);
		}

		eventAdapter.notifyDataSetChanged();
	}

	@Override
	public View getView() {
		return this;
	}

	@Override
	public void onRelease() {
	}

	@Override
	public void onReleaseRequest() {
	}
}

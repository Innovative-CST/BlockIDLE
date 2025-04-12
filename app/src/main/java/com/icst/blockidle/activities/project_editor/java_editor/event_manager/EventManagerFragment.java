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

package com.icst.blockidle.activities.project_editor.java_editor.event_manager;

import static android.view.View.GONE;
import static android.view.View.VISIBLE;

import java.io.File;
import java.util.ArrayList;

import com.icst.blockidle.activities.project_editor.java_editor.event_manager.adapter.EventAdapter;
import com.icst.blockidle.bean.EventBean;
import com.icst.blockidle.databinding.FragmentEventManagerBinding;
import com.icst.blockidle.repository.EventRepository;
import com.icst.blockidle.util.IDLEJavaFile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import androidx.core.util.Pair;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

public class EventManagerFragment extends Fragment {

	private FragmentEventManagerBinding binding;
	private EventAdapter eventAdapter;
	private IDLEJavaFile javaFile;
	private EventRepository eventRepo;
	public static final String IDLEJavaFileArgument = "IDLEJavaFile";

	private static final int EVENTS_LIST = 0;
	private static final int INFO_SECTION = 1;
	private static final int LOADING = 2;

	@Override
	@MainThread
	@Nullable public View onCreateView(LayoutInflater inflator, ViewGroup parent, Bundle bundle) {
		binding = FragmentEventManagerBinding.inflate(inflator);
		javaFile = getArguments().getParcelable(IDLEJavaFileArgument);
		eventRepo = EventRepository.getInstance(javaFile);
		eventRepo.loadEvents();
		eventAdapter = new EventAdapter(eventRepo.getMutableLiveEvents().getValue());
		binding.list.setLayoutManager(new LinearLayoutManager(getActivity()));
		binding.list.setAdapter(eventAdapter);
		eventRepo.getMutableLiveEvents().observe(this, data -> {
			onDataUpdate(data);
		});
		return binding.getRoot();
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
	}

}

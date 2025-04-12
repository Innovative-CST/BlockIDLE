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

package com.icst.blockidle.repository;

import java.io.File;
import java.util.ArrayList;

import com.icst.blockidle.bean.EventBean;
import com.icst.blockidle.util.IDLEJavaFile;
import com.icst.blockidle.util.SerializationUtils;

import androidx.core.util.Pair;
import androidx.lifecycle.MutableLiveData;

public class EventRepository {

	private IDLEJavaFile javaFile;
	private ArrayList<Pair<File, EventBean>> events;
	private MutableLiveData<ArrayList<Pair<File, EventBean>>> data;

	private EventRepository(IDLEJavaFile javaFile) {
		this.javaFile = javaFile;
		data = new MutableLiveData<ArrayList<Pair<File, EventBean>>>(new ArrayList<Pair<File, EventBean>>());
	}

	public static EventRepository getInstance(IDLEJavaFile javaFile) {
		return new EventRepository(javaFile);
	}

	public void loadEvents() {
		events = new ArrayList<Pair<File, EventBean>>();
		for (File file : javaFile.getEventDirectory().listFiles()) {
			if (file.isDirectory())
				continue;
			EventBean eventBean = SerializationUtils.deserialize(file, EventBean.class);

			if (eventBean != null) {
				events.add(Pair.create(file, eventBean));
			}
		}
		data.postValue(events);
	}

	public MutableLiveData<ArrayList<Pair<File, EventBean>>> getMutableLiveEvents() {
		return data;
	}

}

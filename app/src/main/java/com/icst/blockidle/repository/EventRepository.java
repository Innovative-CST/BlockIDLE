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
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.zip.ZipInputStream;

import com.icst.blockidle.ExtensionZipInputStream;
import com.icst.blockidle.bean.EventBean;
import com.icst.blockidle.listener.SerializationListener;
import com.icst.blockidle.util.IDLEJavaFile;
import com.icst.blockidle.util.ProjectEnvironment;
import com.icst.blockidle.util.SerializationUtils;

import android.util.Log;

import androidx.core.util.Pair;
import androidx.lifecycle.MutableLiveData;

public class EventRepository {

	private IDLEJavaFile javaFile;
	private ArrayList<Pair<File, EventBean>> events;
	private MutableLiveData<ArrayList<Pair<File, EventBean>>> data;

	private EventRepository(IDLEJavaFile javaFile) {
		this.javaFile = javaFile;
		events = new ArrayList<Pair<File, EventBean>>();
		data = new MutableLiveData<ArrayList<Pair<File, EventBean>>>(events);
	}

	public static EventRepository getInstance(IDLEJavaFile javaFile) {
		return new EventRepository(javaFile);
	}

	public void addEvent(EventBean event) {
		File eventDir = javaFile.getEventDirectory();
		File eventFile = new File(eventDir, event.getName());
		SerializationUtils.serialize(event, eventFile, new SerializationListener() {

			@Override
			public void onSerializationSucess() {
				events.add(Pair.create(eventFile, event));
				data.postValue(events);
			}

			@Override
			public void onSerializationFailed(Exception exception) {
				Log.e("Serialization failed", "New event serialization failed", exception);
			}
		});
	}

	public ArrayList<EventBean> getExtensionEvents() {
		ArrayList<EventBean> extensionEvents = new ArrayList<EventBean>();

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
			extensionEvents.addAll(extensionZipInputStream.getListOf(EventBean.class));
			extensionZipInputStream.close();
		}

		return extensionEvents;
	}

	public ArrayList<EventBean> getAvailableEvents() {
		ArrayList<EventBean> extensionEvents = getExtensionEvents();

		// Remove EventBeans from extensionEvents if there is any EventBean in events with the same name
		HashSet<String> existingEventNames = new HashSet<>();
		for (Pair<File, EventBean> pair : events) {
			existingEventNames.add(pair.second.getName());
		}

		extensionEvents.removeIf(event -> existingEventNames.contains(event.getName()));

		return extensionEvents;
	}

	public void loadEvents() {
		events = new ArrayList<Pair<File, EventBean>>();
		for (File file : javaFile.getEventDirectory().listFiles()) {
            if (file.isDirectory()) continue;
			EventBean eventBean = SerializationUtils.deserialize(file, EventBean.class);

			if (eventBean == null) continue;
            events.add(Pair.create(file, eventBean));
		}
		data.postValue(events);
	}

	public MutableLiveData<ArrayList<Pair<File, EventBean>>> getMutableLiveEvents() {
		return data;
	}

}

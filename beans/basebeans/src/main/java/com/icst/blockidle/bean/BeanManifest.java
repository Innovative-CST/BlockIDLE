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

package com.icst.blockidle.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BeanManifest implements Serializable {
	private ArrayList<BeanMetadata> metadata;

	public List<BeanMetadata> getMetadata() {
		return (List<BeanMetadata>) Collections.unmodifiableCollection(this.metadata);
	}

	public void setMetadata(ArrayList<BeanMetadata> metadata) {
		this.metadata = (metadata != null) ? new ArrayList<>(metadata) : new ArrayList<>();
	}

	public <T extends BeanMetadata> ArrayList<T> get(Class<T> classType) {
		ArrayList<T> list = new ArrayList<>();
		for (BeanMetadata mMetaData : metadata) {
			if (classType.isInstance(mMetaData)) {
				list.add(classType.cast(mMetaData));
			}
		}
		return list;
	}
}

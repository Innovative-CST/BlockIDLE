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

/**
 * Represents a container for a list of {@link BeanMetadata} instances.
 *
 * <p>This class supports retrieving all metadata entries or filtering them by a specific subtype.
 * Implements {@link Serializable} for object serialization support.
 */
public class BeanManifest implements Serializable {
	private ArrayList<BeanMetadata> metadata;

	/**
	 * Returns the list of all metadata entries stored in this manifest.
	 *
	 * @return a list of {@link BeanMetadata} instances, or {@code null} if not initialized
	 */
	public ArrayList<BeanMetadata> getMetadata() {
		return this.metadata;
	}

	/**
	 * Sets the list of metadata entries for this manifest.
	 *
	 * @param metadata the list of {@link BeanMetadata} to assign
	 */
	public void setMetadata(ArrayList<BeanMetadata> metadata) {
		this.metadata = metadata;
	}

	/**
	 * Returns a list of metadata elements that are instances of the specified subclass type.
	 *
	 * @param <T> the type of metadata to filter for
	 * @param classType the {@link Class} object representing the desired type
	 * @return a list containing only the metadata objects of the specified type
	 */
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
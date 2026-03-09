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

package com.icst.plugin.builder;

import javax.inject.Inject;

import org.gradle.api.model.ObjectFactory;
import org.gradle.api.provider.Property;

public abstract class BlockIdleSdkExtension {

	public abstract Property<String> getPluginName();

	public abstract Property<String> getSdkVersion();

	public abstract Property<String> getMinSdkVersion();

	public abstract Property<String> getAppPluginClass();

	public abstract Property<String> getVersionName();

	@Inject
	public BlockIdleSdkExtension(ObjectFactory objects) {
	}
}
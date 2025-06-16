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

/**
 * A generic interface that indicates a bean can be cloned.
 *
 * <p>Implementing classes should provide a meaningful implementation of the {@link #cloneBean()}
 * method to create a copy of the object.
 *
 * @param <T> the type of object that this bean can clone
 */
public interface CloneableBean<T> {

	/**
	 * Create and returns a deep copy of this bean.
	 *
	 * @return a cloned instance of the bean
	 */
	T cloneBean();
}

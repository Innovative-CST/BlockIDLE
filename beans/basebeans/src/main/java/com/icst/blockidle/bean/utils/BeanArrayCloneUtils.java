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

package com.icst.blockidle.bean.utils;

import java.util.ArrayList;

import com.icst.blockidle.bean.CloneableBean;
import com.icst.blockidle.bean.DatatypeBean;

/**
 * A utility class providing the deep clone functionality for followings:
 *
 * <ul>
 *   <li>ArrayList of bean that implements {@link CloneableBean}
 *   <li>Array of {@link DatatypeBean}.
 * </ul>
 */
public final class BeanArrayCloneUtils {
	/**
	 * Creates a deep copy of the given {@link ArrayList} containing {@link CloneableBean}
	 * instances.
	 *
	 * <p>This method is designed to safely handle corner cases, including {@code null} input. If
	 * the input list is {@code null}, the method will return {@code null} instead of throwing an
	 * exception.
	 *
	 * @param <T> the type of elements in the {@code ArrayList} that implements {@link CloneableBean}
	 * @param beans the {@code ArrayList} of beans to clone; may be {@code null}
	 * @return a new {@code ArrayList} containing cloned instances of the input beans, or {@code
	 *     null} if the input list is {@code null}
	 */
	public static <T extends CloneableBean> ArrayList<T> clone(ArrayList<T> beans) {
		if (beans == null)
			return null;
		ArrayList<T> clone = new ArrayList<>();
		for (int i = 0; i < beans.size(); ++i) {
			clone.add((T) beans.get(i).cloneBean());
		}
		return clone;
	}

	/**
	 * Creates a deep copy of the given array of {@link DatatypeBean} instances.
	 *
	 * <p>This method is designed to handle corner cases gracefully, including {@code null} input.
	 * If the input array is {@code null}, the method returns {@code null} instead of throwing an
	 * exception.
	 *
	 * @param datatypeBean the array of {@link DatatypeBean} instances to clone; may be {@code null}
	 * @return a new array containing cloned instances of the input beans, or {@code null} if the
	 *     input array is {@code null}
	 */
	public static DatatypeBean[] cloneDatatypeBeanArray(DatatypeBean[] datatypeBean) {
		if (datatypeBean == null)
			return null;
		DatatypeBean[] clonedBeans = new DatatypeBean[datatypeBean.length];
		for (int i = 0; i < datatypeBean.length; ++i) {
			clonedBeans[i] = datatypeBean[i].cloneBean();
		}
		return clonedBeans;
	}
}

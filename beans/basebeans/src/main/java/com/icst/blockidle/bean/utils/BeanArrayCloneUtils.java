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
import java.util.List;

import com.icst.blockidle.bean.CloneableBean;
import com.icst.blockidle.bean.DatatypeBean;

public final class BeanArrayCloneUtils {
	public static <T extends CloneableBean> List<T> clone(List<T> beans) {
		if (beans == null) return null;

		ArrayList<T> clone = new ArrayList<>();
		for (T bean : beans) {
			clone.add(bean == null ? null : (T) bean.cloneBean());
		}
		return clone;
	}

	public static DatatypeBean[] cloneDatatypeBeanArray(DatatypeBean[] datatypeBean) {
		if (datatypeBean == null) return null;

		DatatypeBean[] clonedBeans = new DatatypeBean[datatypeBean.length];
		int i = 0;
		for (DatatypeBean bean : datatypeBean) {
			clonedBeans[i] = (bean == null) ? null : bean.cloneBean();
		}
		return clonedBeans;
	}
}

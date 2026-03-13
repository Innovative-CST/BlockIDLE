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

package com.icst.blockidle.util;

import com.icst.blockidle.R;

import android.view.View;

public final class ViewShapeUtils {
	public static void applyItemShape(View view, int index, int size) {

		if (size == 1) {
			view.setBackgroundResource(R.drawable.shape_item_alone);
			return;
		}

		if (index == 0) {
			view.setBackgroundResource(R.drawable.shape_item_top);
		} else if (index == size - 1) {
			view.setBackgroundResource(R.drawable.shape_item_bottom);
		} else {
			view.setBackgroundResource(R.drawable.shape_item_middle);
		}
	}
}

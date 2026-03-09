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

package com.icst.logic.render.paint;

import android.graphics.CornerPathEffect;
import android.graphics.Paint;

public final class PaintFactory {

	public static Paint fill(int color, boolean alpha, int stroke, boolean pathEffect) {
		Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
		paint.setStyle(Paint.Style.FILL);
		paint.setColor(color);
		paint.setStrokeWidth(stroke);
		if (alpha)
			paint.setAlpha(50);
		if (pathEffect)
			paint.setPathEffect(new CornerPathEffect(3));
		return paint;
	}

	public static Paint stroke(int color, float strokeWidth) {
		Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
		paint.setStyle(Paint.Style.STROKE);
		paint.setColor(color);
		paint.setStrokeWidth(strokeWidth);
		paint.setPathEffect(new CornerPathEffect(3));
		return paint;
	}
}

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

package com.icst.logic.render.shape;

import com.icst.logic.render.paint.PaintFactory;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;

public final class NumericBlockRenderer {

	public static void drawNumericBlockPath(Path path, int width, int height) {
		path.reset();
		path.arcTo(0, 0, height, height, 90, 180, false);
		path.lineTo(width + (height / 2), 0);
		path.arcTo(width, 0, width + height, height, 270, 180, false);
		path.lineTo(height / 2, height);
	}

	public static void drawNumericBlockElementPath(Path path, int width, int height) {
		path.reset();
		path.arcTo(0, 0, height, height, 90, 180, false);
		path.lineTo(width - height, 0);
		path.arcTo(width - height, 0, width, height, 270, 180, false);
		path.lineTo(height / 2, height);
	}

	public static void renderNumericBlock(Canvas canvas, Path path, int width, int height, int color) {
		Paint paint = PaintFactory.fill(color, false, 5, false);
		drawNumericBlockPath(path, width, height);
		canvas.drawPath(path, paint);
	}

	public static void renderNumericBlockBackdrop(Canvas canvas, Path path, int width, int height) {
		Paint paint = PaintFactory.fill(Color.BLACK, false, 5, false);
		drawNumericBlockElementPath(path, width, height);
		canvas.drawPath(path, paint);
	}

	public static void renderNumericBlockElement(Canvas canvas, Path path, int width, int height) {
		Paint paint = PaintFactory.fill(Color.WHITE, false, 5, false);
		drawNumericBlockElementPath(path, width, height);
		canvas.drawPath(path, paint);
	}

	public static void renderNonInputableNumericBlockElement(Canvas canvas, Path path, int width, int height) {
		Paint paint = PaintFactory.fill(Color.BLACK, true, 5, false);
		drawNumericBlockElementPath(path, width, height);
		canvas.drawPath(path, paint);
	}

	public static void renderNumericBlockHighlighter(Canvas canvas, Path path, int width, int height) {
		Paint paint = PaintFactory.fill(Color.BLACK, false, 5, false);
		drawNumericBlockElementPath(path, width, height);
		canvas.drawPath(path, paint);
	}
}

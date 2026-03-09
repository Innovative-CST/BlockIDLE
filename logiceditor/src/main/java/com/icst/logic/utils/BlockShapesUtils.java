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

package com.icst.logic.utils;

import com.icst.logic.render.paint.PaintFactory;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.DisplayMetrics;

public final class BlockShapesUtils {

	public static void drawActionBlockHeader(
			Canvas canvas, Context context, float xOffset, float yOffset, float width, int color) {

		Paint paint = PaintFactory.fill(color, false, 5, true);

		Path mPath = new Path();
		mPath.moveTo(dpToPx(context, 5F) + xOffset, dpToPx(context, 0F) + yOffset);
		mPath.lineTo(dpToPx(context, 11F) + xOffset, dpToPx(context, 0F) + yOffset);
		mPath.lineTo(dpToPx(context, 19F) + xOffset, dpToPx(context, 6F) + yOffset);
		mPath.lineTo(dpToPx(context, 35F) + xOffset, dpToPx(context, 6F) + yOffset);
		mPath.lineTo(dpToPx(context, 43F) + xOffset, dpToPx(context, 0F) + yOffset);
		mPath.lineTo(
				Float.valueOf(width) - dpToPx(context, 5F) + xOffset,
				dpToPx(context, 0F) + yOffset);
		mPath.lineTo(Float.valueOf(width) + xOffset, dpToPx(context, 5F) + yOffset);
		mPath.lineTo(Float.valueOf(width) + xOffset, dpToPx(context, 7F) + yOffset);
		mPath.lineTo(dpToPx(context, 0F) + xOffset, dpToPx(context, 7F) + yOffset);
		mPath.lineTo(dpToPx(context, 0F) + xOffset, dpToPx(context, 5F) + yOffset);
		mPath.lineTo(dpToPx(context, 5F) + xOffset, dpToPx(context, 0F) + yOffset);

		canvas.drawPath(mPath, paint);
	}

	public static void drawRegularBlockFooter(
			Canvas canvas, Context context, float xOffset, float yOffset, float width, int color) {

		Paint paint = PaintFactory.fill(color, false, 5, true);

		Path mPath = new Path();

		mPath.moveTo(xOffset, yOffset);
		mPath.lineTo(dpToPx(context, 5F) + xOffset, dpToPx(context, 5F) + yOffset);
		mPath.lineTo(dpToPx(context, 11F) + xOffset, dpToPx(context, 5F) + yOffset);
		mPath.lineTo(dpToPx(context, 20F) + xOffset, dpToPx(context, 12F) + yOffset);
		mPath.lineTo(dpToPx(context, 34F) + xOffset, dpToPx(context, 12F) + yOffset);
		mPath.lineTo(dpToPx(context, 43F) + xOffset, dpToPx(context, 5F) + yOffset);
		mPath.lineTo(
				Float.valueOf(width) + xOffset - dpToPx(context, 5F),
				dpToPx(context, 5F) + yOffset);
		mPath.lineTo(Float.valueOf(width) + xOffset, yOffset);
		mPath.lineTo(xOffset, yOffset);
		canvas.drawPath(mPath, paint);

		int darkenColor = ColorUtils.darkenColor(color);
		Paint edgePaint = PaintFactory.stroke(darkenColor, 5);

		Path edgeEffect = new Path();
		edgeEffect.moveTo(xOffset, yOffset);
		edgeEffect.lineTo(dpToPx(context, 5F) + xOffset, dpToPx(context, 4F) + yOffset);
		edgeEffect.lineTo(dpToPx(context, 11F) + xOffset, dpToPx(context, 4F) + yOffset);
		edgeEffect.lineTo(dpToPx(context, 20F) + xOffset, dpToPx(context, 11F) + yOffset);
		edgeEffect.lineTo(dpToPx(context, 34F) + xOffset, dpToPx(context, 11F) + yOffset);
		edgeEffect.lineTo(dpToPx(context, 43F) + xOffset, dpToPx(context, 4F) + yOffset);
		edgeEffect.lineTo(
				Float.valueOf(width) + xOffset - dpToPx(context, 5F),
				dpToPx(context, 4F) + yOffset);
		edgeEffect.lineTo(Float.valueOf(width) + xOffset, yOffset);
		canvas.drawPath(edgeEffect, edgePaint);
	}

	public static void drawTerminatorBlockFooter(
			Canvas canvas, Context context, float xOffset, float yOffset, float width, int color) {
		Paint paint = PaintFactory.fill(color, false, 5, true);
		Path mPath = new Path();

		mPath.moveTo(xOffset, yOffset);
		mPath.lineTo(dpToPx(context, 5F) + xOffset, dpToPx(context, 5F) + yOffset);
		mPath.lineTo(
				Float.valueOf(width) + xOffset - dpToPx(context, 5F),
				dpToPx(context, 5F) + yOffset);
		mPath.lineTo(Float.valueOf(width) + xOffset, yOffset);
		mPath.lineTo(xOffset, yOffset);
		canvas.drawPath(mPath, paint);
	}

	public static void drawEventBlockHeader(
			Canvas canvas, Context context, float xOffset, float yOffset, float width, int color) {
		Paint paint = PaintFactory.fill(color, false, 5, true);
		Path mPath = new Path();

		mPath.moveTo(xOffset, yOffset + dpToPx(context, 10F));
		mPath.arcTo(
				xOffset,
				yOffset,
				xOffset + dpToPx(context, 60),
				xOffset + dpToPx(context, 10),
				180,
				180,
				false);
		mPath.lineTo(xOffset + width - dpToPx(context, 5F), yOffset + dpToPx(context, 5F));
		mPath.lineTo(xOffset + width, yOffset + dpToPx(context, 10F));
		mPath.lineTo(xOffset + width, yOffset + dpToPx(context, 12F));
		mPath.lineTo(xOffset, yOffset + dpToPx(context, 12F));
		canvas.drawPath(mPath, paint);
	}

	public static void drawActionBlockLayer(
			Canvas canvas, Context context, float width, float height, int color) {
		Paint paint = PaintFactory.fill(color, false, 5, true);
		Path mPath = new Path();

		mPath.lineTo(width, 0);
		mPath.lineTo(width - dpToPx(context, 5), dpToPx(context, 4));
		mPath.lineTo(dpToPx(context, 54), dpToPx(context, 4));
		mPath.lineTo(dpToPx(context, 46), dpToPx(context, 10));
		mPath.lineTo(dpToPx(context, 31), dpToPx(context, 10));
		mPath.lineTo(dpToPx(context, 23), dpToPx(context, 4));
		mPath.lineTo(dpToPx(context, 15), dpToPx(context, 4));
		mPath.lineTo(dpToPx(context, 10), dpToPx(context, 10));
		mPath.lineTo(dpToPx(context, 10), height + dpToPx(context, 0));
		mPath.lineTo(dpToPx(context, 15), height + dpToPx(context, 5));
		mPath.lineTo(width - dpToPx(context, 5), height + dpToPx(context, 5));
		mPath.lineTo(width, height + dpToPx(context, 10));
		mPath.lineTo(0, height + dpToPx(context, 10));
		mPath.lineTo(0, 0);

		canvas.drawPath(mPath, paint);

		int darkenColor = ColorUtils.darkenColor(color);
		Paint edgePaint = PaintFactory.stroke(darkenColor, 5);

		Path edgeEffect = new Path();
		edgeEffect.moveTo(width, 0);
		edgeEffect.lineTo(width - dpToPx(context, 5), dpToPx(context, 4 - 1));
		edgeEffect.lineTo(dpToPx(context, 54), dpToPx(context, 4 - 1));
		edgeEffect.lineTo(dpToPx(context, 46), dpToPx(context, 10 - 1));
		edgeEffect.lineTo(dpToPx(context, 31), dpToPx(context, 10 - 1));
		edgeEffect.lineTo(dpToPx(context, 23), dpToPx(context, 4 - 1));
		edgeEffect.lineTo(dpToPx(context, 15), dpToPx(context, 4 - 1));
		edgeEffect.lineTo(dpToPx(context, 10), dpToPx(context, 10 - 1));
		edgeEffect.lineTo(dpToPx(context, 10), height - dpToPx(context, 1));
		canvas.drawPath(edgeEffect, edgePaint);
	}

	public static void drawBooleanBlock(
			Canvas canvas, Context context, int width, int height, int color) {
		Paint paint = PaintFactory.fill(color, false, 5, false);

		Path triangle1 = new Path();
		triangle1.moveTo(height / 2, 0);
		triangle1.lineTo(height / 2, height);
		triangle1.lineTo(0, height / 2);
		triangle1.close();
		canvas.drawPath(triangle1, paint);

		Rect rectagle = new Rect();
		rectagle.set(height / 2, 0, width + (height / 2), height);
		canvas.drawRect(rectagle, paint);

		Path triangle2 = new Path();
		triangle2.moveTo(width + (height / 2), 0);
		triangle2.lineTo(width + height, height / 2);
		triangle2.lineTo(width + (height / 2), height);
		triangle2.close();
		canvas.drawPath(triangle2, paint);
	}

	public static void drawBooleanBlockElement(
			Canvas canvas, Context context, int width, int height, int color) {
		Paint paint = PaintFactory.fill(color, true, 10, false);

		Path triangle1 = new Path();
		triangle1.moveTo(height / 2, 0);
		triangle1.lineTo(height / 2, height);
		triangle1.lineTo(0, height / 2);
		triangle1.close();
		canvas.drawPath(triangle1, paint);

		Rect rectagle = new Rect();
		rectagle.set(height / 2, 0, width - (height / 2), height);
		canvas.drawRect(rectagle, paint);

		Path triangle2 = new Path();
		triangle2.moveTo(width - (height / 2), 0);
		triangle2.lineTo(width, height / 2);
		triangle2.lineTo(width - (height / 2), height);
		triangle2.close();
		canvas.drawPath(triangle2, paint);
	}

	public static void drawBooleanBlockHighlighter(
			Canvas canvas, Context context, int width, int height, int color) {
		Paint paint = PaintFactory.fill(color, false, 10, false);

		Path triangle1 = new Path();
		triangle1.moveTo(height / 2, 0);
		triangle1.lineTo(height / 2, height);
		triangle1.lineTo(0, height / 2);
		triangle1.close();
		canvas.drawPath(triangle1, paint);

		Rect rectagle = new Rect();
		rectagle.set(height / 2, 0, width - (height / 2), height);
		canvas.drawRect(rectagle, paint);

		Path triangle2 = new Path();
		triangle2.moveTo(width - (height / 2), 0);
		triangle2.lineTo(width, height / 2);
		triangle2.lineTo(width - (height / 2), height);
		triangle2.close();
		canvas.drawPath(triangle2, paint);
	}

	public static void drawGeneralBlockElement(
			Canvas canvas, Context context, int width, int height, int color) {
		Paint paint = PaintFactory.fill(color, true, 10, false);
		paint.setPathEffect(new CornerPathEffect(5));

		Path mPath = new Path();
		mPath.lineTo(width, 0);
		mPath.lineTo(width, height);
		mPath.lineTo(0, height);
		mPath.close();
		canvas.drawPath(mPath, paint);
	}

	public static void drawGeneralExpressionBlockHighlighter(
			Canvas canvas, Context context, int width, int height, int color) {
		Paint paint = PaintFactory.fill(color, false, 10, false);
		paint.setPathEffect(new CornerPathEffect(5));

		Path mPath = new Path();
		mPath.lineTo(width, 0);
		mPath.lineTo(width, height);
		mPath.lineTo(0, height);
		mPath.close();
		canvas.drawPath(mPath, paint);
	}

	public static float dpToPx(Context context, float dp) {
		DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
		return dp * (displayMetrics.xdpi / DisplayMetrics.DENSITY_DEFAULT);
	}
}

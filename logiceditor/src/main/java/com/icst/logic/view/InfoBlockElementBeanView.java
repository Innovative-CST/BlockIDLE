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

package com.icst.logic.view;

import com.google.android.material.R;
import com.icst.blockidle.bean.InfoBlockElementBean;
import com.icst.logic.utils.ColorUtils;
import com.icst.logic.utils.UnitUtils;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.view.View;
import android.widget.Toast;

public class InfoBlockElementBeanView extends View {

	private Paint text;

	public InfoBlockElementBeanView(Context context, InfoBlockElementBean infoBlockElementBean) {
		super(context);

		text = new Paint();
		text.setColor(ColorUtils.getTextColorForColor(ColorUtils.getColor(getContext(), R.attr.colorOnPrimary)));
		text.setTextSize(20);
		text.setTypeface(Typeface.create(Typeface.DEFAULT, Typeface.BOLD));

		setOnClickListener(v -> Toast.makeText(context, infoBlockElementBean.getMarkdown(), Toast.LENGTH_SHORT).show());
	}

	private int dp(float px) {
		return UnitUtils.dpToPx(getContext(), px);
	}

	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		float width = dp(4) + text.measureText("?");
		setMeasuredDimension(
				resolveSize((int) width, widthMeasureSpec),
				resolveSize(dp(20), heightMeasureSpec));
	}

	@Override
	protected void onDraw(Canvas canvas) {
		Path mPath = new Path();
		Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
		mPaint.setStrokeWidth(5);
		mPaint.setColor(ColorUtils.getColor(getContext(), R.attr.colorPrimary));
		mPaint.setStyle(Paint.Style.FILL);
		mPaint.setPathEffect(new CornerPathEffect(3));
		mPath.lineTo(dp(4) + text.measureText("?"), 0);
		mPath.lineTo(dp(4) + text.measureText("?"), dp(20));
		mPath.lineTo(0, dp(20));
		mPath.close();
		canvas.drawPath(mPath, mPaint);
		canvas.drawText("?", dp(2), dp(14), text);
	}
}

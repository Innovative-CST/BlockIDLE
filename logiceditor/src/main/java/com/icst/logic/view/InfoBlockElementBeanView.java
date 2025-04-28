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

import com.icst.blockidle.bean.BlockBean;
import com.icst.blockidle.bean.InfoBlockElementBean;
import com.icst.logic.editor.view.LogicEditorFloatingWindow;
import com.icst.logic.editor.view.LogicEditorView;
import com.icst.logic.utils.ColorUtils;
import com.icst.logic.utils.UnitUtils;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.view.View;

public class InfoBlockElementBeanView extends View {

	private Paint text;
	private int backgroundColor;

	public InfoBlockElementBeanView(Context context, InfoBlockElementBean infoBlockElementBean, BlockBean block,
			LogicEditorView logicEditor) {
		super(context);
		backgroundColor = ColorUtils.getTextColorForColor(Color.parseColor(block.getColor()));

		text = new Paint();
		text.setColor(ColorUtils.getTextColorForColor(backgroundColor));
		text.setTextSize(20);
		text.setTypeface(Typeface.create(Typeface.DEFAULT, Typeface.BOLD));

		setOnClickListener(v -> {
			LogicEditorFloatingWindow window = new LogicEditorFloatingWindow(context,
					infoBlockElementBean.getMarkdown(), logicEditor);
			logicEditor.showWindow(window, this);
		});
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
		mPaint.setColor(backgroundColor);
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

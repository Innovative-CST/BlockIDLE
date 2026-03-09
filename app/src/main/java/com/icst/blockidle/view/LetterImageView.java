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

package com.icst.blockidle.view;

import java.util.Random;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class LetterImageView extends View {

	private char letter = 'A'; // Default letter
	private Paint circlePaint;
	private Paint textPaint;
	private final Rect textBounds = new Rect();
	private final Random random = new Random();

	private final int[] coolColors = new int[] {
			Color.parseColor("#FAF1E6"), // Deep Orange
			Color.parseColor("#FDFAF6"), // Green
			Color.parseColor("#E4EFE7"), // Blue
			Color.parseColor("#99BC85"), // Purple
			Color.parseColor("#F5ECE0"), // Yellow
			Color.parseColor("#D76C82"), // Cyan
			Color.parseColor("#98D2C0"), // Pink
			Color.parseColor("#66D2CE") // Amber
	};

	public LetterImageView(Context context) {
		super(context);
		init();
	}

	public LetterImageView(Context context, @Nullable AttributeSet attrs) {
		super(context, attrs);
		init();
	}

	public LetterImageView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		init();
	}

	private void init() {
		circlePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
		circlePaint.setColor(Color.WHITE); // Default background circle color

		textPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
		textPaint.setColor(Color.DKGRAY); // Default text color
		textPaint.setTextSize(60f); // Adjust as needed
		textPaint.setTextAlign(Paint.Align.CENTER);
	}

	// Required for databinding, otherwise it will cause build error.
	public void setLetter(String letterStr) {
		if (letterStr != null && letterStr.length() == 1) {
			letter = letterStr.charAt(0);
			setRandomCoolColor();
			invalidate();
		} else {
			throw new IllegalArgumentException("Attribute 'letter' must be a single character.");
		}
	}

	public void setLetter(char letter) {
		this.letter = letter;
		setRandomCoolColor();
		invalidate(); // Redraw the view
	}

	public void setCircleColor(int color) {
		circlePaint.setColor(color);
		invalidate();
	}

	public void setTextColor(int color) {
		textPaint.setColor(color);
		invalidate();
	}

	public void setTextSize(float size) {
		textPaint.setTextSize(size);
		invalidate();
	}

	public void setRandomCoolColor() {
		int randomColor = coolColors[random.nextInt(coolColors.length)];
		setCircleColor(randomColor);
	}

	@Override
	protected void onDraw(@NonNull Canvas canvas) {
		super.onDraw(canvas);

		int width = getWidth();
		int height = getHeight();
		int radius = Math.min(width, height) / 2;

		// Draw circle
		canvas.drawCircle(width / 2f, height / 2f, radius, circlePaint);

		// Draw letter in center
		String text = String.valueOf(letter).toUpperCase();
		textPaint.getTextBounds(text, 0, 1, textBounds);
		float textHeight = textBounds.height();

		canvas.drawText(text, width / 2f, height / 2f + textHeight / 2f, textPaint);
	}
}

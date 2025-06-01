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

import com.icst.blockidle.bean.ActionBlockLayerBean;
import com.icst.blockidle.bean.ActionBlockNode;
import com.icst.blockidle.bean.BlockBean;
import com.icst.logic.config.LogicEditorConfiguration;
import com.icst.logic.editor.view.LogicEditorView;
import com.icst.logic.utils.BlockShapesUtils;
import com.icst.logic.utils.ColorUtils;
import com.icst.logic.utils.UnitUtils;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.View;
import android.widget.LinearLayout;

public class ActionBlockLayerView extends ActionBlockDropZoneView implements LayerBeanView<ActionBlockLayerView> {

	private final int LAYER_PADDING = 10;

	private int layerPosition;
	private boolean isFirstLayer;
	private boolean isLastLayer;
	private String color;
	private BlockBean block;
	private ActionBlockLayerBean layer;
	private int maxLayerWidth;

	public ActionBlockLayerView(
			Context context,
			ActionBlockLayerBean layer,
			LogicEditorConfiguration logicEditorConfiguration,
			LogicEditorView logicEditor) {
		super(context, layer.getActionBlockNode(), logicEditorConfiguration, logicEditor);
		this.layer = layer;
		setWillNotDraw(false);
		setActionBlockNode(layer.getActionBlockNode());
	}

	@Override
	protected void setActionBlockNode(ActionBlockNode head) {
		super.setActionBlockNode(head);
		layer.setActionBlockNode(head);
	}

	@Override
	protected void onDraw(Canvas canvas) {
		int totalHeight = 0;

		// Measure each child
		for (int i = 0; i < getChildCount(); i++) {
			View child = getChildAt(i);
			totalHeight += child.getMeasuredHeight();
			LinearLayout.LayoutParams lp = ((LinearLayout.LayoutParams) child.getLayoutParams());
			totalHeight += lp.topMargin;
		}
		int maxWidth = Math.max(UnitUtils.dpToPx(getContext(), 60), getMaxLayerWidth());
		if (totalHeight < UnitUtils.dpToPx(getContext(), 30)) {
			totalHeight = UnitUtils.dpToPx(getContext(), 30);
		}
		BlockShapesUtils.drawActionBlockLayer(
				canvas,
				getContext(),
				maxWidth,
				totalHeight,
				Color.parseColor(ColorUtils.harmonizeHexColor(getContext(), getColor())));
	}

	@Override
	protected void onLayout(boolean changed, int l, int t, int r, int b) {
		int currentTop = UnitUtils.dpToPx(getContext(), 5);

		// Layout each child
		for (int i = 0; i < getChildCount(); i++) {
			View child = getChildAt(i);
			int left = getPaddingLeft() + UnitUtils.dpToPx(getContext(), LAYER_PADDING) + 2;
			LinearLayout.LayoutParams lp = ((LinearLayout.LayoutParams) child.getLayoutParams());
			int top = currentTop + lp.topMargin;
			int right = left + child.getMeasuredWidth();
			int bottom = top + child.getMeasuredHeight();

			child.layout(left, top, right, bottom);

			currentTop += child.getMeasuredHeight() + lp.topMargin;
		}
	}

	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		int totalHeight = 0;
		int maxWidth = 0;
		// Measure each child
		for (int i = 0; i < getChildCount(); i++) {
			View child = getChildAt(i);
			LinearLayout.LayoutParams lp = ((LinearLayout.LayoutParams) child.getLayoutParams());
			measureChild(child, widthMeasureSpec, heightMeasureSpec);
			totalHeight += child.getMeasuredHeight() + lp.topMargin;
			maxWidth = Math.max(maxWidth, child.getMeasuredWidth());
		}
		maxWidth += UnitUtils.dpToPx(getContext(), LAYER_PADDING) + 2;
		maxWidth = Math.max(maxWidth, getMaxLayerWidth());
		if (totalHeight < UnitUtils.dpToPx(getContext(), 30)) {
			totalHeight = UnitUtils.dpToPx(getContext(), 30);
		}
		if (maxWidth < UnitUtils.dpToPx(getContext(), 60)) {
			maxWidth = UnitUtils.dpToPx(getContext(), 60);
		}
		totalHeight += UnitUtils.dpToPx(getContext(), 10) - 1;
		setMeasuredDimension(
				resolveSize(maxWidth, widthMeasureSpec),
				resolveSize(totalHeight, heightMeasureSpec));
	}

	@Override
	public void setColor(String color) {
		this.color = color;
		invalidate();
	}

	@Override
	public BlockBean getBlock() {
		return block;
	}

	@Override
	public String getColor() {
		return color;
	}

	@Override
	public int getLayerPosition() {
		return layerPosition;
	}

	@Override
	public void setLayerPosition(int layerPosition) {
		this.layerPosition = layerPosition;
	}

	@Override
	public boolean isFirstLayer() {
		return isFirstLayer;
	}

	@Override
	public void setFirstLayer(boolean isFirstLayer) {
		this.isFirstLayer = isFirstLayer;
	}

	@Override
	public boolean isLastLayer() {
		return isLastLayer;
	}

	@Override
	public void setLastLayer(boolean isLastLayer) {
		this.isLastLayer = isLastLayer;
	}

	@Override
	public void setBlock(BlockBean block) {
		this.block = block;
	}

	@Override
	public ActionBlockLayerView getView() {
		return this;
	}

	public int getMaxLayerWidth() {
		return this.maxLayerWidth;
	}

	public void setMaxLayerWidth(int maxLayerWidth) {
		this.maxLayerWidth = maxLayerWidth;
		requestLayout();
	}
}

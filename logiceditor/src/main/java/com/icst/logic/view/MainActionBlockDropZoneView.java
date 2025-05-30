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

import com.icst.blockidle.bean.ActionBlockBean;
import com.icst.blockidle.bean.ActionBlockNode;
import com.icst.blockidle.bean.BlockBean;
import com.icst.blockidle.bean.EventBlockBean;
import com.icst.blockidle.bean.RegularBlockBean;
import com.icst.blockidle.bean.RegularBlockNode;
import com.icst.blockidle.bean.TerminatorBlockBean;
import com.icst.blockidle.bean.TerminatorBlockNode;
import com.icst.logic.bean.ActionBlockDropZone;
import com.icst.logic.block.view.ActionBlockBeanView;
import com.icst.logic.block.view.EventBlockBeanView;
import com.icst.logic.config.BlockMarginConstants;
import com.icst.logic.config.LogicEditorConfiguration;
import com.icst.logic.editor.view.LogicEditorView;
import com.icst.logic.exception.EventDefinationBlockNotFound;
import com.icst.logic.exception.TerminatedDropZoneException;
import com.icst.logic.exception.UnexpectedTerminatedException;
import com.icst.logic.exception.UnexpectedViewAddedException;
import com.icst.logic.utils.ActionBlockUtils;
import com.icst.logic.utils.CanvaMathUtils;
import com.icst.logic.utils.UnitUtils;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

public class MainActionBlockDropZoneView extends BlockDropZoneView {
	private EventBlockBean eventDefination;
	private EventBlockBeanView eventDefinationBlockView;
	private Context context;
	private ActionBlockNode actionBlockNode;
	private ActionBlockDropZone actionBlockDropZone;

	public MainActionBlockDropZoneView(
			Context context,
			EventBlockBean eventDefination,
			LogicEditorConfiguration logicEditorConfiguration,
			LogicEditorView logicEditor) {
		super(context, logicEditorConfiguration, logicEditor);
		this.context = context;
		this.eventDefination = eventDefination;

		setOrientation(VERTICAL);

		if (eventDefination == null) {
			throw new EventDefinationBlockNotFound();
		}

		eventDefinationBlockView = new EventBlockBeanView(
				context, eventDefination, getConfiguration(), getLogicEditor());

		addView(eventDefinationBlockView);
		LinearLayout.LayoutParams eventDefBlockLp = new LinearLayout.LayoutParams(
				LinearLayout.LayoutParams.WRAP_CONTENT,
				LinearLayout.LayoutParams.WRAP_CONTENT);

		eventDefinationBlockView.setLayoutParams(eventDefBlockLp);
		actionBlockDropZone = new ActionBlockDropZone() {

			@Override
			public boolean isTerminated() {
				if (actionBlockNode == null)
					return false;
				ActionBlockNode curr = actionBlockNode;
				while (curr != null) {
					if (curr instanceof TerminatorBlockNode) {
						return true;
					}
					curr = curr.next();
				}
				return false;
			}
		};
	}

	public void dereferenceActionBlocks(int index) {
		if (index == 0) {
			actionBlockNode = null;
			return;
		}
		ActionBlockNode iNode = actionBlockNode.get(index);
		if (iNode == null)
			return;
		if (iNode.getPrevious() == null)
			return;
		iNode.getPrevious().setNextNode(null);
	}

	// Always throw this error to make sure no unexpected view is added.
	@Override
	public void addView(View view) {

		if (view instanceof ActionBlockBeanView) {
			super.addView(view);
		} else if (getChildCount() == 0) {
			super.addView(view);
		} else if (view instanceof NearestTargetHighlighterView) {
			super.addView(view);
		} else
			throw new UnexpectedViewAddedException(this, view);
	}

	// Always throw this error to make sure no unexpected view is added.
	@Override
	public void addView(View view, int index) {
		if (view instanceof EventBlockBeanView eventDefBlockView) {
			super.addView(view, index);
		} else if (view instanceof ActionBlockBeanView actionBlockView) {
			super.addView(actionBlockView, index);
		} else if (view instanceof NearestTargetHighlighterView) {
			super.addView(view, index + (eventDefinationBlockView.getParent() == null ? 0 : 1));
		} else
			throw new UnexpectedViewAddedException(this, view);
	}

	private int getIndex(float x, float y) {
		int[] relativeCoordinates = CanvaMathUtils.getRelativeCoordinates(this, getLogicEditor());

		int index = 0;
		for (int i = 0; i < getChildCount(); i++) {
			View child = getChildAt(i);
			if (y - ((int) relativeCoordinates[1]) > child.getY() + (child.getHeight() / 2)) {
				index = i + 1;
			} else {
				break;
			}
		}

		return index;
	}

	@Override
	public void highlightNearestTargetIfAllowed(BlockBean block, float x, float y) {
		if (block instanceof ActionBlockBean actionBlockBean) {
			ActionBlockNode node = null;
			if (block instanceof RegularBlockBean regularBlock) {
				RegularBlockNode regularNode = new RegularBlockNode();
				regularNode.setRegularBlock(regularBlock);
				node = regularNode;
			} else if (block instanceof TerminatorBlockBean terminatorBlock) {
				TerminatorBlockNode terminalNode = new TerminatorBlockNode();
				terminalNode.setTerminatorBlock(terminatorBlock);
				node = terminalNode;
			}
			highlightNearestTargetIfAllowed(node, x, y);
		} else {
			int index = 0;
			for (int i = 0; i < getChildCount(); i++) {
				View child = getChildAt(i);
				if (CanvaMathUtils.isCoordinatesInsideTargetView(
						child, getLogicEditor().getEditorSectionView(), x, y)) {
					index = i;
					break;
				}
			}
			if (getChildAt(index) instanceof ActionBlockBeanView blockBeanView) {
				blockBeanView.highlightNearestTarget(block, x, y);
			}
		}
	}

	@Override
	public void dropBlockIfAllowed(BlockBean block, float x, float y) {
		if (block instanceof ActionBlockBean actionBlockBean) {
			ActionBlockNode node = null;
			if (block instanceof RegularBlockBean regularBlock) {
				RegularBlockNode regularNode = new RegularBlockNode();
				regularNode.setRegularBlock(regularBlock);
				node = regularNode;
			} else if (block instanceof TerminatorBlockBean terminatorBlock) {
				TerminatorBlockNode terminalNode = new TerminatorBlockNode();
				terminalNode.setTerminatorBlock(terminatorBlock);
				node = terminalNode;
			}
			dropBlockIfAllowed(node, x, y);
		} else {
			int index = 0;
			for (int i = 0; i < getChildCount(); i++) {
				View child = getChildAt(i);
				if (CanvaMathUtils.isCoordinatesInsideTargetView(
						child, getLogicEditor().getEditorSectionView(), x, y)) {
					index = i;
					break;
				}
			}
			if (getChildAt(index) instanceof ActionBlockBeanView blockBeanView) {
				blockBeanView.drop(block, x, y);
			}
		}
	}

	public void highlightNearestTargetIfAllowed(ActionBlockNode node, float x, float y) {
		int index = 0;
		for (int i = 0; i < getChildCount(); i++) {
			View child = getChildAt(i);
			if (CanvaMathUtils.isCoordinatesInsideTargetView(
					child, getLogicEditor().getEditorSectionView(), x, y)) {
				index = i;
				break;
			}
		}
		if (getChildAt(index) instanceof ActionBlockBeanView blockBeanView) {
			if (blockBeanView.canDrop(node, x, y)) {
				blockBeanView.highlightNearestTarget(node, x, y);
				return;
			}
		}

		index = getIndex(x, y);
		if (index != 0) {
			index -= 1;
		}
		if (canDrop(node, index)) {
			getLogicEditor().removeDummyHighlighter();
			LayoutParams highlighterLp = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
			highlighterLp.setMargins(0, BlockMarginConstants.ACTION_BLOCK_TOP_MARGIN, 0, 0);
			NearestTargetHighlighterView highlighter = new NearestTargetHighlighterView(getContext(),
					node.getActionBlock());
			getLogicEditor().setDummyHighlighter(highlighter);
			addView(highlighter, index);
			highlighter.setLayoutParams(highlighterLp);
		}
	}

	public void dropBlockIfAllowed(ActionBlockNode node, float x, float y) {
		int index = 0;
		for (int i = 0; i < getChildCount(); i++) {
			View child = getChildAt(i);
			if (CanvaMathUtils.isCoordinatesInsideTargetView(
					child, getLogicEditor().getEditorSectionView(), x, y)) {
				index = i;
				break;
			}
		}
		if (getChildAt(index) instanceof ActionBlockBeanView blockBeanView) {
			if (blockBeanView.canDrop(node, x, y)) {
				blockBeanView.drop(node, x, y);
				return;
			}
		}

		index = getIndex(x, y);
		if (index != 0) {
			index -= 1;
		}
		if (canDrop(node, index)) {
			LayoutParams lp = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
			lp.setMargins(0, BlockMarginConstants.ACTION_BLOCK_TOP_MARGIN, 0, 0);
			addBlockBeans(node, index);
		}
	}

	public boolean canDrop(ActionBlockNode node, float x, float y) {
		int index = 0;
		for (int i = 0; i < getChildCount(); i++) {
			View child = getChildAt(i);
			if (CanvaMathUtils.isCoordinatesInsideTargetView(
					child, getLogicEditor().getEditorSectionView(), x, y)) {
				index = i;
				break;
			}
		}
		if (getChildAt(index) instanceof ActionBlockBeanView blockBeanView) {
			if (blockBeanView.canDrop(node, x, y)) {
				return true;
			}
		}
		index = getIndex(x, y);
		if (index != 0) {
			index -= 1;
		}
		return canDrop(node, index);
	}

	@Override
	public boolean canDrop(BlockBean block, float x, float y) {
		if (block instanceof ActionBlockBean actionBlockBean) {
			ActionBlockNode node = null;
			if (block instanceof RegularBlockBean regularBlock) {
				RegularBlockNode regularNode = new RegularBlockNode();
				regularNode.setRegularBlock(regularBlock);
				node = regularNode;
			} else if (block instanceof TerminatorBlockBean terminatorBlock) {
				TerminatorBlockNode terminalNode = new TerminatorBlockNode();
				terminalNode.setTerminatorBlock(terminatorBlock);
				node = terminalNode;
			}
			return canDrop(node, x, y);
		} else {
			int index = 0;
			for (int i = 0; i < getChildCount(); i++) {
				View child = getChildAt(i);
				if (CanvaMathUtils.isCoordinatesInsideTargetView(
						child, getLogicEditor().getEditorSectionView(), x, y)) {
					index = i;
					break;
				}
			}
			if (getChildAt(index) instanceof ActionBlockBeanView blockBeanView) {
				return blockBeanView.canDrop(block, x, y);
			}
		}
		return false;
	}

	public boolean canDrop(ActionBlockNode node, int index) {
		if (node == null) {
			return false;
		}

		if (node.getSize() == 0)
			return false;

		if (actionBlockNode == null) {
			if (index == 0) {
				return true;
			} else
				return false;
		}

		int actionBlockNodeSize = actionBlockNode.getSize();

		if (index > actionBlockNodeSize) {
			return false;
		}

		if (index == actionBlockNodeSize) {
			return !isTerminated();
		}

		if (node.isTerminated()) {
			return false;
		}

		return true;
	}

	private void addBlockView(ActionBlockNode blocks, int index) {
		ActionBlockNode node = blocks;
		for (int i = 0; node != null; ++i, node = node.next()) {
			ActionBlockBean actionBlock = node.getActionBlock();
			ActionBlockBeanView actionBlockBeanView = ActionBlockUtils.getBlockView(
					context, actionBlock, getConfiguration(), getLogicEditor());
			actionBlockBeanView.setInsideCanva(true);
			if (actionBlockBeanView == null) {
				continue;
			}
			super.addView(actionBlockBeanView, index + i + (eventDefinationBlockView.getParent() == null ? 0 : 1));

			LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
					LinearLayout.LayoutParams.WRAP_CONTENT,
					LinearLayout.LayoutParams.WRAP_CONTENT);
			lp.setMargins(
					0,
					i == 0 && index == 0
							? 0
							: UnitUtils.dpToPx(
									getContext(), BlockMarginConstants.ACTION_BLOCK_TOP_MARGIN),
					0,
					0);
			actionBlockBeanView.setLayoutParams(lp);
		}
	}

	public void addBlockBeans(ActionBlockNode node, int index) {
		if (node == null) {
			return;
		}

		if (actionBlockNode == null) {
			if (index == 0) {
				actionBlockNode = node;
				addBlockView(actionBlockNode, 0);
				return;
			} else
				return;
		}

		int actionBlockNodeSize = actionBlockNode.getSize();

		if (index > actionBlockNodeSize) {
			throw new IndexOutOfBoundsException(index);
		}

		if (index == actionBlockNodeSize) {
			if (actionBlockNode.isTerminated()) {
				throw new TerminatedDropZoneException();
			}
		}

		if (index < actionBlockNodeSize) {
			if (node.isTerminated()) {
				throw new UnexpectedTerminatedException();
			}
		}

		addBlockView(node, index);

		if (index == 0) {
			ActionBlockNode tempHead = actionBlockNode;

			ActionBlockNode lastNode = node;
			while (lastNode.hasNext()) {
				lastNode = lastNode.next();
			}
			tempHead.setPrevious((RegularBlockNode) lastNode);
			((RegularBlockNode) lastNode).setNextNode(tempHead);
			actionBlockNode = node;
		} else if (index == actionBlockNodeSize) {

			ActionBlockNode lastNode = actionBlockNode;
			while (lastNode.hasNext()) {
				lastNode = lastNode.next();
			}
			((RegularBlockNode) lastNode).setNextNode(node);
			node.setPrevious((RegularBlockNode) lastNode);

		} else {
			ActionBlockNode iNode = actionBlockNode.get(index);

			iNode.getPrevious().setNextNode(node);
			node.setPrevious(iNode.getPrevious());

			ActionBlockNode lastNode = node;
			while (lastNode.hasNext()) {
				lastNode = lastNode.next();
			}

			((RegularBlockNode) lastNode).setNextNode(iNode);
			iNode.setPrevious((RegularBlockNode) lastNode);
		}
	}

	public int getBlocksSize() {
		return actionBlockNode.getSize();
	}

	public boolean isTerminated() {
		return actionBlockDropZone.isTerminated();
	}

	public ActionBlockDropZone getActionBlockDropZone() {
		return this.actionBlockDropZone;
	}

	public ActionBlockNode getActionBlockNode() {
		return this.actionBlockNode;
	}
}

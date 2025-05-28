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

import com.icst.blockidle.bean.ActionBlockNode;
import com.icst.blockidle.bean.RegularBlockBean;
import com.icst.blockidle.bean.RegularBlockNode;
import com.icst.blockidle.bean.TerminatorBlockNode;
import java.util.ArrayList;
import java.util.Collections;

import com.icst.blockidle.bean.ActionBlockBean;
import com.icst.blockidle.bean.BlockBean;
import com.icst.blockidle.bean.TerminatorBlockBean;
import com.icst.logic.bean.ActionBlockDropZone;
import com.icst.logic.block.view.ActionBlockBeanView;
import com.icst.logic.config.BlockMarginConstants;
import com.icst.logic.config.LogicEditorConfiguration;
import com.icst.logic.editor.view.LogicEditorView;
import com.icst.logic.exception.TerminatedDropZoneException;
import com.icst.logic.exception.UnexpectedTerminatedException;
import com.icst.logic.exception.UnexpectedViewAddedException;
import com.icst.logic.utils.ActionBlockUtils;
import com.icst.logic.utils.CanvaMathUtils;
import com.icst.logic.utils.UnitUtils;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

public class ActionBlockDropZoneView extends BlockDropZoneView {
	private Context context;
	private ActionBlockNode actionBlockNode;
	private ActionBlockDropZone actionBlockDropZone;

	public ActionBlockDropZoneView(
			Context context,
			ActionBlockNode actionBlockNode,
			LogicEditorConfiguration logicEditorConfiguration,
			LogicEditorView logicEditor) {
		super(context, logicEditorConfiguration, logicEditor);
		this.context = context;
		this.actionBlockNode = actionBlockNode;
		setOrientation(VERTICAL);
		addBlockView();
		actionBlockDropZone = new ActionBlockDropZone() {

			@Override
			public boolean isTerminated() {
				if (actionBlockNode == null) return false;
				ActionBlockNode curr = actionBlockNode;
				while(curr.hasNext()) {
					curr = curr.next();
					if(curr instanceof TerminatorBlockNode) {
						return true;
					}
				}
				return false;
			}
		};
	}

	public void dereferenceActionBlocks(int index) {
		ActionBlockNode iNode = actionBlockNode.get(index);
        if (iNode == null) return;
        if (iNode.getPrevious() == null) return;
		iNode.getPrevious().setNextNode(null);
	}

	// Always throw this error to make sure no unexpected view is added.
	@Override
	public void addView(View view) {
        if (view instanceof LinearLayout || view instanceof ActionBlockBeanView) {
            super.addView(view);
        } else {
			throw new UnexpectedViewAddedException(this, view);
		}
	}

	// Always throw this error to make sure no unexpected view is added.
	@Override
	public void addView(View view, int index) {
		if (view instanceof LinearLayout || view instanceof ActionBlockBeanView) {
			super.addView(view, index);
		} else {
			throw new UnexpectedViewAddedException(this, view);
		}
	}

	@Override
	public void highlightNearestTargetIfAllowed(BlockBean block, float x, float y) {
		if (block instanceof ActionBlockBean mActionBlockBean) {
			ActionBlockNode node = null;
			if(block instanceof RegularBlockBean regularBlock) {
				RegularBlockNode regularNode = new RegularBlockNode();
				regularNode.setRegularBlock(regularBlock);
				node = regularNode;
			} else if(block instanceof TerminatorBlockBean terminatorBlock) {
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
		if (block instanceof ActionBlockBean mActionBlockBean) {
			ActionBlockNode node = null;
			if(block instanceof RegularBlockBean regularBlock) {
				RegularBlockNode regularNode = new RegularBlockNode();
				regularNode.setRegularBlock(regularBlock);
				node = regularNode;
			} else if(block instanceof TerminatorBlockBean terminatorBlock) {
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

	@Override
	public boolean canDrop(BlockBean block, float x, float y) {
		if (block instanceof ActionBlockBean mActionBlockBean) {
			ActionBlockNode node = null;
			if(block instanceof RegularBlockBean regularBlock) {
				RegularBlockNode regularNode = new RegularBlockNode();
				regularNode.setRegularBlock(regularBlock);
				node = regularNode;
			} else if(block instanceof TerminatorBlockBean terminatorBlock) {
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

	public void highlightNearestTargetIfAllowed(
			ActionBlockNode node, float x, float y) {
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
		if (canDrop(node, index)) {
			getLogicEditor().removeDummyHighlighter();
			LayoutParams highlighterLp = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
			highlighterLp.setMargins(0, BlockMarginConstants.ACTION_BLOCK_TOP_MARGIN, 0, 0);
			NearestTargetHighlighterView highlighter = new NearestTargetHighlighterView(getContext(), node.getActionBlock());
			getLogicEditor().setDummyHighlighter(highlighter);
			super.addView(highlighter, index);

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
		if (canDrop(node, index)) {
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
		return canDrop(node, getIndex(x, y));
	}

	public void addActionBlocksBeans(ActionBlockNode node, int index) {
		if (node == null) {
			return;
		}
		
		if (actionBlockNode == null) {
			if(index == 0) {
				addBlockBeans(node, index);
				return;
			} else {
				throw new IndexOutOfBoundsException(index);
			}
			return;
		}
		
		int actionBlockNodeSize = actionBlockNode.getSize();

		if(actionBlockNodeSize < index) {
			throw new IndexOutOfBoundsException(index);
		}
		
		// Trying to add blocks node at last position, so make sure drop zone is not terminated
        if (actionBlockNodeSize == index) {
			
            if (isTerminated()) {
                throw new TerminatedDropZoneException();
            }
			
            addBlockBeans(node, index);
        } else {
            if (node.getSize() == 0) return;
			
			if(node.isTerminated()) {
				throw new UnexpectedTerminatedException();
			}
			
            addBlockBeans(node, index);
        }
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

	private boolean canDrop(ActionBlockBean actionBlock, int index) {
		ActionBlockNode node = null;
        if (actionBlock instanceof RegularBlockBean regularBlock) {
            RegularBlockNode regularNode = new RegularBlockNode();
            regularNode.setRegularBlock(regularBlock);
            node = regularNode;
        } else if (actionBlock instanceof TerminatorBlockBean terminatorBlock) {
            TerminatorBlockNode terminalNode = new TerminatorBlockNode();
            terminalNode.setTerminatorBlock(terminatorBlock);
            node = terminalNode;
        }

		return canDrop(node, index);
	}

	private boolean canDrop(ActionBlockNode node, int index) {
		if (node == null) {
			return false;
		}
		
		if (node.getSize() == 0) return false;
		
		if (actionBlockNode == null) {
			if(index == 0) {
				return true;
			} else return false;
		}
		
		int actionBlockNodeSize = actionBlockNode.getSize();
		
	    if(index > actionBlockNodeSize) {
	    	return false;
	    }
		
		if(index == actionBlockNodeSize) {
			return !isTerminated();
		}
		
		if(node.isTerminated()) {
			return false;
		}
		
		return true;
		
	}

	private void addBlockView() {
		int i = 0;
		for(ActionBlockNode node : actionBlockNode) {
		
			ActionBlockBean actionBlock = node.getActionBlock();
			ActionBlockBeanView actionBlockBeanView = ActionBlockUtils.getBlockView(
					context, actionBlock, getConfiguration(), getLogicEditor());

			if (actionBlockBeanView == null)
				continue;

			actionBlockBeanView.setInsideCanva(true);
			super.addView(actionBlockBeanView, i);

            LinearLayout.LayoutParams lp =
                    new LinearLayout.LayoutParams(
                            LinearLayout.LayoutParams.WRAP_CONTENT,
                            LinearLayout.LayoutParams.WRAP_CONTENT);
            lp.setMargins(
                    0,
                    i == 0
                            ? 0
                            : UnitUtils.dpToPx(
                                    getContext(), BlockMarginConstants.ACTION_BLOCK_TOP_MARGIN),
                    0,
                    0);
				actionBlockBeanView.setLayoutParams(lp);
			i++;
		}
	}

	private void addBlockBeans(ActionBlockNode node, int index) {
		if(node == null) {
			return;
		}
		
		if(actionBlockNode == null) {
			if(index == 0) {
				actionBlockNode = node;
				addBlockView();
				return;
			} else return;
		}
		
		
		int actionBlockNodeSize = actionBlockNode.getSize();
		
		if(index > actionBlockNodeSize) {
			throw new IndexOutOfBoundsException(index);
		}
		
		if(index == actionBlockNodeSize) {
			if(actionBlockNode.isTerminated()) {
				throw new TerminatedDropZoneException();
			}
		}
		
		
		if(index < actionBlockNodeSize) {
			if(node.isTerminated()) {
				throw new UnexpectedTerminatedException();
			}
		}
		
		if(index == 0) {
			ActionBlockNode tempHead = actionBlockNode;
			actionBlockNode = node;
			tempHead.setPrevious((RegularBlockNode)node);
			ActionBlockNode lastNode = node;
			for(ActionBlockNode curr : node) {
				lastNode = curr;
			}
			((RegularBlockNode)lastNode).setNextNode(tempHead);
		} else {
            ActionBlockNode current = actionBlockNode;
            int count = 0;
    
            while (current != null && count < index - 1) {
                current = current.next();
                count++;
            }

            if (current == null) {
                throw new IndexOutOfBoundsException("Index: " + index);
            }
			
			ActionBlockNode newNodeLast = node;
            for(ActionBlockNode newNodeLastNode : node) {
            	newNodeLast = newNodeLastNode;
            }

            ((RegularBlockNode)newNodeLast).setNextNode(current.next());
			((RegularBlockNode)current).setNextNode(node);
		}
		
		int i = 0;
		for(ActionBlockNode actionBlockNode : node) {
			ActionBlockBean actionBlock = actionBlockNode.getActionBlock();
			ActionBlockBeanView actionBlockBeanView = ActionBlockUtils.getBlockView(
					context, actionBlock, getConfiguration(), getLogicEditor());

			if (actionBlockBeanView == null)
				continue;
			
			actionBlockBeanView.setInsideCanva(true);
			super.addView(actionBlockBeanView, i + index);

			LinearLayout.LayoutParams lp =
                    new LinearLayout.LayoutParams(
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
		

            i++;
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

	public ActionBlockNode getBlockNode() {
		return this.actionBlockNode;
	}
}

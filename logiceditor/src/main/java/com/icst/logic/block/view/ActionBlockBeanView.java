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

package com.icst.logic.block.view;

import com.icst.blockidle.bean.ActionBlockNode;
import com.icst.blockidle.bean.RegularBlockBean;
import com.icst.blockidle.bean.RegularBlockNode;
import com.icst.blockidle.bean.TerminatorBlockBean;
import com.icst.blockidle.bean.TerminatorBlockNode;
import java.util.ArrayList;

import com.icst.blockidle.bean.ActionBlockBean;
import com.icst.blockidle.bean.BlockBean;
import com.icst.logic.config.LogicEditorConfiguration;
import com.icst.logic.editor.view.LogicEditorView;
import com.icst.logic.utils.CanvaMathUtils;
import com.icst.logic.view.ActionBlockLayerView;
import com.icst.logic.view.BlockElementLayerBeanView;
import com.icst.logic.view.LayerBeanView;

import android.content.Context;

public abstract class ActionBlockBeanView extends BlockBeanView {

	public ActionBlockBeanView(
			Context context,
			LogicEditorConfiguration logicEditorConfiguration,
			LogicEditorView logicEditor) {
		super(context, logicEditorConfiguration, logicEditor);
	}

	public abstract ActionBlockBean getActionBlockBean();

	public abstract ArrayList<LayerBeanView> getLayers();

	@Override
	public boolean canDrop(BlockBean block, float x, float y) {
		if (block instanceof ActionBlockBean mActionBlockBean) {
			ArrayList<ActionBlockBean> blocks = new ArrayList<>();
			blocks.add(mActionBlockBean);
			return canDrop(blocks, x, y);
		} else {
			for (int i = 0; i < getLayers().size(); ++i) {
				if (CanvaMathUtils.isCoordinatesInsideTargetView(
						getLayers().get(i).getView(), getLogicEditor().getEditorSectionView(), x, y)) {
					if (getLayers().get(i) instanceof BlockElementLayerBeanView layerView) {
						return layerView.canDrop(
								block, getLogicEditor().getEditorSectionView(), x, y);
					} else if (getLayers().get(i) instanceof ActionBlockLayerView layerView) {
						return layerView.canDrop(block, x, y);
					}
				}
			}
		}
		return false;
	}

	public boolean canDrop(ActionBlockNode actionBlockNode, float x, float y) {
		for (int i = 0; i < getLayers().size(); ++i) {
			if (!CanvaMathUtils.isCoordinatesInsideTargetView(
					getLayers().get(i).getView(), getLogicEditor().getEditorSectionView(), x, y)) {
				continue;
			}
			if (getLayers().get(i) instanceof ActionBlockLayerView layerView) {
				return layerView.canDrop(actionBlockNode, x, y);
			}
		}
		return false;
	}

	@Override
	public void highlightNearestTarget(BlockBean block, float x, float y) {
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
			highlightNearestTarget(node, x, y);
		} else {
			for (int i = 0; i < getLayers().size(); ++i) {
				if (!CanvaMathUtils.isCoordinatesInsideTargetView(
						getLayers().get(i).getView(), getLogicEditor().getEditorSectionView(), x, y)) {
					continue;
				}
				if (getLayers().get(i) instanceof BlockElementLayerBeanView layerView) {
					layerView.highlightNearestTargetIfAllowed(
							block, getLogicEditor().getEditorSectionView(), x, y);
				} else if (getLayers().get(i) instanceof ActionBlockLayerView layerView) {
					layerView.highlightNearestTargetIfAllowed(block, x, y);
				}
			}
		}
	}

	public void highlightNearestTarget(ActionBlockNode actionBlockNode, float x, float y) {
		for (int i = 0; i < getLayers().size(); ++i) {
			if (!CanvaMathUtils.isCoordinatesInsideTargetView(
					getLayers().get(i).getView(), getLogicEditor().getEditorSectionView(), x, y)) {
				continue;
			}
			if (getLayers().get(i) instanceof ActionBlockLayerView layerView) {
				layerView.highlightNearestTargetIfAllowed(actionBlockNode, x, y);
			}
		}
	}

	@Override
	public void drop(BlockBean block, float x, float y) {
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
			drop(node, x, y);
		} else {
			for (int i = 0; i < getLayers().size(); ++i) {
				if (!CanvaMathUtils.isCoordinatesInsideTargetView(
						getLayers().get(i).getView(), getLogicEditor().getEditorSectionView(), x, y)) {
					continue;
				}
				if (getLayers().get(i) instanceof BlockElementLayerBeanView layerView) {
					layerView.dropToNearestTargetIfAllowed(
							block, getLogicEditor().getEditorSectionView(), x, y);
				} else if (getLayers().get(i) instanceof ActionBlockLayerView layerView) {
					layerView.dropBlockIfAllowed(block, x, y);
				}
			}
		}
	}

	public void drop(ActionBlockNode actionBlockNode, float x, float y) {
		for (int i = 0; i < getLayers().size(); ++i) {
			if (!CanvaMathUtils.isCoordinatesInsideTargetView(
					getLayers().get(i).getView(), getLogicEditor().getEditorSectionView(), x, y)) {
				continue;
			}
			if (getLayers().get(i) instanceof ActionBlockLayerView layerView) {
				layerView.dropBlockIfAllowed(actionBlockNode, x, y);
			}
		}
	}

}

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

package com.icst.blockidle.bean;

import java.io.Serializable;
import java.util.ArrayList;

import com.icst.blockidle.bean.utils.BeanArrayCloneUtils;
import com.icst.blockidle.bean.utils.BlockBeansUIDConstants;

/**
 * A Bean that holds a group of ActionBlocks and can hold one TerminatorBlockBean. Used to store the
 * nested BlockBeans, and does not hold BlockElementBean directly into it.
 */
public class ActionBlockLayerBean extends LayerBean<ActionBlockLayerBean> implements Serializable {

	public static final long serialVersionUID = BlockBeansUIDConstants.ACTION_ELEMENT_LAYER_BEAN;

	private ActionBlockNode actionBlockNode;
	private String key;

	public ActionBlockNode getActionBlockNode() {
		return this.actionBlockNode;
	}

	public void setActionBlockNode(ActionBlockNode actionBlockNode) {
		this.actionBlockNode = actionBlockNode;
	}

	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getProcessedCode() {
		StringBuilder code = new StringBuilder();
		if (actionBlockNode == null) {
			return "";
		}
		for(Object node : actionBlockNode) {
			code.append(((ActionBlockNode)node).getActionBlock().getProcessedCode());
            code.append("\n");
		}
		return code.toString();
	}

    @SuppressWarnings("unchecked")
	public <T extends BeanMetadata> ArrayList<T> getAllMetadata(Class<T> classType) {
		ArrayList<T> blocksMetadata = new ArrayList<T>();
		for(Object node : actionBlockNode) {
			blocksMetadata.addAll(((ActionBlockNode)node).getActionBlock().getAllMetadata(classType));
		}
		return blocksMetadata;
	}

	@Override
	public ActionBlockLayerBean cloneBean() {
		ActionBlockLayerBean clone = new ActionBlockLayerBean();
		clone.setActionBlockNode(actionBlockNode.deepClone());
		clone.setKey(getKey() == null ? null : new String(getKey()));
		return clone;
	}
}

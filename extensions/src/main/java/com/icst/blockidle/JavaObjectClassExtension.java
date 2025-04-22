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

package com.icst.blockidle;

import java.util.ArrayList;

import com.icst.blockidle.bean.ActionBlockBean;
import com.icst.blockidle.bean.BlockElementBean;
import com.icst.blockidle.bean.BlockElementLayerBean;
import com.icst.blockidle.bean.EventBean;
import com.icst.blockidle.bean.EventBlockBean;
import com.icst.blockidle.bean.LabelBlockElementBean;
import com.icst.blockidle.bean.utils.CodeFormatterUtils;

@Extension(extensionFileName = "JavaObjectExtension.bidle")
public class JavaObjectClassExtension {

	@ExtensionItem(extensionItemName = "events/equalsMethodEvent")
	public static EventBean getEqualsMethodEvent() {
		EventBean event = new EventBean();
		event.setActionBlockBeans(new ArrayList<ActionBlockBean>());
		event.setEventDefinationBlockBean(getObjectEqualsEventBlock());
		event.setName("equals");
		event.setTitle("equals");
		event.setDescription("Compares this class instance with object.");

		StringBuilder code = new StringBuilder();
		code.append("@Override\n");
		code.append("public boolean equals(Object object) {\n\t");
		code.append(CodeFormatterUtils.getKeySyntaxString("EventCode"));
		code.append("\n}");

		event.setCodeSyntax(code.toString());
		return event;
	}

	public static EventBlockBean getObjectEqualsEventBlock() {
		EventBlockBean block = new EventBlockBean();
		block.setColor("#FCC303");

		ArrayList<BlockElementLayerBean> layers = new ArrayList<>();

		BlockElementLayerBean layer1 = new BlockElementLayerBean();
		ArrayList<BlockElementBean> layer1elements = new ArrayList<>();
		LabelBlockElementBean equals = new LabelBlockElementBean();
		equals.setLabel("equals");
		layer1elements.add(equals);
		layer1.setBlockElementBeans(layer1elements);

		layers.add(layer1);
		block.setElementsLayers(layers);
		return block;
	}

}

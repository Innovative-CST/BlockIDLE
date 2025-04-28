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

	@ExtensionItem(extensionItemName = "events/toStringMethodEvent")
	public static EventBean getToStringMethodEvent() {
		EventBean event = new EventBean();
		event.setActionBlockBeans(new ArrayList<>());
		event.setEventDefinationBlockBean(getObjectToStringEventBlock());
		event.setName("toString");
		event.setTitle("toString");
		event.setDescription("Returns a string representation of the object.");

		StringBuilder code = new StringBuilder();
		code.append("@Override\n");
		code.append("public String toString() {\n\t");
		code.append(CodeFormatterUtils.getKeySyntaxString("EventCode"));
		code.append("\n}");

		event.setCodeSyntax(code.toString());
		return event;
	}

	public static EventBlockBean getObjectToStringEventBlock() {
		EventBlockBean block = new EventBlockBean();
		block.setColor("#F1A9A0");

		ArrayList<BlockElementLayerBean> layers = new ArrayList<>();

		BlockElementLayerBean layer = new BlockElementLayerBean();
		ArrayList<BlockElementBean> elements = new ArrayList<>();
		LabelBlockElementBean label = new LabelBlockElementBean();
		label.setLabel("toString");
		elements.add(label);
		layer.setBlockElementBeans(elements);

		layers.add(layer);
		block.setElementsLayers(layers);
		return block;
	}

	@ExtensionItem(extensionItemName = "events/cloneMethodEvent")
	public static EventBean getCloneMethodEvent() {
		EventBean event = new EventBean();
		event.setActionBlockBeans(new ArrayList<>());
		event.setEventDefinationBlockBean(getObjectCloneEventBlock());
		event.setName("clone");
		event.setTitle("clone");
		event.setDescription("Creates and returns a copy of this object.");

		StringBuilder code = new StringBuilder();
		code.append("@Override\n");
		code.append("protected Object clone() throws CloneNotSupportedException {\n\t");
		code.append(CodeFormatterUtils.getKeySyntaxString("EventCode"));
		code.append("\n}");

		event.setCodeSyntax(code.toString());
		return event;
	}

	public static EventBlockBean getObjectCloneEventBlock() {
		EventBlockBean block = new EventBlockBean();
		block.setColor("#C3F584");

		ArrayList<BlockElementLayerBean> layers = new ArrayList<>();

		BlockElementLayerBean layer = new BlockElementLayerBean();
		ArrayList<BlockElementBean> elements = new ArrayList<>();
		LabelBlockElementBean label = new LabelBlockElementBean();
		label.setLabel("clone");
		elements.add(label);
		layer.setBlockElementBeans(elements);

		layers.add(layer);
		block.setElementsLayers(layers);
		return block;
	}

	@ExtensionItem(extensionItemName = "events/getClassMethodEvent")
	public static EventBean getGetClassMethodEvent() {
		EventBean event = new EventBean();
		event.setActionBlockBeans(new ArrayList<>());
		event.setEventDefinationBlockBean(getObjectGetClassEventBlock());
		event.setName("getClass");
		event.setTitle("getClass");
		event.setDescription("Returns the runtime class of this object.");

		StringBuilder code = new StringBuilder();
		code.append("public final Class<?> getClass() {\n\t");
		code.append(CodeFormatterUtils.getKeySyntaxString("EventCode"));
		code.append("\n}");

		event.setCodeSyntax(code.toString());
		return event;
	}

	public static EventBlockBean getObjectGetClassEventBlock() {
		EventBlockBean block = new EventBlockBean();
		block.setColor("#B2EBF2");

		ArrayList<BlockElementLayerBean> layers = new ArrayList<>();
		BlockElementLayerBean layer = new BlockElementLayerBean();
		ArrayList<BlockElementBean> elements = new ArrayList<>();
		LabelBlockElementBean label = new LabelBlockElementBean();
		label.setLabel("getClass");
		elements.add(label);
		layer.setBlockElementBeans(elements);
		layers.add(layer);
		block.setElementsLayers(layers);
		return block;
	}

	@ExtensionItem(extensionItemName = "events/notifyMethodEvent")
	public static EventBean getNotifyMethodEvent() {
		EventBean event = new EventBean();
		event.setActionBlockBeans(new ArrayList<>());
		event.setEventDefinationBlockBean(getObjectNotifyEventBlock());
		event.setName("notify");
		event.setTitle("notify");
		event.setDescription("Wakes up a single thread waiting on this object’s monitor.");

		StringBuilder code = new StringBuilder();
		code.append("public final void notify() {\n\t");
		code.append(CodeFormatterUtils.getKeySyntaxString("EventCode"));
		code.append("\n}");

		event.setCodeSyntax(code.toString());
		return event;
	}

	public static EventBlockBean getObjectNotifyEventBlock() {
		EventBlockBean block = new EventBlockBean();
		block.setColor("#FFD54F");

		ArrayList<BlockElementLayerBean> layers = new ArrayList<>();
		BlockElementLayerBean layer = new BlockElementLayerBean();
		ArrayList<BlockElementBean> elements = new ArrayList<>();
		LabelBlockElementBean label = new LabelBlockElementBean();
		label.setLabel("notify");
		elements.add(label);
		layer.setBlockElementBeans(elements);
		layers.add(layer);
		block.setElementsLayers(layers);
		return block;
	}

	@ExtensionItem(extensionItemName = "events/notifyAllMethodEvent")
	public static EventBean getNotifyAllMethodEvent() {
		EventBean event = new EventBean();
		event.setActionBlockBeans(new ArrayList<>());
		event.setEventDefinationBlockBean(getObjectNotifyAllEventBlock());
		event.setName("notifyAll");
		event.setTitle("notifyAll");
		event.setDescription("Wakes up all threads waiting on this object’s monitor.");

		StringBuilder code = new StringBuilder();
		code.append("public final void notifyAll() {\n\t");
		code.append(CodeFormatterUtils.getKeySyntaxString("EventCode"));
		code.append("\n}");

		event.setCodeSyntax(code.toString());
		return event;
	}

	public static EventBlockBean getObjectNotifyAllEventBlock() {
		EventBlockBean block = new EventBlockBean();
		block.setColor("#FFB74D");

		ArrayList<BlockElementLayerBean> layers = new ArrayList<>();
		BlockElementLayerBean layer = new BlockElementLayerBean();
		ArrayList<BlockElementBean> elements = new ArrayList<>();
		LabelBlockElementBean label = new LabelBlockElementBean();
		label.setLabel("notifyAll");
		elements.add(label);
		layer.setBlockElementBeans(elements);
		layers.add(layer);
		block.setElementsLayers(layers);
		return block;
	}

	@ExtensionItem(extensionItemName = "events/waitMethodEvent")
	public static EventBean getWaitMethodEvent() {
		EventBean event = new EventBean();
		event.setActionBlockBeans(new ArrayList<>());
		event.setEventDefinationBlockBean(getObjectWaitEventBlock());
		event.setName("wait");
		event.setTitle("wait");
		event.setDescription("Causes the current thread to wait until notified or interrupted.");

		StringBuilder code = new StringBuilder();
		code.append("public final void wait() throws InterruptedException {\n\t");
		code.append(CodeFormatterUtils.getKeySyntaxString("EventCode"));
		code.append("\n}");

		event.setCodeSyntax(code.toString());
		return event;
	}

	public static EventBlockBean getObjectWaitEventBlock() {
		EventBlockBean block = new EventBlockBean();
		block.setColor("#FFF176");

		ArrayList<BlockElementLayerBean> layers = new ArrayList<>();
		BlockElementLayerBean layer = new BlockElementLayerBean();
		ArrayList<BlockElementBean> elements = new ArrayList<>();
		LabelBlockElementBean label = new LabelBlockElementBean();
		label.setLabel("wait");
		elements.add(label);
		layer.setBlockElementBeans(elements);
		layers.add(layer);
		block.setElementsLayers(layers);
		return block;
	}

	@ExtensionItem(extensionItemName = "events/hashCodeMethodEvent")
	public static EventBean getHashCodeMethodEvent() {
		EventBean event = new EventBean();
		event.setActionBlockBeans(new ArrayList<>());
		event.setEventDefinationBlockBean(getObjectHashCodeEventBlock());
		event.setName("hashCode");
		event.setTitle("hashCode");
		event.setDescription("Returns a hash code value for the object.");

		StringBuilder code = new StringBuilder();
		code.append("@Override\n");
		code.append("public int hashCode() {\n\t");
		code.append(CodeFormatterUtils.getKeySyntaxString("EventCode"));
		code.append("\n}");

		event.setCodeSyntax(code.toString());
		return event;
	}

	public static EventBlockBean getObjectHashCodeEventBlock() {
		EventBlockBean block = new EventBlockBean();
		block.setColor("#A3C4F3");

		ArrayList<BlockElementLayerBean> layers = new ArrayList<>();

		BlockElementLayerBean layer = new BlockElementLayerBean();
		ArrayList<BlockElementBean> elements = new ArrayList<>();
		LabelBlockElementBean label = new LabelBlockElementBean();
		label.setLabel("hashCode");
		elements.add(label);
		layer.setBlockElementBeans(elements);

		layers.add(layer);
		block.setElementsLayers(layers);
		return block;
	}

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

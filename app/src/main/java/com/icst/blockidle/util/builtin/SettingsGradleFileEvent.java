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

package com.icst.blockidle.util.builtin;

import java.util.ArrayList;

import com.icst.blockidle.bean.BlockElementBean;
import com.icst.blockidle.bean.BlockElementLayerBean;
import com.icst.blockidle.bean.EventBean;
import com.icst.blockidle.bean.EventBlockBean;
import com.icst.blockidle.bean.LabelBlockElementBean;
import com.icst.blockidle.bean.utils.CodeFormatterUtils;
import com.icst.blockidle.repository.EventRepository;
import com.icst.blockidle.util.IDLEGradleFile;

public final class SettingsGradleFileEvent {

	public static void installDefaultEvent(IDLEGradleFile gradleFile) {
		EventRepository mEventRepository = EventRepository.getInstance(gradleFile);
		mEventRepository.addEvent(getDefaultEvent());
	}

	public static EventBlockBean getEventBlock() {
		EventBlockBean block = new EventBlockBean();
		block.setColor("#209BC4");

		ArrayList<BlockElementLayerBean> layers = new ArrayList<>();

		BlockElementLayerBean layer = new BlockElementLayerBean();
		ArrayList<BlockElementBean> elements = new ArrayList<>();
		LabelBlockElementBean label = new LabelBlockElementBean();
		label.setLabel("define settings.gradle");
		elements.add(label);
		layer.setBlockElementBeans(elements);

		layers.add(layer);
		block.setElementsLayers(layers);
		return block;
	}

	private static EventBean getDefaultEvent() {
		EventBean event = new EventBean();
		event.setActionBlockNode(null);
		event.setEventDefinationBlockBean(getEventBlock());
		event.setName("define-settings.gradle");
		event.setTitle("Project configuration");
		event.setDescription("Define the project config to inject in settings.gradle.");

		StringBuilder code = new StringBuilder();
		code.append(CodeFormatterUtils.getKeySyntaxString("EventCode"));

		event.setCodeSyntax(code.toString());
		return event;
	}
}

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

package com.icst.blockidle.blocks;

import java.util.ArrayList;

import com.icst.blockidle.bean.BeanManifest;
import com.icst.blockidle.bean.BeanMetadata;
import com.icst.blockidle.bean.BlockBean;
import com.icst.blockidle.bean.BlockElementBean;
import com.icst.blockidle.bean.BlockElementLayerBean;
import com.icst.blockidle.bean.BlockPaletteBean;
import com.icst.blockidle.bean.LabelBlockElementBean;
import com.icst.blockidle.bean.LayerBean;
import com.icst.blockidle.bean.RegularBlockBean;
import com.icst.blockidle.bean.StringBlockElementBean;
import com.icst.blockidle.bean.SupportedLanguagesBean;
import com.icst.blockidle.bean.enums.ProgrammingLanguage;
import com.icst.blockidle.bean.utils.CodeFormatterUtils;

public final class SettingsGradleBlocks {

	public static BlockPaletteBean getSettingsGradlePalette() {
		BlockPaletteBean palette = new BlockPaletteBean();
		palette.setColor("#4C8BF5"); // Blue for Gradle
		palette.setName("Gradle Config");

		ArrayList<BlockBean> blocks = new ArrayList<>();
		blocks.add(setProjectNameBlock());
		blocks.add(includeModuleBlock());

		palette.setBlocks(blocks);
		return palette;
	}

	private static BlockBean setProjectNameBlock() {

		RegularBlockBean block = new RegularBlockBean();
		block.setColor("#4C8BF5");

		// ----------------------------
		// Attach Language Metadata
		// ----------------------------
		BeanManifest manifest = new BeanManifest();
		ArrayList<BeanMetadata> metadata = new ArrayList<>();

		SupportedLanguagesBean langBean = new SupportedLanguagesBean();
		langBean.addLanguage(ProgrammingLanguage.GRADLE);
		metadata.add(langBean);

		manifest.setMetadata(metadata);
		block.setBeanManifest(manifest);

		// ----------------------------
		// UI Layers
		// ----------------------------
		ArrayList<LayerBean> layers = new ArrayList<>();

		BlockElementLayerBean uiLayer = new BlockElementLayerBean();
		ArrayList<BlockElementBean> elements = new ArrayList<>();

		LabelBlockElementBean label = new LabelBlockElementBean();
		label.setLabel("set project name");
		elements.add(label);

		StringBlockElementBean projectName = new StringBlockElementBean();
		projectName.setKey("projectName");
		elements.add(projectName);

		uiLayer.setBlockElementBeans(elements);
		layers.add(uiLayer);

		block.setLayers(layers);

		// ----------------------------
		// Gradle Code Syntax
		// ----------------------------
		StringBuilder code = new StringBuilder();
		code.append("rootProject.name = ");
		code.append(CodeFormatterUtils.getKeySyntaxString("projectName"));

		block.setCodeSyntax(code.toString());

		return block;
	}

	private static BlockBean includeModuleBlock() {

		RegularBlockBean block = new RegularBlockBean();
		block.setColor("#4C8BF5");

		// Attach GRADLE language support
		BeanManifest manifest = new BeanManifest();
		ArrayList<BeanMetadata> metadata = new ArrayList<>();

		SupportedLanguagesBean langBean = new SupportedLanguagesBean();
		langBean.addLanguage(ProgrammingLanguage.GRADLE);
		metadata.add(langBean);

		manifest.setMetadata(metadata);
		block.setBeanManifest(manifest);

		// UI Layer
		ArrayList<LayerBean> layers = new ArrayList<>();

		BlockElementLayerBean uiLayer = new BlockElementLayerBean();
		ArrayList<BlockElementBean> elements = new ArrayList<>();

		LabelBlockElementBean label = new LabelBlockElementBean();
		label.setLabel("include module");
		elements.add(label);

		StringBlockElementBean moduleName = new StringBlockElementBean();
		moduleName.setKey("moduleName");
		elements.add(moduleName);

		uiLayer.setBlockElementBeans(elements);
		layers.add(uiLayer);

		block.setLayers(layers);

		// Gradle syntax
		StringBuilder code = new StringBuilder();
		code.append("include(");
		code.append(CodeFormatterUtils.getKeySyntaxString("moduleName"));
		code.append(")");

		block.setCodeSyntax(code.toString());

		return block;
	}
}

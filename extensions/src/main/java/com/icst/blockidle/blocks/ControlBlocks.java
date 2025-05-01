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

import com.icst.blockidle.bean.ActionBlockLayerBean;
import com.icst.blockidle.bean.BlockBean;
import com.icst.blockidle.bean.BlockElementBean;
import com.icst.blockidle.bean.BlockElementLayerBean;
import com.icst.blockidle.bean.BlockPaletteBean;
import com.icst.blockidle.bean.BooleanBlockElementBean;
import com.icst.blockidle.bean.InfoBlockElementBean;
import com.icst.blockidle.bean.LabelBlockElementBean;
import com.icst.blockidle.bean.LayerBean;
import com.icst.blockidle.bean.RegularBlockBean;
import com.icst.blockidle.bean.utils.BuiltInDatatypes;
import com.icst.blockidle.bean.utils.CodeFormatterUtils;

public final class ControlBlocks {

	public static BlockPaletteBean getControlBlockPalette() {
		BlockPaletteBean mIOBlockPalette = new BlockPaletteBean();
		mIOBlockPalette.setColor("#FFC041");
		mIOBlockPalette.setName("Flow of Control");
		ArrayList<BlockBean> blocks = new ArrayList<>();
		blocks.add(ifBlock());
		blocks.add(ifElseBlock());
		mIOBlockPalette.setBlocks(blocks);
		return mIOBlockPalette;
	}

	private static BlockBean ifBlock() {
		RegularBlockBean block = new RegularBlockBean();
		block.setColor("#FFC041");

		ArrayList<LayerBean> layers = new ArrayList<LayerBean>();
		BlockElementLayerBean layer1 = new BlockElementLayerBean();

		ArrayList<BlockElementBean> layer1Elements = new ArrayList<BlockElementBean>();

		InfoBlockElementBean info = new InfoBlockElementBean();
		String getIfBlockDoc = "# If block\n" +
				"Executes a block of code only if the specified condition is **true**. This block allows conditional control of program flow.\n\n"
				+
				"![If Block Illustration](https://dl.dropbox.com/scl/fi/9qml0cs2rv91a7xkunqr1/20250501_172537.png?rlkey=94iulvrr4dv668smlfr21joot&dl=0)\n\n"
				+
				"**return** : Executes the nested blocks only when the condition is true. No return value.\n\n" +
				"**Author of block** : [DevKumar](https://github.com/DevVigilante)";
		info.setMarkdown(getIfBlockDoc);
		layer1Elements.add(info);

		LabelBlockElementBean ifLabel = new LabelBlockElementBean();
		ifLabel.setLabel("if");
		layer1Elements.add(ifLabel);

		BooleanBlockElementBean inputBoolean = new BooleanBlockElementBean();
		inputBoolean.setKey("mBoolean");
		inputBoolean.setAcceptedReturnType(BuiltInDatatypes.getPrimitiveBooleanDatatype());
		layer1Elements.add(inputBoolean);

		layer1.setBlockElementBeans(layer1Elements);

		layers.add(layer1);

		ActionBlockLayerBean statementLayer = new ActionBlockLayerBean();
		statementLayer.setKey("statements");

		layers.add(statementLayer);
		block.setLayers(layers);

		StringBuilder code = new StringBuilder();
		code.append("if (");
		code.append(CodeFormatterUtils.getKeySyntaxString("mBoolean"));
		code.append(") {\n\t");
		code.append(CodeFormatterUtils.getKeySyntaxString("statements"));
		code.append("\n}");

		block.setCodeSyntax(code.toString());

		return block;
	}

	private static BlockBean ifElseBlock() {
		RegularBlockBean block = new RegularBlockBean();
		block.setColor("#FFC041");

		ArrayList<LayerBean> layers = new ArrayList<LayerBean>();
		BlockElementLayerBean layer1 = new BlockElementLayerBean();

		ArrayList<BlockElementBean> layer1Elements = new ArrayList<BlockElementBean>();

		LabelBlockElementBean ifLabel = new LabelBlockElementBean();
		ifLabel.setLabel("if");
		layer1Elements.add(ifLabel);

		BooleanBlockElementBean inputBoolean = new BooleanBlockElementBean();
		inputBoolean.setKey("mBoolean");
		inputBoolean.setAcceptedReturnType(BuiltInDatatypes.getPrimitiveBooleanDatatype());
		layer1Elements.add(inputBoolean);

		layer1.setBlockElementBeans(layer1Elements);

		layers.add(layer1);

		ActionBlockLayerBean statementLayer = new ActionBlockLayerBean();
		statementLayer.setKey("statements");

		layers.add(statementLayer);

		BlockElementLayerBean layer3 = new BlockElementLayerBean();

		ArrayList<BlockElementBean> layer3Elements = new ArrayList<BlockElementBean>();

		LabelBlockElementBean elseLabel = new LabelBlockElementBean();
		elseLabel.setLabel("else");
		layer3Elements.add(elseLabel);

		layer3.setBlockElementBeans(layer3Elements);

		layers.add(layer3);

		ActionBlockLayerBean elseStatementLayer = new ActionBlockLayerBean();
		elseStatementLayer.setKey("elseStatement");

		layers.add(elseStatementLayer);

		block.setLayers(layers);

		StringBuilder code = new StringBuilder();
		code.append("if (");
		code.append(CodeFormatterUtils.getKeySyntaxString("mBoolean"));
		code.append(") {\n\t");
		code.append(CodeFormatterUtils.getKeySyntaxString("statements"));
		code.append("\n} else {\n\t");
		code.append(CodeFormatterUtils.getKeySyntaxString("elseStatement"));
		code.append("\n}");

		block.setCodeSyntax(code.toString());

		return block;
	}
}

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

import com.icst.blockidle.bean.BlockElementBean;
import com.icst.blockidle.bean.BlockElementLayerBean;
import com.icst.blockidle.bean.DatatypeBean;
import com.icst.blockidle.bean.GeneralExpressionBlockBean;
import com.icst.blockidle.bean.GeneralExpressionBlockElementBean;
import com.icst.blockidle.bean.InfoBlockElementBean;
import com.icst.blockidle.bean.LabelBlockElementBean;
import com.icst.blockidle.bean.utils.BuiltInDatatypes;
import com.icst.blockidle.bean.utils.CodeFormatterUtils;

public class ClassBlocks {

	public static GeneralExpressionBlockBean getClassBlock() {
		GeneralExpressionBlockBean block = new GeneralExpressionBlockBean();
		block.setColor("#0061FE");

		ArrayList<BlockElementLayerBean> layers = new ArrayList<BlockElementLayerBean>();
		BlockElementLayerBean layer1 = new BlockElementLayerBean();

		ArrayList<BlockElementBean> layer1Elements = new ArrayList<BlockElementBean>();

		InfoBlockElementBean info = new InfoBlockElementBean();
		String getClassDocumentation = "# Information of block\n" +
				"Returns the runtime class of this **Object**. The returned **Class** object is the\n" +
				"object that is locked by **synchronized** methods of the represented object.\n\n" +
				"**return** : The **Class** object that represents the runtime class of this object.\n" +
				"\n\n" +
				"**Author of block** : [DevKumar](https://github.com/DevVigilante)";
		info.setMarkdown(getClassDocumentation);
		layer1Elements.add(info);

		LabelBlockElementBean getClassLabel = new LabelBlockElementBean();
		getClassLabel.setLabel("getClass");
		layer1Elements.add(getClassLabel);

		layer1.setBlockElementBeans(layer1Elements);

		layers.add(layer1);

		block.setElementsLayers(layers);

		block.setCodeSyntax("getClass()");
		block.setReturnDatatype(BuiltInDatatypes.getClassDatatype());

		return block;
	}

	public static GeneralExpressionBlockBean getObjectClassBlock() {
		GeneralExpressionBlockBean block = new GeneralExpressionBlockBean();
		block.setColor("#0061FE");

		ArrayList<BlockElementLayerBean> layers = new ArrayList<BlockElementLayerBean>();
		BlockElementLayerBean layer1 = new BlockElementLayerBean();

		ArrayList<BlockElementBean> layer1Elements = new ArrayList<BlockElementBean>();

		DatatypeBean objDatatype = new DatatypeBean("java.lang.Object", "Object");

		GeneralExpressionBlockElementBean objectInput = new GeneralExpressionBlockElementBean();
		objectInput.setKey("object");
		objectInput.setAcceptedReturnType(objDatatype);
		layer1Elements.add(objectInput);

		LabelBlockElementBean getClassLabel = new LabelBlockElementBean();
		getClassLabel.setLabel("getClass");
		layer1Elements.add(getClassLabel);

		layer1.setBlockElementBeans(layer1Elements);

		layers.add(layer1);

		block.setElementsLayers(layers);

		StringBuilder code = new StringBuilder();
		code.append(CodeFormatterUtils.getKeySyntaxString("object"));
		code.append(".getClass()");

		block.setCodeSyntax(code.toString());
		block.setReturnDatatype(BuiltInDatatypes.getClassDatatype());

		return block;
	}

}

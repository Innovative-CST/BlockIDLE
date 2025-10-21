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

import java.io.*;

import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.*;
import com.github.javaparser.resolution.types.ResolvedType;
import com.icst.blockidle.bean.BlockElementLayerBean;
import com.icst.blockidle.bean.BooleanBlockElementBean;
import com.icst.blockidle.bean.GeneralExpressionBlockElementBean;
import com.icst.blockidle.bean.LabelBlockElementBean;
import com.icst.blockidle.bean.NumericBlockElementBean;
import com.icst.blockidle.bean.StringBlockElementBean;
import com.icst.blockidle.bean.utils.BuiltInDatatypes;

public class BlockParametersGenerator {

	public static void generateParamters(NodeList<Parameter> params, BlockElementLayerBean layer) {
		params.forEach(paramter -> {

			String paramTypeStr = paramter.getType().asString();
			String paramName = paramter.getNameAsString();

			LabelBlockElementBean label = new LabelBlockElementBean();
			label.setLabel(paramName);
			layer.getBlockElementBeans().add(label);

			ResolvedType paramType = paramter.getType().resolve();

			if (paramType.isPrimitive()) {
				switch (paramter.getType().resolve().asPrimitive().describe()) {
					case "boolean":
						BooleanBlockElementBean mBooleanBlockElementBean = new BooleanBlockElementBean();
						mBooleanBlockElementBean.setAcceptedReturnType(BuiltInDatatypes
								.getPrimitiveDatatype(paramter.getType().resolve().asPrimitive().describe()));
						mBooleanBlockElementBean.setKey(paramName);
						layer.getBlockElementBeans().add(mBooleanBlockElementBean);
						break;
					case "byte":
					case "short":
					case "int":
					case "long":
					case "float":
					case "double":
						NumericBlockElementBean mNumericBlockElementBean = new NumericBlockElementBean();
						mNumericBlockElementBean.setAcceptedReturnType(BuiltInDatatypes
								.getPrimitiveDatatype(paramter.getType().resolve().asPrimitive().describe()));
						mNumericBlockElementBean.setKey(paramName);
						layer.getBlockElementBeans().add(mNumericBlockElementBean);
						break;
					case "char":
						GeneralExpressionBlockElementBean mGeneralExpressionBlockElementBean = new GeneralExpressionBlockElementBean();
						mGeneralExpressionBlockElementBean.setAcceptedReturnType(BuiltInDatatypes
								.getPrimitiveDatatype(paramter.getType().resolve().asPrimitive().describe()));
						mGeneralExpressionBlockElementBean.setKey(paramName);
						layer.getBlockElementBeans().add(mGeneralExpressionBlockElementBean);
						break;
					default:
						throw new IllegalArgumentException(
								"Unknown primitive type: " + paramter.getType().resolve().asPrimitive().describe());
				}
			} else if (paramType.isArray()) {

				GeneralExpressionBlockElementBean mGeneralExpressionBlockElementBean = new GeneralExpressionBlockElementBean();
				mGeneralExpressionBlockElementBean.setAcceptedReturnType(
						DatatypeBeanResolver.getDatatypeBean(paramter.getType().asArrayType().resolve()));
				mGeneralExpressionBlockElementBean.setKey(paramName);
				layer.getBlockElementBeans().add(mGeneralExpressionBlockElementBean);
			} else if (paramType.isTypeVariable()) {
				GeneralExpressionBlockElementBean mGeneralExpressionBlockElementBean = new GeneralExpressionBlockElementBean();
				mGeneralExpressionBlockElementBean.setAcceptedReturnType(
						DatatypeBeanResolver.getDatatypeBean(paramter.getType().resolve().asTypeParameter()));
				mGeneralExpressionBlockElementBean.setKey(paramName);
				layer.getBlockElementBeans().add(mGeneralExpressionBlockElementBean);
			} else if (paramType.isReferenceType()) {
				if (paramter.getType().resolve().describe().equals("java.lang.String")) {
					StringBlockElementBean mStringBlockElementBean = new StringBlockElementBean();
					mStringBlockElementBean.setKey(paramName);
					layer.getBlockElementBeans().add(mStringBlockElementBean);
				} else {
					GeneralExpressionBlockElementBean mGeneralExpressionBlockElementBean = new GeneralExpressionBlockElementBean();
					mGeneralExpressionBlockElementBean
							.setAcceptedReturnType(DatatypeBeanResolver
									.getDatatypeBean(paramter.getType().resolve().asReferenceType()));
					mGeneralExpressionBlockElementBean.setKey(paramName);
					layer.getBlockElementBeans().add(mGeneralExpressionBlockElementBean);
				}
			}
		});
	}

}

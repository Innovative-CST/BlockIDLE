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

import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.*;
import com.github.javaparser.resolution.types.ResolvedType;
import com.icst.blockidle.bean.BlockElementLayerBean;
import com.icst.blockidle.bean.BooleanBlockElementBean;
import com.icst.blockidle.bean.DatatypeBean;
import com.icst.blockidle.bean.GeneralExpressionBlockElementBean;
import com.icst.blockidle.bean.LabelBlockElementBean;
import com.icst.blockidle.bean.NumericBlockElementBean;
import com.icst.blockidle.bean.StringBlockElementBean;
import com.icst.blockidle.bean.utils.BuiltInDatatypes;

public class BlockParametersGenerator {

	public static void generateParameters(NodeList<Parameter> params, BlockElementLayerBean layer) {
		params.forEach(parameter -> {
			generateParameter(parameter, layer);
		});
	}

	private static void generateParameter(Parameter parameter, BlockElementLayerBean layer) {
		addParameterLabel(parameter, layer);
		String paramName = parameter.getNameAsString();
		ResolvedType paramType = parameter.getType().resolve();

		if (paramType.isPrimitive()) {
			switch (parameter.getType().resolve().asPrimitive().describe()) {
				case "boolean":
					BooleanBlockElementBean mBooleanBlockElementBean = new BooleanBlockElementBean();
					mBooleanBlockElementBean.setAcceptedReturnType(BuiltInDatatypes
							.getPrimitiveDatatype(parameter.getType().resolve().asPrimitive().describe()));
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
							.getPrimitiveDatatype(parameter.getType().resolve().asPrimitive().describe()));
					mNumericBlockElementBean.setKey(paramName);
					layer.getBlockElementBeans().add(mNumericBlockElementBean);
					break;
				case "char":
					GeneralExpressionBlockElementBean mGeneralExpressionBlockElementBean = new GeneralExpressionBlockElementBean();
					mGeneralExpressionBlockElementBean.setAcceptedReturnType(BuiltInDatatypes
							.getPrimitiveDatatype(parameter.getType().resolve().asPrimitive().describe()));
					mGeneralExpressionBlockElementBean.setKey(paramName);
					layer.getBlockElementBeans().add(mGeneralExpressionBlockElementBean);
					break;
				default:
					throw new IllegalArgumentException(
							"Unknown primitive type: " + parameter.getType().resolve().asPrimitive().describe());
			}
		} else if (paramType.isArray()) {
			GeneralExpressionBlockElementBean mGeneralExpressionBlockElementBean = new GeneralExpressionBlockElementBean();
			mGeneralExpressionBlockElementBean.setAcceptedReturnType(
					DatatypeBeanResolver.getDatatypeBean(parameter.getType().asArrayType().resolve()));
			mGeneralExpressionBlockElementBean.setKey(paramName);
			layer.getBlockElementBeans().add(mGeneralExpressionBlockElementBean);
		} else if (paramType.isReferenceType()) {
			DatatypeBean dtype = DatatypeBeanResolver.getDatatypeBean(parameter.getType().resolve().asReferenceType());
			if (parameter.getType().resolve().describe().equals("java.lang.String")) {
				StringBlockElementBean mStringBlockElementBean = new StringBlockElementBean();
				mStringBlockElementBean.setKey(paramName);
				layer.getBlockElementBeans().add(mStringBlockElementBean);
			} else if (dtype.isSuperTypeOrDatatype(BuiltInDatatypes.getNumberDatatype())) {
				NumericBlockElementBean mNumericBlockElementBean = new NumericBlockElementBean();
				if (dtype.isSuperTypeOrDatatype(BuiltInDatatypes.getByteDatatype())) {
					dtype.addSuperType(BuiltInDatatypes.getPrimitiveByteDatatype());
				} else if (dtype.isSuperTypeOrDatatype(BuiltInDatatypes.getShortDatatype())) {
					dtype.addSuperType(BuiltInDatatypes.getPrimitiveShortDatatype());
				} else if (dtype.isSuperTypeOrDatatype(BuiltInDatatypes.getIntegerDatatype())) {
					dtype.addSuperType(BuiltInDatatypes.getPrimitiveIntegerDatatype());
				} else if (dtype.isSuperTypeOrDatatype(BuiltInDatatypes.getLongDatatype())) {
					dtype.addSuperType(BuiltInDatatypes.getPrimitiveLongDatatype());
				} else if (dtype.isSuperTypeOrDatatype(BuiltInDatatypes.getFloatDatatype())) {
					dtype.addSuperType(BuiltInDatatypes.getPrimitiveFloatDatatype());
				} else if (dtype.isSuperTypeOrDatatype(BuiltInDatatypes.getDoubleDatatype())) {
					dtype.addSuperType(BuiltInDatatypes.getPrimitiveDoubleDatatype());
				}
				mNumericBlockElementBean.setAcceptedReturnType(dtype);
				mNumericBlockElementBean.setKey(paramName);
				layer.getBlockElementBeans().add(mNumericBlockElementBean);
			} else if (dtype.isSuperTypeOrDatatype(BuiltInDatatypes.getBooleanDatatype())) {
				BooleanBlockElementBean mBooleanBlockElementBean = new BooleanBlockElementBean();
				dtype.addSuperType(BuiltInDatatypes.getPrimitiveBooleanDatatype());
				mBooleanBlockElementBean.setAcceptedReturnType(dtype);
				mBooleanBlockElementBean.setKey(paramName);
				layer.getBlockElementBeans().add(mBooleanBlockElementBean);
			} else {
				GeneralExpressionBlockElementBean mGeneralExpressionBlockElementBean = new GeneralExpressionBlockElementBean();
				mGeneralExpressionBlockElementBean
						.setAcceptedReturnType(dtype);
				mGeneralExpressionBlockElementBean.setKey(paramName);
				layer.getBlockElementBeans().add(mGeneralExpressionBlockElementBean);
			}
		} else if (paramType.isTypeVariable()) {
			GeneralExpressionBlockElementBean mGeneralExpressionBlockElementBean = new GeneralExpressionBlockElementBean();
			mGeneralExpressionBlockElementBean.setAcceptedReturnType(
					DatatypeBeanResolver.getDatatypeBean(parameter.getType().resolve().asTypeParameter()));
			mGeneralExpressionBlockElementBean.setKey(paramName);
			layer.getBlockElementBeans().add(mGeneralExpressionBlockElementBean);
		}
	}

	private static void addParameterLabel(Parameter parameter, BlockElementLayerBean layer) {
		String paramTypeStr = parameter.getType().asString();
		String paramName = parameter.getNameAsString();

		LabelBlockElementBean label = new LabelBlockElementBean();
		label.setLabel(paramName);
		layer.getBlockElementBeans().add(label);
	}

}

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
import java.util.ArrayList;

import com.github.javaparser.ast.body.*;
import com.github.javaparser.resolution.declarations.ResolvedMethodDeclaration;
import com.github.javaparser.resolution.declarations.ResolvedReferenceTypeDeclaration;
import com.github.javaparser.resolution.types.ResolvedType;
import com.icst.blockidle.bean.ActionBlockBean;
import com.icst.blockidle.bean.BaseBlockBean;
import com.icst.blockidle.bean.BeanManifest;
import com.icst.blockidle.bean.BeanMetadata;
import com.icst.blockidle.bean.BlockBean;
import com.icst.blockidle.bean.BlockElementBean;
import com.icst.blockidle.bean.BlockElementLayerBean;
import com.icst.blockidle.bean.BooleanBlockBean;
import com.icst.blockidle.bean.DatatypeBean;
import com.icst.blockidle.bean.ExpressionBlockBean;
import com.icst.blockidle.bean.GeneralExpressionBlockBean;
import com.icst.blockidle.bean.GeneralExpressionBlockElementBean;
import com.icst.blockidle.bean.InfoBlockElementBean;
import com.icst.blockidle.bean.LabelBlockElementBean;
import com.icst.blockidle.bean.LayerBean;
import com.icst.blockidle.bean.NumericBlockBean;
import com.icst.blockidle.bean.RegularBlockBean;
import com.icst.blockidle.bean.StringBlockBean;
import com.icst.blockidle.bean.utils.BuiltInDatatypes;
import com.icst.blockidle.bean.utils.CodeFormatterUtils;

public class MethodBlocksGenerator {

	public static BlockBean generateBlockForMethod(MethodDeclaration method, String color) {
		ResolvedType returnType = method.getType().resolve();
		BlockBean block = null;
		ImportsHelper.init();
		ArtifactHelper.init();

		if (returnType.isVoid()) {
			return generateRegularBlockForMethod(method, returnType, color);
		} else if (returnType.isPrimitive()) {
			DatatypeBean dtype = BuiltInDatatypes.getPrimitiveDatatype(returnType.asPrimitive().describe());
			switch (returnType.asPrimitive().describe()) {
				case "boolean":
					return generateExpressionBlockForMethod(method, returnType, dtype, color);
				case "byte":
				case "short":
				case "int":
				case "long":
				case "float":
				case "double":
					return generateExpressionBlockForMethod(method, returnType, dtype, color);
				case "char":
					return generateExpressionBlockForMethod(method, returnType, dtype, color);
				default:
					throw new IllegalArgumentException(
							"Unknown primitive type: " + returnType.asPrimitive().describe());
			}
		} else if (returnType.isReferenceType()) {
			DatatypeBean dataType = DatatypeBeanResolver.getDatatypeBean(returnType.asReferenceType());
			return generateExpressionBlockForMethod(method, returnType, dataType, color);
		} else if (returnType.isArray()) {
			DatatypeBean dataType = DatatypeBeanResolver.getDatatypeBean(returnType.asArrayType());
			return generateExpressionBlockForMethod(method, returnType, dataType, color);
		} else if (returnType.isTypeVariable()) {
			DatatypeBean dataType = DatatypeBeanResolver.getDatatypeBean(returnType.asTypeParameter());
			return generateExpressionBlockForMethod(method, returnType, dataType, color);
		}
		return block;
	}

	private static void buildBaseBlockLayer(MethodDeclaration method, DatatypeBean returnType, BaseBlockBean mBlock) {
		ArrayList<LayerBean> layers = new ArrayList<LayerBean>();
		BlockElementLayerBean layer1 = new BlockElementLayerBean();

		ArrayList<BlockElementBean> layer1Elements = new ArrayList<BlockElementBean>();

		method.getJavadoc().ifPresentOrElse(javaDoc -> {
			StringBuilder doc = new StringBuilder();
			doc.append("# " + javaDoc.getDescription().toText() + "\n");
			doc.append(javaDoc.toComment().getContent() + "\n\n");
			doc.append("**return type**\n\n" + returnType.toString());
			InfoBlockElementBean info = new InfoBlockElementBean();
			info.setMarkdown(doc.toString());
			layer1Elements.add(info);
		}, () -> {
			StringBuilder doc = new StringBuilder();
			doc.append("**return type**\n\n" + returnType.toString());
			InfoBlockElementBean info = new InfoBlockElementBean();
			info.setMarkdown(doc.toString());
			layer1Elements.add(info);
		});

		LabelBlockElementBean methodLabel = new LabelBlockElementBean();
		methodLabel.setLabel(method.getNameAsString());
		layer1Elements.add(methodLabel);

		layer1.setBlockElementBeans(layer1Elements);

		BlockParametersGenerator.generateParamters(method.getParameters(), layer1);

		if (!method.isStatic()) {
			ResolvedMethodDeclaration resolvedMethodDeclaration = method.resolve();
			ResolvedReferenceTypeDeclaration resolvedDecRef = resolvedMethodDeclaration.declaringType();
			GeneralExpressionBlockElementBean mGeneralExpressionBlockElementBean = new GeneralExpressionBlockElementBean();
			mGeneralExpressionBlockElementBean
					.setAcceptedReturnType(DatatypeBeanResolver.getDatatypeBean(resolvedDecRef.asReferenceType()));
			mGeneralExpressionBlockElementBean.setKey("mObject");
			layer1.getBlockElementBeans().add(0, mGeneralExpressionBlockElementBean);
		}

		layers.add(layer1);

		mBlock.setElementsLayers(layers);
	}

	private static void buildActionBlockLayer(MethodDeclaration method, ResolvedType returnType,
			ActionBlockBean mBlock) {
		ArrayList<LayerBean> layers = new ArrayList<LayerBean>();
		BlockElementLayerBean layer1 = new BlockElementLayerBean();

		ArrayList<BlockElementBean> layer1Elements = new ArrayList<BlockElementBean>();

		method.getJavadoc().ifPresentOrElse(javaDoc -> {
			StringBuilder doc = new StringBuilder();
			doc.append("# " + javaDoc.getDescription().toText() + "\n");
			doc.append(javaDoc.toComment().getContent() + "\n\n");
			doc.append("**return type** : void");
			InfoBlockElementBean info = new InfoBlockElementBean();
			info.setMarkdown(doc.toString());
			layer1Elements.add(info);
		}, () -> {
			StringBuilder doc = new StringBuilder();
			doc.append("**return type** : void");
			InfoBlockElementBean info = new InfoBlockElementBean();
			info.setMarkdown(doc.toString());
			layer1Elements.add(info);
		});

		LabelBlockElementBean methodLabel = new LabelBlockElementBean();
		methodLabel.setLabel(method.getNameAsString());
		layer1Elements.add(methodLabel);

		layer1.setBlockElementBeans(layer1Elements);

		BlockParametersGenerator.generateParamters(method.getParameters(), layer1);

		if (!method.isStatic()) {
			ResolvedMethodDeclaration resolvedMethodDeclaration = method.resolve();
			ResolvedReferenceTypeDeclaration resolvedDecRef = resolvedMethodDeclaration.declaringType();
			GeneralExpressionBlockElementBean mGeneralExpressionBlockElementBean = new GeneralExpressionBlockElementBean();
			mGeneralExpressionBlockElementBean
					.setAcceptedReturnType(DatatypeBeanResolver.getDatatypeBean(resolvedDecRef.asReferenceType()));
			mGeneralExpressionBlockElementBean.setKey("mObject");
			layer1.getBlockElementBeans().add(0, mGeneralExpressionBlockElementBean);
		}

		layers.add(layer1);

		mBlock.setLayers(layers);
	}

	private static void buildMethodCode(MethodDeclaration method, BlockBean mBlock) {
		StringBuilder code = new StringBuilder();
		if (method.isStatic()) {
			ResolvedReferenceTypeDeclaration clazz = method.findAncestor(ClassOrInterfaceDeclaration.class).get()
					.resolve();
			code.append(clazz.getName());
			code.append(".");
			ImportsHelper.insertImport(clazz.getQualifiedName());
		} else {
			code.append(CodeFormatterUtils.getKeySyntaxString("mObject"));
			code.append(".");
		}
		code.append(method.getNameAsString());
		code.append("(");
		int numberOfParam = method.getParameters().size();
		for (int i = 0; i < numberOfParam; ++i) {
			Parameter paramter = method.getParameters().get(i);
			String paramName = paramter.getNameAsString();
			code.append(CodeFormatterUtils.getKeySyntaxString(paramName));
			if (i < numberOfParam - 1) {
				code.append(", ");
			}
		}
		code.append(")");
		if (method.getType().resolve().isVoid()) {
			code.append(";");
		}
		if (mBlock instanceof ExpressionBlockBean block) {
			block.setCodeSyntax(code.toString());
		} else if (mBlock instanceof RegularBlockBean block) {
			block.setCodeSyntax(code.toString());
		}
	}

	private static ExpressionBlockBean generateExpressionBlockForMethod(MethodDeclaration method,
			ResolvedType returnType, DatatypeBean dtype, String color) {
		ExpressionBlockBean mBlock = null;
		if (returnType.isPrimitive()) {
			switch (returnType.asPrimitive().describe()) {
				case "boolean":
					BooleanBlockBean booleanBlock = new BooleanBlockBean();
					booleanBlock.setReturnDatatype(dtype);
					mBlock = booleanBlock;
					break;
				case "byte":
				case "short":
				case "int":
				case "long":
				case "float":
				case "double":
					NumericBlockBean numericBlock = new NumericBlockBean();
					numericBlock.setReturnDatatype(dtype);
					mBlock = numericBlock;
					break;
				case "char":
					GeneralExpressionBlockBean generalExpBlock = new GeneralExpressionBlockBean();
					generalExpBlock.setReturnDatatype(dtype);
					mBlock = generalExpBlock;
					break;
				default:
					throw new IllegalArgumentException(
							"Unknown primitive type: " + returnType.asPrimitive().describe());
			}
		} else if (returnType.describe().equals("java.lang.String")) {
			StringBlockBean block = new StringBlockBean();
			mBlock = block;
		} else {
			if (dtype.isSuperTypeOrDatatype(BuiltInDatatypes.getNumberDatatype())) {
				NumericBlockBean block = new NumericBlockBean();
				if (dtype.isSuperTypeOrDatatype(BuiltInDatatypes.getIntegerDatatype())) {
					dtype.addSuperType(BuiltInDatatypes.getPrimitiveIntegerDatatype());
				} else if (dtype.isSuperTypeOrDatatype(BuiltInDatatypes.getFloatDatatype())) {
					dtype.addSuperType(BuiltInDatatypes.getPrimitiveFloatDatatype());
				}
				block.setReturnDatatype(dtype);
				mBlock = block;
			} else if (dtype.isSuperTypeOrDatatype(BuiltInDatatypes.getBooleanDatatype())) {
				BooleanBlockBean block = new BooleanBlockBean();
				dtype.addSuperType(BuiltInDatatypes.getPrimitiveBooleanDatatype());
				block.setReturnDatatype(dtype);
				mBlock = block;
			} else {
				GeneralExpressionBlockBean block = new GeneralExpressionBlockBean();
				block.setReturnDatatype(dtype);
				mBlock = block;
			}
		}
		mBlock.setColor(color);
		buildBaseBlockLayer(method, dtype, mBlock);
		buildMethodCode(method, mBlock);

		BeanManifest beanManifest = new BeanManifest();
		ArrayList<BeanMetadata> metaData = new ArrayList<BeanMetadata>();

		metaData.addAll(ImportsHelper.getImports());
		metaData.addAll(ArtifactHelper.getArtifacts());

		beanManifest.setMetadata(metaData);
		mBlock.setBeanManifest(beanManifest);
		return mBlock;
	}

	private static RegularBlockBean generateRegularBlockForMethod(MethodDeclaration method, ResolvedType returnType,
			String color) {
		RegularBlockBean mBlock = new RegularBlockBean();
		mBlock.setColor(color);
		buildActionBlockLayer(method, returnType, mBlock);
		buildMethodCode(method, mBlock);

		BeanManifest beanManifest = new BeanManifest();
		ArrayList<BeanMetadata> metaData = new ArrayList<BeanMetadata>();

		metaData.addAll(ImportsHelper.getImports());
		metaData.addAll(ArtifactHelper.getArtifacts());

		beanManifest.setMetadata(metaData);
		mBlock.setBeanManifest(beanManifest);
		return mBlock;
	}

}

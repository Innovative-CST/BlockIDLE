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

import com.icst.blockidle.bean.BeanManifest;
import com.icst.blockidle.bean.BeanMetadata;
import com.icst.blockidle.bean.utils.CodeFormatterUtils;
import java.io.*;
import java.util.ArrayList;

import com.github.javaparser.ast.body.*;
import com.github.javaparser.resolution.declarations.ResolvedConstructorDeclaration;
import com.github.javaparser.resolution.declarations.ResolvedReferenceTypeDeclaration;
import com.github.javaparser.resolution.types.ResolvedType;
import com.icst.blockidle.bean.BaseBlockBean;
import com.icst.blockidle.bean.BlockBean;
import com.icst.blockidle.bean.BlockElementBean;
import com.icst.blockidle.bean.BlockElementLayerBean;
import com.icst.blockidle.bean.BooleanBlockElementBean;
import com.icst.blockidle.bean.DatatypeBean;
import com.icst.blockidle.bean.ExpressionBlockBean;
import com.icst.blockidle.bean.GeneralExpressionBlockBean;
import com.icst.blockidle.bean.GeneralExpressionBlockElementBean;
import com.icst.blockidle.bean.InfoBlockElementBean;
import com.icst.blockidle.bean.LabelBlockElementBean;
import com.icst.blockidle.bean.LayerBean;
import com.icst.blockidle.bean.NumericBlockElementBean;
import com.icst.blockidle.bean.RegularBlockBean;
import com.icst.blockidle.bean.StringBlockElementBean;
import com.icst.blockidle.bean.utils.BuiltInDatatypes;

public class ConstructorBlockGenerator {

	public static BlockBean generateBlockForConstructor(ConstructorDeclaration contructor, String color) {
		ResolvedReferenceTypeDeclaration returnType = contructor.resolve().declaringType().asReferenceType();
		BlockBean block = null;
		ImportsHelper.init();
		ArtifactHelper.init();
		if (returnType.isReferenceType()) {
			DatatypeBean dataType = DatatypeBeanResolver.getDatatypeBean(returnType.asReferenceType());
			return generateExpressionBlockForMethod(contructor, returnType, dataType, color);
		}
		return block;
	}

	private static void generateParamters(ConstructorDeclaration contructor, BlockElementLayerBean layer) {
		contructor.getParameters().forEach(paramter -> {

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

	private static void buildBaseBlockLayer(ConstructorDeclaration contructor, DatatypeBean returnType,
			BaseBlockBean mBlock) {
		ArrayList<LayerBean> layers = new ArrayList<LayerBean>();
		BlockElementLayerBean layer1 = new BlockElementLayerBean();

		ArrayList<BlockElementBean> layer1Elements = new ArrayList<BlockElementBean>();

		contructor.getJavadoc().ifPresentOrElse(javaDoc -> {
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

		ResolvedConstructorDeclaration resolvedConstructorDeclaration = contructor.resolve();
		ResolvedReferenceTypeDeclaration resolvedDecRef = resolvedConstructorDeclaration.declaringType();
		DatatypeBean dType = DatatypeBeanResolver.getDatatypeBean(resolvedDecRef.asReferenceType());
		LabelBlockElementBean label = new LabelBlockElementBean();
		label.setLabel("new " + dType.getClassName());
		layer1Elements.add(label);

		layer1.setBlockElementBeans(layer1Elements);

		generateParamters(contructor, layer1);

		layers.add(layer1);
		
		ResolvedReferenceTypeDeclaration clazz = contructor.findAncestor(ClassOrInterfaceDeclaration.class).get().resolve();
        ImportsHelper.insertImport(clazz.getQualifiedName());

		mBlock.setElementsLayers(layers);
	}

	private static void buildMethodCode(ConstructorDeclaration contructor, BlockBean mBlock) {
		ResolvedConstructorDeclaration resolvedConstructorDeclaration = contructor.resolve();
		ResolvedReferenceTypeDeclaration resolvedDecRef = resolvedConstructorDeclaration.declaringType();
		DatatypeBean dType = DatatypeBeanResolver.getDatatypeBean(resolvedDecRef.asReferenceType());

		StringBuilder code = new StringBuilder();
		code.append("new " + dType.getClassName());
		code.append("(");
		int numberOfParam = contructor.getParameters().size();
		for(int i = 0; i < numberOfParam; ++i) {
			Parameter paramter = contructor.getParameters().get(i);
			String paramName = paramter.getNameAsString();
			code.append(CodeFormatterUtils.getKeySyntaxString(paramName));
			if(i < numberOfParam - 1) {
				code.append(", ");
			}
		}
		code.append(")");
		if (mBlock instanceof ExpressionBlockBean block) {
			block.setCodeSyntax(code.toString());
		} else if (mBlock instanceof RegularBlockBean block) {
			block.setCodeSyntax(code.toString());
		}
	}

	private static ExpressionBlockBean generateExpressionBlockForMethod(ConstructorDeclaration contructor,
			ResolvedReferenceTypeDeclaration returnType, DatatypeBean dtype, String color) {
		GeneralExpressionBlockBean block = new GeneralExpressionBlockBean();
		block.setReturnDatatype(dtype);
		block.setColor(color);
		buildBaseBlockLayer(contructor, dtype, block);
		buildMethodCode(contructor, block);
		
		BeanManifest beanManifest = new BeanManifest();
		ArrayList<BeanMetadata> metaData = new ArrayList<BeanMetadata>();
		
		metaData.addAll(ImportsHelper.getImports());
		metaData.addAll(ArtifactHelper.getArtifacts());
		
		beanManifest.setMetadata(metaData);
		block.setBeanManifest(beanManifest);
		return block;
	}
}

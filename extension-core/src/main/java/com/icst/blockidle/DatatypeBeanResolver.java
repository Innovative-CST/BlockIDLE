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

import java.util.HashMap;
import java.util.Map;

import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.type.ClassOrInterfaceType;
import com.github.javaparser.resolution.declarations.ResolvedReferenceTypeDeclaration;
import com.github.javaparser.resolution.declarations.ResolvedTypeParameterDeclaration;
import com.github.javaparser.resolution.types.ResolvedArrayType;
import com.github.javaparser.resolution.types.ResolvedReferenceType;
import com.icst.blockidle.bean.DatatypeBean;

public class DatatypeBeanResolver {

	private static Map<String, DatatypeBean> cache = new HashMap<>();

	public static DatatypeBean getDatatypeBean(ClassOrInterfaceType clazz) {
		try {
			ResolvedReferenceType resolved = clazz.resolve().asReferenceType();
			return getDatatypeBean(resolved);
		} catch (Exception e) {
			throw new IllegalArgumentException(e);
		}
	}

	public static DatatypeBean getDatatypeBean(ClassOrInterfaceDeclaration clazz) {
		try {
			ResolvedReferenceTypeDeclaration resolved = clazz.resolve();
			return getDatatypeBean(resolved);
		} catch (Exception e) {
			throw new IllegalArgumentException(e);
		}
	}

	public static DatatypeBean getDatatypeBean(ResolvedReferenceType ref) {
		try {
			return getDatatypeBean(ref.getTypeDeclaration().get());
		} catch (Exception e) {
			throw new IllegalArgumentException(e);
		}
	}

	public static DatatypeBean getDatatypeBean(ResolvedReferenceTypeDeclaration ref) {
		if (ref == null) {
			throw new IllegalArgumentException("Null ref");
		}

		String fullName = ref.getQualifiedName();
		if (cache.containsKey(fullName)) {
			return cache.get(fullName);
		}

		String className = ref.getName();
		DatatypeBean current = new DatatypeBean(fullName, className);
		cache.put(fullName, current);

		for (ResolvedReferenceType superType : ref.getAncestors(true)) {
			DatatypeBean superBean = getDatatypeBean(superType);
			if (superBean != null) {
				current.addSuperType(superBean);
			}
		}
		return current;
	}

	public static DatatypeBean getDatatypeBean(ResolvedArrayType array) {
		if (array == null) {
			throw new IllegalArgumentException("Null ResolvedArrayType");
		}

		String fullName = array.getComponentType().erasure().describe() + "[]";
		if (cache.containsKey(fullName)) {
			return cache.get(fullName);
		}

		DatatypeBean arrayBean = new DatatypeBean(fullName, fullName);
		cache.put(fullName, arrayBean);

		arrayBean.addSuperType(getOrCreate("java.lang.Object", "Object"));
		arrayBean.addSuperType(getOrCreate("java.io.Serializable", "Serializable"));
		arrayBean.addSuperType(getOrCreate("java.lang.Cloneable", "Cloneable"));
		return arrayBean;
	}

	public static DatatypeBean getDatatypeBean(ResolvedTypeParameterDeclaration typeVar) {
		if (typeVar == null) {
			throw new IllegalArgumentException("Null ResolvedTypeVariable");
		}
		DatatypeBean typeVarBean = new DatatypeBean(typeVar.getQualifiedName(), typeVar.getName());
		// Add bounds (e.g., extends Number & Comparable)
		for (ResolvedTypeParameterDeclaration.Bound bound : typeVar.getBounds()) {
			if (bound.getType().isReferenceType()) {
				try {
					DatatypeBean boundBean = getDatatypeBean(bound.getType().asReferenceType());
					typeVarBean.addSuperType(boundBean);
				} catch (Exception ignored) {
				}
			} else if (bound.getType().isTypeVariable()) {
				try {
					if (bound.getType().isReferenceType()) {
						DatatypeBean boundBean = getDatatypeBean(bound.getType().asReferenceType());
						typeVarBean.addSuperType(boundBean);
					}
				} catch (Exception ignored) {
				}
			}
		}

		return typeVarBean;
	}

	private static DatatypeBean getOrCreate(String fullName, String className) {
		return cache.computeIfAbsent(fullName, k -> new DatatypeBean(fullName, className));
	}
}

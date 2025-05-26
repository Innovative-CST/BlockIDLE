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

package com.icst.blockidle.bean.utils;

import com.icst.blockidle.bean.DatatypeBean;

public final class BuiltInDatatypes {

	// New Class<T> type definition
	public static DatatypeBean getClassDatatype() {
		// Superclass
		DatatypeBean object = new DatatypeBean("java.lang.Object", "Object");

		// Interfaces
		DatatypeBean serializable = new DatatypeBean("java.io.Serializable", "Serializable");
		DatatypeBean genericDeclaration = new DatatypeBean(
				"java.lang.reflect.GenericDeclaration",
				"GenericDeclaration");
		DatatypeBean type = new DatatypeBean("java.lang.reflect.Type", "Type");
		DatatypeBean annotatedElement = new DatatypeBean(
				"java.lang.reflect.AnnotatedElement",
				"AnnotatedElement");

		// Class
		DatatypeBean classType = new DatatypeBean("java.lang.Class", "Class");
		classType.addSuperType(object);
		classType.addSuperType(serializable);
		classType.addSuperType(genericDeclaration);
		classType.addSuperType(type);
		classType.addSuperType(annotatedElement);

		return classType;
	}

	public static DatatypeBean getPrimitiveBooleanDatatype() {
		return new DatatypeBean("boolean", "boolean");
	}

	public static DatatypeBean getPrimitiveIntegerDatatype() {
		return new DatatypeBean("int", "int");
	}

	public static DatatypeBean getPrimitiveDatatype(String primitiveName) {
		switch (primitiveName) {
			case "boolean":
			case "byte":
			case "short":
			case "int":
			case "long":
			case "char":
			case "float":
			case "double":
				return new DatatypeBean(primitiveName, primitiveName);
			default:
				throw new IllegalArgumentException("Unknown primitive type: " + primitiveName);
		}
	}

	public static DatatypeBean getIntegerDatatype() {
		DatatypeBean object = new DatatypeBean("java.lang.Object", "Object");
		DatatypeBean serializable = new DatatypeBean("java.io.Serializable", "Serializable");
		DatatypeBean comparable = new DatatypeBean("java.lang.Comparable", "Comparable");
		DatatypeBean number = new DatatypeBean("java.lang.Number", "Number");

		// Create Integer type
		DatatypeBean integer = new DatatypeBean("java.lang.Integer", "Integer");

		// Set up hierarchy: String -> Number -> Object
		integer.addSuperType(number);
		number.addSuperType(object);

		// Add interfaces implemented by Integer
		integer.addSuperType(serializable);
		integer.addSuperType(comparable);
		integer.addSuperType(number);
		integer.addSuperType(getPrimitiveIntegerDatatype());

		return integer;
	}

	public static DatatypeBean getStringDatatype() {
		// Create core types
		DatatypeBean object = new DatatypeBean("java.lang.Object", "Object");
		DatatypeBean serializable = new DatatypeBean("java.io.Serializable", "Serializable");
		DatatypeBean comparable = new DatatypeBean("java.lang.Comparable", "Comparable");
		DatatypeBean charSequence = new DatatypeBean("java.lang.CharSequence", "CharSequence");

		// Create String type
		DatatypeBean string = new DatatypeBean("java.lang.String", "String");

		// Set up hierarchy: String -> Object
		string.addSuperType(object);

		// Add interfaces implemented by String
		string.addSuperType(serializable);
		string.addSuperType(comparable);
		string.addSuperType(charSequence);

		return string;
	}
}

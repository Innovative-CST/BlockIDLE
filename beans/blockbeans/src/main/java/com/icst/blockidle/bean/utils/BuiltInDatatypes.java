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

	public static DatatypeBean getBooleanDatatype() {
		DatatypeBean object = new DatatypeBean("java.lang.Object", "Object");
		DatatypeBean serializable = new DatatypeBean("java.io.Serializable", "Serializable");
		DatatypeBean comparable = new DatatypeBean("java.lang.Comparable", "Comparable");

		// Create Boolean type
		DatatypeBean mBoolean = new DatatypeBean("java.lang.Boolean", "Boolean");
		// Set up hierarchy: -> Boolean -> Object
		mBoolean.addSuperType(object);

		// Add interfaces implemented by Integer
		mBoolean.addSuperType(serializable);
		mBoolean.addSuperType(comparable);
		mBoolean.addSuperType(getPrimitiveBooleanDatatype());

		return mBoolean;
	}

	public static DatatypeBean getPrimitiveByteDatatype() {
		return new DatatypeBean("byte", "byte");
	}

	public static DatatypeBean getByteDatatype() {
		DatatypeBean object = new DatatypeBean("java.lang.Object", "Object");
		DatatypeBean serializable = new DatatypeBean("java.io.Serializable", "Serializable");
		DatatypeBean comparable = new DatatypeBean("java.lang.Comparable", "Comparable");
		DatatypeBean number = new DatatypeBean("java.lang.Number", "Number");

		// Create Byte type
		DatatypeBean mByte = new DatatypeBean("java.lang.Byte", "Byte");

		// Set up hierarchy: Byte -> Number -> Object
		mByte.addSuperType(number);
		number.addSuperType(object);

		// Add interfaces implemented by Byte
		mByte.addSuperType(serializable);
		mByte.addSuperType(comparable);
		mByte.addSuperType(number);
		mByte.addSuperType(getPrimitiveByteDatatype());

		return mByte;
	}

	public static DatatypeBean getPrimitiveShortDatatype() {
		return new DatatypeBean("short", "short");
	}

	public static DatatypeBean getShortDatatype() {
		DatatypeBean object = new DatatypeBean("java.lang.Object", "Object");
		DatatypeBean serializable = new DatatypeBean("java.io.Serializable", "Serializable");
		DatatypeBean comparable = new DatatypeBean("java.lang.Comparable", "Comparable");
		DatatypeBean number = new DatatypeBean("java.lang.Number", "Number");

		// Create Short type
		DatatypeBean mShort = new DatatypeBean("java.lang.Short", "Short");

		// Set up hierarchy: Short -> Number -> Object
		mShort.addSuperType(number);
		number.addSuperType(object);

		// Add interfaces implemented by Short
		mShort.addSuperType(serializable);
		mShort.addSuperType(comparable);
		mShort.addSuperType(number);
		mShort.addSuperType(getPrimitiveShortDatatype());

		return mShort;
	}

	public static DatatypeBean getPrimitiveIntegerDatatype() {
		return new DatatypeBean("int", "int");
	}

	public static DatatypeBean getIntegerDatatype() {
		DatatypeBean object = new DatatypeBean("java.lang.Object", "Object");
		DatatypeBean serializable = new DatatypeBean("java.io.Serializable", "Serializable");
		DatatypeBean comparable = new DatatypeBean("java.lang.Comparable", "Comparable");
		DatatypeBean number = new DatatypeBean("java.lang.Number", "Number");

		// Create Integer type
		DatatypeBean integer = new DatatypeBean("java.lang.Integer", "Integer");

		// Set up hierarchy: Integer -> Number -> Object
		integer.addSuperType(number);
		number.addSuperType(object);

		// Add interfaces implemented by Integer
		integer.addSuperType(serializable);
		integer.addSuperType(comparable);
		integer.addSuperType(number);
		integer.addSuperType(getPrimitiveIntegerDatatype());

		return integer;
	}

	public static DatatypeBean getPrimitiveLongDatatype() {
		return new DatatypeBean("long", "long");
	}

	public static DatatypeBean getLongDatatype() {
		DatatypeBean object = new DatatypeBean("java.lang.Object", "Object");
		DatatypeBean serializable = new DatatypeBean("java.io.Serializable", "Serializable");
		DatatypeBean comparable = new DatatypeBean("java.lang.Comparable", "Comparable");
		DatatypeBean number = new DatatypeBean("java.lang.Number", "Number");

		// Create Long type
		DatatypeBean mLong = new DatatypeBean("java.lang.Long", "Long");

		// Set up hierarchy: Long -> Number -> Object
		mLong.addSuperType(number);
		number.addSuperType(object);

		// Add interfaces implemented by Long
		mLong.addSuperType(serializable);
		mLong.addSuperType(comparable);
		mLong.addSuperType(number);
		mLong.addSuperType(getPrimitiveLongDatatype());

		return mLong;
	}

	public static DatatypeBean getPrimitiveFloatDatatype() {
		return new DatatypeBean("float", "float");
	}

	public static DatatypeBean getFloatDatatype() {
		DatatypeBean object = new DatatypeBean("java.lang.Object", "Object");
		DatatypeBean serializable = new DatatypeBean("java.io.Serializable", "Serializable");
		DatatypeBean comparable = new DatatypeBean("java.lang.Comparable", "Comparable");
		DatatypeBean number = new DatatypeBean("java.lang.Number", "Number");

		// Create float type
		DatatypeBean flt = new DatatypeBean("java.lang.Float", "Float");

		// Set up hierarchy: Float -> Number -> Object
		flt.addSuperType(number);
		number.addSuperType(object);

		// Add interfaces implemented by Integer
		flt.addSuperType(serializable);
		flt.addSuperType(comparable);
		flt.addSuperType(number);
		flt.addSuperType(getPrimitiveFloatDatatype());

		return flt;
	}

	public static DatatypeBean getPrimitiveDoubleDatatype() {
		return new DatatypeBean("double", "double");
	}

	public static DatatypeBean getDoubleDatatype() {
		DatatypeBean object = new DatatypeBean("java.lang.Object", "Object");
		DatatypeBean serializable = new DatatypeBean("java.io.Serializable", "Serializable");
		DatatypeBean comparable = new DatatypeBean("java.lang.Comparable", "Comparable");
		DatatypeBean number = new DatatypeBean("java.lang.Number", "Number");

		// Create Double type
		DatatypeBean mDouble = new DatatypeBean("java.lang.Double", "Double");

		// Set up hierarchy: Double -> Number -> Object
		mDouble.addSuperType(number);
		number.addSuperType(object);

		// Add interfaces implemented by Double
		mDouble.addSuperType(serializable);
		mDouble.addSuperType(comparable);
		mDouble.addSuperType(number);
		mDouble.addSuperType(getPrimitiveDoubleDatatype());

		return mDouble;
	}

	public static DatatypeBean getPrimitiveCharacterDatatype() {
		return new DatatypeBean("char", "char");
	}

	public static DatatypeBean getCharacterDatatype() {
		DatatypeBean object = new DatatypeBean("java.lang.Object", "Object");
		DatatypeBean serializable = new DatatypeBean("java.io.Serializable", "Serializable");
		DatatypeBean comparable = new DatatypeBean("java.lang.Comparable", "Comparable");

		// Create Character type
		DatatypeBean mCharacter = new DatatypeBean("java.lang.Character", "Character");

		// Set up hierarchy: Character -> Object
		mCharacter.addSuperType(object);

		// Add interfaces implemented by Character
		mCharacter.addSuperType(serializable);
		mCharacter.addSuperType(comparable);
		mCharacter.addSuperType(getPrimitiveCharacterDatatype());

		return mCharacter;
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

	public static DatatypeBean getNumberDatatype() {
		DatatypeBean object = new DatatypeBean("java.lang.Object", "Object");
		DatatypeBean serializable = new DatatypeBean("java.io.Serializable", "Serializable");
		DatatypeBean number = new DatatypeBean("java.lang.Number", "Number");
		number.addSuperType(object);

		// Add interfaces implemented by Number
		number.addSuperType(serializable);
		return number;
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

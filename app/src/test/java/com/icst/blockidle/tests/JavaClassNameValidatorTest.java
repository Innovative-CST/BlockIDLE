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

package com.icst.blockidle.tests;

import org.junit.Test;

import com.google.common.truth.Truth;
import com.icst.blockidle.util.JavaValidators;

public class JavaClassNameValidatorTest {

	@Test
	public void valid_java_class_name() {
		String className = "MyJavaClass";
		boolean isValid = JavaValidators.isValidJavaClassName(className);
		Truth.assertThat(isValid).isTrue();
	}

	@Test
	public void valid_class_with_numbers() {
		String className = "Class2";
		boolean isValid = JavaValidators.isValidJavaClassName(className);
		Truth.assertThat(isValid).isTrue();
	}

	@Test
	public void valid_class_with_underscores() {
		String className = "My_Class";
		boolean isValid = JavaValidators.isValidJavaClassName(className);
		Truth.assertThat(isValid).isTrue();
	}

	@Test
	public void valid_class_with_dollar_sign() {
		String className = "My$Class";
		boolean isValid = JavaValidators.isValidJavaClassName(className);
		Truth.assertThat(isValid).isTrue();
	}

	@Test
	public void valid_class_starting_with_underscore() {
		String className = "_UnderScoreClass";
		boolean isValid = JavaValidators.isValidJavaClassName(className);
		Truth.assertThat(isValid).isTrue();
	}

	@Test
	public void valid_single_character_class() {
		String className = "A";
		boolean isValid = JavaValidators.isValidJavaClassName(className);
		Truth.assertThat(isValid).isTrue();
	}

	@Test
	public void valid_long_class_name() {
		String className = new String(new char[1000]).replace('\0', 'A');
		boolean isValid = JavaValidators.isValidJavaClassName(className);
		Truth.assertThat(isValid).isTrue();
	}

	@Test
	public void invalid_start_with_number() {
		String className = "123Invalid";
		boolean isValid = JavaValidators.isValidJavaClassName(className);
		Truth.assertThat(isValid).isFalse();
	}

	@Test
	public void invalid_contains_space() {
		String className = "My Class";
		boolean isValid = JavaValidators.isValidJavaClassName(className);
		Truth.assertThat(isValid).isFalse();
	}

	@Test
	public void invalid_contains_hyphen() {
		String className = "My-Class";
		boolean isValid = JavaValidators.isValidJavaClassName(className);
		Truth.assertThat(isValid).isFalse();
	}

	@Test
	public void invalid_contains_asterisk() {
		String className = "My*Class";
		boolean isValid = JavaValidators.isValidJavaClassName(className);
		Truth.assertThat(isValid).isFalse();
	}

	@Test
	public void invalid_reserved_keyword() {
		String className = "int";
		boolean isValid = JavaValidators.isValidJavaClassName(className);
		Truth.assertThat(isValid).isFalse();
	}

	@Test
	public void invalid_empty_string() {
		String className = "";
		boolean isValid = JavaValidators.isValidJavaClassName(className);
		Truth.assertThat(isValid).isFalse();
	}

	@Test
	public void invalid_null_class_name() {
		String className = null;
		boolean isValid = JavaValidators.isValidJavaClassName(className);
		Truth.assertThat(isValid).isFalse();
	}

	@Test
	public void invalid_special_characters() {
		String className = "Test@Class";
		boolean isValid = JavaValidators.isValidJavaClassName(className);
		Truth.assertThat(isValid).isFalse();
	}

	@Test
	public void invalid_start_with_lowercase() {
		String className = "myClass";
		boolean isValid = JavaValidators.isValidJavaClassName(className);
		Truth.assertThat(isValid).isFalse();
	}

}

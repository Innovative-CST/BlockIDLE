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
import com.icst.blockidle.util.ProjectBeanValidator;

public class ProjectBeanValidatorPackageNameTest {

	@Test
	public void valid_package_name_with_3_dot() {
		String packageName = "com.junit.test";
		boolean isValid = ProjectBeanValidator.isValidPackageName(packageName);
		Truth.assertThat(isValid).isTrue();
	}

	@Test
	public void valid_package_name_with_single_segment() {
		String packageName = "junit";
		boolean isValid = ProjectBeanValidator.isValidPackageName(packageName);
		Truth.assertThat(isValid).isTrue();
	}

	@Test
	public void valid_package_name_with_numbers() {
		String packageName = "com.junit123.test456";
		boolean isValid = ProjectBeanValidator.isValidPackageName(packageName);
		Truth.assertThat(isValid).isTrue();
	}

	@Test
	public void valid_package_name_with_underscore() {
		String packageName = "com.junit_test.example";
		boolean isValid = ProjectBeanValidator.isValidPackageName(packageName);
		Truth.assertThat(isValid).isTrue();
	}

	@Test
	public void invalid_package_name_with_hyphen() {
		String packageName = "com.junit-test.example";
		boolean isValid = ProjectBeanValidator.isValidPackageName(packageName);
		Truth.assertThat(isValid).isFalse();
	}

	@Test
	public void invalid_package_name_starting_with_number() {
		String packageName = "123com.junit.test";
		boolean isValid = ProjectBeanValidator.isValidPackageName(packageName);
		Truth.assertThat(isValid).isFalse();
	}

	@Test
	public void invalid_package_name_with_space() {
		String packageName = "com.junit test.example";
		boolean isValid = ProjectBeanValidator.isValidPackageName(packageName);
		Truth.assertThat(isValid).isFalse();
	}

	@Test
	public void invalid_package_name_with_special_characters() {
		String packageName = "com.junit@test.example";
		boolean isValid = ProjectBeanValidator.isValidPackageName(packageName);
		Truth.assertThat(isValid).isFalse();
	}

	@Test
	public void invalid_package_name_with_empty_segment() {
		String packageName = "com..junit.test";
		boolean isValid = ProjectBeanValidator.isValidPackageName(packageName);
		Truth.assertThat(isValid).isFalse();
	}

	@Test
	public void invalid_package_name_with_leading_dot() {
		String packageName = ".com.junit.test";
		boolean isValid = ProjectBeanValidator.isValidPackageName(packageName);
		Truth.assertThat(isValid).isFalse();
	}

	@Test
	public void invalid_package_name_with_trailing_dot() {
		String packageName = "com.junit.test.";
		boolean isValid = ProjectBeanValidator.isValidPackageName(packageName);
		Truth.assertThat(isValid).isFalse();
	}

	@Test
	public void invalid_package_name_with_reserved_keyword() {
		String packageName = "com.junit.public.test";
		boolean isValid = ProjectBeanValidator.isValidPackageName(packageName);
		Truth.assertThat(isValid).isFalse();
	}

	@Test
	public void invalid_package_name_with_null() {
		String packageName = null;
		boolean isValid = ProjectBeanValidator.isValidPackageName(packageName);
		Truth.assertThat(isValid).isFalse();
	}

	@Test
	public void invalid_package_name_with_empty_string() {
		String packageName = "";
		boolean isValid = ProjectBeanValidator.isValidPackageName(packageName);
		Truth.assertThat(isValid).isFalse();
	}

	@Test
	public void invalid_package_name_with_uppercase_letters() {
		String packageName = "com.JUnit.Test";
		boolean isValid = ProjectBeanValidator.isValidPackageName(packageName);
		Truth.assertThat(isValid).isFalse();
	}

	@Test
	public void invalid_package_name_with_consecutive_dots() {
		String packageName = "com..junit..test";
		boolean isValid = ProjectBeanValidator.isValidPackageName(packageName);
		Truth.assertThat(isValid).isFalse();
	}

	@Test
	public void invalid_package_name_with_too_long_segment() {
		String packageName = "com." + "a".repeat(300) + ".test";
		boolean isValid = ProjectBeanValidator.isValidPackageName(packageName);
		Truth.assertThat(isValid).isFalse();
	}
}

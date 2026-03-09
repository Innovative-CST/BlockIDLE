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

public class ProjectBeanValidatorProjectNameTest {

	@Test
	public void valid_project_name() {
		String projectName = "MyTestProject";
		boolean isValid = ProjectBeanValidator.isValidProjectName(projectName);
		Truth.assertThat(isValid).isTrue();
	}

	@Test
	public void valid_project_name_with_numbers() {
		String projectName = "A1Project";
		boolean isValid = ProjectBeanValidator.isValidProjectName(projectName);
		Truth.assertThat(isValid).isTrue();
	}

	@Test
	public void valid_project_name_with_single_character() {
		String projectName = "A";
		boolean isValid = ProjectBeanValidator.isValidProjectName(projectName);
		Truth.assertThat(isValid).isTrue();
	}

	@Test
	public void invalid_project_name_starting_with_lowercase() {
		String projectName = "myProject";
		boolean isValid = ProjectBeanValidator.isValidProjectName(projectName);
		Truth.assertThat(isValid).isFalse();
	}

	@Test
	public void invalid_project_name_starting_with_number() {
		String projectName = "1Project";
		boolean isValid = ProjectBeanValidator.isValidProjectName(projectName);
		Truth.assertThat(isValid).isFalse();
	}

	@Test
	public void invalid_project_name_starting_with_special_character() {
		String projectName = "_Project";
		boolean isValid = ProjectBeanValidator.isValidProjectName(projectName);
		Truth.assertThat(isValid).isFalse();
	}

	@Test
	public void invalid_project_name_with_special_characters() {
		String projectName = "Project@123";
		boolean isValid = ProjectBeanValidator.isValidProjectName(projectName);
		Truth.assertThat(isValid).isFalse();
	}

	@Test
	public void invalid_project_name_with_spaces() {
		String projectName = "My Project";
		boolean isValid = ProjectBeanValidator.isValidProjectName(projectName);
		Truth.assertThat(isValid).isFalse();
	}

	@Test
	public void invalid_project_name_with_empty_string() {
		String projectName = "";
		boolean isValid = ProjectBeanValidator.isValidProjectName(projectName);
		Truth.assertThat(isValid).isFalse();
	}

	@Test
	public void invalid_project_name_with_null() {
		String projectName = null;
		boolean isValid = ProjectBeanValidator.isValidProjectName(projectName);
		Truth.assertThat(isValid).isFalse();
	}
}

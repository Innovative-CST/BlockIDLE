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

package com.icst.blockidle.bean;

import java.io.Serializable;
import java.util.Objects;

import com.icst.blockidle.bean.utils.GradleBeansUIDConstants;

/**
 * Represents a Gradle import declaration within the Block IDLE environment.
 * <p>
 * This bean encapsulates information about a single import statement, including
 * whether the import is static and the fully qualified name of the imported class
 * or member. It provides utility methods to retrieve and modify the import
 * attributes, as well as generate corresponding Gradle source code.
 * </p>
 *
 * <p>
 * This class is serializable and cloneable, making it suitable for storage and
 * duplication in environments where import declarations need to be manipulated
 * programmatically, such as in a visual programming editor or code generator.
 * </p>
 */
public class GradleImportDeclarationBean extends BeanMetadata
		implements Serializable, CloneableBean<GradleImportDeclarationBean> {

	public static final long serialVersionUID = GradleBeansUIDConstants.GRADLE_IMPORT_DECLARATION_BEAN;

	private String className;
	private boolean isStaticImport;

	// For non-parameterized contructor, do not removr
	public GradleImportDeclarationBean() {
	}

	public GradleImportDeclarationBean(String className, boolean isStatic) {
		this.className = className;
		this.isStaticImport = isStatic;
	}

	public String getClassName() {
		return this.className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		GradleImportDeclarationBean other = (GradleImportDeclarationBean) obj;
		return isStaticImport == other.isStaticImport &&
				Objects.equals(className, other.className);
	}

	@Override
	public int hashCode() {
		return Objects.hash(className, isStaticImport);
	}

	@Override
	public GradleImportDeclarationBean cloneBean() {
		return new GradleImportDeclarationBean(new String(className), Boolean.valueOf(isStaticImport));
	}

	public boolean getIsStaticImport() {
		return this.isStaticImport;
	}

	public void setIsStaticImport(boolean isStaticImport) {
		this.isStaticImport = isStaticImport;
	}

	public String getCode() {
		if (className == null || className.isEmpty()) {
			return "";
		}
		StringBuilder builder = new StringBuilder("import ");
		if (isStaticImport) {
			builder.append("static ");
		}
		builder.append(className).append(";");
		return builder.toString();
	}
}

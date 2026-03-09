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
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

import com.icst.blockidle.bean.enums.ProgrammingLanguage;
import com.icst.blockidle.bean.utils.BeansUIDConstants;

/**
 * Metadata bean defining which programming languages
 * a block supports.
 *
 * This bean can be attached to any {@link BlockBean}.
 */
public class SupportedLanguagesBean extends BeanMetadata implements Serializable {

	/**
	 * {@code serialVersionUID} for serialization compatibility with {@link SupportedLanguagesBean}.
	 */
	public static final long serialVersionUID = BeansUIDConstants.SUPPORTED_LANGUAGES_BEAN;

	/**
	 * EnumSet containing the supported languages.
	 */
	private Set<ProgrammingLanguage> supportedLanguages = EnumSet.noneOf(ProgrammingLanguage.class);

	/**
	 * Returns an unmodifiable set of supported languages.
	 *
	 * @return immutable set of supported languages
	 */
	public Set<ProgrammingLanguage> getSupportedLanguages() {
		return Collections.unmodifiableSet(supportedLanguages);
	}

	/**
	 * Adds a supported language.
	 *
	 * @param language language to add
	 */
	public void addLanguage(ProgrammingLanguage language) {
		if (language != null) {
			supportedLanguages.add(language);
		}
	}

	/**
	 * Checks if a language is supported.
	 *
	 * @param language language to check
	 * @return true if supported
	 */
	public boolean isLanguageSupported(ProgrammingLanguage language) {
		return language != null && supportedLanguages.contains(language);
	}
}
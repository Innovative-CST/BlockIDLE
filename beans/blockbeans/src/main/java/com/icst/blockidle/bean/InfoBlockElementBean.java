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

public class InfoBlockElementBean implements BlockElementBean<InfoBlockElementBean>, Serializable {

	private String markdown;

	@Override
	public InfoBlockElementBean cloneBean() {
		InfoBlockElementBean clone = new InfoBlockElementBean();
		clone.setMarkdown(this.markdown == null ? null : new String(markdown));
		return clone;
	}

	public String getMarkdown() {
		return this.markdown;
	}

	public void setMarkdown(String markdown) {
		this.markdown = markdown;
	}
}

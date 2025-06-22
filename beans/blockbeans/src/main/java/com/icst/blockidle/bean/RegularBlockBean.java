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

import com.icst.blockidle.bean.utils.BeanArrayCloneUtils;
import com.icst.blockidle.bean.utils.BlockBeansUIDConstants;

/** RegularBlockBean: Can hold all kind of LayerBean, for example BlockElementLayerBean & ActionBlockLayerBean and further ActionBlockBean can be added below it. */
public class RegularBlockBean extends ActionBlockBean<RegularBlockBean>
		implements Serializable {

	public static final long serialVersionUID = BlockBeansUIDConstants.BLOCK_BEAN;

	private String codeSyntax;

	@Override
	public String getCodeSyntax() {
		return this.codeSyntax;
	}

	public void setCodeSyntax(String codeSyntax) {
		this.codeSyntax = codeSyntax;
	}

	@Override
	public RegularBlockBean cloneBean() {
		RegularBlockBean clone = new RegularBlockBean();
		clone.setCodeSyntax(getCodeSyntax() == null ? null : new String(getCodeSyntax()));
		clone.setColor(getColor() == null ? null : new String(getColor()));
		clone.setDragAllowed(isDragAllowed());
		clone.setLayers(BeanArrayCloneUtils.clone(getLayers()));
		clone.setValueReadOnly(isValueReadOnly());
		clone.setBeanManifest(getBeanManifest() == null ? null : getBeanManifest());
		return clone;
	}
}

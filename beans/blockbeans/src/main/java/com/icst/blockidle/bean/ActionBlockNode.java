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

public abstract class ActionBlockNode<T extends ActionBlockNode, K extends ActionBlockBean> implements Serializable {

	public abstract void setPrevious(RegularBlockNode node);

	public abstract void setActionBlock(K block);

	public abstract RegularBlockNode getPrevious();

	public abstract boolean hasPrevious();

	public abstract ActionBlockNode get(int position);

	public abstract int getSize();

	public abstract boolean isTerminated();

	public abstract ActionBlockBean getActionBlock();

	public abstract T deepClone();

	public abstract ActionBlockNode next();

	public abstract boolean hasNext();

	protected abstract T deepCloneInternal(RegularBlockNode previous);

}

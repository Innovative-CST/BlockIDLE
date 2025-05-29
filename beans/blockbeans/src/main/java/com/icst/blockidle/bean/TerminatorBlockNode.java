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

public class TerminatorBlockNode extends ActionBlockNode<TerminatorBlockNode, TerminatorBlockBean>
		implements Serializable {

	private RegularBlockNode previous;
	private TerminatorBlockBean terminatorBlock;

	@Override
	public boolean isTerminated() {
		return true;
	}

	@Override
	public ActionBlockNode get(int position) {
		return position == 0 ? this : null;
	}

	@Override
	public RegularBlockNode getPrevious() {
		return previous;
	}

	@Override
	public boolean hasPrevious() {
		return previous != null;
	}

	@Override
	public void setPrevious(RegularBlockNode previous) {
		this.previous = previous;
	}

	@Override
	public ActionBlockBean getActionBlock() {
		return this.terminatorBlock;
	}

	@Override
	public void setActionBlock(TerminatorBlockBean terminatorBlock) {
		setTerminatorBlock(terminatorBlock);
	}

	public TerminatorBlockBean getTerminatorBlock() {
		return this.terminatorBlock;
	}

	public void setTerminatorBlock(TerminatorBlockBean terminatorBlock) {
		this.terminatorBlock = terminatorBlock;
	}

	@Override
	public boolean hasNext() {
		return false;
	}

	@Override
	public ActionBlockNode next() {
		return null;
	}

	@Override
	public int getSize() {
		return 1;
	}

	@Override
	public TerminatorBlockNode deepClone() {
		return deepCloneInternal(null);
	}

	@Override
	protected TerminatorBlockNode deepCloneInternal(RegularBlockNode previousClone) {
		TerminatorBlockNode currentClone = new TerminatorBlockNode();
		currentClone.setTerminatorBlock(terminatorBlock.cloneBean());
		currentClone.setPrevious(previousClone);
		return currentClone;
	}
}

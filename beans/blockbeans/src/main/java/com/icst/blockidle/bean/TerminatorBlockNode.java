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
import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Consumer;

public class TerminatorBlockNode extends ActionBlockNode implements Serializable {

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
	public void forEach(Consumer<? super ActionBlockNode> action) {
		for (ActionBlockNode node = this; node != null; node = (node instanceof RegularBlockNode rb) ? rb.getNext()
				: null) {
			action.accept(node);
		}
	}

	@Override
	public Iterator<ActionBlockNode> iterator() {
		return this;
	}

	@Override
	public Spliterator<ActionBlockNode> spliterator() {
		return Spliterators.spliteratorUnknownSize(this.iterator(), Spliterator.ORDERED);
	}

	@Override
	public ActionBlockNode next() {
		return null;
	}

    @Override
    public int getSize() {
        return 1;
    }
}

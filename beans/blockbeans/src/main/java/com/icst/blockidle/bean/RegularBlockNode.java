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

public class RegularBlockNode extends ActionBlockNode<RegularBlockNode> implements Serializable {

    private ActionBlockNode next;
    private RegularBlockNode previous;
    private RegularBlockBean regularBlock;

    @Override
    public ActionBlockNode get(int position) {
        ActionBlockNode curr = this;
        int index = 0;
        while (curr.hasNext() && position > index) {
            if (curr instanceof RegularBlockNode regularBlockNode) {
                curr = regularBlockNode.getNext();
            }
            index++;
        }

        if (position > index) {
            return null;
        }
        return curr;
    }

    public ActionBlockNode getNext() {
        return next;
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
        return this.regularBlock;
    }

    public RegularBlockBean getRegularBlock() {
        return this.regularBlock;
    }

    public void setRegularBlock(RegularBlockBean regularBlock) {
        this.regularBlock = regularBlock;
    }

    public void setNextNode(ActionBlockNode next) {
        this.next = next;
    }

    @Override
    public boolean isTerminated() {
        if (hasNext()) {
            return next.isTerminated();
        }
        return false;
    }

    @Override
    public boolean hasNext() {
        return next != null;
    }

    @Override
    public void forEach(Consumer<? super ActionBlockNode> action) {
        for (ActionBlockNode node = this;
                node != null;
                node = (node instanceof RegularBlockNode rb) ? rb.getNext() : null) {
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
        return getNext();
    }

    @Override
    public int getSize() {
        if (hasNext()) {
            return 1 + next.getSize();
        }
        return 1;
    }

    @Override
    public RegularBlockNode deepClone() {
        return deepCloneInternal(null);
    }

    @Override
    @SuppressWarnings("unchecked")
    protected RegularBlockNode deepCloneInternal(RegularBlockNode previousClone) {
        RegularBlockNode currentClone = new RegularBlockNode();

        // Clone the block itself
        if (regularBlock != null) {
            currentClone.setRegularBlock(regularBlock.cloneBean());
        }

        // Set the previous reference to the provided clone
        currentClone.setPrevious(previousClone);

        // Clone the next node if exists
        if (next != null) {
            ActionBlockNode clonedNext = next.deepCloneInternal(currentClone);
            currentClone.setNextNode(clonedNext);
        }

        return currentClone;
    }
}

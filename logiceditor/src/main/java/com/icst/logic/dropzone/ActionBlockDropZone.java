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

package com.icst.logic.dropzone;

/**
 * Represents a drop zone for ActionBlocks (e.g., Regular or Terminator blocks)
 * used within the LogicEditor.
 *
 * <p>This drop zone accepts action-type blocks and manages their placement
 * inside the editor workflow. The blocks are placed below each others in 
 * ActionBlockDropZone</p>
 *
 * @see com.icst.logic.view.ActionBlockDropZoneView
 * @see com.icst.logic.view.MainActionBlockDropZoneView
 */
public abstract class ActionBlockDropZone extends BlockDropZone {

	/**
	 * Checks whether the last block in this drop zone is a TerminatorBlock.
	 *
	 * @return {@code true} if the last block is a TerminatorBlock,
	 *         {@code false} otherwise
	 */
	public abstract boolean isTerminated();
}

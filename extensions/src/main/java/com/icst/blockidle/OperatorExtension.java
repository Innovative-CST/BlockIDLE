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

package com.icst.blockidle;

import com.icst.blockidle.bean.BlockPaletteBean;
import com.icst.blockidle.blocks.OperatorBlocks;

@Extension(extensionFileName = "OperatorExtension.bidle")
public class OperatorExtension {

	@ExtensionItem(extensionItemName = "block_palette/operator_block_palette")
	public static BlockPaletteBean getClassBlockPalette() {
		return OperatorBlocks.getOperatorBlockPalette();
	}

}

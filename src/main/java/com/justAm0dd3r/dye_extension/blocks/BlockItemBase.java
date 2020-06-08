package com.justAm0dd3r.dye_extension.blocks;

import com.justAm0dd3r.dye_extension.DyeExtension;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockItemBase extends BlockItem {
    public BlockItemBase(Block block) {
        super(block, new Item.Properties().group(DyeExtension.DYED_BLOCKS_TAB));
    }
}

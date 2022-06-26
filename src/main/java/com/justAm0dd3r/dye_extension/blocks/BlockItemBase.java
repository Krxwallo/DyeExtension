package com.justAm0dd3r.dye_extension.blocks;

import com.justAm0dd3r.dye_extension.tabs.ItemTabs;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class BlockItemBase extends BlockItem {
    public BlockItemBase(Block block) {
        super(block, new Item.Properties().tab(ItemTabs.getFromBlock(block)));
    }
}

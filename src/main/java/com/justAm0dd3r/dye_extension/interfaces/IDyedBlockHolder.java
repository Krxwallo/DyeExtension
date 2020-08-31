package com.justAm0dd3r.dye_extension.interfaces;

import com.justAm0dd3r.dye_extension.blocks.BlockHolder;
import com.justAm0dd3r.dye_extension.items.ItemHolder;
import net.minecraft.item.DyeColor;

import java.util.Collection;

public interface IDyedBlockHolder {
    Collection<ItemHolder> getItems();
    Collection<BlockHolder> getBlocks();
    BlockHolder getBlockFromColor(DyeColor color);
    ItemHolder getItemFromColor(DyeColor color);
}

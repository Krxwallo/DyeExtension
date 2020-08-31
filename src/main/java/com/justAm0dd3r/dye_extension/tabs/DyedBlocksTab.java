package com.justAm0dd3r.dye_extension.tabs;

import com.justAm0dd3r.dye_extension.registry.types.ModBlocks;
import net.minecraft.item.DyeColor;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class DyedBlocksTab extends ItemGroup {

    public DyedBlocksTab() {
        super("dyedBlocksTab");
    }

    @SuppressWarnings("NullableProblems")
    @Override
    public ItemStack createIcon() {
        return new ItemStack(ModBlocks.DYED_COBBLESTONE_BLOCKS.getBlockFromColor(DyeColor.LIME).getBlock().get());
    }
}

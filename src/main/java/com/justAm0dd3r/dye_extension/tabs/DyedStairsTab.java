package com.justAm0dd3r.dye_extension.tabs;

import com.justAm0dd3r.dye_extension.registry.types.ModBlocks;
import net.minecraft.item.DyeColor;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class DyedStairsTab extends ItemGroup {

    public DyedStairsTab() {
        super("dyed_stairs_tab");
    }

    @SuppressWarnings("NullableProblems")
    @Override
    public ItemStack createIcon() {
        return new ItemStack(ModBlocks.DYED_POLISHED_ANDESITE_BLOCKS.getBlockFromColor(DyeColor.LIME).getStairsBlock().get());
    }
}

package com.justAm0dd3r.dye_extension.tabs;

import com.justAm0dd3r.dye_extension.registry.types.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.ItemStack;

public class DyedStairsTab extends CreativeModeTab {

    public DyedStairsTab() {
        super("dyed_stairs_tab");
    }

    @SuppressWarnings("NullableProblems")
    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ModBlocks.DYED_POLISHED_ANDESITE_BLOCKS.getBlockFromColor(DyeColor.LIME).getStairsBlock().get());
    }
}

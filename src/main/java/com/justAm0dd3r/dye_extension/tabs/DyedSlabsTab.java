package com.justAm0dd3r.dye_extension.tabs;

import com.justAm0dd3r.dye_extension.registry.types.ModBlocks;
import net.minecraft.item.DyeColor;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class DyedSlabsTab extends ItemGroup {

    public DyedSlabsTab() {
        super("dyedSlabsTab");
    }

    @SuppressWarnings("NullableProblems")
    @Override
    public ItemStack createIcon() {
        return new ItemStack(ModBlocks.DYED_STONE_BLOCKS.getBlockFromColor(DyeColor.LIME).getSlabBlock().get());
    }
}

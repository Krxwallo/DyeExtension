package com.justAm0dd3r.dye_extension.tabs;

import com.justAm0dd3r.dye_extension.registry.types.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class DyedStairsTab extends ItemGroup {

    public DyedStairsTab() {
        super("dyedStairsTab");
    }

    @SuppressWarnings("NullableProblems")
    @Override
    public ItemStack createIcon() {
        return new ItemStack(Blocks.LIME_POLISHED_ANDESITE_STAIRS.get());
    }
}

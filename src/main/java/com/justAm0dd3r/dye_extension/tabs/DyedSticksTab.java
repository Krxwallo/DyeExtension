package com.justAm0dd3r.dye_extension.tabs;

import com.justAm0dd3r.dye_extension.registry.Items;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class DyedSticksTab extends ItemGroup {

    public DyedSticksTab() {
        super("dyedSticksTab");
    }

    @SuppressWarnings("NullableProblems")
    @Override
    public ItemStack createIcon() {
        return new ItemStack(Items.LIME_STICK.get());
    }
}
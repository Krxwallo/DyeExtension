package com.justAm0dd3r.dye_extension.tabs;

import com.justAm0dd3r.dye_extension.registry.types.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class DyedSticksTab extends ItemGroup {

    public DyedSticksTab() {
        super("dyedSticksTab");
    }

    @SuppressWarnings("NullableProblems")
    @Override
    public ItemStack createIcon() {
        return new ItemStack(ModItems.LIME_STICK.get());
    }
}

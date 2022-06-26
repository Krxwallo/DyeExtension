package com.justAm0dd3r.dye_extension.tabs;

import com.justAm0dd3r.dye_extension.registry.types.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class DyedSticksTab extends CreativeModeTab {

    public DyedSticksTab() {
        super("dyed_sticks_tab");
    }

    @SuppressWarnings("NullableProblems")
    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ModItems.LIME_STICK.get());
    }
}

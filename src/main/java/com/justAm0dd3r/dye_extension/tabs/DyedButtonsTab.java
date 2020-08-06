package com.justAm0dd3r.dye_extension.tabs;

import com.justAm0dd3r.dye_extension.registry.types.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class DyedButtonsTab extends ItemGroup {

    public DyedButtonsTab() {
        super("dyedButtonsTab");
    }

    @SuppressWarnings("NullableProblems")
    @Override
    public ItemStack createIcon() {
        return new ItemStack(Blocks.LIME_STONE_BUTTON.get());
    }
}
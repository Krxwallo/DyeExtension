package com.justAm0dd3r.dye_extension.tabs;

import com.justAm0dd3r.dye_extension.registry.types.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.ItemStack;

import javax.annotation.Nonnull;

public class DyedButtonsTab extends CreativeModeTab {

    public DyedButtonsTab() {
        super("dyed_buttons_tab");
    }

    @Nonnull
    @Override
    public ItemStack makeIcon() {
        //noinspection ConstantConditions
        return new ItemStack(ModBlocks.DYED_STONE_BLOCKS.getBlockFromColor(DyeColor.LIME).getButtonBlock().get());
    }
}

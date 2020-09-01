package com.justAm0dd3r.dye_extension.tabs;

import com.justAm0dd3r.dye_extension.registry.types.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.item.DyeColor;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class DyedButtonsTab extends ItemGroup {

    public DyedButtonsTab() {
        super("dyed_buttons_tab");
    }

    @Nonnull
    @Override
    public ItemStack createIcon() {
        //noinspection ConstantConditions
        return new ItemStack(ModBlocks.DYED_STONE_BLOCKS.getBlockFromColor(DyeColor.LIME).getButtonBlock().get());
    }
}

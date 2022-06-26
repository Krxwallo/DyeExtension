package com.justAm0dd3r.dye_extension.tabs;

import com.justAm0dd3r.dye_extension.registry.types.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.ItemStack;

public class DyedBlocksTab extends CreativeModeTab {

    public DyedBlocksTab() {
        super("dyed_blocks_tab");
    }

    @SuppressWarnings("NullableProblems")
    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ModBlocks.DYED_COBBLESTONE_BLOCKS.getBlockFromColor(DyeColor.LIME).getBlock().get());
    }
}

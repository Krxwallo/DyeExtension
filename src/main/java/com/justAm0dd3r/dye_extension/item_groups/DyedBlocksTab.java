package com.justAm0dd3r.dye_extension.item_groups;

import com.justAm0dd3r.dye_extension.util.registry_types.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class DyedBlocksTab extends ItemGroup {

    public DyedBlocksTab() {
        super("dyedBlocksTab");
    }

    @SuppressWarnings("NullableProblems")
    @Override
    public ItemStack createIcon() {
        return new ItemStack(Blocks.LIME_COBBLESTONE.get());
    }
}

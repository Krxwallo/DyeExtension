package com.justAm0dd3r.dye_extension.item_groups;

import com.justAm0dd3r.dye_extension.util.registry_types.Items;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class DyedToolsTab extends ItemGroup {

    public DyedToolsTab() {
        super("dyedToolsTab");
    }

    @SuppressWarnings("NullableProblems")
    @Override
    public ItemStack createIcon() {
        return new ItemStack(Items.DIAMOND_AXE_YELLOW_HANDLE.get());
    }
}

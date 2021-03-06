package com.justAm0dd3r.dye_extension.tabs;

import com.justAm0dd3r.dye_extension.registry.types.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class DyedToolsTab extends ItemGroup {

    public DyedToolsTab() {
        super("dyed_tools_tab");
    }

    @SuppressWarnings("NullableProblems")
    @Override
    public ItemStack createIcon() {
        return new ItemStack(ModItems.DIAMOND_AXE_YELLOW_HANDLE.get());
    }
}

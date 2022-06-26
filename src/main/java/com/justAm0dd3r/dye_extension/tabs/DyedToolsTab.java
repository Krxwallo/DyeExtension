package com.justAm0dd3r.dye_extension.tabs;

import com.justAm0dd3r.dye_extension.registry.types.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class DyedToolsTab extends CreativeModeTab {

    public DyedToolsTab() {
        super("dyed_tools_tab");
    }

    @SuppressWarnings("NullableProblems")
    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ModItems.DIAMOND_AXE_YELLOW_HANDLE.get());
    }
}

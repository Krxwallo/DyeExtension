package com.justAm0dd3r.dye_extension.item_groups;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class DyeExtensionTab extends ItemGroup {

    public DyeExtensionTab() {
        super("dyeExtensionTab");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(Items.RED_DYE);
    }
}

package com.justAm0dd3r.dye_extension.items;

import com.justAm0dd3r.dye_extension.tabs.ItemTabs;
import net.minecraft.world.item.Item;

public class DyedStickItem extends Item {
    public DyedStickItem() {
        super(new Properties().tab(ItemTabs.DYED_STICKS_TAB));
    }
}

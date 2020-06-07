package com.justAm0dd3r.dye_extension.items;

import com.justAm0dd3r.dye_extension.DyeExtension;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;

public class DyedAxe extends AxeItem {
    public DyedAxe(ItemTier tier) {
        super(tier, 6.0F, -3.1F, (new Item.Properties()).group(DyeExtension.TAB));
    }
}
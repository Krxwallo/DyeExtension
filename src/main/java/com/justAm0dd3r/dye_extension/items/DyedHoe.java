package com.justAm0dd3r.dye_extension.items;

import net.minecraft.item.HoeItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Items;

public class DyedHoe extends HoeItem {
    public DyedHoe(IItemTier tier, float attackSpeedIn, Properties builder) {
        super(tier, 0, attackSpeedIn, builder);
    }
}
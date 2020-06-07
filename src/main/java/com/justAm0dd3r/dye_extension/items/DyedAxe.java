package com.justAm0dd3r.dye_extension.items;

import net.minecraft.item.AxeItem;
import net.minecraft.item.IItemTier;

public class DyedAxe extends AxeItem {
    public DyedAxe(IItemTier tier, float attackDamageIn, float attackSpeedIn, Properties builder) {
        super(tier, attackDamageIn, attackSpeedIn, builder);
    }
}
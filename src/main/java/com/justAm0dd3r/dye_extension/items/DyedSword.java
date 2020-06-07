package com.justAm0dd3r.dye_extension.items;

import net.minecraft.item.IItemTier;
import net.minecraft.item.SwordItem;

public class DyedSword extends SwordItem {
    public DyedSword(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder) {
        super(tier, attackDamageIn, attackSpeedIn, builder);
    }
}
package com.justAm0dd3r.dye_extension.items;

import net.minecraft.item.IItemTier;
import net.minecraft.item.PickaxeItem;

public class DyedPickaxe extends PickaxeItem {

    public DyedPickaxe(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder) {
        super(tier, attackDamageIn, attackSpeedIn, builder);
    }
}
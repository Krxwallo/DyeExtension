package com.justAm0dd3r.dye_extension.items;


import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class DyedSword extends SwordItem {
    public DyedSword(Tier tier, int attackDamageIn, float attackSpeedIn, Properties builder) {
        super(tier, attackDamageIn, attackSpeedIn, builder);
    }
}
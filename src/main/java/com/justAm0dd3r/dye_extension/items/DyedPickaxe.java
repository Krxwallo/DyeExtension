package com.justAm0dd3r.dye_extension.items;


import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;

public class DyedPickaxe extends PickaxeItem {

    public DyedPickaxe(Tier tier, int attackDamageIn, float attackSpeedIn, Properties builder) {
        super(tier, attackDamageIn, attackSpeedIn, builder);
    }
}
package com.justAm0dd3r.dye_extension.items;

import net.minecraft.item.HoeItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemTier;
import net.minecraft.item.Items;

public class DyedHoe extends HoeItem {
    public DyedHoe(IItemTier tier, float attackSpeedIn, Properties builder) {
        super(tier, getAttackDamage(tier), attackSpeedIn, builder);
    }

    private static int getAttackDamage(IItemTier tier) {
        if (tier.equals(ItemTier.STONE)) return -1;
        else if (tier.equals(ItemTier.IRON)) return -2;
        else if (tier.equals(ItemTier.DIAMOND)) return -3;
        else if (tier.equals(ItemTier.NETHERITE)) return -4;

        return 0;
    }
}
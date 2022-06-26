package com.justAm0dd3r.dye_extension.items;

import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;

public class DyedHoe extends HoeItem {
    public DyedHoe(Tier tier, float attackSpeedIn, Properties builder) {
        super(tier, getAttackDamage(tier), attackSpeedIn, builder);
    }

    private static int getAttackDamage(Tier tier) {
        if (tier.equals(Tiers.STONE)) return -1;
        else if (tier.equals(Tiers.IRON)) return -2;
        else if (tier.equals(Tiers.DIAMOND)) return -3;
        else if (tier.equals(Tiers.NETHERITE)) return -4;

        return 0;
    }
}
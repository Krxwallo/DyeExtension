package com.justAm0dd3r.dye_extension.container;

import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.container.AbstractFurnaceContainer;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.item.crafting.RecipeBookCategory;
import net.minecraft.util.IIntArray;

/*
Author: justAm0dd3r
 */

public class DyedFurnaceContainer extends AbstractFurnaceContainer {
    public DyedFurnaceContainer(int id, PlayerInventory playerInventoryIn) {
        super(ContainerTypes.DYED_FURNACE.get(), IRecipeType.SMELTING, RecipeBookCategory.FURNACE, id, playerInventoryIn);
    }

    public DyedFurnaceContainer(int id, PlayerInventory playerInventoryIn, IInventory furnaceInventoryIn, IIntArray p_i50083_4_) {
        super(ContainerTypes.DYED_FURNACE.get(), IRecipeType.SMELTING, RecipeBookCategory.FURNACE, id, playerInventoryIn, furnaceInventoryIn, p_i50083_4_);
    }
}

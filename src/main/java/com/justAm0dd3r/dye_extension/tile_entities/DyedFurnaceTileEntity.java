package com.justAm0dd3r.dye_extension.tile_entities;

import com.justAm0dd3r.dye_extension.container.DyedFurnaceContainer;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.tileentity.AbstractFurnaceTileEntity;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

/*
Author: justAm0dd3r
 */

@SuppressWarnings("NullableProblems")
public class DyedFurnaceTileEntity extends AbstractFurnaceTileEntity {

    public DyedFurnaceTileEntity() {
        super(TileEntityTypes.DYED_FURNACE.get(), IRecipeType.SMELTING);
    }

    @Override
    protected ITextComponent getDefaultName() {
        return new TranslationTextComponent("container.dyed_furnace");
    }

    @Override
    protected Container createMenu(int id, PlayerInventory player) {
        return new DyedFurnaceContainer(id, player, this, this.furnaceData);
    }


}

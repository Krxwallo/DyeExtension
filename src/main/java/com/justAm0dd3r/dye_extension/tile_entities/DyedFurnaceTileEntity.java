package com.justAm0dd3r.dye_extension.tile_entities;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;

/*
Author: justAm0dd3r
 */

@SuppressWarnings("NullableProblems")
public class DyedFurnaceTileEntity {// extends AbstractFurnaceTileEntity {

    //public DyedFurnaceTileEntity() {
    //    super(TileEntityTypes.DYED_FURNACE.get(), IRecipeType.SMELTING);
    //}

    //@Override
    protected Component getDefaultName() {
        return new TranslatableComponent("container.dyed_furnace");
    }

    //@Override
    //protected Container createMenu(int id, PlayerInventory player) {
    //    return new DyedFurnaceContainer(id, player, this, this.furnaceData);
    //}


}

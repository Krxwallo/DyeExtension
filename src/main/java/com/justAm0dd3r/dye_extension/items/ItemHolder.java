package com.justAm0dd3r.dye_extension.items;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class ItemHolder {
    private final RegistryObject<Item> blockItem;
    private final RegistryObject<Item> stairsBlockItem;
    private final RegistryObject<Item> slabBlockItem;
    private final RegistryObject<Item> buttonBlockItem;

    public ItemHolder(@Nonnull RegistryObject<Item> blockItem, @Nullable RegistryObject<Item> stairsBlockItem,
                      @Nullable RegistryObject<Item> slabBlockItem, @Nullable RegistryObject<Item> buttonBlockItem) {
        this.blockItem = blockItem;
        this.stairsBlockItem = stairsBlockItem;
        this.slabBlockItem = slabBlockItem;
        this.buttonBlockItem = buttonBlockItem;
    }

    public RegistryObject<Item> getBlockItem() {
        return blockItem;
    }

    public RegistryObject<Item> getStairsBlockItem() {
        return stairsBlockItem;
    }

    public RegistryObject<Item> getSlabBlockItem() {
        return slabBlockItem;
    }

    public RegistryObject<Item> getButtonBlockItem() {
        return buttonBlockItem;
    }
}

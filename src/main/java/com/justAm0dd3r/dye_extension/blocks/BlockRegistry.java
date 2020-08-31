package com.justAm0dd3r.dye_extension.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;

public class BlockRegistry {
    private final RegistryObject<Block> block;
    private final RegistryObject<Item> item;

    public BlockRegistry(RegistryObject<Block> block, RegistryObject<Item> item) {
        this.block = block;
        this.item = item;
    }

    public RegistryObject<Block> getBlock() {
        return block;
    }

    public RegistryObject<Item> getItem() {
        return item;
    }
}

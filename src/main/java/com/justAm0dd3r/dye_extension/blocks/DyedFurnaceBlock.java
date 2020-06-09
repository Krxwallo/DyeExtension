package com.justAm0dd3r.dye_extension.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.FurnaceBlock;
import net.minecraft.block.material.Material;

public class DyedFurnaceBlock extends FurnaceBlock {
    public DyedFurnaceBlock() {
        super(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.5F).lightValue(13));
    }
}

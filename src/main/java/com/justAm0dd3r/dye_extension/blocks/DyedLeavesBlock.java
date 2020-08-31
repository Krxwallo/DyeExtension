package com.justAm0dd3r.dye_extension.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class DyedLeavesBlock extends Block {
    public DyedLeavesBlock() {
        super(Block.Properties.create(Material.LEAVES)
                .hardnessAndResistance(0.2F)
                .tickRandomly()
                .sound(SoundType.PLANT)
                .notSolid());
    }
}

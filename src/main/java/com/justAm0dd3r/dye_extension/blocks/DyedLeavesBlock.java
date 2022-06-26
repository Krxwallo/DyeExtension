package com.justAm0dd3r.dye_extension.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class DyedLeavesBlock extends Block {
    public DyedLeavesBlock() {
        super(Block.Properties.of(Material.LEAVES)
                .strength(0.2F)
                .randomTicks()
                .sound(SoundType.GRASS)
                .noOcclusion()); // notSolid?
    }
}

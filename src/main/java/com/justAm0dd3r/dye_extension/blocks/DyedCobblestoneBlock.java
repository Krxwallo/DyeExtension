package com.justAm0dd3r.dye_extension.blocks;


import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class DyedCobblestoneBlock extends Block {

    public DyedCobblestoneBlock() {
        super(Properties.create(Material.ROCK).hardnessAndResistance(2.0F, 6.0F)
                .sound(SoundType.STONE));
    }
}

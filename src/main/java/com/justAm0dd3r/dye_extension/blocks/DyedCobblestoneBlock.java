package com.justAm0dd3r.dye_extension.blocks;


import com.justAm0dd3r.dye_extension.interfaces.IDyedBlock;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class DyedCobblestoneBlock extends Block implements IDyedBlock {

    public DyedCobblestoneBlock(DyeColor color) {
        super(Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)
                .sound(SoundType.STONE));
    }
}

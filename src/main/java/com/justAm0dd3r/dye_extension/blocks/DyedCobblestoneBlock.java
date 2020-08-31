package com.justAm0dd3r.dye_extension.blocks;


import com.justAm0dd3r.dye_extension.interfaces.IDyedBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.DyeColor;

public class DyedCobblestoneBlock extends Block implements IDyedBlock {

    public DyedCobblestoneBlock(DyeColor color) {
        super(Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(2.0F, 6.0F)
                .sound(SoundType.STONE));
    }
}

package com.justAm0dd3r.dye_extension.blocks;

import com.justAm0dd3r.dye_extension.interfaces.IDyedBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.DyeColor;

public class DyedAndesiteBlock extends Block implements IDyedBlock {
    /**
     * @param color the color of the block
     */
    public DyedAndesiteBlock(DyeColor color) {
        super(Block.Properties.create(Material.ROCK, color).func_235861_h_().hardnessAndResistance(1.5F, 6.0F));
    }
}

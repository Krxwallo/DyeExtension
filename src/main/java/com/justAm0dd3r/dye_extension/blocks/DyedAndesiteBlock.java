package com.justAm0dd3r.dye_extension.blocks;

import com.justAm0dd3r.dye_extension.interfaces.IDyedBlock;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Material;

public class DyedAndesiteBlock extends Block implements IDyedBlock {
    /**
     * @param color the color of the block
     */
    public DyedAndesiteBlock(DyeColor color) {
        super(Block.Properties.of(Material.STONE, color).requiresCorrectToolForDrops().strength(1.5F, 6.0F));
    }
}

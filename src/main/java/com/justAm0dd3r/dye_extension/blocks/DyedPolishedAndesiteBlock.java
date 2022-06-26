package com.justAm0dd3r.dye_extension.blocks;

import com.justAm0dd3r.dye_extension.interfaces.IDyedBlock;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Material;

public class DyedPolishedAndesiteBlock extends Block implements IDyedBlock {
    public DyedPolishedAndesiteBlock(DyeColor color) {
        super(Properties.of(Material.STONE, color).requiresCorrectToolForDrops().strength(1.5F, 6.0F));
    }
}

package com.justAm0dd3r.dye_extension.blocks;

import com.justAm0dd3r.dye_extension.interfaces.IDyedBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.DyeColor;

public class DyedPolishedAndesiteBlock extends Block implements IDyedBlock {
    public DyedPolishedAndesiteBlock(DyeColor color) {
        super(Block.Properties.create(Material.ROCK, color).setRequiresTool().hardnessAndResistance(1.5F, 6.0F));
    }
}

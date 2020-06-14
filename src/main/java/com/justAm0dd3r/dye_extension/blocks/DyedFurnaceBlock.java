package com.justAm0dd3r.dye_extension.blocks;

import com.justAm0dd3r.dye_extension.tile_entities.DyedFurnaceTileEntity;
import net.minecraft.block.AbstractFurnaceBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.stats.Stats;
import net.minecraft.tileentity.FurnaceTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import javax.annotation.Nullable;
/*

public class DyedFurnaceBlock extends AbstractFurnaceBlock {
    public DyedFurnaceBlock() {
        super(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.5F).lightValue(13));
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new FurnaceTileEntity();
    }

    @SuppressWarnings("NullableProblems")
    @Override
    protected void interactWith(World worldIn, BlockPos pos, PlayerEntity player) {
        TileEntity tileentity = worldIn.getTileEntity(pos);
        if (tileentity instanceof DyedFurnaceTileEntity) {
            LOGGER.info("player.openContainer()");
            player.openContainer((INamedContainerProvider)tileentity);
            player.addStat(Stats.INTERACT_WITH_FURNACE);
        }
    }

    @Nullable
    @Override
    public TileEntity createNewTileEntity(IBlockReader worldIn) {
        return new DyedFurnaceTileEntity();
    }
}
*/

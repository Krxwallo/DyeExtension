package com.justAm0dd3r.dye_extension.blocks;

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

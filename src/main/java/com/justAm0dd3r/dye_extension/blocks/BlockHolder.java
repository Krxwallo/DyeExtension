package com.justAm0dd3r.dye_extension.blocks;


import net.minecraft.world.level.block.Block;
import net.minecraftforge.fmllegacy.RegistryObject;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class BlockHolder {
    @Nonnull
    private final RegistryObject<Block> block;
    @Nullable
    private final RegistryObject<Block> stairsBlock;
    @Nullable
    private final RegistryObject<Block> slabBlock;
    @Nullable
    private final RegistryObject<Block> buttonBlock;

    public BlockHolder(@Nonnull RegistryObject<Block> block, @Nullable RegistryObject<Block> stairsBlock,
                       @Nullable RegistryObject<Block> slabBlock, @Nullable RegistryObject<Block> buttonBlock) {
        this.block = block;
        this.stairsBlock = stairsBlock;
        this.slabBlock = slabBlock;
        this.buttonBlock = buttonBlock;
    }

    @Nonnull
    public RegistryObject<Block> getBlock() {
        return block;
    }

    @Nullable
    public RegistryObject<Block> getStairsBlock() {
        return stairsBlock;
    }

    @Nullable
    public RegistryObject<Block> getSlabBlock() {
        return slabBlock;
    }

    @Nullable
    public RegistryObject<Block> getButtonBlock() {
        return buttonBlock;
    }
}

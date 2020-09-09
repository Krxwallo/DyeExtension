package com.justAm0dd3r.dye_extension.registry.types;

import com.justAm0dd3r.dye_extension.blocks.DyedBlockHolder;
import com.justAm0dd3r.dye_extension.reference.Reference;
import net.minecraft.block.Block;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {

    public static void init() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Reference.MOD_ID);

    public static final DyedBlockHolder DYED_ANDESITE_BLOCKS = new DyedBlockHolder("andesite");
    public static final DyedBlockHolder DYED_POLISHED_ANDESITE_BLOCKS = new DyedBlockHolder("polished_andesite");
    public static final DyedBlockHolder DYED_LEAVES_BLOCKS = new DyedBlockHolder("leaves", false, false, false);
    public static final DyedBlockHolder DYED_STONE_BLOCKS = new DyedBlockHolder("stone", true, true, true);
    public static final DyedBlockHolder DYED_COBBLESTONE_BLOCKS = new DyedBlockHolder("cobblestone");
    public static final DyedBlockHolder DYED_DIRT_BLOCKS = new DyedBlockHolder("dirt", false, false, false);

}

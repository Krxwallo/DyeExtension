package com.justAm0dd3r.dye_extension.tile_entities;

import com.justAm0dd3r.dye_extension.Reference;
import com.justAm0dd3r.dye_extension.util.registry_types.Blocks;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TileEntityTypes {

    public static void init() {
        TILE_ENTITY_TYPES.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPES = new DeferredRegister<>
            (ForgeRegistries.TILE_ENTITIES, Reference.MOD_ID);



    @SuppressWarnings("ConstantConditions")
    public static final RegistryObject<TileEntityType<DyedFurnaceTileEntity>> DYED_FURNACE
            = TILE_ENTITY_TYPES.register("dyed_furnace", () -> TileEntityType.Builder.create(DyedFurnaceTileEntity::new,
                    Blocks.BLACK_FURNACE.get()).build(null));
}

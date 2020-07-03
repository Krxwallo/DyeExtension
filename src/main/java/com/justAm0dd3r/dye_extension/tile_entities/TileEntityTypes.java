package com.justAm0dd3r.dye_extension.tile_entities;

import com.justAm0dd3r.dye_extension.DyeExtension;
import com.justAm0dd3r.dye_extension.reference.Reference;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.types.Type;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.SharedConstants;
import net.minecraft.util.datafix.DataFixesManager;
import net.minecraft.util.datafix.TypeReferences;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TileEntityTypes {

    public static void init() {
        TILE_ENTITY_TYPES.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPES = new DeferredRegister<>
            (ForgeRegistries.TILE_ENTITIES, Reference.MOD_ID);


    private static Type<?> getType(String key) {
        Type<?> type = null;
        try {
            type = DataFixesManager.getDataFixer().getSchema(DataFixUtils.makeKey(SharedConstants.getVersion().getWorldVersion())).getChoiceType(TypeReferences.BLOCK_ENTITY, key);
        } catch (IllegalArgumentException illegalargumentexception) {
            DyeExtension.LOGGER.error("(register() method) No data fixer registered for block entity {}", (Object)key);
            if (SharedConstants.developmentMode) {
                throw illegalargumentexception;
            }
        }
        return type;
    }


    //public static final RegistryObject<TileEntityType<DyedFurnaceTileEntity>> DYED_FURNACE
    //        = TILE_ENTITY_TYPES.register("dyed_furnace", () -> TileEntityType.Builder.create(DyedFurnaceTileEntity::new,
    //                Blocks.BLACK_FURNACE.get()).build(getType("dyed_furnace")));
}

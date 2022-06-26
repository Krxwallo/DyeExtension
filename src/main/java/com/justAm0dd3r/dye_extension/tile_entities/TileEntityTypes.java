package com.justAm0dd3r.dye_extension.tile_entities;

/*
public class TileEntityTypes {

    public static void init() {
        TILE_ENTITY_TYPES.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPES = DeferredRegister.create
            (ForgeRegistries.TILE_ENTITIES, Reference.MOD_ID);


    private static Type<?> getType(String key) {
        Type<?> type = null;
        try {
            type = DataFixers.getDataFixer().getSchema(DataFixUtils.makeKey(SharedConstants.getCurrentVersion().getWorldVersion())).getChoiceType(References.BLOCK_ENTITY, key);
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
}*/

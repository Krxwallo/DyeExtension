package com.justAm0dd3r.dye_extension.container;

public class ContainerTypes {/*
    public static final DeferredRegister<ContainerType<?>> CONTAINER_TYPES
            = DeferredRegister.create(ForgeRegistries.CONTAINERS, Reference.MOD_ID);

    public static final RegistryObject<ContainerType<DyedFurnaceContainer>> DYED_FURNACE
            = register("dyed_furnace", (IContainerFactory<DyedFurnaceContainer>) (windowId, playerInventory, data)
            -> new DyedFurnaceContainer(windowId, playerInventory));

    public static void init() {
        CONTAINER_TYPES.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //public static ContainerType<DyedFurnaceContainer> DYED_FURNACE
    //        = register("dyed_furnace", DyedFurnaceContainer::new);

    //private static <T extends Container> ContainerType<T> register(String key, ContainerType.IFactory<T> factory) {
    //    return Registry.register(Registry.MENU, key, new ContainerType<>(factory));
    //}

    private static <T extends Container> RegistryObject<ContainerType<T>> register(String id, ContainerType.IFactory<T> factory)
    {
        return CONTAINER_TYPES.register(id, () -> new ContainerType<>(factory));
    }*/
}

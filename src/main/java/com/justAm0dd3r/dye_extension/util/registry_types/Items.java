package com.justAm0dd3r.dye_extension.util.registry_types;

import com.justAm0dd3r.dye_extension.DyeExtension;
import com.justAm0dd3r.dye_extension.items.ItemBase;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Items {

    public static final DeferredRegister<Item> ITEMS =
            new DeferredRegister<>(ForgeRegistries.ITEMS, DyeExtension.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Sticks
    public static final RegistryObject<Item> BLACK_STICK = ITEMS.register("black_stick", ItemBase::new);
    public static final RegistryObject<Item> BLUE_STICK = ITEMS.register("blue_stick", ItemBase::new);
    public static final RegistryObject<Item> BROWN_STICK = ITEMS.register("brown_stick", ItemBase::new);
    public static final RegistryObject<Item> CYAN_STICK = ITEMS.register("cyan_stick", ItemBase::new);
    public static final RegistryObject<Item> GRAY_STICK = ITEMS.register("gray_stick", ItemBase::new);
    public static final RegistryObject<Item> GREEN_STICK = ITEMS.register("green_stick", ItemBase::new);
    public static final RegistryObject<Item> LIGHT_BLUE_STICK = ITEMS.register("light_blue_stick", ItemBase::new);
    public static final RegistryObject<Item> LIGHT_GRAY_STICK = ITEMS.register("light_gray_stick", ItemBase::new);
    public static final RegistryObject<Item> LIME_STICK = ITEMS.register("lime_stick", ItemBase::new);
    public static final RegistryObject<Item> MAGENTA_STICK = ITEMS.register("magenta_stick", ItemBase::new);
    public static final RegistryObject<Item> ORANGE_STICK = ITEMS.register("orange_stick", ItemBase::new);
    public static final RegistryObject<Item> PINK_STICK = ITEMS.register("pink_stick", ItemBase::new);
    public static final RegistryObject<Item> PURPLE_STICK = ITEMS.register("purple_stick", ItemBase::new);
    public static final RegistryObject<Item> RED_STICK = ITEMS.register("red_stick", ItemBase::new);
    public static final RegistryObject<Item> WHITE_STICK = ITEMS.register("white_stick", ItemBase::new);
    public static final RegistryObject<Item> YELLOW_STICK = ITEMS.register("yellow_stick", ItemBase::new);


}
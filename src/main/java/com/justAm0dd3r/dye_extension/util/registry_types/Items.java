package com.justAm0dd3r.dye_extension.util.registry_types;

import com.justAm0dd3r.dye_extension.DyeExtension;
import com.justAm0dd3r.dye_extension.Reference;
import com.justAm0dd3r.dye_extension.items.DyedAxe;
import com.justAm0dd3r.dye_extension.items.ItemBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Items {

    public static final DeferredRegister<Item> ITEMS =
            new DeferredRegister<>(ForgeRegistries.ITEMS, Reference.MOD_ID);

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

    // TODO Axes
        // Iron
    public static final RegistryObject<Item> IRON_AXE_BLACK_HANDLE = ITEMS.register("iron_axe_black_handle", () -> new DyedAxe(ItemTier.IRON));
    public static final RegistryObject<Item> IRON_AXE_BLUE_HANDLE = ITEMS.register("iron_axe_blue_handle", () -> new DyedAxe(ItemTier.IRON));
    public static final RegistryObject<Item> IRON_AXE_BROWN_HANDLE = ITEMS.register("iron_axe_brown_handle", () -> new DyedAxe(ItemTier.IRON));
    public static final RegistryObject<Item> IRON_AXE_CYAN_HANDLE = ITEMS.register("iron_axe_cyan_handle", () -> new DyedAxe(ItemTier.IRON));
    public static final RegistryObject<Item> IRON_AXE_GRAY_HANDLE = ITEMS.register("iron_axe_gray_handle", () -> new DyedAxe(ItemTier.IRON));
    public static final RegistryObject<Item> IRON_AXE_GREEN_HANDLE = ITEMS.register("iron_axe_green_handle", () -> new DyedAxe(ItemTier.IRON));
    public static final RegistryObject<Item> IRON_AXE_LIGHT_BLUE_HANDLE = ITEMS.register("iron_axe_light_blue_handle", () -> new DyedAxe(ItemTier.IRON));
    public static final RegistryObject<Item> IRON_AXE_LIGHT_GRAY_HANDLE = ITEMS.register("iron_axe_light_gray_handle", () -> new DyedAxe(ItemTier.IRON));
    public static final RegistryObject<Item> IRON_AXE_LIME_HANDLE = ITEMS.register("iron_axe_lime_handle", () -> new DyedAxe(ItemTier.IRON));
    public static final RegistryObject<Item> IRON_AXE_MAGENTA_HANDLE = ITEMS.register("iron_axe_magenta_handle", () -> new DyedAxe(ItemTier.IRON));
    public static final RegistryObject<Item> IRON_AXE_ORANGE_HANDLE = ITEMS.register("iron_axe_orange_handle", () -> new DyedAxe(ItemTier.IRON));
    public static final RegistryObject<Item> IRON_AXE_PINK_HANDLE = ITEMS.register("iron_axe_pink_handle", () -> new DyedAxe(ItemTier.IRON));
    public static final RegistryObject<Item> IRON_AXE_PURPLE_HANDLE = ITEMS.register("iron_axe_purple_handle", () -> new DyedAxe(ItemTier.IRON));
    public static final RegistryObject<Item> IRON_AXE_RED_HANDLE = ITEMS.register("iron_axe_red_handle", () -> new DyedAxe(ItemTier.IRON));
    public static final RegistryObject<Item> IRON_AXE_WHITE_HANDLE = ITEMS.register("iron_axe_white_handle", () -> new DyedAxe(ItemTier.IRON));
    public static final RegistryObject<Item> IRON_AXE_YELLOW_HANDLE = ITEMS.register("iron_axe_yellow_handle", () -> new DyedAxe(ItemTier.IRON));

    // TODO Hoes

    // TODO Pickaxes

    // TODO Shovels

    // TODO Swords


}
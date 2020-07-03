package com.justAm0dd3r.dye_extension.registry;

import com.justAm0dd3r.dye_extension.DyeExtension;
import com.justAm0dd3r.dye_extension.reference.Reference;
import com.justAm0dd3r.dye_extension.items.*;
import com.justAm0dd3r.dye_extension.tabs.ItemGroups;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/*
Author: justAm0dd3r
 */
public class Items {

    public static final DeferredRegister<Item> ITEMS =
            new DeferredRegister<>(ForgeRegistries.ITEMS, Reference.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // NEW GENERATED

    // Black
    public static final RegistryObject<Item> BLACK_STICK= ITEMS.register("black_stick", DyedStickItem::new);
    public static final RegistryObject<Item> WOODEN_AXE_BLACK_HANDLE = ITEMS.register("wooden_axe_black_handle", () -> new DyedAxe(ItemTier.WOOD, 6.0F, -3.2F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_AXE_BLACK_HANDLE = ITEMS.register("stone_axe_black_handle", () -> new DyedAxe(ItemTier.STONE, 7.0F, -3.2F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_AXE_BLACK_HANDLE = ITEMS.register("iron_axe_black_handle", () -> new DyedAxe(ItemTier.IRON, 6.0F, -3.1F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_AXE_BLACK_HANDLE = ITEMS.register("golden_axe_black_handle", () -> new DyedAxe(ItemTier.GOLD, 6.0F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_AXE_BLACK_HANDLE = ITEMS.register("diamond_axe_black_handle", () -> new DyedAxe(ItemTier.DIAMOND, 5.0F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> WOODEN_HOE_BLACK_HANDLE = ITEMS.register("wooden_hoe_black_handle", () -> new DyedHoe(ItemTier.WOOD, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_HOE_BLACK_HANDLE = ITEMS.register("stone_hoe_black_handle", () -> new DyedHoe(ItemTier.STONE, -2.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_HOE_BLACK_HANDLE = ITEMS.register("iron_hoe_black_handle", () -> new DyedHoe(ItemTier.IRON, -1.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_HOE_BLACK_HANDLE = ITEMS.register("golden_hoe_black_handle", () -> new DyedHoe(ItemTier.GOLD, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_HOE_BLACK_HANDLE = ITEMS.register("diamond_hoe_black_handle", () -> new DyedHoe(ItemTier.DIAMOND, 0.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> WOODEN_PICKAXE_BLACK_HANDLE = ITEMS.register("wooden_pickaxe_black_handle", () -> new DyedPickaxe(ItemTier.WOOD, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_PICKAXE_BLACK_HANDLE = ITEMS.register("stone_pickaxe_black_handle", () -> new DyedPickaxe(ItemTier.STONE, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_PICKAXE_BLACK_HANDLE = ITEMS.register("iron_pickaxe_black_handle", () -> new DyedPickaxe(ItemTier.IRON, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_PICKAXE_BLACK_HANDLE = ITEMS.register("golden_pickaxe_black_handle", () -> new DyedPickaxe(ItemTier.GOLD, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_PICKAXE_BLACK_HANDLE = ITEMS.register("diamond_pickaxe_black_handle", () -> new DyedPickaxe(ItemTier.DIAMOND, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> WOODEN_SHOVEL_BLACK_HANDLE = ITEMS.register("wooden_shovel_black_handle", () -> new DyedShovel(ItemTier.WOOD, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_SHOVEL_BLACK_HANDLE = ITEMS.register("stone_shovel_black_handle", () -> new DyedShovel(ItemTier.STONE, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_SHOVEL_BLACK_HANDLE = ITEMS.register("iron_shovel_black_handle", () -> new DyedShovel(ItemTier.IRON, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_SHOVEL_BLACK_HANDLE = ITEMS.register("golden_shovel_black_handle", () -> new DyedShovel(ItemTier.GOLD, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_SHOVEL_BLACK_HANDLE = ITEMS.register("diamond_shovel_black_handle", () -> new DyedShovel(ItemTier.DIAMOND, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> WOODEN_SWORD_BLACK_HANDLE = ITEMS.register("wooden_sword_black_handle", () -> new DyedSword(ItemTier.WOOD, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_SWORD_BLACK_HANDLE = ITEMS.register("stone_sword_black_handle", () -> new DyedSword(ItemTier.STONE, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_SWORD_BLACK_HANDLE = ITEMS.register("iron_sword_black_handle", () -> new DyedSword(ItemTier.IRON, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_SWORD_BLACK_HANDLE = ITEMS.register("golden_sword_black_handle", () -> new DyedSword(ItemTier.GOLD, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_SWORD_BLACK_HANDLE = ITEMS.register("diamond_sword_black_handle", () -> new DyedSword(ItemTier.DIAMOND, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));

    // Blue
    public static final RegistryObject<Item> BLUE_STICK= ITEMS.register("blue_stick", DyedStickItem::new);
    public static final RegistryObject<Item> WOODEN_AXE_BLUE_HANDLE = ITEMS.register("wooden_axe_blue_handle", () -> new DyedAxe(ItemTier.WOOD, 6.0F, -3.2F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_AXE_BLUE_HANDLE = ITEMS.register("stone_axe_blue_handle", () -> new DyedAxe(ItemTier.STONE, 7.0F, -3.2F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_AXE_BLUE_HANDLE = ITEMS.register("iron_axe_blue_handle", () -> new DyedAxe(ItemTier.IRON, 6.0F, -3.1F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_AXE_BLUE_HANDLE = ITEMS.register("golden_axe_blue_handle", () -> new DyedAxe(ItemTier.GOLD, 6.0F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_AXE_BLUE_HANDLE = ITEMS.register("diamond_axe_blue_handle", () -> new DyedAxe(ItemTier.DIAMOND, 5.0F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> WOODEN_HOE_BLUE_HANDLE = ITEMS.register("wooden_hoe_blue_handle", () -> new DyedHoe(ItemTier.WOOD, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_HOE_BLUE_HANDLE = ITEMS.register("stone_hoe_blue_handle", () -> new DyedHoe(ItemTier.STONE, -2.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_HOE_BLUE_HANDLE = ITEMS.register("iron_hoe_blue_handle", () -> new DyedHoe(ItemTier.IRON, -1.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_HOE_BLUE_HANDLE = ITEMS.register("golden_hoe_blue_handle", () -> new DyedHoe(ItemTier.GOLD, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_HOE_BLUE_HANDLE = ITEMS.register("diamond_hoe_blue_handle", () -> new DyedHoe(ItemTier.DIAMOND, 0.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> WOODEN_PICKAXE_BLUE_HANDLE = ITEMS.register("wooden_pickaxe_blue_handle", () -> new DyedPickaxe(ItemTier.WOOD, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_PICKAXE_BLUE_HANDLE = ITEMS.register("stone_pickaxe_blue_handle", () -> new DyedPickaxe(ItemTier.STONE, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_PICKAXE_BLUE_HANDLE = ITEMS.register("iron_pickaxe_blue_handle", () -> new DyedPickaxe(ItemTier.IRON, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_PICKAXE_BLUE_HANDLE = ITEMS.register("golden_pickaxe_blue_handle", () -> new DyedPickaxe(ItemTier.GOLD, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_PICKAXE_BLUE_HANDLE = ITEMS.register("diamond_pickaxe_blue_handle", () -> new DyedPickaxe(ItemTier.DIAMOND, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> WOODEN_SHOVEL_BLUE_HANDLE = ITEMS.register("wooden_shovel_blue_handle", () -> new DyedShovel(ItemTier.WOOD, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_SHOVEL_BLUE_HANDLE = ITEMS.register("stone_shovel_blue_handle", () -> new DyedShovel(ItemTier.STONE, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_SHOVEL_BLUE_HANDLE = ITEMS.register("iron_shovel_blue_handle", () -> new DyedShovel(ItemTier.IRON, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_SHOVEL_BLUE_HANDLE = ITEMS.register("golden_shovel_blue_handle", () -> new DyedShovel(ItemTier.GOLD, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_SHOVEL_BLUE_HANDLE = ITEMS.register("diamond_shovel_blue_handle", () -> new DyedShovel(ItemTier.DIAMOND, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> WOODEN_SWORD_BLUE_HANDLE = ITEMS.register("wooden_sword_blue_handle", () -> new DyedSword(ItemTier.WOOD, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_SWORD_BLUE_HANDLE = ITEMS.register("stone_sword_blue_handle", () -> new DyedSword(ItemTier.STONE, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_SWORD_BLUE_HANDLE = ITEMS.register("iron_sword_blue_handle", () -> new DyedSword(ItemTier.IRON, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_SWORD_BLUE_HANDLE = ITEMS.register("golden_sword_blue_handle", () -> new DyedSword(ItemTier.GOLD, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_SWORD_BLUE_HANDLE = ITEMS.register("diamond_sword_blue_handle", () -> new DyedSword(ItemTier.DIAMOND, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));

    // Brown
    public static final RegistryObject<Item> BROWN_STICK= ITEMS.register("brown_stick", DyedStickItem::new);
    public static final RegistryObject<Item> WOODEN_AXE_BROWN_HANDLE = ITEMS.register("wooden_axe_brown_handle", () -> new DyedAxe(ItemTier.WOOD, 6.0F, -3.2F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_AXE_BROWN_HANDLE = ITEMS.register("stone_axe_brown_handle", () -> new DyedAxe(ItemTier.STONE, 7.0F, -3.2F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_AXE_BROWN_HANDLE = ITEMS.register("iron_axe_brown_handle", () -> new DyedAxe(ItemTier.IRON, 6.0F, -3.1F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_AXE_BROWN_HANDLE = ITEMS.register("golden_axe_brown_handle", () -> new DyedAxe(ItemTier.GOLD, 6.0F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_AXE_BROWN_HANDLE = ITEMS.register("diamond_axe_brown_handle", () -> new DyedAxe(ItemTier.DIAMOND, 5.0F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> WOODEN_HOE_BROWN_HANDLE = ITEMS.register("wooden_hoe_brown_handle", () -> new DyedHoe(ItemTier.WOOD, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_HOE_BROWN_HANDLE = ITEMS.register("stone_hoe_brown_handle", () -> new DyedHoe(ItemTier.STONE, -2.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_HOE_BROWN_HANDLE = ITEMS.register("iron_hoe_brown_handle", () -> new DyedHoe(ItemTier.IRON, -1.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_HOE_BROWN_HANDLE = ITEMS.register("golden_hoe_brown_handle", () -> new DyedHoe(ItemTier.GOLD, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_HOE_BROWN_HANDLE = ITEMS.register("diamond_hoe_brown_handle", () -> new DyedHoe(ItemTier.DIAMOND, 0.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> WOODEN_PICKAXE_BROWN_HANDLE = ITEMS.register("wooden_pickaxe_brown_handle", () -> new DyedPickaxe(ItemTier.WOOD, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_PICKAXE_BROWN_HANDLE = ITEMS.register("stone_pickaxe_brown_handle", () -> new DyedPickaxe(ItemTier.STONE, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_PICKAXE_BROWN_HANDLE = ITEMS.register("iron_pickaxe_brown_handle", () -> new DyedPickaxe(ItemTier.IRON, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_PICKAXE_BROWN_HANDLE = ITEMS.register("golden_pickaxe_brown_handle", () -> new DyedPickaxe(ItemTier.GOLD, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_PICKAXE_BROWN_HANDLE = ITEMS.register("diamond_pickaxe_brown_handle", () -> new DyedPickaxe(ItemTier.DIAMOND, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> WOODEN_SHOVEL_BROWN_HANDLE = ITEMS.register("wooden_shovel_brown_handle", () -> new DyedShovel(ItemTier.WOOD, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_SHOVEL_BROWN_HANDLE = ITEMS.register("stone_shovel_brown_handle", () -> new DyedShovel(ItemTier.STONE, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_SHOVEL_BROWN_HANDLE = ITEMS.register("iron_shovel_brown_handle", () -> new DyedShovel(ItemTier.IRON, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_SHOVEL_BROWN_HANDLE = ITEMS.register("golden_shovel_brown_handle", () -> new DyedShovel(ItemTier.GOLD, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_SHOVEL_BROWN_HANDLE = ITEMS.register("diamond_shovel_brown_handle", () -> new DyedShovel(ItemTier.DIAMOND, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> WOODEN_SWORD_BROWN_HANDLE = ITEMS.register("wooden_sword_brown_handle", () -> new DyedSword(ItemTier.WOOD, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_SWORD_BROWN_HANDLE = ITEMS.register("stone_sword_brown_handle", () -> new DyedSword(ItemTier.STONE, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_SWORD_BROWN_HANDLE = ITEMS.register("iron_sword_brown_handle", () -> new DyedSword(ItemTier.IRON, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_SWORD_BROWN_HANDLE = ITEMS.register("golden_sword_brown_handle", () -> new DyedSword(ItemTier.GOLD, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_SWORD_BROWN_HANDLE = ITEMS.register("diamond_sword_brown_handle", () -> new DyedSword(ItemTier.DIAMOND, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));

    // Cyan
    public static final RegistryObject<Item> CYAN_STICK= ITEMS.register("cyan_stick", DyedStickItem::new);
    public static final RegistryObject<Item> WOODEN_AXE_CYAN_HANDLE = ITEMS.register("wooden_axe_cyan_handle", () -> new DyedAxe(ItemTier.WOOD, 6.0F, -3.2F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_AXE_CYAN_HANDLE = ITEMS.register("stone_axe_cyan_handle", () -> new DyedAxe(ItemTier.STONE, 7.0F, -3.2F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_AXE_CYAN_HANDLE = ITEMS.register("iron_axe_cyan_handle", () -> new DyedAxe(ItemTier.IRON, 6.0F, -3.1F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_AXE_CYAN_HANDLE = ITEMS.register("golden_axe_cyan_handle", () -> new DyedAxe(ItemTier.GOLD, 6.0F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_AXE_CYAN_HANDLE = ITEMS.register("diamond_axe_cyan_handle", () -> new DyedAxe(ItemTier.DIAMOND, 5.0F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> WOODEN_HOE_CYAN_HANDLE = ITEMS.register("wooden_hoe_cyan_handle", () -> new DyedHoe(ItemTier.WOOD, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_HOE_CYAN_HANDLE = ITEMS.register("stone_hoe_cyan_handle", () -> new DyedHoe(ItemTier.STONE, -2.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_HOE_CYAN_HANDLE = ITEMS.register("iron_hoe_cyan_handle", () -> new DyedHoe(ItemTier.IRON, -1.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_HOE_CYAN_HANDLE = ITEMS.register("golden_hoe_cyan_handle", () -> new DyedHoe(ItemTier.GOLD, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_HOE_CYAN_HANDLE = ITEMS.register("diamond_hoe_cyan_handle", () -> new DyedHoe(ItemTier.DIAMOND, 0.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> WOODEN_PICKAXE_CYAN_HANDLE = ITEMS.register("wooden_pickaxe_cyan_handle", () -> new DyedPickaxe(ItemTier.WOOD, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_PICKAXE_CYAN_HANDLE = ITEMS.register("stone_pickaxe_cyan_handle", () -> new DyedPickaxe(ItemTier.STONE, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_PICKAXE_CYAN_HANDLE = ITEMS.register("iron_pickaxe_cyan_handle", () -> new DyedPickaxe(ItemTier.IRON, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_PICKAXE_CYAN_HANDLE = ITEMS.register("golden_pickaxe_cyan_handle", () -> new DyedPickaxe(ItemTier.GOLD, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_PICKAXE_CYAN_HANDLE = ITEMS.register("diamond_pickaxe_cyan_handle", () -> new DyedPickaxe(ItemTier.DIAMOND, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> WOODEN_SHOVEL_CYAN_HANDLE = ITEMS.register("wooden_shovel_cyan_handle", () -> new DyedShovel(ItemTier.WOOD, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_SHOVEL_CYAN_HANDLE = ITEMS.register("stone_shovel_cyan_handle", () -> new DyedShovel(ItemTier.STONE, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_SHOVEL_CYAN_HANDLE = ITEMS.register("iron_shovel_cyan_handle", () -> new DyedShovel(ItemTier.IRON, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_SHOVEL_CYAN_HANDLE = ITEMS.register("golden_shovel_cyan_handle", () -> new DyedShovel(ItemTier.GOLD, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_SHOVEL_CYAN_HANDLE = ITEMS.register("diamond_shovel_cyan_handle", () -> new DyedShovel(ItemTier.DIAMOND, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> WOODEN_SWORD_CYAN_HANDLE = ITEMS.register("wooden_sword_cyan_handle", () -> new DyedSword(ItemTier.WOOD, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_SWORD_CYAN_HANDLE = ITEMS.register("stone_sword_cyan_handle", () -> new DyedSword(ItemTier.STONE, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_SWORD_CYAN_HANDLE = ITEMS.register("iron_sword_cyan_handle", () -> new DyedSword(ItemTier.IRON, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_SWORD_CYAN_HANDLE = ITEMS.register("golden_sword_cyan_handle", () -> new DyedSword(ItemTier.GOLD, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_SWORD_CYAN_HANDLE = ITEMS.register("diamond_sword_cyan_handle", () -> new DyedSword(ItemTier.DIAMOND, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));

    // Gray
    public static final RegistryObject<Item> GRAY_STICK= ITEMS.register("gray_stick", DyedStickItem::new);
    public static final RegistryObject<Item> WOODEN_AXE_GRAY_HANDLE = ITEMS.register("wooden_axe_gray_handle", () -> new DyedAxe(ItemTier.WOOD, 6.0F, -3.2F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_AXE_GRAY_HANDLE = ITEMS.register("stone_axe_gray_handle", () -> new DyedAxe(ItemTier.STONE, 7.0F, -3.2F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_AXE_GRAY_HANDLE = ITEMS.register("iron_axe_gray_handle", () -> new DyedAxe(ItemTier.IRON, 6.0F, -3.1F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_AXE_GRAY_HANDLE = ITEMS.register("golden_axe_gray_handle", () -> new DyedAxe(ItemTier.GOLD, 6.0F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_AXE_GRAY_HANDLE = ITEMS.register("diamond_axe_gray_handle", () -> new DyedAxe(ItemTier.DIAMOND, 5.0F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> WOODEN_HOE_GRAY_HANDLE = ITEMS.register("wooden_hoe_gray_handle", () -> new DyedHoe(ItemTier.WOOD, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_HOE_GRAY_HANDLE = ITEMS.register("stone_hoe_gray_handle", () -> new DyedHoe(ItemTier.STONE, -2.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_HOE_GRAY_HANDLE = ITEMS.register("iron_hoe_gray_handle", () -> new DyedHoe(ItemTier.IRON, -1.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_HOE_GRAY_HANDLE = ITEMS.register("golden_hoe_gray_handle", () -> new DyedHoe(ItemTier.GOLD, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_HOE_GRAY_HANDLE = ITEMS.register("diamond_hoe_gray_handle", () -> new DyedHoe(ItemTier.DIAMOND, 0.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> WOODEN_PICKAXE_GRAY_HANDLE = ITEMS.register("wooden_pickaxe_gray_handle", () -> new DyedPickaxe(ItemTier.WOOD, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_PICKAXE_GRAY_HANDLE = ITEMS.register("stone_pickaxe_gray_handle", () -> new DyedPickaxe(ItemTier.STONE, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_PICKAXE_GRAY_HANDLE = ITEMS.register("iron_pickaxe_gray_handle", () -> new DyedPickaxe(ItemTier.IRON, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_PICKAXE_GRAY_HANDLE = ITEMS.register("golden_pickaxe_gray_handle", () -> new DyedPickaxe(ItemTier.GOLD, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_PICKAXE_GRAY_HANDLE = ITEMS.register("diamond_pickaxe_gray_handle", () -> new DyedPickaxe(ItemTier.DIAMOND, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> WOODEN_SHOVEL_GRAY_HANDLE = ITEMS.register("wooden_shovel_gray_handle", () -> new DyedShovel(ItemTier.WOOD, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_SHOVEL_GRAY_HANDLE = ITEMS.register("stone_shovel_gray_handle", () -> new DyedShovel(ItemTier.STONE, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_SHOVEL_GRAY_HANDLE = ITEMS.register("iron_shovel_gray_handle", () -> new DyedShovel(ItemTier.IRON, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_SHOVEL_GRAY_HANDLE = ITEMS.register("golden_shovel_gray_handle", () -> new DyedShovel(ItemTier.GOLD, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_SHOVEL_GRAY_HANDLE = ITEMS.register("diamond_shovel_gray_handle", () -> new DyedShovel(ItemTier.DIAMOND, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> WOODEN_SWORD_GRAY_HANDLE = ITEMS.register("wooden_sword_gray_handle", () -> new DyedSword(ItemTier.WOOD, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_SWORD_GRAY_HANDLE = ITEMS.register("stone_sword_gray_handle", () -> new DyedSword(ItemTier.STONE, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_SWORD_GRAY_HANDLE = ITEMS.register("iron_sword_gray_handle", () -> new DyedSword(ItemTier.IRON, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_SWORD_GRAY_HANDLE = ITEMS.register("golden_sword_gray_handle", () -> new DyedSword(ItemTier.GOLD, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_SWORD_GRAY_HANDLE = ITEMS.register("diamond_sword_gray_handle", () -> new DyedSword(ItemTier.DIAMOND, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));

    // Green
    public static final RegistryObject<Item> GREEN_STICK= ITEMS.register("green_stick", DyedStickItem::new);
    public static final RegistryObject<Item> WOODEN_AXE_GREEN_HANDLE = ITEMS.register("wooden_axe_green_handle", () -> new DyedAxe(ItemTier.WOOD, 6.0F, -3.2F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_AXE_GREEN_HANDLE = ITEMS.register("stone_axe_green_handle", () -> new DyedAxe(ItemTier.STONE, 7.0F, -3.2F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_AXE_GREEN_HANDLE = ITEMS.register("iron_axe_green_handle", () -> new DyedAxe(ItemTier.IRON, 6.0F, -3.1F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_AXE_GREEN_HANDLE = ITEMS.register("golden_axe_green_handle", () -> new DyedAxe(ItemTier.GOLD, 6.0F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_AXE_GREEN_HANDLE = ITEMS.register("diamond_axe_green_handle", () -> new DyedAxe(ItemTier.DIAMOND, 5.0F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> WOODEN_HOE_GREEN_HANDLE = ITEMS.register("wooden_hoe_green_handle", () -> new DyedHoe(ItemTier.WOOD, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_HOE_GREEN_HANDLE = ITEMS.register("stone_hoe_green_handle", () -> new DyedHoe(ItemTier.STONE, -2.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_HOE_GREEN_HANDLE = ITEMS.register("iron_hoe_green_handle", () -> new DyedHoe(ItemTier.IRON, -1.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_HOE_GREEN_HANDLE = ITEMS.register("golden_hoe_green_handle", () -> new DyedHoe(ItemTier.GOLD, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_HOE_GREEN_HANDLE = ITEMS.register("diamond_hoe_green_handle", () -> new DyedHoe(ItemTier.DIAMOND, 0.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> WOODEN_PICKAXE_GREEN_HANDLE = ITEMS.register("wooden_pickaxe_green_handle", () -> new DyedPickaxe(ItemTier.WOOD, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_PICKAXE_GREEN_HANDLE = ITEMS.register("stone_pickaxe_green_handle", () -> new DyedPickaxe(ItemTier.STONE, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_PICKAXE_GREEN_HANDLE = ITEMS.register("iron_pickaxe_green_handle", () -> new DyedPickaxe(ItemTier.IRON, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_PICKAXE_GREEN_HANDLE = ITEMS.register("golden_pickaxe_green_handle", () -> new DyedPickaxe(ItemTier.GOLD, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_PICKAXE_GREEN_HANDLE = ITEMS.register("diamond_pickaxe_green_handle", () -> new DyedPickaxe(ItemTier.DIAMOND, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> WOODEN_SHOVEL_GREEN_HANDLE = ITEMS.register("wooden_shovel_green_handle", () -> new DyedShovel(ItemTier.WOOD, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_SHOVEL_GREEN_HANDLE = ITEMS.register("stone_shovel_green_handle", () -> new DyedShovel(ItemTier.STONE, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_SHOVEL_GREEN_HANDLE = ITEMS.register("iron_shovel_green_handle", () -> new DyedShovel(ItemTier.IRON, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_SHOVEL_GREEN_HANDLE = ITEMS.register("golden_shovel_green_handle", () -> new DyedShovel(ItemTier.GOLD, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_SHOVEL_GREEN_HANDLE = ITEMS.register("diamond_shovel_green_handle", () -> new DyedShovel(ItemTier.DIAMOND, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> WOODEN_SWORD_GREEN_HANDLE = ITEMS.register("wooden_sword_green_handle", () -> new DyedSword(ItemTier.WOOD, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_SWORD_GREEN_HANDLE = ITEMS.register("stone_sword_green_handle", () -> new DyedSword(ItemTier.STONE, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_SWORD_GREEN_HANDLE = ITEMS.register("iron_sword_green_handle", () -> new DyedSword(ItemTier.IRON, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_SWORD_GREEN_HANDLE = ITEMS.register("golden_sword_green_handle", () -> new DyedSword(ItemTier.GOLD, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_SWORD_GREEN_HANDLE = ITEMS.register("diamond_sword_green_handle", () -> new DyedSword(ItemTier.DIAMOND, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));

    // Light Blue
    public static final RegistryObject<Item> LIGHT_BLUE_STICK= ITEMS.register("light_blue_stick", DyedStickItem::new);
    public static final RegistryObject<Item> WOODEN_AXE_LIGHT_BLUE_HANDLE = ITEMS.register("wooden_axe_light_blue_handle", () -> new DyedAxe(ItemTier.WOOD, 6.0F, -3.2F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_AXE_LIGHT_BLUE_HANDLE = ITEMS.register("stone_axe_light_blue_handle", () -> new DyedAxe(ItemTier.STONE, 7.0F, -3.2F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_AXE_LIGHT_BLUE_HANDLE = ITEMS.register("iron_axe_light_blue_handle", () -> new DyedAxe(ItemTier.IRON, 6.0F, -3.1F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_AXE_LIGHT_BLUE_HANDLE = ITEMS.register("golden_axe_light_blue_handle", () -> new DyedAxe(ItemTier.GOLD, 6.0F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_AXE_LIGHT_BLUE_HANDLE = ITEMS.register("diamond_axe_light_blue_handle", () -> new DyedAxe(ItemTier.DIAMOND, 5.0F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> WOODEN_HOE_LIGHT_BLUE_HANDLE = ITEMS.register("wooden_hoe_light_blue_handle", () -> new DyedHoe(ItemTier.WOOD, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_HOE_LIGHT_BLUE_HANDLE = ITEMS.register("stone_hoe_light_blue_handle", () -> new DyedHoe(ItemTier.STONE, -2.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_HOE_LIGHT_BLUE_HANDLE = ITEMS.register("iron_hoe_light_blue_handle", () -> new DyedHoe(ItemTier.IRON, -1.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_HOE_LIGHT_BLUE_HANDLE = ITEMS.register("golden_hoe_light_blue_handle", () -> new DyedHoe(ItemTier.GOLD, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_HOE_LIGHT_BLUE_HANDLE = ITEMS.register("diamond_hoe_light_blue_handle", () -> new DyedHoe(ItemTier.DIAMOND, 0.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> WOODEN_PICKAXE_LIGHT_BLUE_HANDLE = ITEMS.register("wooden_pickaxe_light_blue_handle", () -> new DyedPickaxe(ItemTier.WOOD, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_PICKAXE_LIGHT_BLUE_HANDLE = ITEMS.register("stone_pickaxe_light_blue_handle", () -> new DyedPickaxe(ItemTier.STONE, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_PICKAXE_LIGHT_BLUE_HANDLE = ITEMS.register("iron_pickaxe_light_blue_handle", () -> new DyedPickaxe(ItemTier.IRON, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_PICKAXE_LIGHT_BLUE_HANDLE = ITEMS.register("golden_pickaxe_light_blue_handle", () -> new DyedPickaxe(ItemTier.GOLD, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_PICKAXE_LIGHT_BLUE_HANDLE = ITEMS.register("diamond_pickaxe_light_blue_handle", () -> new DyedPickaxe(ItemTier.DIAMOND, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> WOODEN_SHOVEL_LIGHT_BLUE_HANDLE = ITEMS.register("wooden_shovel_light_blue_handle", () -> new DyedShovel(ItemTier.WOOD, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_SHOVEL_LIGHT_BLUE_HANDLE = ITEMS.register("stone_shovel_light_blue_handle", () -> new DyedShovel(ItemTier.STONE, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_SHOVEL_LIGHT_BLUE_HANDLE = ITEMS.register("iron_shovel_light_blue_handle", () -> new DyedShovel(ItemTier.IRON, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_SHOVEL_LIGHT_BLUE_HANDLE = ITEMS.register("golden_shovel_light_blue_handle", () -> new DyedShovel(ItemTier.GOLD, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_SHOVEL_LIGHT_BLUE_HANDLE = ITEMS.register("diamond_shovel_light_blue_handle", () -> new DyedShovel(ItemTier.DIAMOND, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> WOODEN_SWORD_LIGHT_BLUE_HANDLE = ITEMS.register("wooden_sword_light_blue_handle", () -> new DyedSword(ItemTier.WOOD, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_SWORD_LIGHT_BLUE_HANDLE = ITEMS.register("stone_sword_light_blue_handle", () -> new DyedSword(ItemTier.STONE, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_SWORD_LIGHT_BLUE_HANDLE = ITEMS.register("iron_sword_light_blue_handle", () -> new DyedSword(ItemTier.IRON, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_SWORD_LIGHT_BLUE_HANDLE = ITEMS.register("golden_sword_light_blue_handle", () -> new DyedSword(ItemTier.GOLD, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_SWORD_LIGHT_BLUE_HANDLE = ITEMS.register("diamond_sword_light_blue_handle", () -> new DyedSword(ItemTier.DIAMOND, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));

    // Light Gray
    public static final RegistryObject<Item> LIGHT_GRAY_STICK= ITEMS.register("light_gray_stick", DyedStickItem::new);
    public static final RegistryObject<Item> WOODEN_AXE_LIGHT_GRAY_HANDLE = ITEMS.register("wooden_axe_light_gray_handle", () -> new DyedAxe(ItemTier.WOOD, 6.0F, -3.2F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_AXE_LIGHT_GRAY_HANDLE = ITEMS.register("stone_axe_light_gray_handle", () -> new DyedAxe(ItemTier.STONE, 7.0F, -3.2F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_AXE_LIGHT_GRAY_HANDLE = ITEMS.register("iron_axe_light_gray_handle", () -> new DyedAxe(ItemTier.IRON, 6.0F, -3.1F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_AXE_LIGHT_GRAY_HANDLE = ITEMS.register("golden_axe_light_gray_handle", () -> new DyedAxe(ItemTier.GOLD, 6.0F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_AXE_LIGHT_GRAY_HANDLE = ITEMS.register("diamond_axe_light_gray_handle", () -> new DyedAxe(ItemTier.DIAMOND, 5.0F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> WOODEN_HOE_LIGHT_GRAY_HANDLE = ITEMS.register("wooden_hoe_light_gray_handle", () -> new DyedHoe(ItemTier.WOOD, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_HOE_LIGHT_GRAY_HANDLE = ITEMS.register("stone_hoe_light_gray_handle", () -> new DyedHoe(ItemTier.STONE, -2.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_HOE_LIGHT_GRAY_HANDLE = ITEMS.register("iron_hoe_light_gray_handle", () -> new DyedHoe(ItemTier.IRON, -1.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_HOE_LIGHT_GRAY_HANDLE = ITEMS.register("golden_hoe_light_gray_handle", () -> new DyedHoe(ItemTier.GOLD, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_HOE_LIGHT_GRAY_HANDLE = ITEMS.register("diamond_hoe_light_gray_handle", () -> new DyedHoe(ItemTier.DIAMOND, 0.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> WOODEN_PICKAXE_LIGHT_GRAY_HANDLE = ITEMS.register("wooden_pickaxe_light_gray_handle", () -> new DyedPickaxe(ItemTier.WOOD, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_PICKAXE_LIGHT_GRAY_HANDLE = ITEMS.register("stone_pickaxe_light_gray_handle", () -> new DyedPickaxe(ItemTier.STONE, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_PICKAXE_LIGHT_GRAY_HANDLE = ITEMS.register("iron_pickaxe_light_gray_handle", () -> new DyedPickaxe(ItemTier.IRON, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_PICKAXE_LIGHT_GRAY_HANDLE = ITEMS.register("golden_pickaxe_light_gray_handle", () -> new DyedPickaxe(ItemTier.GOLD, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_PICKAXE_LIGHT_GRAY_HANDLE = ITEMS.register("diamond_pickaxe_light_gray_handle", () -> new DyedPickaxe(ItemTier.DIAMOND, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> WOODEN_SHOVEL_LIGHT_GRAY_HANDLE = ITEMS.register("wooden_shovel_light_gray_handle", () -> new DyedShovel(ItemTier.WOOD, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_SHOVEL_LIGHT_GRAY_HANDLE = ITEMS.register("stone_shovel_light_gray_handle", () -> new DyedShovel(ItemTier.STONE, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_SHOVEL_LIGHT_GRAY_HANDLE = ITEMS.register("iron_shovel_light_gray_handle", () -> new DyedShovel(ItemTier.IRON, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_SHOVEL_LIGHT_GRAY_HANDLE = ITEMS.register("golden_shovel_light_gray_handle", () -> new DyedShovel(ItemTier.GOLD, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_SHOVEL_LIGHT_GRAY_HANDLE = ITEMS.register("diamond_shovel_light_gray_handle", () -> new DyedShovel(ItemTier.DIAMOND, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> WOODEN_SWORD_LIGHT_GRAY_HANDLE = ITEMS.register("wooden_sword_light_gray_handle", () -> new DyedSword(ItemTier.WOOD, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_SWORD_LIGHT_GRAY_HANDLE = ITEMS.register("stone_sword_light_gray_handle", () -> new DyedSword(ItemTier.STONE, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_SWORD_LIGHT_GRAY_HANDLE = ITEMS.register("iron_sword_light_gray_handle", () -> new DyedSword(ItemTier.IRON, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_SWORD_LIGHT_GRAY_HANDLE = ITEMS.register("golden_sword_light_gray_handle", () -> new DyedSword(ItemTier.GOLD, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_SWORD_LIGHT_GRAY_HANDLE = ITEMS.register("diamond_sword_light_gray_handle", () -> new DyedSword(ItemTier.DIAMOND, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));

    // Lime
    public static final RegistryObject<Item> LIME_STICK= ITEMS.register("lime_stick", DyedStickItem::new);
    public static final RegistryObject<Item> WOODEN_AXE_LIME_HANDLE = ITEMS.register("wooden_axe_lime_handle", () -> new DyedAxe(ItemTier.WOOD, 6.0F, -3.2F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_AXE_LIME_HANDLE = ITEMS.register("stone_axe_lime_handle", () -> new DyedAxe(ItemTier.STONE, 7.0F, -3.2F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_AXE_LIME_HANDLE = ITEMS.register("iron_axe_lime_handle", () -> new DyedAxe(ItemTier.IRON, 6.0F, -3.1F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_AXE_LIME_HANDLE = ITEMS.register("golden_axe_lime_handle", () -> new DyedAxe(ItemTier.GOLD, 6.0F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_AXE_LIME_HANDLE = ITEMS.register("diamond_axe_lime_handle", () -> new DyedAxe(ItemTier.DIAMOND, 5.0F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> WOODEN_HOE_LIME_HANDLE = ITEMS.register("wooden_hoe_lime_handle", () -> new DyedHoe(ItemTier.WOOD, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_HOE_LIME_HANDLE = ITEMS.register("stone_hoe_lime_handle", () -> new DyedHoe(ItemTier.STONE, -2.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_HOE_LIME_HANDLE = ITEMS.register("iron_hoe_lime_handle", () -> new DyedHoe(ItemTier.IRON, -1.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_HOE_LIME_HANDLE = ITEMS.register("golden_hoe_lime_handle", () -> new DyedHoe(ItemTier.GOLD, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_HOE_LIME_HANDLE = ITEMS.register("diamond_hoe_lime_handle", () -> new DyedHoe(ItemTier.DIAMOND, 0.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> WOODEN_PICKAXE_LIME_HANDLE = ITEMS.register("wooden_pickaxe_lime_handle", () -> new DyedPickaxe(ItemTier.WOOD, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_PICKAXE_LIME_HANDLE = ITEMS.register("stone_pickaxe_lime_handle", () -> new DyedPickaxe(ItemTier.STONE, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_PICKAXE_LIME_HANDLE = ITEMS.register("iron_pickaxe_lime_handle", () -> new DyedPickaxe(ItemTier.IRON, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_PICKAXE_LIME_HANDLE = ITEMS.register("golden_pickaxe_lime_handle", () -> new DyedPickaxe(ItemTier.GOLD, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_PICKAXE_LIME_HANDLE = ITEMS.register("diamond_pickaxe_lime_handle", () -> new DyedPickaxe(ItemTier.DIAMOND, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> WOODEN_SHOVEL_LIME_HANDLE = ITEMS.register("wooden_shovel_lime_handle", () -> new DyedShovel(ItemTier.WOOD, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_SHOVEL_LIME_HANDLE = ITEMS.register("stone_shovel_lime_handle", () -> new DyedShovel(ItemTier.STONE, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_SHOVEL_LIME_HANDLE = ITEMS.register("iron_shovel_lime_handle", () -> new DyedShovel(ItemTier.IRON, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_SHOVEL_LIME_HANDLE = ITEMS.register("golden_shovel_lime_handle", () -> new DyedShovel(ItemTier.GOLD, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_SHOVEL_LIME_HANDLE = ITEMS.register("diamond_shovel_lime_handle", () -> new DyedShovel(ItemTier.DIAMOND, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> WOODEN_SWORD_LIME_HANDLE = ITEMS.register("wooden_sword_lime_handle", () -> new DyedSword(ItemTier.WOOD, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_SWORD_LIME_HANDLE = ITEMS.register("stone_sword_lime_handle", () -> new DyedSword(ItemTier.STONE, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_SWORD_LIME_HANDLE = ITEMS.register("iron_sword_lime_handle", () -> new DyedSword(ItemTier.IRON, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_SWORD_LIME_HANDLE = ITEMS.register("golden_sword_lime_handle", () -> new DyedSword(ItemTier.GOLD, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_SWORD_LIME_HANDLE = ITEMS.register("diamond_sword_lime_handle", () -> new DyedSword(ItemTier.DIAMOND, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));

    // Magenta
    public static final RegistryObject<Item> MAGENTA_STICK= ITEMS.register("magenta_stick", DyedStickItem::new);
    public static final RegistryObject<Item> WOODEN_AXE_MAGENTA_HANDLE = ITEMS.register("wooden_axe_magenta_handle", () -> new DyedAxe(ItemTier.WOOD, 6.0F, -3.2F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_AXE_MAGENTA_HANDLE = ITEMS.register("stone_axe_magenta_handle", () -> new DyedAxe(ItemTier.STONE, 7.0F, -3.2F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_AXE_MAGENTA_HANDLE = ITEMS.register("iron_axe_magenta_handle", () -> new DyedAxe(ItemTier.IRON, 6.0F, -3.1F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_AXE_MAGENTA_HANDLE = ITEMS.register("golden_axe_magenta_handle", () -> new DyedAxe(ItemTier.GOLD, 6.0F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_AXE_MAGENTA_HANDLE = ITEMS.register("diamond_axe_magenta_handle", () -> new DyedAxe(ItemTier.DIAMOND, 5.0F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> WOODEN_HOE_MAGENTA_HANDLE = ITEMS.register("wooden_hoe_magenta_handle", () -> new DyedHoe(ItemTier.WOOD, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_HOE_MAGENTA_HANDLE = ITEMS.register("stone_hoe_magenta_handle", () -> new DyedHoe(ItemTier.STONE, -2.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_HOE_MAGENTA_HANDLE = ITEMS.register("iron_hoe_magenta_handle", () -> new DyedHoe(ItemTier.IRON, -1.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_HOE_MAGENTA_HANDLE = ITEMS.register("golden_hoe_magenta_handle", () -> new DyedHoe(ItemTier.GOLD, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_HOE_MAGENTA_HANDLE = ITEMS.register("diamond_hoe_magenta_handle", () -> new DyedHoe(ItemTier.DIAMOND, 0.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> WOODEN_PICKAXE_MAGENTA_HANDLE = ITEMS.register("wooden_pickaxe_magenta_handle", () -> new DyedPickaxe(ItemTier.WOOD, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_PICKAXE_MAGENTA_HANDLE = ITEMS.register("stone_pickaxe_magenta_handle", () -> new DyedPickaxe(ItemTier.STONE, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_PICKAXE_MAGENTA_HANDLE = ITEMS.register("iron_pickaxe_magenta_handle", () -> new DyedPickaxe(ItemTier.IRON, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_PICKAXE_MAGENTA_HANDLE = ITEMS.register("golden_pickaxe_magenta_handle", () -> new DyedPickaxe(ItemTier.GOLD, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_PICKAXE_MAGENTA_HANDLE = ITEMS.register("diamond_pickaxe_magenta_handle", () -> new DyedPickaxe(ItemTier.DIAMOND, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> WOODEN_SHOVEL_MAGENTA_HANDLE = ITEMS.register("wooden_shovel_magenta_handle", () -> new DyedShovel(ItemTier.WOOD, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_SHOVEL_MAGENTA_HANDLE = ITEMS.register("stone_shovel_magenta_handle", () -> new DyedShovel(ItemTier.STONE, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_SHOVEL_MAGENTA_HANDLE = ITEMS.register("iron_shovel_magenta_handle", () -> new DyedShovel(ItemTier.IRON, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_SHOVEL_MAGENTA_HANDLE = ITEMS.register("golden_shovel_magenta_handle", () -> new DyedShovel(ItemTier.GOLD, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_SHOVEL_MAGENTA_HANDLE = ITEMS.register("diamond_shovel_magenta_handle", () -> new DyedShovel(ItemTier.DIAMOND, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> WOODEN_SWORD_MAGENTA_HANDLE = ITEMS.register("wooden_sword_magenta_handle", () -> new DyedSword(ItemTier.WOOD, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_SWORD_MAGENTA_HANDLE = ITEMS.register("stone_sword_magenta_handle", () -> new DyedSword(ItemTier.STONE, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_SWORD_MAGENTA_HANDLE = ITEMS.register("iron_sword_magenta_handle", () -> new DyedSword(ItemTier.IRON, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_SWORD_MAGENTA_HANDLE = ITEMS.register("golden_sword_magenta_handle", () -> new DyedSword(ItemTier.GOLD, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_SWORD_MAGENTA_HANDLE = ITEMS.register("diamond_sword_magenta_handle", () -> new DyedSword(ItemTier.DIAMOND, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));

    // Orange
    public static final RegistryObject<Item> ORANGE_STICK= ITEMS.register("orange_stick", DyedStickItem::new);
    public static final RegistryObject<Item> WOODEN_AXE_ORANGE_HANDLE = ITEMS.register("wooden_axe_orange_handle", () -> new DyedAxe(ItemTier.WOOD, 6.0F, -3.2F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_AXE_ORANGE_HANDLE = ITEMS.register("stone_axe_orange_handle", () -> new DyedAxe(ItemTier.STONE, 7.0F, -3.2F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_AXE_ORANGE_HANDLE = ITEMS.register("iron_axe_orange_handle", () -> new DyedAxe(ItemTier.IRON, 6.0F, -3.1F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_AXE_ORANGE_HANDLE = ITEMS.register("golden_axe_orange_handle", () -> new DyedAxe(ItemTier.GOLD, 6.0F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_AXE_ORANGE_HANDLE = ITEMS.register("diamond_axe_orange_handle", () -> new DyedAxe(ItemTier.DIAMOND, 5.0F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> WOODEN_HOE_ORANGE_HANDLE = ITEMS.register("wooden_hoe_orange_handle", () -> new DyedHoe(ItemTier.WOOD, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_HOE_ORANGE_HANDLE = ITEMS.register("stone_hoe_orange_handle", () -> new DyedHoe(ItemTier.STONE, -2.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_HOE_ORANGE_HANDLE = ITEMS.register("iron_hoe_orange_handle", () -> new DyedHoe(ItemTier.IRON, -1.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_HOE_ORANGE_HANDLE = ITEMS.register("golden_hoe_orange_handle", () -> new DyedHoe(ItemTier.GOLD, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_HOE_ORANGE_HANDLE = ITEMS.register("diamond_hoe_orange_handle", () -> new DyedHoe(ItemTier.DIAMOND, 0.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> WOODEN_PICKAXE_ORANGE_HANDLE = ITEMS.register("wooden_pickaxe_orange_handle", () -> new DyedPickaxe(ItemTier.WOOD, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_PICKAXE_ORANGE_HANDLE = ITEMS.register("stone_pickaxe_orange_handle", () -> new DyedPickaxe(ItemTier.STONE, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_PICKAXE_ORANGE_HANDLE = ITEMS.register("iron_pickaxe_orange_handle", () -> new DyedPickaxe(ItemTier.IRON, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_PICKAXE_ORANGE_HANDLE = ITEMS.register("golden_pickaxe_orange_handle", () -> new DyedPickaxe(ItemTier.GOLD, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_PICKAXE_ORANGE_HANDLE = ITEMS.register("diamond_pickaxe_orange_handle", () -> new DyedPickaxe(ItemTier.DIAMOND, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> WOODEN_SHOVEL_ORANGE_HANDLE = ITEMS.register("wooden_shovel_orange_handle", () -> new DyedShovel(ItemTier.WOOD, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_SHOVEL_ORANGE_HANDLE = ITEMS.register("stone_shovel_orange_handle", () -> new DyedShovel(ItemTier.STONE, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_SHOVEL_ORANGE_HANDLE = ITEMS.register("iron_shovel_orange_handle", () -> new DyedShovel(ItemTier.IRON, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_SHOVEL_ORANGE_HANDLE = ITEMS.register("golden_shovel_orange_handle", () -> new DyedShovel(ItemTier.GOLD, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_SHOVEL_ORANGE_HANDLE = ITEMS.register("diamond_shovel_orange_handle", () -> new DyedShovel(ItemTier.DIAMOND, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> WOODEN_SWORD_ORANGE_HANDLE = ITEMS.register("wooden_sword_orange_handle", () -> new DyedSword(ItemTier.WOOD, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_SWORD_ORANGE_HANDLE = ITEMS.register("stone_sword_orange_handle", () -> new DyedSword(ItemTier.STONE, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_SWORD_ORANGE_HANDLE = ITEMS.register("iron_sword_orange_handle", () -> new DyedSword(ItemTier.IRON, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_SWORD_ORANGE_HANDLE = ITEMS.register("golden_sword_orange_handle", () -> new DyedSword(ItemTier.GOLD, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_SWORD_ORANGE_HANDLE = ITEMS.register("diamond_sword_orange_handle", () -> new DyedSword(ItemTier.DIAMOND, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));

    // Pink
    public static final RegistryObject<Item> PINK_STICK= ITEMS.register("pink_stick", DyedStickItem::new);
    public static final RegistryObject<Item> WOODEN_AXE_PINK_HANDLE = ITEMS.register("wooden_axe_pink_handle", () -> new DyedAxe(ItemTier.WOOD, 6.0F, -3.2F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_AXE_PINK_HANDLE = ITEMS.register("stone_axe_pink_handle", () -> new DyedAxe(ItemTier.STONE, 7.0F, -3.2F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_AXE_PINK_HANDLE = ITEMS.register("iron_axe_pink_handle", () -> new DyedAxe(ItemTier.IRON, 6.0F, -3.1F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_AXE_PINK_HANDLE = ITEMS.register("golden_axe_pink_handle", () -> new DyedAxe(ItemTier.GOLD, 6.0F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_AXE_PINK_HANDLE = ITEMS.register("diamond_axe_pink_handle", () -> new DyedAxe(ItemTier.DIAMOND, 5.0F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> WOODEN_HOE_PINK_HANDLE = ITEMS.register("wooden_hoe_pink_handle", () -> new DyedHoe(ItemTier.WOOD, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_HOE_PINK_HANDLE = ITEMS.register("stone_hoe_pink_handle", () -> new DyedHoe(ItemTier.STONE, -2.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_HOE_PINK_HANDLE = ITEMS.register("iron_hoe_pink_handle", () -> new DyedHoe(ItemTier.IRON, -1.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_HOE_PINK_HANDLE = ITEMS.register("golden_hoe_pink_handle", () -> new DyedHoe(ItemTier.GOLD, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_HOE_PINK_HANDLE = ITEMS.register("diamond_hoe_pink_handle", () -> new DyedHoe(ItemTier.DIAMOND, 0.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> WOODEN_PICKAXE_PINK_HANDLE = ITEMS.register("wooden_pickaxe_pink_handle", () -> new DyedPickaxe(ItemTier.WOOD, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_PICKAXE_PINK_HANDLE = ITEMS.register("stone_pickaxe_pink_handle", () -> new DyedPickaxe(ItemTier.STONE, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_PICKAXE_PINK_HANDLE = ITEMS.register("iron_pickaxe_pink_handle", () -> new DyedPickaxe(ItemTier.IRON, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_PICKAXE_PINK_HANDLE = ITEMS.register("golden_pickaxe_pink_handle", () -> new DyedPickaxe(ItemTier.GOLD, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_PICKAXE_PINK_HANDLE = ITEMS.register("diamond_pickaxe_pink_handle", () -> new DyedPickaxe(ItemTier.DIAMOND, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> WOODEN_SHOVEL_PINK_HANDLE = ITEMS.register("wooden_shovel_pink_handle", () -> new DyedShovel(ItemTier.WOOD, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_SHOVEL_PINK_HANDLE = ITEMS.register("stone_shovel_pink_handle", () -> new DyedShovel(ItemTier.STONE, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_SHOVEL_PINK_HANDLE = ITEMS.register("iron_shovel_pink_handle", () -> new DyedShovel(ItemTier.IRON, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_SHOVEL_PINK_HANDLE = ITEMS.register("golden_shovel_pink_handle", () -> new DyedShovel(ItemTier.GOLD, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_SHOVEL_PINK_HANDLE = ITEMS.register("diamond_shovel_pink_handle", () -> new DyedShovel(ItemTier.DIAMOND, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> WOODEN_SWORD_PINK_HANDLE = ITEMS.register("wooden_sword_pink_handle", () -> new DyedSword(ItemTier.WOOD, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_SWORD_PINK_HANDLE = ITEMS.register("stone_sword_pink_handle", () -> new DyedSword(ItemTier.STONE, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_SWORD_PINK_HANDLE = ITEMS.register("iron_sword_pink_handle", () -> new DyedSword(ItemTier.IRON, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_SWORD_PINK_HANDLE = ITEMS.register("golden_sword_pink_handle", () -> new DyedSword(ItemTier.GOLD, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_SWORD_PINK_HANDLE = ITEMS.register("diamond_sword_pink_handle", () -> new DyedSword(ItemTier.DIAMOND, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));

    // Purple
    public static final RegistryObject<Item> PURPLE_STICK= ITEMS.register("purple_stick", DyedStickItem::new);
    public static final RegistryObject<Item> WOODEN_AXE_PURPLE_HANDLE = ITEMS.register("wooden_axe_purple_handle", () -> new DyedAxe(ItemTier.WOOD, 6.0F, -3.2F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_AXE_PURPLE_HANDLE = ITEMS.register("stone_axe_purple_handle", () -> new DyedAxe(ItemTier.STONE, 7.0F, -3.2F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_AXE_PURPLE_HANDLE = ITEMS.register("iron_axe_purple_handle", () -> new DyedAxe(ItemTier.IRON, 6.0F, -3.1F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_AXE_PURPLE_HANDLE = ITEMS.register("golden_axe_purple_handle", () -> new DyedAxe(ItemTier.GOLD, 6.0F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_AXE_PURPLE_HANDLE = ITEMS.register("diamond_axe_purple_handle", () -> new DyedAxe(ItemTier.DIAMOND, 5.0F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> WOODEN_HOE_PURPLE_HANDLE = ITEMS.register("wooden_hoe_purple_handle", () -> new DyedHoe(ItemTier.WOOD, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_HOE_PURPLE_HANDLE = ITEMS.register("stone_hoe_purple_handle", () -> new DyedHoe(ItemTier.STONE, -2.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_HOE_PURPLE_HANDLE = ITEMS.register("iron_hoe_purple_handle", () -> new DyedHoe(ItemTier.IRON, -1.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_HOE_PURPLE_HANDLE = ITEMS.register("golden_hoe_purple_handle", () -> new DyedHoe(ItemTier.GOLD, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_HOE_PURPLE_HANDLE = ITEMS.register("diamond_hoe_purple_handle", () -> new DyedHoe(ItemTier.DIAMOND, 0.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> WOODEN_PICKAXE_PURPLE_HANDLE = ITEMS.register("wooden_pickaxe_purple_handle", () -> new DyedPickaxe(ItemTier.WOOD, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_PICKAXE_PURPLE_HANDLE = ITEMS.register("stone_pickaxe_purple_handle", () -> new DyedPickaxe(ItemTier.STONE, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_PICKAXE_PURPLE_HANDLE = ITEMS.register("iron_pickaxe_purple_handle", () -> new DyedPickaxe(ItemTier.IRON, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_PICKAXE_PURPLE_HANDLE = ITEMS.register("golden_pickaxe_purple_handle", () -> new DyedPickaxe(ItemTier.GOLD, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_PICKAXE_PURPLE_HANDLE = ITEMS.register("diamond_pickaxe_purple_handle", () -> new DyedPickaxe(ItemTier.DIAMOND, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> WOODEN_SHOVEL_PURPLE_HANDLE = ITEMS.register("wooden_shovel_purple_handle", () -> new DyedShovel(ItemTier.WOOD, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_SHOVEL_PURPLE_HANDLE = ITEMS.register("stone_shovel_purple_handle", () -> new DyedShovel(ItemTier.STONE, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_SHOVEL_PURPLE_HANDLE = ITEMS.register("iron_shovel_purple_handle", () -> new DyedShovel(ItemTier.IRON, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_SHOVEL_PURPLE_HANDLE = ITEMS.register("golden_shovel_purple_handle", () -> new DyedShovel(ItemTier.GOLD, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_SHOVEL_PURPLE_HANDLE = ITEMS.register("diamond_shovel_purple_handle", () -> new DyedShovel(ItemTier.DIAMOND, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> WOODEN_SWORD_PURPLE_HANDLE = ITEMS.register("wooden_sword_purple_handle", () -> new DyedSword(ItemTier.WOOD, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_SWORD_PURPLE_HANDLE = ITEMS.register("stone_sword_purple_handle", () -> new DyedSword(ItemTier.STONE, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_SWORD_PURPLE_HANDLE = ITEMS.register("iron_sword_purple_handle", () -> new DyedSword(ItemTier.IRON, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_SWORD_PURPLE_HANDLE = ITEMS.register("golden_sword_purple_handle", () -> new DyedSword(ItemTier.GOLD, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_SWORD_PURPLE_HANDLE = ITEMS.register("diamond_sword_purple_handle", () -> new DyedSword(ItemTier.DIAMOND, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));

    // Red
    public static final RegistryObject<Item> RED_STICK= ITEMS.register("red_stick", DyedStickItem::new);
    public static final RegistryObject<Item> WOODEN_AXE_RED_HANDLE = ITEMS.register("wooden_axe_red_handle", () -> new DyedAxe(ItemTier.WOOD, 6.0F, -3.2F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_AXE_RED_HANDLE = ITEMS.register("stone_axe_red_handle", () -> new DyedAxe(ItemTier.STONE, 7.0F, -3.2F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_AXE_RED_HANDLE = ITEMS.register("iron_axe_red_handle", () -> new DyedAxe(ItemTier.IRON, 6.0F, -3.1F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_AXE_RED_HANDLE = ITEMS.register("golden_axe_red_handle", () -> new DyedAxe(ItemTier.GOLD, 6.0F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_AXE_RED_HANDLE = ITEMS.register("diamond_axe_red_handle", () -> new DyedAxe(ItemTier.DIAMOND, 5.0F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> WOODEN_HOE_RED_HANDLE = ITEMS.register("wooden_hoe_red_handle", () -> new DyedHoe(ItemTier.WOOD, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_HOE_RED_HANDLE = ITEMS.register("stone_hoe_red_handle", () -> new DyedHoe(ItemTier.STONE, -2.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_HOE_RED_HANDLE = ITEMS.register("iron_hoe_red_handle", () -> new DyedHoe(ItemTier.IRON, -1.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_HOE_RED_HANDLE = ITEMS.register("golden_hoe_red_handle", () -> new DyedHoe(ItemTier.GOLD, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_HOE_RED_HANDLE = ITEMS.register("diamond_hoe_red_handle", () -> new DyedHoe(ItemTier.DIAMOND, 0.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> WOODEN_PICKAXE_RED_HANDLE = ITEMS.register("wooden_pickaxe_red_handle", () -> new DyedPickaxe(ItemTier.WOOD, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_PICKAXE_RED_HANDLE = ITEMS.register("stone_pickaxe_red_handle", () -> new DyedPickaxe(ItemTier.STONE, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_PICKAXE_RED_HANDLE = ITEMS.register("iron_pickaxe_red_handle", () -> new DyedPickaxe(ItemTier.IRON, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_PICKAXE_RED_HANDLE = ITEMS.register("golden_pickaxe_red_handle", () -> new DyedPickaxe(ItemTier.GOLD, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_PICKAXE_RED_HANDLE = ITEMS.register("diamond_pickaxe_red_handle", () -> new DyedPickaxe(ItemTier.DIAMOND, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> WOODEN_SHOVEL_RED_HANDLE = ITEMS.register("wooden_shovel_red_handle", () -> new DyedShovel(ItemTier.WOOD, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_SHOVEL_RED_HANDLE = ITEMS.register("stone_shovel_red_handle", () -> new DyedShovel(ItemTier.STONE, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_SHOVEL_RED_HANDLE = ITEMS.register("iron_shovel_red_handle", () -> new DyedShovel(ItemTier.IRON, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_SHOVEL_RED_HANDLE = ITEMS.register("golden_shovel_red_handle", () -> new DyedShovel(ItemTier.GOLD, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_SHOVEL_RED_HANDLE = ITEMS.register("diamond_shovel_red_handle", () -> new DyedShovel(ItemTier.DIAMOND, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> WOODEN_SWORD_RED_HANDLE = ITEMS.register("wooden_sword_red_handle", () -> new DyedSword(ItemTier.WOOD, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_SWORD_RED_HANDLE = ITEMS.register("stone_sword_red_handle", () -> new DyedSword(ItemTier.STONE, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_SWORD_RED_HANDLE = ITEMS.register("iron_sword_red_handle", () -> new DyedSword(ItemTier.IRON, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_SWORD_RED_HANDLE = ITEMS.register("golden_sword_red_handle", () -> new DyedSword(ItemTier.GOLD, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_SWORD_RED_HANDLE = ITEMS.register("diamond_sword_red_handle", () -> new DyedSword(ItemTier.DIAMOND, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));

    // White
    public static final RegistryObject<Item> WHITE_STICK= ITEMS.register("white_stick", DyedStickItem::new);
    public static final RegistryObject<Item> WOODEN_AXE_WHITE_HANDLE = ITEMS.register("wooden_axe_white_handle", () -> new DyedAxe(ItemTier.WOOD, 6.0F, -3.2F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_AXE_WHITE_HANDLE = ITEMS.register("stone_axe_white_handle", () -> new DyedAxe(ItemTier.STONE, 7.0F, -3.2F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_AXE_WHITE_HANDLE = ITEMS.register("iron_axe_white_handle", () -> new DyedAxe(ItemTier.IRON, 6.0F, -3.1F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_AXE_WHITE_HANDLE = ITEMS.register("golden_axe_white_handle", () -> new DyedAxe(ItemTier.GOLD, 6.0F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_AXE_WHITE_HANDLE = ITEMS.register("diamond_axe_white_handle", () -> new DyedAxe(ItemTier.DIAMOND, 5.0F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> WOODEN_HOE_WHITE_HANDLE = ITEMS.register("wooden_hoe_white_handle", () -> new DyedHoe(ItemTier.WOOD, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_HOE_WHITE_HANDLE = ITEMS.register("stone_hoe_white_handle", () -> new DyedHoe(ItemTier.STONE, -2.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_HOE_WHITE_HANDLE = ITEMS.register("iron_hoe_white_handle", () -> new DyedHoe(ItemTier.IRON, -1.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_HOE_WHITE_HANDLE = ITEMS.register("golden_hoe_white_handle", () -> new DyedHoe(ItemTier.GOLD, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_HOE_WHITE_HANDLE = ITEMS.register("diamond_hoe_white_handle", () -> new DyedHoe(ItemTier.DIAMOND, 0.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> WOODEN_PICKAXE_WHITE_HANDLE = ITEMS.register("wooden_pickaxe_white_handle", () -> new DyedPickaxe(ItemTier.WOOD, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_PICKAXE_WHITE_HANDLE = ITEMS.register("stone_pickaxe_white_handle", () -> new DyedPickaxe(ItemTier.STONE, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_PICKAXE_WHITE_HANDLE = ITEMS.register("iron_pickaxe_white_handle", () -> new DyedPickaxe(ItemTier.IRON, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_PICKAXE_WHITE_HANDLE = ITEMS.register("golden_pickaxe_white_handle", () -> new DyedPickaxe(ItemTier.GOLD, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_PICKAXE_WHITE_HANDLE = ITEMS.register("diamond_pickaxe_white_handle", () -> new DyedPickaxe(ItemTier.DIAMOND, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> WOODEN_SHOVEL_WHITE_HANDLE = ITEMS.register("wooden_shovel_white_handle", () -> new DyedShovel(ItemTier.WOOD, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_SHOVEL_WHITE_HANDLE = ITEMS.register("stone_shovel_white_handle", () -> new DyedShovel(ItemTier.STONE, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_SHOVEL_WHITE_HANDLE = ITEMS.register("iron_shovel_white_handle", () -> new DyedShovel(ItemTier.IRON, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_SHOVEL_WHITE_HANDLE = ITEMS.register("golden_shovel_white_handle", () -> new DyedShovel(ItemTier.GOLD, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_SHOVEL_WHITE_HANDLE = ITEMS.register("diamond_shovel_white_handle", () -> new DyedShovel(ItemTier.DIAMOND, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> WOODEN_SWORD_WHITE_HANDLE = ITEMS.register("wooden_sword_white_handle", () -> new DyedSword(ItemTier.WOOD, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_SWORD_WHITE_HANDLE = ITEMS.register("stone_sword_white_handle", () -> new DyedSword(ItemTier.STONE, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_SWORD_WHITE_HANDLE = ITEMS.register("iron_sword_white_handle", () -> new DyedSword(ItemTier.IRON, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_SWORD_WHITE_HANDLE = ITEMS.register("golden_sword_white_handle", () -> new DyedSword(ItemTier.GOLD, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_SWORD_WHITE_HANDLE = ITEMS.register("diamond_sword_white_handle", () -> new DyedSword(ItemTier.DIAMOND, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));

    // Yellow
    public static final RegistryObject<Item> YELLOW_STICK= ITEMS.register("yellow_stick", DyedStickItem::new);
    public static final RegistryObject<Item> WOODEN_AXE_YELLOW_HANDLE = ITEMS.register("wooden_axe_yellow_handle", () -> new DyedAxe(ItemTier.WOOD, 6.0F, -3.2F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_AXE_YELLOW_HANDLE = ITEMS.register("stone_axe_yellow_handle", () -> new DyedAxe(ItemTier.STONE, 7.0F, -3.2F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_AXE_YELLOW_HANDLE = ITEMS.register("iron_axe_yellow_handle", () -> new DyedAxe(ItemTier.IRON, 6.0F, -3.1F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_AXE_YELLOW_HANDLE = ITEMS.register("golden_axe_yellow_handle", () -> new DyedAxe(ItemTier.GOLD, 6.0F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_AXE_YELLOW_HANDLE = ITEMS.register("diamond_axe_yellow_handle", () -> new DyedAxe(ItemTier.DIAMOND, 5.0F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> WOODEN_HOE_YELLOW_HANDLE = ITEMS.register("wooden_hoe_yellow_handle", () -> new DyedHoe(ItemTier.WOOD, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_HOE_YELLOW_HANDLE = ITEMS.register("stone_hoe_yellow_handle", () -> new DyedHoe(ItemTier.STONE, -2.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_HOE_YELLOW_HANDLE = ITEMS.register("iron_hoe_yellow_handle", () -> new DyedHoe(ItemTier.IRON, -1.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_HOE_YELLOW_HANDLE = ITEMS.register("golden_hoe_yellow_handle", () -> new DyedHoe(ItemTier.GOLD, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_HOE_YELLOW_HANDLE = ITEMS.register("diamond_hoe_yellow_handle", () -> new DyedHoe(ItemTier.DIAMOND, 0.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> WOODEN_PICKAXE_YELLOW_HANDLE = ITEMS.register("wooden_pickaxe_yellow_handle", () -> new DyedPickaxe(ItemTier.WOOD, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_PICKAXE_YELLOW_HANDLE = ITEMS.register("stone_pickaxe_yellow_handle", () -> new DyedPickaxe(ItemTier.STONE, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_PICKAXE_YELLOW_HANDLE = ITEMS.register("iron_pickaxe_yellow_handle", () -> new DyedPickaxe(ItemTier.IRON, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_PICKAXE_YELLOW_HANDLE = ITEMS.register("golden_pickaxe_yellow_handle", () -> new DyedPickaxe(ItemTier.GOLD, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_PICKAXE_YELLOW_HANDLE = ITEMS.register("diamond_pickaxe_yellow_handle", () -> new DyedPickaxe(ItemTier.DIAMOND, 1, -2.8F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> WOODEN_SHOVEL_YELLOW_HANDLE = ITEMS.register("wooden_shovel_yellow_handle", () -> new DyedShovel(ItemTier.WOOD, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_SHOVEL_YELLOW_HANDLE = ITEMS.register("stone_shovel_yellow_handle", () -> new DyedShovel(ItemTier.STONE, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_SHOVEL_YELLOW_HANDLE = ITEMS.register("iron_shovel_yellow_handle", () -> new DyedShovel(ItemTier.IRON, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_SHOVEL_YELLOW_HANDLE = ITEMS.register("golden_shovel_yellow_handle", () -> new DyedShovel(ItemTier.GOLD, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_SHOVEL_YELLOW_HANDLE = ITEMS.register("diamond_shovel_yellow_handle", () -> new DyedShovel(ItemTier.DIAMOND, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> WOODEN_SWORD_YELLOW_HANDLE = ITEMS.register("wooden_sword_yellow_handle", () -> new DyedSword(ItemTier.WOOD, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> STONE_SWORD_YELLOW_HANDLE = ITEMS.register("stone_sword_yellow_handle", () -> new DyedSword(ItemTier.STONE, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> IRON_SWORD_YELLOW_HANDLE = ITEMS.register("iron_sword_yellow_handle", () -> new DyedSword(ItemTier.IRON, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> GOLDEN_SWORD_YELLOW_HANDLE = ITEMS.register("golden_sword_yellow_handle", () -> new DyedSword(ItemTier.GOLD, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));
    public static final RegistryObject<Item> DIAMOND_SWORD_YELLOW_HANDLE = ITEMS.register("diamond_sword_yellow_handle", () -> new DyedSword(ItemTier.DIAMOND, 3, -2.4F, (new Item.Properties()).group(ItemGroups.DYED_TOOLS_TAB)));

}
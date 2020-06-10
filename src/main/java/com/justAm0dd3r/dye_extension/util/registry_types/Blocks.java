package com.justAm0dd3r.dye_extension.util.registry_types;

import com.justAm0dd3r.dye_extension.Reference;
import com.justAm0dd3r.dye_extension.blocks.BlockItemBase;
import com.justAm0dd3r.dye_extension.blocks.DyedCobblestoneBlock;
import com.justAm0dd3r.dye_extension.blocks.DyedFurnaceBlock;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static com.justAm0dd3r.dye_extension.util.registry_types.Items.ITEMS;

public class Blocks {

    public static void init() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Reference.MOD_ID);


    // AUTO-GEN
    public static final RegistryObject<Block> BLACK_COBBLESTONE = BLOCKS.register("black_cobblestone", DyedCobblestoneBlock::new);
    public static final RegistryObject<Block> BLUE_COBBLESTONE = BLOCKS.register("blue_cobblestone", DyedCobblestoneBlock::new);
    public static final RegistryObject<Block> BROWN_COBBLESTONE = BLOCKS.register("brown_cobblestone", DyedCobblestoneBlock::new);
    public static final RegistryObject<Block> CYAN_COBBLESTONE = BLOCKS.register("cyan_cobblestone", DyedCobblestoneBlock::new);
    public static final RegistryObject<Block> GRAY_COBBLESTONE = BLOCKS.register("gray_cobblestone", DyedCobblestoneBlock::new);
    public static final RegistryObject<Block> GREEN_COBBLESTONE = BLOCKS.register("green_cobblestone", DyedCobblestoneBlock::new);
    public static final RegistryObject<Block> LIGHT_BLUE_COBBLESTONE = BLOCKS.register("light_blue_cobblestone", DyedCobblestoneBlock::new);
    public static final RegistryObject<Block> LIGHT_GRAY_COBBLESTONE = BLOCKS.register("light_gray_cobblestone", DyedCobblestoneBlock::new);
    public static final RegistryObject<Block> LIME_COBBLESTONE = BLOCKS.register("lime_cobblestone", DyedCobblestoneBlock::new);
    public static final RegistryObject<Block> MAGENTA_COBBLESTONE = BLOCKS.register("magenta_cobblestone", DyedCobblestoneBlock::new);
    public static final RegistryObject<Block> ORANGE_COBBLESTONE = BLOCKS.register("orange_cobblestone", DyedCobblestoneBlock::new);
    public static final RegistryObject<Block> PINK_COBBLESTONE = BLOCKS.register("pink_cobblestone", DyedCobblestoneBlock::new);
    public static final RegistryObject<Block> PURPLE_COBBLESTONE = BLOCKS.register("purple_cobblestone", DyedCobblestoneBlock::new);
    public static final RegistryObject<Block> RED_COBBLESTONE = BLOCKS.register("red_cobblestone", DyedCobblestoneBlock::new);
    public static final RegistryObject<Block> WHITE_COBBLESTONE = BLOCKS.register("white_cobblestone", DyedCobblestoneBlock::new);
    public static final RegistryObject<Block> YELLOW_COBBLESTONE = BLOCKS.register("yellow_cobblestone", DyedCobblestoneBlock::new);

    // AUTO-GEN Block Items
    public static final RegistryObject<Item> BLACK_COBBLESTONE_ITEM = ITEMS.register("black_cobblestone", () -> new BlockItemBase(BLACK_COBBLESTONE.get()));
    public static final RegistryObject<Item> BLUE_COBBLESTONE_ITEM = ITEMS.register("blue_cobblestone", () -> new BlockItemBase(BLUE_COBBLESTONE.get()));
    public static final RegistryObject<Item> BROWN_COBBLESTONE_ITEM = ITEMS.register("brown_cobblestone", () -> new BlockItemBase(BROWN_COBBLESTONE.get()));
    public static final RegistryObject<Item> CYAN_COBBLESTONE_ITEM = ITEMS.register("cyan_cobblestone", () -> new BlockItemBase(CYAN_COBBLESTONE.get()));
    public static final RegistryObject<Item> GRAY_COBBLESTONE_ITEM = ITEMS.register("gray_cobblestone", () -> new BlockItemBase(GRAY_COBBLESTONE.get()));
    public static final RegistryObject<Item> GREEN_COBBLESTONE_ITEM = ITEMS.register("green_cobblestone", () -> new BlockItemBase(GREEN_COBBLESTONE.get()));
    public static final RegistryObject<Item> LIGHT_BLUE_COBBLESTONE_ITEM = ITEMS.register("light_blue_cobblestone", () -> new BlockItemBase(LIGHT_BLUE_COBBLESTONE.get()));
    public static final RegistryObject<Item> LIGHT_GRAY_COBBLESTONE_ITEM = ITEMS.register("light_gray_cobblestone", () -> new BlockItemBase(LIGHT_GRAY_COBBLESTONE.get()));
    public static final RegistryObject<Item> LIME_COBBLESTONE_ITEM = ITEMS.register("lime_cobblestone", () -> new BlockItemBase(LIME_COBBLESTONE.get()));
    public static final RegistryObject<Item> MAGENTA_COBBLESTONE_ITEM = ITEMS.register("magenta_cobblestone", () -> new BlockItemBase(MAGENTA_COBBLESTONE.get()));
    public static final RegistryObject<Item> ORANGE_COBBLESTONE_ITEM = ITEMS.register("orange_cobblestone", () -> new BlockItemBase(ORANGE_COBBLESTONE.get()));
    public static final RegistryObject<Item> PINK_COBBLESTONE_ITEM = ITEMS.register("pink_cobblestone", () -> new BlockItemBase(PINK_COBBLESTONE.get()));
    public static final RegistryObject<Item> PURPLE_COBBLESTONE_ITEM = ITEMS.register("purple_cobblestone", () -> new BlockItemBase(PURPLE_COBBLESTONE.get()));
    public static final RegistryObject<Item> RED_COBBLESTONE_ITEM = ITEMS.register("red_cobblestone", () -> new BlockItemBase(RED_COBBLESTONE.get()));
    public static final RegistryObject<Item> WHITE_COBBLESTONE_ITEM = ITEMS.register("white_cobblestone", () -> new BlockItemBase(WHITE_COBBLESTONE.get()));
    public static final RegistryObject<Item> YELLOW_COBBLESTONE_ITEM = ITEMS.register("yellow_cobblestone", () -> new BlockItemBase(YELLOW_COBBLESTONE.get()));

    // AUTO-GEN Furnace Blocks and Block Items
    public static final RegistryObject<Block> BLACK_FURNACE = BLOCKS.register("black_furnace", DyedFurnaceBlock::new);
    public static final RegistryObject<Item> BLACK_FURNACE_ITEM = ITEMS.register("black_furnace", () -> new BlockItemBase(BLACK_FURNACE.get()));
    public static final RegistryObject<Block> BLUE_FURNACE = BLOCKS.register("blue_furnace", DyedFurnaceBlock::new);
    public static final RegistryObject<Item> BLUE_FURNACE_ITEM = ITEMS.register("blue_furnace", () -> new BlockItemBase(BLUE_FURNACE.get()));
    public static final RegistryObject<Block> BROWN_FURNACE = BLOCKS.register("brown_furnace", DyedFurnaceBlock::new);
    public static final RegistryObject<Item> BROWN_FURNACE_ITEM = ITEMS.register("brown_furnace", () -> new BlockItemBase(BROWN_FURNACE.get()));
    public static final RegistryObject<Block> CYAN_FURNACE = BLOCKS.register("cyan_furnace", DyedFurnaceBlock::new);
    public static final RegistryObject<Item> CYAN_FURNACE_ITEM = ITEMS.register("cyan_furnace", () -> new BlockItemBase(CYAN_FURNACE.get()));
    public static final RegistryObject<Block> GRAY_FURNACE = BLOCKS.register("gray_furnace", DyedFurnaceBlock::new);
    public static final RegistryObject<Item> GRAY_FURNACE_ITEM = ITEMS.register("gray_furnace", () -> new BlockItemBase(GRAY_FURNACE.get()));
    public static final RegistryObject<Block> GREEN_FURNACE = BLOCKS.register("green_furnace", DyedFurnaceBlock::new);
    public static final RegistryObject<Item> GREEN_FURNACE_ITEM = ITEMS.register("green_furnace", () -> new BlockItemBase(GREEN_FURNACE.get()));
    public static final RegistryObject<Block> LIGHT_BLUE_FURNACE = BLOCKS.register("light_blue_furnace", DyedFurnaceBlock::new);
    public static final RegistryObject<Item> LIGHT_BLUE_FURNACE_ITEM = ITEMS.register("light_blue_furnace", () -> new BlockItemBase(LIGHT_BLUE_FURNACE.get()));
    public static final RegistryObject<Block> LIGHT_GRAY_FURNACE = BLOCKS.register("light_gray_furnace", DyedFurnaceBlock::new);
    public static final RegistryObject<Item> LIGHT_GRAY_FURNACE_ITEM = ITEMS.register("light_gray_furnace", () -> new BlockItemBase(LIGHT_GRAY_FURNACE.get()));
    public static final RegistryObject<Block> LIME_FURNACE = BLOCKS.register("lime_furnace", DyedFurnaceBlock::new);
    public static final RegistryObject<Item> LIME_FURNACE_ITEM = ITEMS.register("lime_furnace", () -> new BlockItemBase(LIME_FURNACE.get()));
    public static final RegistryObject<Block> MAGENTA_FURNACE = BLOCKS.register("magenta_furnace", DyedFurnaceBlock::new);
    public static final RegistryObject<Item> MAGENTA_FURNACE_ITEM = ITEMS.register("magenta_furnace", () -> new BlockItemBase(MAGENTA_FURNACE.get()));
    public static final RegistryObject<Block> ORANGE_FURNACE = BLOCKS.register("orange_furnace", DyedFurnaceBlock::new);
    public static final RegistryObject<Item> ORANGE_FURNACE_ITEM = ITEMS.register("orange_furnace", () -> new BlockItemBase(ORANGE_FURNACE.get()));
    public static final RegistryObject<Block> PINK_FURNACE = BLOCKS.register("pink_furnace", DyedFurnaceBlock::new);
    public static final RegistryObject<Item> PINK_FURNACE_ITEM = ITEMS.register("pink_furnace", () -> new BlockItemBase(PINK_FURNACE.get()));
    public static final RegistryObject<Block> PURPLE_FURNACE = BLOCKS.register("purple_furnace", DyedFurnaceBlock::new);
    public static final RegistryObject<Item> PURPLE_FURNACE_ITEM = ITEMS.register("purple_furnace", () -> new BlockItemBase(PURPLE_FURNACE.get()));
    public static final RegistryObject<Block> RED_FURNACE = BLOCKS.register("red_furnace", DyedFurnaceBlock::new);
    public static final RegistryObject<Item> RED_FURNACE_ITEM = ITEMS.register("red_furnace", () -> new BlockItemBase(RED_FURNACE.get()));
    public static final RegistryObject<Block> WHITE_FURNACE = BLOCKS.register("white_furnace", DyedFurnaceBlock::new);
    public static final RegistryObject<Item> WHITE_FURNACE_ITEM = ITEMS.register("white_furnace", () -> new BlockItemBase(WHITE_FURNACE.get()));
    public static final RegistryObject<Block> YELLOW_FURNACE = BLOCKS.register("yellow_furnace", DyedFurnaceBlock::new);
    public static final RegistryObject<Item> YELLOW_FURNACE_ITEM = ITEMS.register("yellow_furnace", () -> new BlockItemBase(YELLOW_FURNACE.get()));

}

package com.justAm0dd3r.dye_extension.filters;

/*import com.justAm0dd3r.dye_extension.reference.Reference;
import com.justAm0dd3r.dye_extension.registry.types.ModBlocks;
import com.justAm0dd3r.dye_extension.registry.types.ModItems;
import com.justAm0dd3r.dye_extension.tabs.ItemTabs;
import com.mrcrayfish.filters.Filters;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.ModList;*/

public class FiltersRebornManager {
    public static void registerFiltersWhenLoaded() {
        /*if (isFiltersLoaded()) {
            // Register Filter Tabs
            // Dyed Tools
            addFilter(ItemTabs.DYED_TOOLS_TAB, "dyed_tools/dyed_swords", ModItems.DIAMOND_SWORD_YELLOW_HANDLE.get());
            addFilter(ItemTabs.DYED_TOOLS_TAB, "dyed_tools/dyed_axes", ModItems.DIAMOND_AXE_YELLOW_HANDLE.get());
            addFilter(ItemTabs.DYED_TOOLS_TAB, "dyed_tools/dyed_pickaxes", ModItems.DIAMOND_PICKAXE_YELLOW_HANDLE.get());
            addFilter(ItemTabs.DYED_TOOLS_TAB, "dyed_tools/dyed_shovels", ModItems.DIAMOND_SHOVEL_YELLOW_HANDLE.get());
            addFilter(ItemTabs.DYED_TOOLS_TAB, "dyed_tools/dyed_hoes", ModItems.DIAMOND_HOE_YELLOW_HANDLE.get());

            // Dyed Blocks
            addFilter(ItemTabs.DYED_BLOCKS_TAB, "dyed_blocks/dyed_andesite", ModBlocks.DYED_ANDESITE_BLOCKS.getBlockFromColor(DyeColor.LIME).getBlock().get()); // addFilter(CreativeModeTabs.DYED_BLOCKS_TAB, "dyed_blocks/dyed_andesite", ModBlocks.LIME_ANDESITE.get());
            addFilter(ItemTabs.DYED_BLOCKS_TAB, "dyed_blocks/dyed_polished_andesite", ModBlocks.DYED_POLISHED_ANDESITE_BLOCKS.getBlockFromColor(DyeColor.LIME).getBlock().get());
            addFilter(ItemTabs.DYED_BLOCKS_TAB, "dyed_blocks/dyed_leaves", ModBlocks.DYED_LEAVES_BLOCKS.getBlockFromColor(DyeColor.LIME).getBlock().get());
            addFilter(ItemTabs.DYED_BLOCKS_TAB, "dyed_blocks/dyed_cobblestone", ModBlocks.DYED_COBBLESTONE_BLOCKS.getBlockFromColor(DyeColor.LIME).getBlock().get());
            addFilter(ItemTabs.DYED_BLOCKS_TAB, "dyed_blocks/dyed_stone", ModBlocks.DYED_STONE_BLOCKS.getBlockFromColor(DyeColor.LIME).getBlock().get());

            // Dyed Stairs
            addFilter(ItemTabs.DYED_STAIRS_TAB, "dyed_stairs/dyed_andesite_stairs", ModBlocks.DYED_POLISHED_ANDESITE_BLOCKS.getBlockFromColor(DyeColor.LIME).getSlabBlock().get()); // addFilter(CreativeModeTabs.DYED_STAIRS_TAB, "dyed_stairs/dyed_andesite_stairs", ModBlocks.LIME_ANDESITE_STAIRS.get());
            addFilter(ItemTabs.DYED_STAIRS_TAB, "dyed_stairs/dyed_polished_andesite_stairs", ModBlocks.DYED_POLISHED_ANDESITE_BLOCKS.getBlockFromColor(DyeColor.LIME).getStairsBlock().get());
            addFilter(ItemTabs.DYED_STAIRS_TAB, "dyed_stairs/dyed_cobblestone_stairs", ModBlocks.DYED_COBBLESTONE_BLOCKS.getBlockFromColor(DyeColor.LIME).getStairsBlock().get());
            addFilter(ItemTabs.DYED_STAIRS_TAB, "dyed_stairs/dyed_stone_stairs", ModBlocks.DYED_STONE_BLOCKS.getBlockFromColor(DyeColor.LIME).getStairsBlock().get());

            // Dyed Slabs
            addFilter(ItemTabs.DYED_SLABS_TAB, "dyed_slabs/dyed_andesite_slabs", ModBlocks.DYED_POLISHED_ANDESITE_BLOCKS.getBlockFromColor(DyeColor.LIME).getSlabBlock().get());
            addFilter(ItemTabs.DYED_SLABS_TAB, "dyed_slabs/dyed_polished_andesite_slabs", ModBlocks.DYED_POLISHED_ANDESITE_BLOCKS.getBlockFromColor(DyeColor.LIME).getSlabBlock().get());
            addFilter(ItemTabs.DYED_SLABS_TAB, "dyed_slabs/dyed_cobblestone_slabs", ModBlocks.DYED_COBBLESTONE_BLOCKS.getBlockFromColor(DyeColor.LIME).getSlabBlock().get());
            addFilter(ItemTabs.DYED_SLABS_TAB, "dyed_slabs/dyed_stone_slabs", ModBlocks.DYED_STONE_BLOCKS.getBlockFromColor(DyeColor.LIME).getSlabBlock().get());
        }*/
    }
/*
    public static boolean isFiltersLoaded() {
        return ModList.get().isLoaded("filters");
    }

    private static void addFilter(@SuppressWarnings("SameParameterValue") CreativeModeTab group, String tag, Item icon) {
        Filters.get().register(group, new ResourceLocation(Reference.MOD_ID, tag), new ItemStack(icon));
    }

    private static void addFilter(@SuppressWarnings("SameParameterValue") CreativeModeTab group, String tag, Block icon) {
        Filters.get().register(group, new ResourceLocation(Reference.MOD_ID, tag), new ItemStack(icon));
    }*/
}

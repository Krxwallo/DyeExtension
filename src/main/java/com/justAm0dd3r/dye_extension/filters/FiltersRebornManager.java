package com.justAm0dd3r.dye_extension.filters;

import com.justAm0dd3r.dye_extension.reference.Reference;
import com.justAm0dd3r.dye_extension.registry.types.Blocks;
import com.justAm0dd3r.dye_extension.registry.types.Items;
import com.justAm0dd3r.dye_extension.tabs.ItemGroups;
import com.mrcrayfish.filters.Filters;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.ModList;

public class FiltersRebornManager {
    public static void registerFiltersWhenLoaded() {
        if (isFiltersLoaded()) {
            // Register Filter Tabs
            // Dyed Tools
            addFilter(ItemGroups.DYED_TOOLS_TAB, "dyed_tools/dyed_swords", Items.DIAMOND_SWORD_YELLOW_HANDLE.get());
            addFilter(ItemGroups.DYED_TOOLS_TAB, "dyed_tools/dyed_axes", Items.DIAMOND_AXE_YELLOW_HANDLE.get());
            addFilter(ItemGroups.DYED_TOOLS_TAB, "dyed_tools/dyed_pickaxes", Items.DIAMOND_PICKAXE_YELLOW_HANDLE.get());
            addFilter(ItemGroups.DYED_TOOLS_TAB, "dyed_tools/dyed_shovels", Items.DIAMOND_SHOVEL_YELLOW_HANDLE.get());
            addFilter(ItemGroups.DYED_TOOLS_TAB, "dyed_tools/dyed_hoes", Items.DIAMOND_HOE_YELLOW_HANDLE.get());

            // Dyed Blocks
            addFilter(ItemGroups.DYED_BLOCKS_TAB, "dyed_blocks/dyed_andesite", Blocks.LIME_ANDESITE.get());
            addFilter(ItemGroups.DYED_BLOCKS_TAB, "dyed_blocks/dyed_polished_andesite", Blocks.LIME_POLISHED_ANDESITE.get());
            addFilter(ItemGroups.DYED_BLOCKS_TAB, "dyed_blocks/dyed_leaves", Blocks.LIME_LEAVES.get());
            addFilter(ItemGroups.DYED_BLOCKS_TAB, "dyed_blocks/dyed_cobblestone", Blocks.LIME_COBBLESTONE.get());
            addFilter(ItemGroups.DYED_BLOCKS_TAB, "dyed_blocks/dyed_stone", Blocks.LIME_STONE.get());

            // Dyed Stairs
            addFilter(ItemGroups.DYED_STAIRS_TAB, "dyed_stairs/dyed_andesite_stairs", Blocks.LIME_ANDESITE_STAIRS.get());
            addFilter(ItemGroups.DYED_STAIRS_TAB, "dyed_stairs/dyed_polished_andesite_stairs", Blocks.LIME_POLISHED_ANDESITE_STAIRS.get());
            addFilter(ItemGroups.DYED_STAIRS_TAB, "dyed_stairs/dyed_cobblestone_stairs", Blocks.LIME_COBBLESTONE_STAIRS.get());
            addFilter(ItemGroups.DYED_STAIRS_TAB, "dyed_stairs/dyed_stone_stairs", Blocks.LIME_STONE_STAIRS.get());

            // Dyed Slabs
            addFilter(ItemGroups.DYED_SLABS_TAB, "dyed_slabs/dyed_andesite_slabs", Blocks.LIME_ANDESITE_SLAB.get());
            addFilter(ItemGroups.DYED_SLABS_TAB, "dyed_slabs/dyed_polished_andesite_slabs", Blocks.LIME_POLISHED_ANDESITE_SLAB.get());
            addFilter(ItemGroups.DYED_SLABS_TAB, "dyed_slabs/dyed_cobblestone_slabs", Blocks.LIME_COBBLESTONE_SLAB.get());
            addFilter(ItemGroups.DYED_SLABS_TAB, "dyed_slabs/dyed_stone_slabs", Blocks.LIME_STONE_SLAB.get());
        }
    }

    public static boolean isFiltersLoaded() {
        return ModList.get().isLoaded("filters");
    }

    private static void addFilter(@SuppressWarnings("SameParameterValue") ItemGroup group, String tag, Item icon) {
        Filters.get().register(group, new ResourceLocation(Reference.MOD_ID, tag), new ItemStack(icon));
    }

    private static void addFilter(@SuppressWarnings("SameParameterValue") ItemGroup group, String tag, Block icon) {
        Filters.get().register(group, new ResourceLocation(Reference.MOD_ID, tag), new ItemStack(icon));
    }
}

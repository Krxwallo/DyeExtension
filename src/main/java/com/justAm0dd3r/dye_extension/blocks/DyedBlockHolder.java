package com.justAm0dd3r.dye_extension.blocks;

import com.justAm0dd3r.dye_extension.interfaces.IDyedBlockHolder;
import com.justAm0dd3r.dye_extension.items.ItemHolder;
import com.justAm0dd3r.dye_extension.registry.types.ModBlocks;
import com.justAm0dd3r.dye_extension.registry.types.ModItems;
import com.justAm0dd3r.dye_extension.tabs.ItemGroups;
import com.justAm0dd3r.dye_extension.util.ReflectionUtil;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.DyeColor;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Mod.EventBusSubscriber
public class DyedBlockHolder implements IDyedBlockHolder {

    /** block holder */
    private final Map<DyeColor, BlockHolder> blocks = new HashMap<>(DyeColor.values().length);
    /** item holder */
    private final Map<DyeColor, ItemHolder> items = new HashMap<>(DyeColor.values().length);

    private static final Logger LOGGER = LogManager.getLogger();

    /**
     * @param blockName the name of the block, e.g. "andesite", "stone", "cobblestone", "polished_andesite", ...
     */
    public DyedBlockHolder(String blockName) {
        this(blockName, true, true, false);
    }

    /**
     * @param blockName the name of the block, e.g. "andesite", "stone", "cobblestone", ...
     * @param stairs should register stairs?
     * @param slabs should register slabs?
     * @param buttons should register buttons?
     */
    public DyedBlockHolder(String blockName, boolean stairs, boolean slabs, boolean buttons) {
        for (DyeColor color : DyeColor.values()) {
            final String name = color.name().toLowerCase() + "_" + blockName;
            LOGGER.debug("Name: " + name);

            // Main Block
            BlockRegistry blockRegistry = registerBlock(blockName, name);

            // Stairs
            BlockRegistry stairsRegistry = null;
            if (stairs) {
                stairsRegistry = registerStairs(blockRegistry, blockName, name);
            }

            // Slab
            BlockRegistry slabsRegistry = null;
            if (slabs) {
                slabsRegistry = registerSlab(blockName, name);
            }

            // Button
            BlockRegistry buttonRegistry = null;
            if (buttons) {
                buttonRegistry = registerButton(blockName, name);
            }

            // Put the BlockHolder and the ItemHolder into the maps.
            putBlockHolder(color, new BlockHolder(blockRegistry.getBlock(),
                    getNullableBlock(stairsRegistry), getNullableBlock(slabsRegistry), getNullableBlock(buttonRegistry)));

            putItemHolder(color, new ItemHolder(blockRegistry.getItem(),
                    getNullableItem(stairsRegistry), getNullableItem(slabsRegistry), getNullableItem(buttonRegistry)));
        }
    }

    private void putBlockHolder(DyeColor color, BlockHolder blockHolder) {
        blocks.put(color, blockHolder);
    }

    private void putItemHolder(DyeColor color, ItemHolder blockHolder) {
        items.put(color, blockHolder);
    }

    @Nullable
    private RegistryObject<Block> getNullableBlock(@Nullable BlockRegistry registry) {
        return registry != null ? registry.getBlock() : null;
    }

    @Nullable
    private RegistryObject<Item> getNullableItem(@Nullable BlockRegistry registry) {
        return registry != null ? registry.getItem() : null;
    }

    /**
     * Register a "normal" dyed block, e.g. a red andesite block
     * @param originalName e.g. "andesite"
     * @param dyedName e.g. "red_andesite"
     * @return the created {@link BlockRegistry} -> contains the block and the block item.
     */
    private BlockRegistry registerBlock(String originalName, String dyedName) {
        // Block
        RegistryObject<Block> block = ModBlocks.BLOCKS.register(dyedName,
                () -> new Block(AbstractBlock.Properties.from(ReflectionUtil.requireBlockByName(originalName))));

        // Block Item
        RegistryObject<Item> item = ModItems.ITEMS.register(dyedName, () -> new BlockItem(block.get(), new Item.Properties().group(ItemGroups.getFromBlock(block.get()))));

        // Return the block registry
        return new BlockRegistry(block, item);
    }

    /**
     * Register a dyed stairs block, e.g. red andesite stairs
     * @param originalName e.g. "andesite_stairs"
     * @param dyedName e.g. "red_andesite_stairs"
     * @return the created {@link BlockRegistry} -> contains the block and the block item.
     */
    private BlockRegistry registerStairs(BlockRegistry blockRegistry, String originalName, String dyedName) {
        final String stairsName = dyedName + "_stairs";
        final String unDyedStairsName = originalName + "_slab";
        // Block
        RegistryObject<Block> block = ModBlocks.BLOCKS.register(stairsName,
                () -> new StairsBlock(() -> blockRegistry.getBlock().get().getDefaultState(), AbstractBlock.Properties.from(ReflectionUtil.requireBlockByName(unDyedStairsName)).func_235861_h_()));

        // Block Item
        RegistryObject<Item> item = ModItems.ITEMS.register(stairsName, () -> new BlockItem(block.get(), new Item.Properties().group(ItemGroups.getFromBlock(block.get()))));

        // Return the block registry
        return new BlockRegistry(block, item);
    }

    private BlockRegistry registerSlab(final String originalName, final String dyedName) {
        // The slab name, e.g. "red_andesite_slab"
        final String slabName = dyedName + "_slab";
        // The "undyed" slab name, e.g. "andesite_slab"
        final String unDyedSlabName = originalName + "_slab";
        // Block
        RegistryObject<Block> block = ModBlocks.BLOCKS.register(slabName,
                () -> new SlabBlock(AbstractBlock.Properties.from(
                        /* Get the Blocks.XXX (e.g. Blocks.ANDESITE_SLAB) field and create the properties from it */
                        ReflectionUtil.requireBlockByName(unDyedSlabName)).func_235861_h_()));

        // Block Item
        RegistryObject<Item> item = ModItems.ITEMS.register(slabName, () -> new BlockItem(block.get(), new Item.Properties().group(ItemGroups.getFromBlock(block.get()))));

        // Return the block registry
        return new BlockRegistry(block, item);
    }

    private BlockRegistry registerButton(final String originalName, final String dyedName) {
        // The button name, e.g. "red_stone_button"
        final String buttonName = dyedName + "_button";
        // The "undyed" button name, e.g. "stone_button"
        final String unDyedButtonName = originalName + "_button";
        // Block
        RegistryObject<Block> block = ModBlocks.BLOCKS.register(buttonName,
                () -> new StoneButtonBlock(AbstractBlock.Properties.from(
                        /* Get the Blocks.XXX (e.g. Blocks.STONE_BUTTON) field and create the properties from it */
                        ReflectionUtil.requireBlockByName(unDyedButtonName)).func_235861_h_()));

        // Block Item
        RegistryObject<Item> item = ModItems.ITEMS.register(buttonName, () -> new BlockItem(block.get(), new Item.Properties().group(ItemGroups.getFromBlock(block.get()))));

        // Return the block registry
        return new BlockRegistry(block, item);
    }

    @Override
    public Collection<BlockHolder> getBlocks() {
        return blocks.values();
    }

    @Override
    public Collection<ItemHolder> getItems() {
        return items.values();
    }

    @Override
    public BlockHolder getBlockFromColor(DyeColor color) {
        return blocks.get(color);
    }

    @Override
    public ItemHolder getItemFromColor(DyeColor color) {
        return items.get(color);
    }
}

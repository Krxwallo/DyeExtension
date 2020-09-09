package com.justAm0dd3r.dye_extension.data_gen.loot_tables;

import com.justAm0dd3r.dye_extension.DyeExtension;
import com.justAm0dd3r.dye_extension.blocks.BlockHolder;
import com.justAm0dd3r.dye_extension.data_gen.properties.DataGenerationProperties;
import com.justAm0dd3r.dye_extension.data_gen.properties.DataGenerationProperty;
import com.justAm0dd3r.dye_extension.util.ReflectionUtils;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.fml.RegistryObject;

public class LootTables extends BaseLootTableProvider {
    public LootTables(DataGenerator dataGeneratorIn) {
        super(dataGeneratorIn);
    }

    @Override
    protected void addTables() {
        for (DataGenerationProperty property :
                DataGenerationProperties.getProperties()) {
            BlockHolder blockHolder = ReflectionUtils.requireBlockHolderByName(property.getDyedName());
            RegistryObject<Block> blockRegistry;
            switch (property.getType()) {
                case DataGenerationProperty.Type.STAIRS:
                    blockRegistry = blockHolder.getStairsBlock();
                    break;
                case DataGenerationProperty.Type.SLAB:
                    blockRegistry = blockHolder.getSlabBlock();
                    break;
                case DataGenerationProperty.Type.BUTTON:
                    blockRegistry = blockHolder.getButtonBlock();
                    break;
                default:
                    blockRegistry = blockHolder.getBlock();
            }

            assert blockRegistry != null;
            Block block = blockRegistry.get();
            if (property.getDyedName().contains("leaves")) jsonTables.put(block, createLeavesTable(property.getDyedName()));
            else lootTables.put(block, createStandardTable(property.getDyedName(), block));
            DyeExtension.LOGGER.debug("Added a loot table for name: " + property.getDyedName());
        }
    }
}

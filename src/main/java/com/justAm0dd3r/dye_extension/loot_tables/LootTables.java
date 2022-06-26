package com.justAm0dd3r.dye_extension.loot_tables;

import com.justAm0dd3r.dye_extension.DyeExtension;
import com.justAm0dd3r.dye_extension.blocks.BlockHolder;
import com.justAm0dd3r.dye_extension.data_gen.DataGenerationProperties;
import com.justAm0dd3r.dye_extension.data_gen.DataGenerationProperty;
import com.justAm0dd3r.dye_extension.util.ReflectionUtil;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fmllegacy.RegistryObject;

public class LootTables extends BaseLootTableProvider {
    public LootTables(DataGenerator dataGeneratorIn) {
        super(dataGeneratorIn);
    }

    @Override
    protected void addTables() {
        for (DataGenerationProperty property :
                DataGenerationProperties.getProperties()) {
            BlockHolder blockHolder = ReflectionUtil.requireBlockHolderByName(property.getDyedName());
            RegistryObject<Block> blockRegistry = switch (property.getType()) {
                case DataGenerationProperty.Type.STAIRS -> blockHolder.getStairsBlock();
                case DataGenerationProperty.Type.SLAB -> blockHolder.getSlabBlock();
                case DataGenerationProperty.Type.BUTTON -> blockHolder.getButtonBlock();
                default -> blockHolder.getBlock();
            };

            assert blockRegistry != null;
            Block block = blockRegistry.get();
            if (property.getDyedName().contains("leaves")) jsonTables.put(block, createLeavesTable(property.getDyedName()));
            else lootTables.put(block, createStandardTable(property.getDyedName(), block));
            DyeExtension.LOGGER.debug("Added a loot table for name: " + property.getDyedName());
        }
    }
}

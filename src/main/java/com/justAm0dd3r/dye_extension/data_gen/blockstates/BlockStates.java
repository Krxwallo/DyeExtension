package com.justAm0dd3r.dye_extension.data_gen.blockstates;

import com.justAm0dd3r.dye_extension.data_gen.properties.DataGenerationProperties;
import com.justAm0dd3r.dye_extension.data_gen.properties.DataGenerationProperty;
import com.justAm0dd3r.dye_extension.reference.Reference;
import com.justAm0dd3r.dye_extension.util.ReflectionUtils;
import com.justAm0dd3r.dye_extension.util.StringUtils;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ExistingFileHelper;

public class BlockStates extends BlockStateProvider {
    public BlockStates(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, Reference.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        for (DataGenerationProperty property : DataGenerationProperties.getProperties()) {
            String dyedBaseName = StringUtils.getDyedBaseName(property.getDyedName());
            switch (property.getType()) {
                case DataGenerationProperty.Type.STAIRS:
                    stairsBlock(((StairsBlock) ReflectionUtils.requireBlockHolderByName(property.getDyedName()).getStairsBlock().get()),
                            dyedBaseName, modLoc("blocks/" + dyedBaseName));
                    break;
                case DataGenerationProperty.Type.SLAB:
                    SlabBlock slabBlock = (SlabBlock) ReflectionUtils.requireBlockHolderByName(property.getDyedName()).getSlabBlock().get();
                    slabBlock(slabBlock,
                            modLoc("block/" + dyedBaseName), modLoc("blocks/" + dyedBaseName));
                    break;
                case DataGenerationProperty.Type.BUTTON:
                    //AbstractButtonBlock buttonBlock = (AbstractButtonBlock) ReflectionUtil.requireBlockHolderByName(property.getDyedName()).getButtonBlock().get();
                    break;
                default:
                    simpleBlock(ReflectionUtils.requireBlockHolderByName(property.getDyedName()).getBlock().get(),
                            models().cubeAll(property.getDyedName(), modLoc("blocks/" + property.getDyedName())));
            }
        }
    }
}

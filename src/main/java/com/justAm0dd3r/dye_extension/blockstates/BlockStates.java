package com.justAm0dd3r.dye_extension.blockstates;

import com.justAm0dd3r.dye_extension.data_gen.DataGenerationProperties;
import com.justAm0dd3r.dye_extension.data_gen.DataGenerationProperty;
import com.justAm0dd3r.dye_extension.reference.Reference;
import com.justAm0dd3r.dye_extension.util.ReflectionUtil;
import com.justAm0dd3r.dye_extension.util.StringUtils;
import net.minecraft.block.AbstractButtonBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.StoneButtonBlock;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.sql.Ref;

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
                    stairsBlock(((StairsBlock) ReflectionUtil.requireBlockHolderByName(property.getDyedName()).getStairsBlock().get()),
                            dyedBaseName, modLoc("blocks/" + dyedBaseName));
                    break;
                case DataGenerationProperty.Type.SLAB:
                    SlabBlock slabBlock = (SlabBlock) ReflectionUtil.requireBlockHolderByName(property.getDyedName()).getSlabBlock().get();
                    slabBlock(slabBlock,
                            modLoc("block/" + dyedBaseName), modLoc("blocks/" + dyedBaseName));
                    break;
                case DataGenerationProperty.Type.BUTTON:
                    //AbstractButtonBlock buttonBlock = (AbstractButtonBlock) ReflectionUtil.requireBlockHolderByName(property.getDyedName()).getButtonBlock().get();
                    break;
                default:
                    simpleBlock(ReflectionUtil.requireBlockHolderByName(property.getDyedName()).getBlock().get(),
                            models().cubeAll(property.getDyedName(), modLoc("blocks/" + property.getDyedName())));
            }
        }
    }
}

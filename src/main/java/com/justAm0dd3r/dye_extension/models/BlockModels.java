package com.justAm0dd3r.dye_extension.models;

import com.justAm0dd3r.dye_extension.data_gen.DataGenerationProperties;
import com.justAm0dd3r.dye_extension.data_gen.DataGenerationProperty;
import com.justAm0dd3r.dye_extension.reference.Reference;
import com.justAm0dd3r.dye_extension.util.StringUtils;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockModelBuilder;
import net.minecraftforge.client.model.generators.BlockModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BlockModels extends BlockModelProvider {
    public BlockModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Reference.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        for (DataGenerationProperty property :
                DataGenerationProperties.getProperties()) {
            // Block Model
            String baseName = StringUtils.getDyedBaseName(property.getDyedName());
            switch (property.getType()) {
                case DataGenerationProperty.Type.STAIRS:
                    String stairsName = property.getDyedName();
                    for (String type : new String[] {"inner", "outer", ""}){
                        BlockModelBuilder builder = getBuilder(stairsName + (type.equals("") ? "" : ("_" + type)))
                                .parent(getExistingFile(mcLoc("block/" + (type.equals("") ? "" : (type + "_")) + "stairs")));
                        textures(baseName, builder, "bottom", "top", "side");
                    }
                    break;
                case DataGenerationProperty.Type.SLAB:
                    String slabName = property.getDyedName();
                    for (String type : new String[] {"_top", ""}) {
                        BlockModelBuilder builder = getBuilder(slabName + type)
                                .parent(getExistingFile(mcLoc("block/" + "slab" + type)));
                        textures(baseName, builder, "bottom", "top", "side");
                    }
                    break;
                case DataGenerationProperty.Type.BUTTON:
                    String buttonName = property.getDyedName();
                    for (String type : new String[] {"_pressed", ""}) {
                        BlockModelBuilder builder = getBuilder(buttonName + type)
                                .parent(getExistingFile(mcLoc("block/" + "button" + type)));
                        textures(baseName, builder, "texture");
                    }
                    break;
                default:
                    textures(property.getDyedName(), getBuilder(property.getDyedName()).parent(getExistingFile(mcLoc("block/cube_all"))), "all");
            }
        }
    }

    private void textures(String dyedName, BlockModelBuilder builder, String... keys) {
        for (String key :
                keys) {
            builder.texture(key, modLoc("blocks/" + dyedName));
        }
    }
}

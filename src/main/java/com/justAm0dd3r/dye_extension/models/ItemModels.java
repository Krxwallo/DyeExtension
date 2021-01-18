package com.justAm0dd3r.dye_extension.models;

import com.justAm0dd3r.dye_extension.data_gen.DataGenerationProperties;
import com.justAm0dd3r.dye_extension.data_gen.DataGenerationProperty;
import com.justAm0dd3r.dye_extension.reference.Reference;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ItemModels extends ItemModelProvider {
    public ItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Reference.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        for (DataGenerationProperty property : DataGenerationProperties.getProperties()) {
            String name = property.getDyedName();
            getBuilder(name)
                    .parent(getExistingFile(modLoc("block/" + name)));
        }
    }
}

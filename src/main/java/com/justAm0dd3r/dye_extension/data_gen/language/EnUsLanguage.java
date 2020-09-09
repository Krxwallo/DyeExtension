package com.justAm0dd3r.dye_extension.data_gen.language;

import com.justAm0dd3r.dye_extension.data_gen.properties.DataGenerationProperties;
import com.justAm0dd3r.dye_extension.data_gen.properties.DataGenerationProperty;
import com.justAm0dd3r.dye_extension.reference.Reference;
import com.justAm0dd3r.dye_extension.util.ReflectionUtils;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.DyeColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.common.data.LanguageProvider;
import org.apache.commons.lang3.text.WordUtils;

public class EnUsLanguage extends LanguageProvider {
    private static final ToolType[] TOOL_TYPES = new ToolType[] {
            ToolType.AXE, ToolType.HOE, ToolType.PICKAXE, ToolType.SHOVEL, ToolType.get("sword")
    };

    private static final String[] TOOL_LEVELS = new String[] {
            "wooden", "stone", "golden", "diamond", "netherite"
    };

    public EnUsLanguage(DataGenerator gen) {
        super(gen, Reference.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        for (DataGenerationProperty property : DataGenerationProperties.getProperties()) {
            add(ReflectionUtils.requireCorrespondingDyedBlockByName(property.getDyedName()),
                    getTranslation(property.getDyedName()));
        }
        for (DyeColor color :
                DyeColor.values()) {
            for (ToolType tool :
                    TOOL_TYPES) {
                for (String level : TOOL_LEVELS) {

                }
            }
        }
    }

    private String getTranslation(String name) {
        //noinspection deprecation
        return WordUtils.capitalize(name.replace('_', ' '));
    }
}

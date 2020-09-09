package com.justAm0dd3r.dye_extension.data_gen.properties;

import java.util.ArrayList;
import java.util.List;

public class DataGenerationProperties {
    private static final List<DataGenerationProperty> properties = new ArrayList<>();
    public static void addProperty(DataGenerationProperty property) {
        properties.add(property);
    }
    public static DataGenerationProperty[] getProperties() {
        return properties.toArray(new DataGenerationProperty[0]);
    }
}

package com.justAm0dd3r.dye_extension.util;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class LootTableUtils {
    public static JsonObject getLeavesJson(String name) {
        return new JsonParser().parse(
                "{\n" +
                        "  \"type\": \"minecraft:block\",\n" +
                        "  \"pools\": [\n" +
                        "    {\n" +
                        "      \"rolls\": 1,\n" +
                        "      \"entries\": [\n" +
                        "        {\n" +
                        "          \"type\": \"minecraft:alternatives\",\n" +
                        "          \"children\": [\n" +
                        "            {\n" +
                        "              \"type\": \"minecraft:item\",\n" +
                        "              \"conditions\": [\n" +
                        "                {\n" +
                        "                  \"condition\": \"minecraft:alternative\",\n" +
                        "                  \"terms\": [\n" +
                        "                    {\n" +
                        "                      \"condition\": \"minecraft:match_tool\",\n" +
                        "                      \"predicate\": {\n" +
                        "                        \"item\": \"minecraft:shears\"\n" +
                        "                      }\n" +
                        "                    },\n" +
                        "                    {\n" +
                        "                      \"condition\": \"minecraft:match_tool\",\n" +
                        "                      \"predicate\": {\n" +
                        "                        \"enchantments\": [\n" +
                        "                          {\n" +
                        "                            \"enchantment\": \"minecraft:silk_touch\",\n" +
                        "                            \"levels\": {\n" +
                        "                              \"min\": 1\n" +
                        "                            }\n" +
                        "                          }\n" +
                        "                        ]\n" +
                        "                      }\n" +
                        "                    }\n" +
                        "                  ]\n" +
                        "                }\n" +
                        "              ],\n" +
                        "              \"name\": \"dye_extension:" + name + "\"\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"type\": \"minecraft:item\",\n" +
                        "              \"conditions\": [\n" +
                        "                {\n" +
                        "                  \"condition\": \"minecraft:survives_explosion\"\n" +
                        "                },\n" +
                        "                {\n" +
                        "                  \"condition\": \"minecraft:table_bonus\",\n" +
                        "                  \"enchantment\": \"minecraft:fortune\",\n" +
                        "                  \"chances\": [\n" +
                        "                    0.05,\n" +
                        "                    0.0625,\n" +
                        "                    0.083333336,\n" +
                        "                    0.1\n" +
                        "                  ]\n" +
                        "                }\n" +
                        "              ],\n" +
                        "              \"name\": \"minecraft:oak_sapling\"\n" +
                        "            }\n" +
                        "          ]\n" +
                        "        }\n" +
                        "      ]\n" +
                        "    },\n" +
                        "    {\n" +
                        "      \"rolls\": 1,\n" +
                        "      \"entries\": [\n" +
                        "        {\n" +
                        "          \"type\": \"minecraft:item\",\n" +
                        "          \"conditions\": [\n" +
                        "            {\n" +
                        "              \"condition\": \"minecraft:table_bonus\",\n" +
                        "              \"enchantment\": \"minecraft:fortune\",\n" +
                        "              \"chances\": [\n" +
                        "                0.02,\n" +
                        "                0.022222223,\n" +
                        "                0.025,\n" +
                        "                0.033333335,\n" +
                        "                0.1\n" +
                        "              ]\n" +
                        "            }\n" +
                        "          ],\n" +
                        "          \"functions\": [\n" +
                        "            {\n" +
                        "              \"function\": \"minecraft:set_count\",\n" +
                        "              \"count\": {\n" +
                        "                \"min\": 1.0,\n" +
                        "                \"max\": 2.0,\n" +
                        "                \"type\": \"minecraft:uniform\"\n" +
                        "              }\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"function\": \"minecraft:explosion_decay\"\n" +
                        "            }\n" +
                        "          ],\n" +
                        "          \"name\": \"dye_extension:" + name + "\"\n" +
                        "        }\n" +
                        "      ],\n" +
                        "      \"conditions\": [\n" +
                        "        {\n" +
                        "          \"condition\": \"minecraft:inverted\",\n" +
                        "          \"term\": {\n" +
                        "            \"condition\": \"minecraft:alternative\",\n" +
                        "            \"terms\": [\n" +
                        "              {\n" +
                        "                \"condition\": \"minecraft:match_tool\",\n" +
                        "                \"predicate\": {\n" +
                        "                  \"item\": \"minecraft:shears\"\n" +
                        "                }\n" +
                        "              },\n" +
                        "              {\n" +
                        "                \"condition\": \"minecraft:match_tool\",\n" +
                        "                \"predicate\": {\n" +
                        "                  \"enchantments\": [\n" +
                        "                    {\n" +
                        "                      \"enchantment\": \"minecraft:silk_touch\",\n" +
                        "                      \"levels\": {\n" +
                        "                        \"min\": 1\n" +
                        "                      }\n" +
                        "                    }\n" +
                        "                  ]\n" +
                        "                }\n" +
                        "              }\n" +
                        "            ]\n" +
                        "          }\n" +
                        "        }\n" +
                        "      ]\n" +
                        "    },\n" +
                        "    {\n" +
                        "      \"rolls\": 1,\n" +
                        "      \"entries\": [\n" +
                        "        {\n" +
                        "          \"type\": \"minecraft:item\",\n" +
                        "          \"conditions\": [\n" +
                        "            {\n" +
                        "              \"condition\": \"minecraft:survives_explosion\"\n" +
                        "            },\n" +
                        "            {\n" +
                        "              \"condition\": \"minecraft:table_bonus\",\n" +
                        "              \"enchantment\": \"minecraft:fortune\",\n" +
                        "              \"chances\": [\n" +
                        "                0.005,\n" +
                        "                0.0055555557,\n" +
                        "                0.00625,\n" +
                        "                0.008333334,\n" +
                        "                0.025\n" +
                        "              ]\n" +
                        "            }\n" +
                        "          ],\n" +
                        "          \"name\": \"minecraft:apple\"\n" +
                        "        }\n" +
                        "      ],\n" +
                        "      \"conditions\": [\n" +
                        "        {\n" +
                        "          \"condition\": \"minecraft:inverted\",\n" +
                        "          \"term\": {\n" +
                        "            \"condition\": \"minecraft:alternative\",\n" +
                        "            \"terms\": [\n" +
                        "              {\n" +
                        "                \"condition\": \"minecraft:match_tool\",\n" +
                        "                \"predicate\": {\n" +
                        "                  \"item\": \"minecraft:shears\"\n" +
                        "                }\n" +
                        "              },\n" +
                        "              {\n" +
                        "                \"condition\": \"minecraft:match_tool\",\n" +
                        "                \"predicate\": {\n" +
                        "                  \"enchantments\": [\n" +
                        "                    {\n" +
                        "                      \"enchantment\": \"minecraft:silk_touch\",\n" +
                        "                      \"levels\": {\n" +
                        "                        \"min\": 1\n" +
                        "                      }\n" +
                        "                    }\n" +
                        "                  ]\n" +
                        "                }\n" +
                        "              }\n" +
                        "            ]\n" +
                        "          }\n" +
                        "        }\n" +
                        "      ]\n" +
                        "    }\n" +
                        "  ]\n" +
                        "}"
        ).getAsJsonObject();
    }
}

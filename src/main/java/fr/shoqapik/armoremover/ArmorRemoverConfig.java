package fr.shoqapik.armoremover;

import net.minecraftforge.common.ForgeConfigSpec;

import java.util.Arrays;
import java.util.List;

public class ArmorRemoverConfig {

    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<List<? extends String>> ARMORS_ITEMS;

    static{
        BUILDER.push("ArmorRemover Configuration");
        ARMORS_ITEMS = BUILDER.comment("List of armor to remove when broken").defineList("armors", Arrays.asList("minecraft:golden_helmet"), item -> true);
        BUILDER.pop();
        SPEC = BUILDER.build();
    }

}

package com.toggski.pb.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ModPlacedFeatures {

    public static final Holder<PlacedFeature> AMBER_ORE_PLACED = PlacementUtils.register("amber_ore_placed",
            ModConfiguredFeatures.AMBER_ORE, ModOrePlacement.commonOrePlacement(7,
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));

    public static final Holder<PlacedFeature> FOSSIL_ORE_PLACED = PlacementUtils.register("fossil_ore_placed",
            ModConfiguredFeatures.FOSSIL_ORE, ModOrePlacement.commonOrePlacement(10,
                    HeightRangePlacement.triangle(VerticalAnchor.absolute(-24), VerticalAnchor.absolute(56))));



}

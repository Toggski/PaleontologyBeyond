package com.toggski.pb.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {


    public static final ForgeTier AMBER = new ForgeTier(3, 2500, 10.0f, 5.0f,
            25, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ModItems.AMBER.get()));


}

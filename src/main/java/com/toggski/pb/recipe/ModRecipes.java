package com.toggski.pb.recipe;

import com.toggski.pb.PaleontologyBeyond;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, PaleontologyBeyond.MOD_ID);

    public static final RegistryObject<RecipeSerializer<DNAExtractorRecipe>> DNA_EXTRACTOR_SERIALIZER =
            SERIALIZERS.register("dna_extracting", () -> DNAExtractorRecipe.Serializer.INSTANCE);

    public static final RegistryObject<RecipeSerializer<PlushieMakerRecipe>> PLUSHIE_MAKER_SERIALIZER =
            SERIALIZERS.register("plushie_making", () -> PlushieMakerRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }

}

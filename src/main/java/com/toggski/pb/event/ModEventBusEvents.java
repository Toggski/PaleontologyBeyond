package com.toggski.pb.event;

import com.toggski.pb.PaleontologyBeyond;
import com.toggski.pb.event.loot.FibrousLeavesFromLeavesAdditionModifier;
import com.toggski.pb.recipe.DNAExtractorRecipe;
import com.toggski.pb.recipe.PlushieMakerRecipe;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = PaleontologyBeyond.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void registerModifierSerializers(@Nonnull final RegistryEvent.Register<GlobalLootModifierSerializer<?>>
                                                               event) {


        event.getRegistry().registerAll(

                new FibrousLeavesFromLeavesAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(PaleontologyBeyond.MOD_ID,"fibrous_leaves_from_leaves_acacia")),
                new FibrousLeavesFromLeavesAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(PaleontologyBeyond.MOD_ID,"fibrous_leaves_from_leaves_azalea")),
                new FibrousLeavesFromLeavesAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(PaleontologyBeyond.MOD_ID,"fibrous_leaves_from_leaves_birch")),
                new FibrousLeavesFromLeavesAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(PaleontologyBeyond.MOD_ID,"fibrous_leaves_from_leaves_dark_oak")),
                new FibrousLeavesFromLeavesAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(PaleontologyBeyond.MOD_ID,"fibrous_leaves_from_leaves_flowering_azalea")),
                new FibrousLeavesFromLeavesAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(PaleontologyBeyond.MOD_ID,"fibrous_leaves_from_leaves_jungle")),
                new FibrousLeavesFromLeavesAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(PaleontologyBeyond.MOD_ID,"fibrous_leaves_from_leaves_oak")),
                new FibrousLeavesFromLeavesAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(PaleontologyBeyond.MOD_ID,"fibrous_leaves_from_leaves_spruce"))


        );
    }

    @SubscribeEvent
    public static void registerRecipeTypes(final RegistryEvent.Register<RecipeSerializer<?>> event) {
        Registry.register(Registry.RECIPE_TYPE, DNAExtractorRecipe.Type.ID, DNAExtractorRecipe.Type.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, PlushieMakerRecipe.Type.ID, PlushieMakerRecipe.Type.INSTANCE);
    }
}

package com.toggski.pb.integration;

import com.toggski.pb.PaleontologyBeyond;
import com.toggski.pb.recipe.DNAExtractorRecipe;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeManager;

import java.util.List;
import java.util.Objects;

public class JEIPaleontologyBeyondPlugin implements IModPlugin {
    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(PaleontologyBeyond.MOD_ID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new
                DNAExtractorRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager rm = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();
        List<DNAExtractorRecipe> recipes = rm.getAllRecipesFor(DNAExtractorRecipe.Type.INSTANCE);
        registration.addRecipes(new RecipeType<>(DNAExtractorRecipeCategory.UID, DNAExtractorRecipe.class), recipes);
    }
}

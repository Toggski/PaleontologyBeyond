package com.toggski.pb.integration;

import com.toggski.pb.PaleontologyBeyond;
import com.toggski.pb.block.ModBlocks;
import com.toggski.pb.recipe.DNAExtractorRecipe;
import com.toggski.pb.recipe.PlushieMakerRecipe;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

import javax.annotation.Nonnull;

public class PlushieMakerRecipeCategory implements IRecipeCategory<PlushieMakerRecipe> {
    public final static ResourceLocation UID = new ResourceLocation(PaleontologyBeyond.MOD_ID, "plushie_making");
    public final static ResourceLocation TEXTURE =
            new ResourceLocation(PaleontologyBeyond.MOD_ID, "textures/gui/plushie_maker_container.png");

    private final IDrawable background;
    private final IDrawable icon;

    public PlushieMakerRecipeCategory(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 85);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM, new ItemStack(ModBlocks.PLUSHIE_MAKER.get()));
    }

    @Override
    public ResourceLocation getUid() {
        return UID;
    }

    @Override
    public Class<? extends PlushieMakerRecipe> getRecipeClass() {
        return PlushieMakerRecipe.class;
    }

    @Override
    public Component getTitle() {
        return new TextComponent("Dinosaur Plushie Maker");
    }

    @Override
    public IDrawable getBackground() {
        return this.background;
    }

    @Override
    public IDrawable getIcon() {
        return this.icon;
    }

    @Override
    public void setRecipe(@Nonnull IRecipeLayoutBuilder builder, @Nonnull PlushieMakerRecipe recipe, @Nonnull IFocusGroup focusGroup) {
        builder.addSlot(RecipeIngredientRole.INPUT, 50, 35).addIngredients(recipe.getIngredients().get(0));
        builder.addSlot(RecipeIngredientRole.OUTPUT, 116, 35).addItemStack(recipe.getResultItem());
    }
            //this.addSlot(new SlotItemHandler(handler, 0, 50, 35));
            //this.addSlot(new ModResultSlot(handler, 1, 116, 35));
}

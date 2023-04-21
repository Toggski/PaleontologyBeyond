package com.toggski.pb.integration;

import com.toggski.pb.PaleontologyBeyond;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.resources.ResourceLocation;

public class JEIPaleontologyBeyondPlugin implements IModPlugin {
    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(PaleontologyBeyond.MOD_ID, "jei_plugin");
    }
}

package com.toggski.pb.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import com.toggski.pb.PaleontologyBeyond;
import net.minecraft.ResourceLocationException;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

public class DNAExtractorScreen extends AbstractContainerScreen<DNAExtractorMenu> {
    private static final ResourceLocation TEXTURE =
            new ResourceLocation(PaleontologyBeyond.MOD_ID, "textures/gui/dna_extractor_container.png");


    public DNAExtractorScreen(DNAExtractorMenu pMenu, Inventory pPlayerInventory, Component pTitle) {
        super(pMenu, pPlayerInventory, pTitle);
    }

    @Override
    protected void renderBg(PoseStack pPoseStack, float pPartialTick, int pMouseX, int pMouseY) {

        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, TEXTURE);
        int x = (width - imageWidth) / 2;
        int y = (height - imageHeight) / 2;

        this.blit(pPoseStack, x, y, 0, 0, imageWidth, imageHeight);

    }

    @Override
    public void render(PoseStack pPoseStack, int pMouseX, int pMouseY, float delta) {
        renderBackground(pPoseStack);
        super.render(pPoseStack, pMouseX, pMouseY, delta);
        renderTooltip(pPoseStack, pMouseX, pMouseY);
    }
}

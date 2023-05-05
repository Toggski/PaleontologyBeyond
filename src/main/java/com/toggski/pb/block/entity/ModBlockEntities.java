package com.toggski.pb.block.entity;

import com.toggski.pb.PaleontologyBeyond;
import com.toggski.pb.block.ModBlocks;
import com.toggski.pb.block.entity.custom.DNAExtractorBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, PaleontologyBeyond.MOD_ID);



    public static final RegistryObject<BlockEntityType<DNAExtractorBlockEntity>> DNA_EXTRACTOR_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("dna_extractor_block_entity", () ->
                    BlockEntityType.Builder.of(DNAExtractorBlockEntity::new,
                            ModBlocks.DNA_EXTRACTOR.get()).build(null));





    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}

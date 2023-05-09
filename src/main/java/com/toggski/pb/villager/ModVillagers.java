package com.toggski.pb.villager;

import com.google.common.collect.ImmutableSet;
import com.toggski.pb.PaleontologyBeyond;
import com.toggski.pb.block.ModBlocks;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.util.ObfuscationReflectionHelper;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.lang.reflect.InvocationTargetException;

public class ModVillagers {
    public static final DeferredRegister<PoiType> POI_TYPES
            = DeferredRegister.create(ForgeRegistries.POI_TYPES, PaleontologyBeyond.MOD_ID);
    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS
            = DeferredRegister.create(ForgeRegistries.PROFESSIONS, PaleontologyBeyond.MOD_ID);


    public static final RegistryObject<PoiType> PALEONTOLOGISTS_WORKBENCH_POI = POI_TYPES.register("paleontologists_workbench_poi",
            () -> new PoiType("paleontologists_workbench_poi", PoiType.getBlockStates(ModBlocks.PALEONTOLOGISTS_WORKBENCH.get()), 1, 1));

    public static final RegistryObject<VillagerProfession> PALEONTOLOGIST = VILLAGER_PROFESSIONS.register("paleontologist",
            () -> new VillagerProfession("paleontologist", PALEONTOLOGISTS_WORKBENCH_POI.get(),
                    ImmutableSet.of(), ImmutableSet.of(), SoundEvents.VILLAGER_WORK_CARTOGRAPHER));


    public static void registerPOIs() {
        try {
            ObfuscationReflectionHelper.findMethod(PoiType.class,
                    "registerBlockStates", PoiType.class).invoke(null, PALEONTOLOGISTS_WORKBENCH_POI.get());
        } catch (InvocationTargetException | IllegalAccessException exception) {
            exception.printStackTrace();
        }
    }


    public static void register(IEventBus eventbus) {
        POI_TYPES.register(eventbus);
        VILLAGER_PROFESSIONS.register(eventbus);
    }
}

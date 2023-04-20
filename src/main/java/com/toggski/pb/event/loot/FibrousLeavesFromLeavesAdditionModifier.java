package com.toggski.pb.event.loot;

import com.google.gson.JsonObject;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nonnull;
import java.util.List;

public class FibrousLeavesFromLeavesAdditionModifier  extends LootModifier {
    private final Item addition;

    protected FibrousLeavesFromLeavesAdditionModifier(LootItemCondition[] conditionsIn, Item addition) {
        super(conditionsIn);
        this.addition = addition;
    }

    @Nonnull
    @Override
    protected List<ItemStack> doApply(List<ItemStack> generatedLoot, LootContext context) {
        // generatedLoot is the loot that would be dropped, if we wouldn't add or replace
        // anything!
            generatedLoot.add(new ItemStack(addition, 1));
        return generatedLoot;
    }

    public static class Serializer extends GlobalLootModifierSerializer<FibrousLeavesFromLeavesAdditionModifier> {

        @Override
        public FibrousLeavesFromLeavesAdditionModifier read(ResourceLocation name, JsonObject object,
                                                           LootItemCondition[] conditionsIn) {
            Item addition = ForgeRegistries.ITEMS.getValue(
                    new ResourceLocation(GsonHelper.getAsString(object, "addition")));
            return new FibrousLeavesFromLeavesAdditionModifier(conditionsIn, addition);
        }

        @Override
        public JsonObject write(FibrousLeavesFromLeavesAdditionModifier instance) {
            JsonObject json = makeConditions(instance.conditions);
            json.addProperty("addition", ForgeRegistries.ITEMS.getKey(instance.addition).toString());
            return json;
        }
    }
}

package net.paps.papsgymbadges.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.paps.papsgymbadges.PapsGymBadges;

public class ModItemGroups {
    // Custom Item Group to keep Items from this mod in within game
    public static final ItemGroup Badge_Group = Registry.register(Registries.ITEM_GROUP, new Identifier(PapsGymBadges.MOD_ID, "badges"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.badges"))
                    .icon(() -> new ItemStack(ModItems.ChargeBadge)).entries((displayContext, entries) -> {
                        // Add any badges to the correct item group below
                        entries.add(ModItems.ChargeBadge);
                        entries.add(ModItems.BlossomBadge);
                        entries.add(ModItems.TideBadge);
                        entries.add(ModItems.SageBadge);
                        entries.add(ModItems.EclipseBadge);
                        entries.add(ModItems.ZephyrBadge);
                        entries.add(ModItems.RoyalBadge);
                        entries.add(ModItems.PillarBadge);

                    }).build());

    public static void registerItemGroups(){
        PapsGymBadges.LOGGER.info("Registering Item Groups for " +PapsGymBadges.MOD_ID);
    }
}

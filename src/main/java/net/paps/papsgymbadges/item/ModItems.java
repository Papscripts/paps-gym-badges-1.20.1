package net.paps.papsgymbadges.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.paps.papsgymbadges.PapsGymBadges;

public class ModItems {
    // Add more items below
    public static final Item ChargeBadge = registerItem("charge_badge", new Item(new FabricItemSettings()));
    public static final Item BlossomBadge = registerItem("blossom_badge", new Item(new FabricItemSettings()));
    public static final Item TideBadge = registerItem("tide_badge", new Item(new FabricItemSettings()));
    public static final Item SageBadge = registerItem("sage_badge", new Item(new FabricItemSettings()));
    public static final Item EclipseBadge = registerItem("eclipse_badge", new Item(new FabricItemSettings()));
    public static final Item ZephyrBadge = registerItem("zephyr_badge", new Item(new FabricItemSettings()));
    public static final Item RoyalBadge = registerItem("royal_badge", new Item(new FabricItemSettings()));
    public static final Item PillarBadge = registerItem("pillar_badge", new Item(new FabricItemSettings()));
    // Add items to the item group with new entries below
    private static void addItemsToToolsItemGroup(FabricItemGroupEntries entries) {
        // entries.add(ChargeBadge);
        // entries.add(BlossomBadge);
       // entries.add(TideBadge);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(PapsGymBadges.MOD_ID, name), item);
    }

    public static void registerModItems() {
        PapsGymBadges.LOGGER.info("Registering Mod Items for " + PapsGymBadges.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToToolsItemGroup);
    }
}

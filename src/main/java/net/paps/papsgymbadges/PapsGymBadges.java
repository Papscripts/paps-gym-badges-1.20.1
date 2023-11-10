package net.paps.papsgymbadges;

import com.sun.jna.WString;
import net.fabricmc.api.ModInitializer;

import net.paps.papsgymbadges.item.ModItemGroups;
import net.paps.papsgymbadges.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PapsGymBadges implements ModInitializer {
	public static final String MOD_ID = "papsgymbadges";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// on game startup initialise all modded items and groups
		LOGGER.info("Hello Fabric world!");
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}
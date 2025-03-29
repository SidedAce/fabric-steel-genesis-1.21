package net.sided.steelgenesis;

import net.fabricmc.api.ModInitializer;

import net.sided.steelgenesis.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SteelGenesis implements ModInitializer {
	public static final String MOD_ID = "steelgenesis";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	// Commit Test
	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		LOGGER.info("Mod Initializing");
	}
}
package net.idothehax;

import net.fabricmc.api.ModInitializer;

import net.idothehax.item.ModItemGroups;
import net.idothehax.item.ModItems;
import net.idothehax.block.ModBlocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NotEnoughLuck implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final String MOD_ID = "notenoughluck";
	public static final Logger LOGGER = LoggerFactory.getLogger("notenoughluck");

	@Override
	public void onInitialize() {
		LOGGER.info("Let's go gambling!");

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
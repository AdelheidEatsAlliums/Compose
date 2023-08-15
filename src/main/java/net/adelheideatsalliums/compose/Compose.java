package net.adelheideatsalliums.compose;

import net.adelheideatsalliums.compose.block.*;
import net.adelheideatsalliums.compose.registry.ItemGroupPlacement;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Compose implements ModInitializer {
	public static final String COMPOSE = "compose";
	public static final Logger LOGGER = LoggerFactory.getLogger("COMPOSE");

	@Override
	public void onInitialize() {
		ComposePolished.registerBlock();
		ComposeBricks.registerBlock();
		ComposeBrickStairs.registerBlock();
		ComposeBrickSlabs.registerBlock();
		ComposePolishedStairs.registerBlock();
		ComposePolishedSlabs.registerBlock();
		ComposePolishedWalls.registerBlock();
		ComposePolishedPressurePlates.registerBlock();
		ComposePillars.registerBlock();
		ComposePillarSlabs.registerBlock();
		ComposeSlabs.registerBlock();

		ItemGroupPlacement.placeItems();

	}
}

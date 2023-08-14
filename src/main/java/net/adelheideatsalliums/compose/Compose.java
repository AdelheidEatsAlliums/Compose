package net.adelheideatsalliums.compose;

import net.adelheideatsalliums.compose.block.*;
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

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBricks.ANDESITE_BRICKS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickStairs.ANDESITE_BRICK_STAIRS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickSlabs.ANDESITE_BRICK_SLAB);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBricks.CRACKED_ANDESITE_BRICKS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickStairs.CRACKED_ANDESITE_BRICK_STAIRS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickSlabs.CRACKED_ANDESITE_BRICK_SLAB);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBricks.MOSSY_ANDESITE_BRICKS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickStairs.MOSSY_ANDESITE_BRICK_STAIRS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickSlabs.MOSSY_ANDESITE_BRICK_SLAB);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposePillars.ANDESITE_PILLAR);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposePillarSlabs.ANDESITE_PILLAR_SLAB);});

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposePolished.POLISHED_TUFF);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposePolishedStairs.POLISHED_TUFF_STAIRS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposePolishedSlabs.POLISHED_TUFF_SLAB);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposePolishedWalls.POLISHED_TUFF_WALL);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposePolishedPressurePlates.POLISHED_TUFF_PRESSURE_PLATE);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBricks.TUFF_BRICKS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickStairs.TUFF_BRICK_STAIRS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickSlabs.TUFF_BRICK_SLAB);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBricks.CRACKED_TUFF_BRICKS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickStairs.CRACKED_TUFF_BRICK_STAIRS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickSlabs.CRACKED_TUFF_BRICK_SLAB);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBricks.MOSSY_TUFF_BRICKS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickStairs.MOSSY_TUFF_BRICK_STAIRS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickSlabs.MOSSY_TUFF_BRICK_SLAB);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposePillars.TUFF_PILLAR);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposePillarSlabs.TUFF_PILLAR_SLAB);});

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBricks.BASALT_BRICKS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickStairs.BASALT_BRICK_STAIRS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickSlabs.BASALT_BRICK_SLAB);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBricks.CRACKED_BASALT_BRICKS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickStairs.CRACKED_BASALT_BRICK_STAIRS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickSlabs.CRACKED_BASALT_BRICK_SLAB);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBricks.MOSSY_BASALT_BRICKS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickStairs.MOSSY_BASALT_BRICK_STAIRS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickSlabs.MOSSY_BASALT_BRICK_SLAB);});

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBricks.COBBLESTONE_BRICKS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickStairs.COBBLESTONE_BRICK_STAIRS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickSlabs.COBBLESTONE_BRICK_SLAB);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBricks.CRACKED_COBBLESTONE_BRICKS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickStairs.CRACKED_COBBLESTONE_BRICK_STAIRS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickSlabs.CRACKED_COBBLESTONE_BRICK_SLAB);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBricks.MOSSY_COBBLESTONE_BRICKS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickStairs.MOSSY_COBBLESTONE_BRICK_STAIRS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickSlabs.MOSSY_COBBLESTONE_BRICK_SLAB);});

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBricks.CRYING_OBSIDIAN_BRICKS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickStairs.CRYING_OBSIDIAN_BRICK_STAIRS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickSlabs.CRYING_OBSIDIAN_BRICK_SLAB);});

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBricks.DIORITE_BRICKS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickStairs.DIORITE_BRICK_STAIRS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickSlabs.DIORITE_BRICK_SLAB);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBricks.CRACKED_DIORITE_BRICKS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickStairs.CRACKED_DIORITE_BRICK_STAIRS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickSlabs.CRACKED_DIORITE_BRICK_SLAB);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBricks.MOSSY_DIORITE_BRICKS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickStairs.MOSSY_DIORITE_BRICK_STAIRS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickSlabs.MOSSY_DIORITE_BRICK_SLAB);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposePillars.DIORITE_PILLAR);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposePillarSlabs.DIORITE_PILLAR_SLAB);});

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBricks.DIRT_BRICKS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickStairs.DIRT_BRICK_STAIRS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickSlabs.DIRT_BRICK_SLAB);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBricks.CRACKED_DIRT_BRICKS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickStairs.CRACKED_DIRT_BRICK_STAIRS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickSlabs.CRACKED_DIRT_BRICK_SLAB);});

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposePolished.POLISHED_DRIPSTONE);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposePolishedStairs.POLISHED_DRIPSTONE_STAIRS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposePolishedSlabs.POLISHED_DRIPSTONE_SLAB);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposePolishedWalls.POLISHED_DRIPSTONE_WALL);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposePolishedPressurePlates.POLISHED_DRIPSTONE_PRESSURE_PLATE);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBricks.DRIPSTONE_BRICKS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickStairs.DRIPSTONE_BRICK_STAIRS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickSlabs.DRIPSTONE_BRICK_SLAB);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBricks.CRACKED_DRIPSTONE_BRICKS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickStairs.CRACKED_DRIPSTONE_BRICK_STAIRS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickSlabs.CRACKED_DRIPSTONE_BRICK_SLAB);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBricks.MOSSY_DRIPSTONE_BRICKS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickStairs.MOSSY_DRIPSTONE_BRICK_STAIRS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickSlabs.MOSSY_DRIPSTONE_BRICK_SLAB);});

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBricks.GRANITE_BRICKS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickStairs.GRANITE_BRICK_STAIRS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickSlabs.GRANITE_BRICK_SLAB);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBricks.CRACKED_GRANITE_BRICKS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickStairs.CRACKED_GRANITE_BRICK_STAIRS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickSlabs.CRACKED_GRANITE_BRICK_SLAB);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBricks.MOSSY_GRANITE_BRICKS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickStairs.MOSSY_GRANITE_BRICK_STAIRS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickSlabs.MOSSY_GRANITE_BRICK_SLAB);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposePillars.GRANITE_PILLAR);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposePillarSlabs.GRANITE_PILLAR_SLAB);});

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBricks.OBSIDIAN_BRICKS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickStairs.OBSIDIAN_BRICK_STAIRS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickSlabs.OBSIDIAN_BRICK_SLAB);});

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBricks.RED_SANDSTONE_BRICKS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickStairs.RED_SANDSTONE_BRICK_STAIRS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickSlabs.RED_SANDSTONE_BRICK_SLAB);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBricks.CRACKED_RED_SANDSTONE_BRICKS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickStairs.CRACKED_RED_SANDSTONE_BRICK_STAIRS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickSlabs.RED_SANDSTONE_BRICK_SLAB);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposePillars.RED_SANDSTONE_PILLAR);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposePillarSlabs.RED_SANDSTONE_PILLAR_SLAB);});

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBricks.SANDSTONE_BRICKS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickStairs.SANDSTONE_BRICK_STAIRS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickSlabs.SANDSTONE_BRICK_SLAB);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBricks.CRACKED_SANDSTONE_BRICKS);});;
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickStairs.CRACKED_SANDSTONE_BRICK_STAIRS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickSlabs.CRACKED_RED_SANDSTONE_BRICK_SLAB);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposePillars.SANDSTONE_PILLAR);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposePillarSlabs.SANDSTONE_PILLAR_SLAB);});

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposePolished.POLISHED_CALCITE);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposePolishedStairs.POLISHED_CALCITE_STAIRS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposePolishedSlabs.POLISHED_CALCITE_SLAB);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposePolishedWalls.POLISHED_CALCITE_WALL);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposePolishedPressurePlates.POLISHED_CALCITE_PRESSURE_PLATE);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBricks.CALCITE_BRICKS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickStairs.CALCITE_BRICK_STAIRS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickSlabs.CALCITE_BRICK_SLAB);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBricks.CRACKED_CALCITE_BRICKS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickStairs.CRACKED_CALCITE_BRICK_STAIRS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickSlabs.CRACKED_CALCITE_BRICK_SLAB);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBricks.MOSSY_CALCITE_BRICKS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickStairs.MOSSY_CALCITE_BRICK_STAIRS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickSlabs.MOSSY_CALCITE_BRICK_SLAB);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposePillars.CALCITE_PILLAR);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposePillarSlabs.CALCITE_PILLAR_SLAB);});

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBricks.PURPUR_BRICKS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickStairs.PURPUR_BRICK_STAIRS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickSlabs.PURPUR_BRICK_SLAB);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBricks.CRACKED_PURPUR_BRICKS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickStairs.CRACKED_PURPUR_BRICK_STAIRS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickSlabs.CRACKED_PURPUR_BRICK_SLAB);});

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBricks.COARSE_DIRT_BRICKS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickStairs.COARSE_DIRT_BRICK_STAIRS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickSlabs.COARSE_DIRT_BRICK_SLAB);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBricks.CRACKED_COARSE_DIRT_BRICKS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickStairs.CRACKED_COARSE_DIRT_BRICK_STAIRS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickSlabs.CRACKED_COARSE_DIRT_BRICK_SLAB);});

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBricks.ROOTED_DIRT_BRICKS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickStairs.ROOTED_DIRT_BRICK_STAIRS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickSlabs.ROOTED_DIRT_BRICK_SLAB);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBricks.CRACKED_ROOTED_DIRT_BRICKS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickStairs.CRACKED_ROOTED_DIRT_BRICK_STAIRS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickSlabs.CRACKED_ROOTED_DIRT_BRICK_SLAB);});

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBricks.ICE_BRICKS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickStairs.ICE_BRICK_STAIRS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickSlabs.ICE_BRICK_SLAB);});

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBricks.PACKED_ICE_BRICKS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickStairs.PACKED_ICE_BRICK_STAIRS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickSlabs.PACKED_ICE_BRICK_SLAB);});

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBricks.BLUE_ICE_BRICKS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickStairs.BLUE_ICE_BRICK_STAIRS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickSlabs.BLUE_ICE_BRICK_SLAB);});

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBricks.SOUL_SAND_BRICKS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickStairs.SOUL_SAND_BRICK_STAIRS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickSlabs.SOUL_SAND_BRICK_SLAB);});

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBricks.SOUL_SOIL_BRICKS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickStairs.SOUL_SOIL_BRICK_STAIRS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickSlabs.SOUL_SOIL_BRICK_SLAB);});

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBricks.SNOW_BRICKS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickStairs.SNOW_BRICK_STAIRS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickSlabs.SNOW_BRICK_SLAB);});

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBricks.NETHERRACK_BRICKS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickStairs.NETHERRACK_BRICK_STAIRS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposeBrickSlabs.NETHERRACK_BRICK_SLAB);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposePillars.NETHERRACK_PILLAR);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposePillarSlabs.NETHERRACK_PILLAR_SLAB);});

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposePolished.POLISHED_END_STONE);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposePolishedStairs.POLISHED_END_STONE_STAIRS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposePolishedSlabs.POLISHED_END_STONE_SLAB);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposePolishedWalls.POLISHED_END_STONE_WALL);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposePolishedPressurePlates.POLISHED_END_STONE_PRESSURE_PLATE);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposePillars.END_STONE_PILLAR);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposePillarSlabs.END_STONE_PILLAR_SLAB);});

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposePolished.POLISHED_MUD);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposePolishedStairs.POLISHED_MUD_STAIRS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposePolishedSlabs.POLISHED_MUD_SLAB);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposePolishedWalls.POLISHED_MUD_WALL);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposePolishedPressurePlates.POLISHED_MUD_PRESSURE_PLATE);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposePillars.MUD_PILLAR);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposePillarSlabs.MUD_PILLAR_SLAB);});

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposePolished.POLISHED_PRISMARINE);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposePolishedStairs.POLISHED_PRISMARINE_STAIRS);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposePolishedSlabs.POLISHED_PRISMARINE_SLAB);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposePolishedWalls.POLISHED_PRISMARINE_WALL);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposePolishedPressurePlates.POLISHED_PRISMARINE_PRESSURE_PLATE);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposePillars.PRISMARINE_PILLAR);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposePillarSlabs.PRISMARINE_PILLAR_SLAB);});

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposePillars.STONE_PILLAR);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposePillarSlabs.STONE_PILLAR_SLAB);});

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposePillars.DEEPSLATE_PILLAR);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposePillarSlabs.DEEPSLATE_PILLAR_SLAB);});

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposePillars.BLACKSTONE_PILLAR);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(ComposePillarSlabs.BLACKSTONE_PILLAR_SLAB);});


	}
}

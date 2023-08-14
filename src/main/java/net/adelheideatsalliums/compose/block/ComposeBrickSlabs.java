package net.adelheideatsalliums.compose.block;

import net.adelheideatsalliums.compose.block.blockClass.ComposeStairsBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ComposeBrickSlabs {
    public static final Block ANDESITE_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.ANDESITE).requiresTool());
    public static final Block BASALT_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.BASALT).requiresTool());
    public static final Block COBBLESTONE_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.COBBLESTONE).requiresTool());
    public static final Block CRYING_OBSIDIAN_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.OBSIDIAN).requiresTool());
    public static final Block DIORITE_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.DIORITE).requiresTool());
    public static final Block DIRT_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.DIRT));
    public static final Block DRIPSTONE_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.DRIPSTONE_BLOCK).requiresTool());
    public static final Block GRANITE_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.GRANITE).requiresTool());
    public static final Block OBSIDIAN_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.OBSIDIAN).requiresTool());
    public static final Block RED_SANDSTONE_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.RED_SANDSTONE).requiresTool());
    public static final Block SANDSTONE_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.SANDSTONE).requiresTool());
    public static final Block CALCITE_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.CALCITE).requiresTool());
    public static final Block TUFF_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.TUFF).requiresTool());
    public static final Block NETHERRACK_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.NETHERRACK).requiresTool());
    public static final Block SNOW_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.SNOW));
    public static final Block PURPUR_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.PURPUR_BLOCK).requiresTool());
    public static final Block COARSE_DIRT_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.COARSE_DIRT));
    public static final Block ROOTED_DIRT_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.ROOTED_DIRT));
    public static final Block ICE_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.ICE).requiresTool());
    public static final Block PACKED_ICE_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.PACKED_ICE).requiresTool());
    public static final Block BLUE_ICE_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.BLUE_ICE).requiresTool());
    public static final Block SOUL_SAND_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.SOUL_SAND));
    public static final Block SOUL_SOIL_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.SOUL_SOIL));

    public static final Block MOSSY_COBBLESTONE_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.COBBLESTONE).requiresTool());
    public static final Block MOSSY_ANDESITE_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.ANDESITE).requiresTool());
    public static final Block MOSSY_BASALT_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.BASALT).requiresTool());
    public static final Block MOSSY_DIORITE_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.DIORITE).requiresTool());
    public static final Block MOSSY_DRIPSTONE_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.DRIPSTONE_BLOCK).requiresTool());
    public static final Block MOSSY_GRANITE_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.GRANITE).requiresTool());
    public static final Block MOSSY_CALCITE_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.CALCITE).requiresTool());
    public static final Block MOSSY_TUFF_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.TUFF).requiresTool());

    public static final Block CRACKED_ANDESITE_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.ANDESITE).requiresTool());
    public static final Block CRACKED_BASALT_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.BASALT).requiresTool());
    public static final Block CRACKED_COBBLESTONE_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.COBBLESTONE).requiresTool());
    public static final Block CRACKED_DIORITE_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.DIORITE).requiresTool());
    public static final Block CRACKED_DIRT_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.DIRT));
    public static final Block CRACKED_DRIPSTONE_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.DRIPSTONE_BLOCK).requiresTool());
    public static final Block CRACKED_GRANITE_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.GRANITE).requiresTool());
    public static final Block CRACKED_RED_SANDSTONE_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.RED_SANDSTONE).requiresTool());
    public static final Block CRACKED_SANDSTONE_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.SANDSTONE).requiresTool());
    public static final Block CRACKED_CALCITE_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.CALCITE).requiresTool());
    public static final Block CRACKED_TUFF_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.TUFF).requiresTool());
    public static final Block CRACKED_PURPUR_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.PURPUR_BLOCK).requiresTool());
    public static final Block CRACKED_COARSE_DIRT_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.COARSE_DIRT));
    public static final Block CRACKED_ROOTED_DIRT_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.ROOTED_DIRT));

    public static void registerBlock() {
        Registry.register(Registries.BLOCK, new Identifier("compose", "andesite_brick_slab"), ANDESITE_BRICK_SLAB);
        Registry.register(Registries.BLOCK, new Identifier("compose", "basalt_brick_slab"), BASALT_BRICK_SLAB);
        Registry.register(Registries.BLOCK, new Identifier("compose", "cobblestone_brick_slab"), COBBLESTONE_BRICK_SLAB);
        Registry.register(Registries.BLOCK, new Identifier("compose", "crying_obsidian_brick_slab"), CRYING_OBSIDIAN_BRICK_SLAB);
        Registry.register(Registries.BLOCK, new Identifier("compose", "diorite_brick_slab"), DIORITE_BRICK_SLAB);
        Registry.register(Registries.BLOCK, new Identifier("compose", "dirt_brick_slab"), DIRT_BRICK_SLAB);
        Registry.register(Registries.BLOCK, new Identifier("compose", "dripstone_brick_slab"), DRIPSTONE_BRICK_SLAB);
        Registry.register(Registries.BLOCK, new Identifier("compose", "granite_brick_slab"), GRANITE_BRICK_SLAB);
        Registry.register(Registries.BLOCK, new Identifier("compose", "obsidian_brick_slab"), OBSIDIAN_BRICK_SLAB);
        Registry.register(Registries.BLOCK, new Identifier("compose", "red_sandstone_brick_slab"), RED_SANDSTONE_BRICK_SLAB);
        Registry.register(Registries.BLOCK, new Identifier("compose", "sandstone_brick_slab"), SANDSTONE_BRICK_SLAB);
        Registry.register(Registries.BLOCK, new Identifier("compose", "calcite_brick_slab"), CALCITE_BRICK_SLAB);
        Registry.register(Registries.BLOCK, new Identifier("compose", "tuff_brick_slab"), TUFF_BRICK_SLAB);
        Registry.register(Registries.BLOCK, new Identifier("compose", "netherrack_brick_slab"), NETHERRACK_BRICK_SLAB);
        Registry.register(Registries.BLOCK, new Identifier("compose", "snow_brick_slab"), SNOW_BRICK_SLAB);
        Registry.register(Registries.BLOCK, new Identifier("compose", "purpur_brick_slab"), PURPUR_BRICK_SLAB);
        Registry.register(Registries.BLOCK, new Identifier("compose", "coarse_dirt_brick_slab"), COARSE_DIRT_BRICK_SLAB);
        Registry.register(Registries.BLOCK, new Identifier("compose", "rooted_dirt_brick_slab"), ROOTED_DIRT_BRICK_SLAB);
        Registry.register(Registries.BLOCK, new Identifier("compose", "ice_brick_slab"), ICE_BRICK_SLAB);
        Registry.register(Registries.BLOCK, new Identifier("compose", "packed_ice_brick_slab"), PACKED_ICE_BRICK_SLAB);
        Registry.register(Registries.BLOCK, new Identifier("compose", "blue_ice_brick_slab"), BLUE_ICE_BRICK_SLAB);
        Registry.register(Registries.BLOCK, new Identifier("compose", "soul_sand_brick_slab"), SOUL_SAND_BRICK_SLAB);
        Registry.register(Registries.BLOCK, new Identifier("compose", "soul_soil_brick_slab"), SOUL_SOIL_BRICK_SLAB);

        Registry.register(Registries.BLOCK, new Identifier("compose", "mossy_basalt_brick_slab"), MOSSY_BASALT_BRICK_SLAB);
        Registry.register(Registries.BLOCK, new Identifier("compose", "mossy_cobblestone_brick_slab"), MOSSY_COBBLESTONE_BRICK_SLAB);
        Registry.register(Registries.BLOCK, new Identifier("compose", "mossy_andesite_brick_slab"), MOSSY_ANDESITE_BRICK_SLAB);
        Registry.register(Registries.BLOCK, new Identifier("compose", "mossy_diorite_brick_slab"), MOSSY_DIORITE_BRICK_SLAB);
        Registry.register(Registries.BLOCK, new Identifier("compose", "mossy_dripstone_brick_slab"), MOSSY_DRIPSTONE_BRICK_SLAB);
        Registry.register(Registries.BLOCK, new Identifier("compose", "mossy_granite_brick_slab"), MOSSY_GRANITE_BRICK_SLAB);
        Registry.register(Registries.BLOCK, new Identifier("compose", "mossy_calcite_brick_slab"), MOSSY_CALCITE_BRICK_SLAB);
        Registry.register(Registries.BLOCK, new Identifier("compose", "mossy_tuff_brick_slab"), MOSSY_TUFF_BRICK_SLAB);

        Registry.register(Registries.BLOCK, new Identifier("compose", "cracked_andesite_brick_slab"), CRACKED_ANDESITE_BRICK_SLAB);
        Registry.register(Registries.BLOCK, new Identifier("compose", "cracked_basalt_brick_slab"), CRACKED_BASALT_BRICK_SLAB);
        Registry.register(Registries.BLOCK, new Identifier("compose", "cracked_cobblestone_brick_slab"), CRACKED_COBBLESTONE_BRICK_SLAB);
        Registry.register(Registries.BLOCK, new Identifier("compose", "cracked_diorite_brick_slab"), CRACKED_DIORITE_BRICK_SLAB);
        Registry.register(Registries.BLOCK, new Identifier("compose", "cracked_dirt_brick_slab"), CRACKED_DIRT_BRICK_SLAB);
        Registry.register(Registries.BLOCK, new Identifier("compose", "cracked_dripstone_brick_slab"), CRACKED_DRIPSTONE_BRICK_SLAB);
        Registry.register(Registries.BLOCK, new Identifier("compose", "cracked_granite_brick_slab"), CRACKED_GRANITE_BRICK_SLAB);
        Registry.register(Registries.BLOCK, new Identifier("compose", "cracked_red_sandstone_brick_slab"), CRACKED_RED_SANDSTONE_BRICK_SLAB);
        Registry.register(Registries.BLOCK, new Identifier("compose", "cracked_sandstone_brick_slab"), CRACKED_SANDSTONE_BRICK_SLAB);
        Registry.register(Registries.BLOCK, new Identifier("compose", "cracked_calcite_brick_slab"), CRACKED_CALCITE_BRICK_SLAB);
        Registry.register(Registries.BLOCK, new Identifier("compose", "cracked_tuff_brick_slab"), CRACKED_TUFF_BRICK_SLAB);
        Registry.register(Registries.BLOCK, new Identifier("compose", "cracked_purpur_brick_slab"), CRACKED_PURPUR_BRICK_SLAB);
        Registry.register(Registries.BLOCK, new Identifier("compose", "cracked_coarse_dirt_brick_slab"), CRACKED_COARSE_DIRT_BRICK_SLAB);
        Registry.register(Registries.BLOCK, new Identifier("compose", "cracked_rooted_dirt_brick_slab"), CRACKED_ROOTED_DIRT_BRICK_SLAB);



        Registry.register(Registries.ITEM, new Identifier("compose", "andesite_brick_slab"), new BlockItem(ANDESITE_BRICK_SLAB, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "basalt_brick_slab"), new BlockItem(BASALT_BRICK_SLAB, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "cobblestone_brick_slab"), new BlockItem(COBBLESTONE_BRICK_SLAB, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "crying_obsidian_brick_slab"), new BlockItem(CRYING_OBSIDIAN_BRICK_SLAB, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "diorite_brick_slab"), new BlockItem(DIORITE_BRICK_SLAB, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "dirt_brick_slab"), new BlockItem(DIRT_BRICK_SLAB, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "dripstone_brick_slab"), new BlockItem(DRIPSTONE_BRICK_SLAB, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "granite_brick_slab"), new BlockItem(GRANITE_BRICK_SLAB, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "obsidian_brick_slab"), new BlockItem(OBSIDIAN_BRICK_SLAB, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "red_sandstone_brick_slab"), new BlockItem(RED_SANDSTONE_BRICK_SLAB, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "sandstone_brick_slab"), new BlockItem(SANDSTONE_BRICK_SLAB, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "calcite_brick_slab"), new BlockItem(CALCITE_BRICK_SLAB, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "tuff_brick_slab"), new BlockItem(TUFF_BRICK_SLAB, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "netherrack_brick_slab"), new BlockItem(NETHERRACK_BRICK_SLAB, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "snow_brick_slab"), new BlockItem(SNOW_BRICK_SLAB, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "purpur_brick_slab"), new BlockItem(PURPUR_BRICK_SLAB, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "coarse_dirt_brick_slab"), new BlockItem(COARSE_DIRT_BRICK_SLAB, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "rooted_dirt_brick_slab"), new BlockItem(ROOTED_DIRT_BRICK_SLAB, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "ice_brick_slab"), new BlockItem(ICE_BRICK_SLAB, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "packed_ice_brick_slab"), new BlockItem(PACKED_ICE_BRICK_SLAB, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "blue_ice_brick_slab"), new BlockItem(BLUE_ICE_BRICK_SLAB, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "soul_sand_brick_slab"), new BlockItem(SOUL_SAND_BRICK_SLAB, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "soul_soil_brick_slab"), new BlockItem(SOUL_SOIL_BRICK_SLAB, new FabricItemSettings()));

        Registry.register(Registries.ITEM, new Identifier("compose", "mossy_andesite_brick_slab"), new BlockItem(MOSSY_ANDESITE_BRICK_SLAB, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "mossy_basalt_brick_slab"), new BlockItem(MOSSY_BASALT_BRICK_SLAB, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "mossy_cobblestone_brick_slab"), new BlockItem(MOSSY_COBBLESTONE_BRICK_SLAB, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "mossy_diorite_brick_slab"), new BlockItem(MOSSY_DIORITE_BRICK_SLAB, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "mossy_dripstone_brick_slab"), new BlockItem(MOSSY_DRIPSTONE_BRICK_SLAB, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "mossy_granite_brick_slab"), new BlockItem(MOSSY_GRANITE_BRICK_SLAB, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "mossy_calcite_brick_slab"), new BlockItem(MOSSY_CALCITE_BRICK_SLAB, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "mossy_tuff_brick_slab"), new BlockItem(MOSSY_TUFF_BRICK_SLAB, new Item.Settings()));

        Registry.register(Registries.ITEM, new Identifier("compose", "cracked_andesite_brick_slab"), new BlockItem(CRACKED_ANDESITE_BRICK_SLAB, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "cracked_basalt_brick_slab"), new BlockItem(CRACKED_BASALT_BRICK_SLAB, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "cracked_cobblestone_brick_slab"), new BlockItem(CRACKED_COBBLESTONE_BRICK_SLAB, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "cracked_diorite_brick_slab"), new BlockItem(CRACKED_DIORITE_BRICK_SLAB, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "cracked_dirt_brick_slab"), new BlockItem(CRACKED_DIRT_BRICK_SLAB, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "cracked_dripstone_brick_slab"), new BlockItem(CRACKED_DRIPSTONE_BRICK_SLAB, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "cracked_granite_brick_slab"), new BlockItem(CRACKED_GRANITE_BRICK_SLAB, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "cracked_red_sandstone_brick_slab"), new BlockItem(CRACKED_RED_SANDSTONE_BRICK_SLAB, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "cracked_sandstone_brick_slab"), new BlockItem(CRACKED_SANDSTONE_BRICK_SLAB, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "cracked_calcite_brick_slab"), new BlockItem(CRACKED_CALCITE_BRICK_SLAB, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "cracked_tuff_brick_slab"), new BlockItem(CRACKED_TUFF_BRICK_SLAB, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "cracked_purpur_brick_slab"), new BlockItem(CRACKED_PURPUR_BRICK_SLAB, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "cracked_coarse_dirt_brick_slab"), new BlockItem(CRACKED_COARSE_DIRT_BRICK_SLAB, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "cracked_rooted_dirt_brick_slab"), new BlockItem(CRACKED_ROOTED_DIRT_BRICK_SLAB, new Item.Settings()));
    }
}

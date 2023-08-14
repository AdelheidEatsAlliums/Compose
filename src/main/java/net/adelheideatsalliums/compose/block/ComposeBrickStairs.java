//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.adelheideatsalliums.compose.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.adelheideatsalliums.compose.block.blockClass.ComposeStairsBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
public class ComposeBrickStairs {
    public static final Block ANDESITE_BRICK_STAIRS = new ComposeStairsBlock(ComposeBricks.ANDESITE_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.ANDESITE).requiresTool());
    public static final Block BASALT_BRICK_STAIRS = new ComposeStairsBlock(ComposeBricks.BASALT_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.BASALT).requiresTool());
    public static final Block COBBLESTONE_BRICK_STAIRS = new ComposeStairsBlock(ComposeBricks.COBBLESTONE_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.COBBLESTONE).requiresTool());
    public static final Block CRYING_OBSIDIAN_BRICK_STAIRS = new ComposeStairsBlock(ComposeBricks.CRYING_OBSIDIAN_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.OBSIDIAN).requiresTool());
    public static final Block DIORITE_BRICK_STAIRS = new ComposeStairsBlock(ComposeBricks.DIORITE_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.DIORITE).requiresTool());
    public static final Block DIRT_BRICK_STAIRS = new ComposeStairsBlock(ComposeBricks.DIRT_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.DIRT));
    public static final Block DRIPSTONE_BRICK_STAIRS = new ComposeStairsBlock(ComposeBricks.DRIPSTONE_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.DRIPSTONE_BLOCK).requiresTool());
    public static final Block GRANITE_BRICK_STAIRS = new ComposeStairsBlock(ComposeBricks.GRANITE_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.GRANITE).requiresTool());
    public static final Block OBSIDIAN_BRICK_STAIRS = new ComposeStairsBlock(ComposeBricks.OBSIDIAN_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.OBSIDIAN).requiresTool());
    public static final Block RED_SANDSTONE_BRICK_STAIRS = new ComposeStairsBlock(ComposeBricks.RED_SANDSTONE_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.RED_SANDSTONE).requiresTool());
    public static final Block SANDSTONE_BRICK_STAIRS = new ComposeStairsBlock(ComposeBricks.SANDSTONE_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.SANDSTONE).requiresTool());
    public static final Block CALCITE_BRICK_STAIRS = new ComposeStairsBlock(ComposeBricks.CALCITE_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.CALCITE).requiresTool());
    public static final Block TUFF_BRICK_STAIRS = new ComposeStairsBlock(ComposeBricks.TUFF_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.TUFF).requiresTool());
    public static final Block NETHERRACK_BRICK_STAIRS = new ComposeStairsBlock(ComposeBricks.NETHERRACK_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.NETHERRACK).requiresTool());
    public static final Block SNOW_BRICK_STAIRS = new ComposeStairsBlock(ComposeBricks.SNOW_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.SNOW));
    public static final Block PURPUR_BRICK_STAIRS = new ComposeStairsBlock(ComposeBricks.PURPUR_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.PURPUR_BLOCK).requiresTool());
    public static final Block COARSE_DIRT_BRICK_STAIRS = new ComposeStairsBlock(ComposeBricks.COARSE_DIRT_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.COARSE_DIRT));
    public static final Block ROOTED_DIRT_BRICK_STAIRS = new ComposeStairsBlock(ComposeBricks.ROOTED_DIRT_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.ROOTED_DIRT));
    public static final Block ICE_BRICK_STAIRS = new ComposeStairsBlock(ComposeBricks.ICE_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.ICE).requiresTool());
    public static final Block PACKED_ICE_BRICK_STAIRS = new ComposeStairsBlock(ComposeBricks.PACKED_ICE_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.PACKED_ICE).requiresTool());
    public static final Block BLUE_ICE_BRICK_STAIRS = new ComposeStairsBlock(ComposeBricks.BLUE_ICE_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.BLUE_ICE).requiresTool());
    public static final Block SOUL_SAND_BRICK_STAIRS = new ComposeStairsBlock(ComposeBricks.SOUL_SAND_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.SOUL_SAND));
    public static final Block SOUL_SOIL_BRICK_STAIRS = new ComposeStairsBlock(ComposeBricks.SOUL_SOIL_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.SOUL_SOIL));

    public static final Block MOSSY_COBBLESTONE_BRICK_STAIRS = new ComposeStairsBlock(ComposeBricks.MOSSY_COBBLESTONE_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.COBBLESTONE).requiresTool());
    public static final Block MOSSY_ANDESITE_BRICK_STAIRS = new ComposeStairsBlock(ComposeBricks.MOSSY_ANDESITE_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.ANDESITE).requiresTool());
    public static final Block MOSSY_BASALT_BRICK_STAIRS = new ComposeStairsBlock(ComposeBricks.MOSSY_BASALT_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.BASALT).requiresTool());
    public static final Block MOSSY_DIORITE_BRICK_STAIRS = new ComposeStairsBlock(ComposeBricks.MOSSY_DIORITE_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.DIORITE).requiresTool());
    public static final Block MOSSY_DRIPSTONE_BRICK_STAIRS = new ComposeStairsBlock(ComposeBricks.MOSSY_DRIPSTONE_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.DRIPSTONE_BLOCK).requiresTool());
    public static final Block MOSSY_GRANITE_BRICK_STAIRS = new ComposeStairsBlock(ComposeBricks.MOSSY_GRANITE_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.GRANITE).requiresTool());
    public static final Block MOSSY_CALCITE_BRICK_STAIRS = new ComposeStairsBlock(ComposeBricks.MOSSY_CALCITE_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.CALCITE).requiresTool());
    public static final Block MOSSY_TUFF_BRICK_STAIRS = new ComposeStairsBlock(ComposeBricks.MOSSY_TUFF_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.TUFF).requiresTool());

    public static final Block CRACKED_ANDESITE_BRICK_STAIRS = new ComposeStairsBlock(ComposeBricks.CRACKED_ANDESITE_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.ANDESITE).requiresTool());
    public static final Block CRACKED_BASALT_BRICK_STAIRS = new ComposeStairsBlock(ComposeBricks.CRACKED_BASALT_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.BASALT).requiresTool());
    public static final Block CRACKED_COBBLESTONE_BRICK_STAIRS = new ComposeStairsBlock(ComposeBricks.CRACKED_COBBLESTONE_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.COBBLESTONE).requiresTool());
    public static final Block CRACKED_DIORITE_BRICK_STAIRS = new ComposeStairsBlock(ComposeBricks.CRACKED_DIORITE_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.DIORITE).requiresTool());
    public static final Block CRACKED_DIRT_BRICK_STAIRS = new ComposeStairsBlock(ComposeBricks.CRACKED_DIRT_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.DIRT));
    public static final Block CRACKED_DRIPSTONE_BRICK_STAIRS = new ComposeStairsBlock(ComposeBricks.CRACKED_DRIPSTONE_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.DRIPSTONE_BLOCK).requiresTool());
    public static final Block CRACKED_GRANITE_BRICK_STAIRS = new ComposeStairsBlock(ComposeBricks.CRACKED_GRANITE_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.GRANITE).requiresTool());
    public static final Block CRACKED_RED_SANDSTONE_BRICK_STAIRS = new ComposeStairsBlock(ComposeBricks.CRACKED_RED_SANDSTONE_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.RED_SANDSTONE).requiresTool());
    public static final Block CRACKED_SANDSTONE_BRICK_STAIRS = new ComposeStairsBlock(ComposeBricks.CRACKED_SANDSTONE_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.SANDSTONE).requiresTool());
    public static final Block CRACKED_CALCITE_BRICK_STAIRS = new ComposeStairsBlock(ComposeBricks.CRACKED_CALCITE_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.CALCITE).requiresTool());
    public static final Block CRACKED_TUFF_BRICK_STAIRS = new ComposeStairsBlock(ComposeBricks.CRACKED_TUFF_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.TUFF).requiresTool());
    public static final Block CRACKED_PURPUR_BRICK_STAIRS = new ComposeStairsBlock(ComposeBricks.CRACKED_PURPUR_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.PURPUR_BLOCK).requiresTool());
    public static final Block CRACKED_COARSE_DIRT_BRICK_STAIRS = new ComposeStairsBlock(ComposeBricks.CRACKED_COARSE_DIRT_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.COARSE_DIRT));
    public static final Block CRACKED_ROOTED_DIRT_BRICK_STAIRS = new ComposeStairsBlock(ComposeBricks.CRACKED_ROOTED_DIRT_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.ROOTED_DIRT));

    public static void registerBlock() {
        Registry.register(Registries.BLOCK, new Identifier("compose", "andesite_brick_stairs"), ANDESITE_BRICK_STAIRS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "basalt_brick_stairs"), BASALT_BRICK_STAIRS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "cobblestone_brick_stairs"), COBBLESTONE_BRICK_STAIRS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "crying_obsidian_brick_stairs"), CRYING_OBSIDIAN_BRICK_STAIRS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "diorite_brick_stairs"), DIORITE_BRICK_STAIRS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "dirt_brick_stairs"), DIRT_BRICK_STAIRS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "dripstone_brick_stairs"), DRIPSTONE_BRICK_STAIRS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "granite_brick_stairs"), GRANITE_BRICK_STAIRS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "obsidian_brick_stairs"), OBSIDIAN_BRICK_STAIRS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "red_sandstone_brick_stairs"), RED_SANDSTONE_BRICK_STAIRS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "sandstone_brick_stairs"), SANDSTONE_BRICK_STAIRS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "calcite_brick_stairs"), CALCITE_BRICK_STAIRS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "tuff_brick_stairs"), TUFF_BRICK_STAIRS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "netherrack_brick_stairs"), NETHERRACK_BRICK_STAIRS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "snow_brick_stairs"), SNOW_BRICK_STAIRS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "purpur_brick_stairs"), PURPUR_BRICK_STAIRS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "coarse_dirt_brick_stairs"), COARSE_DIRT_BRICK_STAIRS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "rooted_dirt_brick_stairs"), ROOTED_DIRT_BRICK_STAIRS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "ice_brick_stairs"), ICE_BRICK_STAIRS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "packed_ice_brick_stairs"), PACKED_ICE_BRICK_STAIRS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "blue_ice_brick_stairs"), BLUE_ICE_BRICK_STAIRS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "soul_sand_brick_stairs"), SOUL_SAND_BRICK_STAIRS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "soul_soil_brick_stairs"), SOUL_SOIL_BRICK_STAIRS);

        Registry.register(Registries.BLOCK, new Identifier("compose", "mossy_basalt_brick_stairs"), MOSSY_BASALT_BRICK_STAIRS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "mossy_cobblestone_brick_stairs"), MOSSY_COBBLESTONE_BRICK_STAIRS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "mossy_andesite_brick_stairs"), MOSSY_ANDESITE_BRICK_STAIRS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "mossy_diorite_brick_stairs"), MOSSY_DIORITE_BRICK_STAIRS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "mossy_dripstone_brick_stairs"), MOSSY_DRIPSTONE_BRICK_STAIRS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "mossy_granite_brick_stairs"), MOSSY_GRANITE_BRICK_STAIRS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "mossy_calcite_brick_stairs"), MOSSY_CALCITE_BRICK_STAIRS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "mossy_tuff_brick_stairs"), MOSSY_TUFF_BRICK_STAIRS);

        Registry.register(Registries.BLOCK, new Identifier("compose", "cracked_andesite_brick_stairs"), CRACKED_ANDESITE_BRICK_STAIRS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "cracked_basalt_brick_stairs"), CRACKED_BASALT_BRICK_STAIRS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "cracked_cobblestone_brick_stairs"), CRACKED_COBBLESTONE_BRICK_STAIRS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "cracked_diorite_brick_stairs"), CRACKED_DIORITE_BRICK_STAIRS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "cracked_dirt_brick_stairs"), CRACKED_DIRT_BRICK_STAIRS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "cracked_dripstone_brick_stairs"), CRACKED_DRIPSTONE_BRICK_STAIRS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "cracked_granite_brick_stairs"), CRACKED_GRANITE_BRICK_STAIRS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "cracked_red_sandstone_brick_stairs"), CRACKED_RED_SANDSTONE_BRICK_STAIRS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "cracked_sandstone_brick_stairs"), CRACKED_SANDSTONE_BRICK_STAIRS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "cracked_calcite_brick_stairs"), CRACKED_CALCITE_BRICK_STAIRS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "cracked_tuff_brick_stairs"), CRACKED_TUFF_BRICK_STAIRS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "cracked_purpur_brick_stairs"), CRACKED_PURPUR_BRICK_STAIRS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "cracked_coarse_dirt_brick_stairs"), CRACKED_COARSE_DIRT_BRICK_STAIRS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "cracked_rooted_dirt_brick_stairs"), CRACKED_ROOTED_DIRT_BRICK_STAIRS);



        Registry.register(Registries.ITEM, new Identifier("compose", "andesite_brick_stairs"), new BlockItem(ANDESITE_BRICK_STAIRS, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "basalt_brick_stairs"), new BlockItem(BASALT_BRICK_STAIRS, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "cobblestone_brick_stairs"), new BlockItem(COBBLESTONE_BRICK_STAIRS, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "crying_obsidian_brick_stairs"), new BlockItem(CRYING_OBSIDIAN_BRICK_STAIRS, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "diorite_brick_stairs"), new BlockItem(DIORITE_BRICK_STAIRS, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "dirt_brick_stairs"), new BlockItem(DIRT_BRICK_STAIRS, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "dripstone_brick_stairs"), new BlockItem(DRIPSTONE_BRICK_STAIRS, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "granite_brick_stairs"), new BlockItem(GRANITE_BRICK_STAIRS, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "obsidian_brick_stairs"), new BlockItem(OBSIDIAN_BRICK_STAIRS, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "red_sandstone_brick_stairs"), new BlockItem(RED_SANDSTONE_BRICK_STAIRS, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "sandstone_brick_stairs"), new BlockItem(SANDSTONE_BRICK_STAIRS, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "calcite_brick_stairs"), new BlockItem(CALCITE_BRICK_STAIRS, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "tuff_brick_stairs"), new BlockItem(TUFF_BRICK_STAIRS, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "netherrack_brick_stairs"), new BlockItem(NETHERRACK_BRICK_STAIRS, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "snow_brick_stairs"), new BlockItem(SNOW_BRICK_STAIRS, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "purpur_brick_stairs"), new BlockItem(PURPUR_BRICK_STAIRS, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "coarse_dirt_brick_stairs"), new BlockItem(COARSE_DIRT_BRICK_STAIRS, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "rooted_dirt_brick_stairs"), new BlockItem(ROOTED_DIRT_BRICK_STAIRS, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "ice_brick_stairs"), new BlockItem(ICE_BRICK_STAIRS, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "packed_ice_brick_stairs"), new BlockItem(PACKED_ICE_BRICK_STAIRS, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "blue_ice_brick_stairs"), new BlockItem(BLUE_ICE_BRICK_STAIRS, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "soul_sand_brick_stairs"), new BlockItem(SOUL_SAND_BRICK_STAIRS, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "soul_soil_brick_stairs"), new BlockItem(SOUL_SOIL_BRICK_STAIRS, new FabricItemSettings()));

        Registry.register(Registries.ITEM, new Identifier("compose", "mossy_andesite_brick_stairs"), new BlockItem(MOSSY_ANDESITE_BRICK_STAIRS, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "mossy_basalt_brick_stairs"), new BlockItem(MOSSY_BASALT_BRICK_STAIRS, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "mossy_cobblestone_brick_stairs"), new BlockItem(MOSSY_COBBLESTONE_BRICK_STAIRS, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "mossy_diorite_brick_stairs"), new BlockItem(MOSSY_DIORITE_BRICK_STAIRS, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "mossy_dripstone_brick_stairs"), new BlockItem(MOSSY_DRIPSTONE_BRICK_STAIRS, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "mossy_granite_brick_stairs"), new BlockItem(MOSSY_GRANITE_BRICK_STAIRS, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "mossy_calcite_brick_stairs"), new BlockItem(MOSSY_CALCITE_BRICK_STAIRS, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "mossy_tuff_brick_stairs"), new BlockItem(MOSSY_TUFF_BRICK_STAIRS, new Item.Settings()));

        Registry.register(Registries.ITEM, new Identifier("compose", "cracked_andesite_brick_stairs"), new BlockItem(CRACKED_ANDESITE_BRICK_STAIRS, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "cracked_basalt_brick_stairs"), new BlockItem(CRACKED_BASALT_BRICK_STAIRS, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "cracked_cobblestone_brick_stairs"), new BlockItem(CRACKED_COBBLESTONE_BRICK_STAIRS, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "cracked_diorite_brick_stairs"), new BlockItem(CRACKED_DIORITE_BRICK_STAIRS, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "cracked_dirt_brick_stairs"), new BlockItem(CRACKED_DIRT_BRICK_STAIRS, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "cracked_dripstone_brick_stairs"), new BlockItem(CRACKED_DRIPSTONE_BRICK_STAIRS, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "cracked_granite_brick_stairs"), new BlockItem(CRACKED_GRANITE_BRICK_STAIRS, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "cracked_red_sandstone_brick_stairs"), new BlockItem(CRACKED_RED_SANDSTONE_BRICK_STAIRS, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "cracked_sandstone_brick_stairs"), new BlockItem(CRACKED_SANDSTONE_BRICK_STAIRS, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "cracked_calcite_brick_stairs"), new BlockItem(CRACKED_CALCITE_BRICK_STAIRS, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "cracked_tuff_brick_stairs"), new BlockItem(CRACKED_TUFF_BRICK_STAIRS, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "cracked_purpur_brick_stairs"), new BlockItem(CRACKED_PURPUR_BRICK_STAIRS, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "cracked_coarse_dirt_brick_stairs"), new BlockItem(CRACKED_COARSE_DIRT_BRICK_STAIRS, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "cracked_rooted_dirt_brick_stairs"), new BlockItem(CRACKED_ROOTED_DIRT_BRICK_STAIRS, new Item.Settings()));
    }
}

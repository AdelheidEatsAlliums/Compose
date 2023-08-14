//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.adelheideatsalliums.compose.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ComposeBricks {
    public static final Block ANDESITE_BRICKS = new Block(FabricBlockSettings.copy(Blocks.ANDESITE).requiresTool());
    public static final Block BASALT_BRICKS = new Block(FabricBlockSettings.copy(Blocks.SMOOTH_BASALT).requiresTool());
    public static final Block COBBLESTONE_BRICKS = new Block(FabricBlockSettings.copy(Blocks.COBBLESTONE).requiresTool());
    public static final Block CRYING_OBSIDIAN_BRICKS = new Block(FabricBlockSettings.copy(Blocks.CRYING_OBSIDIAN).requiresTool());
    public static final Block DIORITE_BRICKS = new Block(FabricBlockSettings.copy(Blocks.DIORITE).requiresTool());
    public static final Block DIRT_BRICKS = new Block(FabricBlockSettings.copy(Blocks.DIRT));
    public static final Block DRIPSTONE_BRICKS = new Block(FabricBlockSettings.copy(Blocks.DRIPSTONE_BLOCK).requiresTool());
    public static final Block GRANITE_BRICKS = new Block(FabricBlockSettings.copy(Blocks.GRANITE).requiresTool());
    public static final Block OBSIDIAN_BRICKS = new Block(FabricBlockSettings.copy(Blocks.OBSIDIAN).requiresTool());
    public static final Block RED_SANDSTONE_BRICKS = new Block(FabricBlockSettings.copy(Blocks.RED_SANDSTONE).requiresTool());
    public static final Block SANDSTONE_BRICKS = new Block(FabricBlockSettings.copy(Blocks.SANDSTONE).requiresTool());
    public static final Block CALCITE_BRICKS = new Block(FabricBlockSettings.copy(Blocks.CALCITE).requiresTool());
    public static final Block TUFF_BRICKS = new Block(FabricBlockSettings.copy(Blocks.TUFF).requiresTool());
    public static final Block NETHERRACK_BRICKS = new Block(FabricBlockSettings.copy(Blocks.NETHERRACK).requiresTool());
    public static final Block SNOW_BRICKS = new Block(FabricBlockSettings.copy(Blocks.SNOW_BLOCK));
    public static final Block PURPUR_BRICKS = new Block(FabricBlockSettings.copy(Blocks.PURPUR_BLOCK).requiresTool());
    public static final Block COARSE_DIRT_BRICKS = new Block(FabricBlockSettings.copy(Blocks.COARSE_DIRT));
    public static final Block ROOTED_DIRT_BRICKS = new Block(FabricBlockSettings.copy(Blocks.ROOTED_DIRT));
    public static final Block ICE_BRICKS = new Block(FabricBlockSettings.copy(Blocks.ICE).requiresTool());
    public static final Block PACKED_ICE_BRICKS = new Block(FabricBlockSettings.copy(Blocks.PACKED_ICE).requiresTool());
    public static final Block BLUE_ICE_BRICKS = new Block(FabricBlockSettings.copy(Blocks.BLUE_ICE).requiresTool());
    public static final Block SOUL_SAND_BRICKS = new Block(FabricBlockSettings.copy(Blocks.SOUL_SAND));
    public static final Block SOUL_SOIL_BRICKS = new Block(FabricBlockSettings.copy(Blocks.SOUL_SOIL));

    public static final Block MOSSY_COBBLESTONE_BRICKS = new Block(FabricBlockSettings.copy(Blocks.COBBLESTONE).requiresTool());
    public static final Block MOSSY_ANDESITE_BRICKS = new Block(FabricBlockSettings.copy(Blocks.ANDESITE).requiresTool());
    public static final Block MOSSY_BASALT_BRICKS = new Block(FabricBlockSettings.copy(Blocks.BASALT).requiresTool());
    public static final Block MOSSY_DIORITE_BRICKS = new Block(FabricBlockSettings.copy(Blocks.DIORITE).requiresTool());
    public static final Block MOSSY_DRIPSTONE_BRICKS = new Block(FabricBlockSettings.copy(Blocks.DRIPSTONE_BLOCK).requiresTool());
    public static final Block MOSSY_GRANITE_BRICKS = new Block(FabricBlockSettings.copy(Blocks.GRANITE).requiresTool());
    public static final Block MOSSY_CALCITE_BRICKS = new Block(FabricBlockSettings.copy(Blocks.CALCITE).requiresTool());
    public static final Block MOSSY_TUFF_BRICKS = new Block(FabricBlockSettings.copy(Blocks.TUFF).requiresTool());

    public static final Block CRACKED_ANDESITE_BRICKS = new Block(FabricBlockSettings.copy(Blocks.ANDESITE).requiresTool());
    public static final Block CRACKED_BASALT_BRICKS = new Block(FabricBlockSettings.copy(Blocks.BASALT).requiresTool());
    public static final Block CRACKED_COBBLESTONE_BRICKS = new Block(FabricBlockSettings.copy(Blocks.COBBLESTONE).requiresTool());
    public static final Block CRACKED_DIORITE_BRICKS = new Block(FabricBlockSettings.copy(Blocks.DIORITE).requiresTool());
    public static final Block CRACKED_DIRT_BRICKS = new Block(FabricBlockSettings.copy(Blocks.DIRT));
    public static final Block CRACKED_DRIPSTONE_BRICKS = new Block(FabricBlockSettings.copy(Blocks.DRIPSTONE_BLOCK).requiresTool());
    public static final Block CRACKED_GRANITE_BRICKS = new Block(FabricBlockSettings.copy(Blocks.GRANITE).requiresTool());
    public static final Block CRACKED_RED_SANDSTONE_BRICKS = new Block(FabricBlockSettings.copy(Blocks.RED_SANDSTONE).requiresTool());
    public static final Block CRACKED_SANDSTONE_BRICKS = new Block(FabricBlockSettings.copy(Blocks.SANDSTONE).requiresTool());
    public static final Block CRACKED_CALCITE_BRICKS = new Block(FabricBlockSettings.copy(Blocks.CALCITE).requiresTool());
    public static final Block CRACKED_TUFF_BRICKS = new Block(FabricBlockSettings.copy(Blocks.TUFF).requiresTool());
    public static final Block CRACKED_PURPUR_BRICKS = new Block(FabricBlockSettings.copy(Blocks.PURPUR_BLOCK).requiresTool());
    public static final Block CRACKED_COARSE_DIRT_BRICKS = new Block(FabricBlockSettings.copy(Blocks.COARSE_DIRT));
    public static final Block CRACKED_ROOTED_DIRT_BRICKS = new Block(FabricBlockSettings.copy(Blocks.ROOTED_DIRT));

    public static void registerBlock() {
        Registry.register(Registries.BLOCK, new Identifier("compose", "andesite_bricks"), ANDESITE_BRICKS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "basalt_bricks"), BASALT_BRICKS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "cobblestone_bricks"), COBBLESTONE_BRICKS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "crying_obsidian_bricks"), CRYING_OBSIDIAN_BRICKS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "diorite_bricks"), DIORITE_BRICKS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "dirt_bricks"), DIRT_BRICKS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "dripstone_bricks"), DRIPSTONE_BRICKS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "granite_bricks"), GRANITE_BRICKS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "obsidian_bricks"), OBSIDIAN_BRICKS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "red_sandstone_bricks"), RED_SANDSTONE_BRICKS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "sandstone_bricks"), SANDSTONE_BRICKS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "calcite_bricks"), CALCITE_BRICKS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "tuff_bricks"), TUFF_BRICKS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "netherrack_bricks"), NETHERRACK_BRICKS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "snow_bricks"), SNOW_BRICKS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "purpur_bricks"), PURPUR_BRICKS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "coarse_dirt_bricks"), COARSE_DIRT_BRICKS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "rooted_dirt_bricks"), ROOTED_DIRT_BRICKS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "ice_bricks"), ICE_BRICKS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "packed_ice_bricks"), PACKED_ICE_BRICKS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "blue_ice_bricks"), BLUE_ICE_BRICKS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "soul_sand_bricks"), SOUL_SAND_BRICKS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "soul_soil_bricks"), SOUL_SOIL_BRICKS);

        Registry.register(Registries.BLOCK, new Identifier("compose", "mossy_basalt_bricks"), MOSSY_BASALT_BRICKS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "mossy_cobblestone_bricks"), MOSSY_COBBLESTONE_BRICKS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "mossy_andesite_bricks"), MOSSY_ANDESITE_BRICKS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "mossy_diorite_bricks"), MOSSY_DIORITE_BRICKS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "mossy_dripstone_bricks"), MOSSY_DRIPSTONE_BRICKS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "mossy_granite_bricks"), MOSSY_GRANITE_BRICKS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "mossy_calcite_bricks"), MOSSY_CALCITE_BRICKS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "mossy_tuff_bricks"), MOSSY_TUFF_BRICKS);

        Registry.register(Registries.BLOCK, new Identifier("compose", "cracked_andesite_bricks"), CRACKED_ANDESITE_BRICKS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "cracked_basalt_bricks"), CRACKED_BASALT_BRICKS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "cracked_cobblestone_bricks"), CRACKED_COBBLESTONE_BRICKS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "cracked_diorite_bricks"), CRACKED_DIORITE_BRICKS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "cracked_dirt_bricks"), CRACKED_DIRT_BRICKS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "cracked_dripstone_bricks"), CRACKED_DRIPSTONE_BRICKS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "cracked_granite_bricks"), CRACKED_GRANITE_BRICKS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "cracked_red_sandstone_bricks"), CRACKED_RED_SANDSTONE_BRICKS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "cracked_sandstone_bricks"), CRACKED_SANDSTONE_BRICKS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "cracked_calcite_bricks"), CRACKED_CALCITE_BRICKS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "cracked_tuff_bricks"), CRACKED_TUFF_BRICKS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "cracked_purpur_bricks"), CRACKED_PURPUR_BRICKS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "cracked_coarse_dirt_bricks"), CRACKED_COARSE_DIRT_BRICKS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "cracked_rooted_dirt_bricks"), CRACKED_ROOTED_DIRT_BRICKS);



        Registry.register(Registries.ITEM, new Identifier("compose", "andesite_bricks"), new BlockItem(ANDESITE_BRICKS, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "basalt_bricks"), new BlockItem(BASALT_BRICKS, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "cobblestone_bricks"), new BlockItem(COBBLESTONE_BRICKS, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "crying_obsidian_bricks"), new BlockItem(CRYING_OBSIDIAN_BRICKS, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "diorite_bricks"), new BlockItem(DIORITE_BRICKS, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "dirt_bricks"), new BlockItem(DIRT_BRICKS, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "dripstone_bricks"), new BlockItem(DRIPSTONE_BRICKS, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "granite_bricks"), new BlockItem(GRANITE_BRICKS, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "obsidian_bricks"), new BlockItem(OBSIDIAN_BRICKS, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "red_sandstone_bricks"), new BlockItem(RED_SANDSTONE_BRICKS, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "sandstone_bricks"), new BlockItem(SANDSTONE_BRICKS, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "calcite_bricks"), new BlockItem(CALCITE_BRICKS, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "tuff_bricks"), new BlockItem(TUFF_BRICKS, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "netherrack_bricks"), new BlockItem(NETHERRACK_BRICKS, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "snow_bricks"), new BlockItem(SNOW_BRICKS, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "purpur_bricks"), new BlockItem(PURPUR_BRICKS, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "coarse_dirt_bricks"), new BlockItem(COARSE_DIRT_BRICKS, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "rooted_dirt_bricks"), new BlockItem(ROOTED_DIRT_BRICKS, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "ice_bricks"), new BlockItem(ICE_BRICKS, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "packed_ice_bricks"), new BlockItem(PACKED_ICE_BRICKS, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "blue_ice_bricks"), new BlockItem(BLUE_ICE_BRICKS, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "soul_sand_bricks"), new BlockItem(SOUL_SAND_BRICKS, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "soul_soil_bricks"), new BlockItem(SOUL_SOIL_BRICKS, new Item.Settings()));

        Registry.register(Registries.ITEM, new Identifier("compose", "mossy_andesite_bricks"), new BlockItem(MOSSY_ANDESITE_BRICKS, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "mossy_basalt_bricks"), new BlockItem(MOSSY_BASALT_BRICKS, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "mossy_cobblestone_bricks"), new BlockItem(MOSSY_COBBLESTONE_BRICKS, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "mossy_diorite_bricks"), new BlockItem(MOSSY_DIORITE_BRICKS, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "mossy_dripstone_bricks"), new BlockItem(MOSSY_DRIPSTONE_BRICKS, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "mossy_granite_bricks"), new BlockItem(MOSSY_GRANITE_BRICKS, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "mossy_calcite_bricks"), new BlockItem(MOSSY_CALCITE_BRICKS, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "mossy_tuff_bricks"), new BlockItem(MOSSY_TUFF_BRICKS, new Item.Settings()));

        Registry.register(Registries.ITEM, new Identifier("compose", "cracked_andesite_bricks"), new BlockItem(CRACKED_ANDESITE_BRICKS, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "cracked_basalt_bricks"), new BlockItem(CRACKED_BASALT_BRICKS, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "cracked_cobblestone_bricks"), new BlockItem(CRACKED_COBBLESTONE_BRICKS, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "cracked_diorite_bricks"), new BlockItem(CRACKED_DIORITE_BRICKS, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "cracked_dirt_bricks"), new BlockItem(CRACKED_DIRT_BRICKS, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "cracked_dripstone_bricks"), new BlockItem(CRACKED_DRIPSTONE_BRICKS, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "cracked_granite_bricks"), new BlockItem(CRACKED_GRANITE_BRICKS, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "cracked_red_sandstone_bricks"), new BlockItem(CRACKED_RED_SANDSTONE_BRICKS, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "cracked_sandstone_bricks"), new BlockItem(CRACKED_SANDSTONE_BRICKS, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "cracked_calcite_bricks"), new BlockItem(CRACKED_CALCITE_BRICKS, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "cracked_tuff_bricks"), new BlockItem(CRACKED_TUFF_BRICKS, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "cracked_purpur_bricks"), new BlockItem(CRACKED_PURPUR_BRICKS, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "cracked_coarse_dirt_bricks"), new BlockItem(CRACKED_COARSE_DIRT_BRICKS, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "cracked_rooted_dirt_bricks"), new BlockItem(CRACKED_ROOTED_DIRT_BRICKS, new Item.Settings()));
    }
}

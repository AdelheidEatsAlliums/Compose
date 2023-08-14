package net.adelheideatsalliums.compose.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.PillarBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ComposePillars {
    public static final Block STONE_PILLAR = new PillarBlock(FabricBlockSettings.copy(Blocks.STONE).requiresTool());
    public static final Block GRANITE_PILLAR = new PillarBlock(FabricBlockSettings.copy(Blocks.GRANITE).requiresTool());
    public static final Block ANDESITE_PILLAR = new PillarBlock(FabricBlockSettings.copy(Blocks.ANDESITE).requiresTool());
    public static final Block DIORITE_PILLAR = new PillarBlock(FabricBlockSettings.copy(Blocks.DIORITE).requiresTool());
    public static final Block DEEPSLATE_PILLAR = new PillarBlock(FabricBlockSettings.copy(Blocks.DEEPSLATE).requiresTool());
    public static final Block MUD_PILLAR = new PillarBlock(FabricBlockSettings.copy(Blocks.PACKED_MUD).requiresTool());
    public static final Block END_STONE_PILLAR = new PillarBlock(FabricBlockSettings.copy(Blocks.END_STONE).requiresTool());
    public static final Block SANDSTONE_PILLAR = new PillarBlock(FabricBlockSettings.copy(Blocks.SANDSTONE).requiresTool());
    public static final Block RED_SANDSTONE_PILLAR = new PillarBlock(FabricBlockSettings.copy(Blocks.RED_SANDSTONE).requiresTool());
    public static final Block PRISMARINE_PILLAR = new PillarBlock(FabricBlockSettings.copy(Blocks.PRISMARINE).requiresTool());
    public static final Block NETHERRACK_PILLAR = new PillarBlock(FabricBlockSettings.copy(Blocks.NETHERRACK).requiresTool());
    public static final Block BLACKSTONE_PILLAR = new PillarBlock(FabricBlockSettings.copy(Blocks.BLACKSTONE).requiresTool());
    public static final Block CALCITE_PILLAR = new PillarBlock(FabricBlockSettings.copy(Blocks.CALCITE).requiresTool());
    public static final Block TUFF_PILLAR = new PillarBlock(FabricBlockSettings.copy(Blocks.TUFF).requiresTool());

    public static void registerBlock() {
        Registry.register(Registries.BLOCK, new Identifier("compose", "stone_pillar"), STONE_PILLAR);
        Registry.register(Registries.BLOCK, new Identifier("compose", "granite_pillar"), GRANITE_PILLAR);
        Registry.register(Registries.BLOCK, new Identifier("compose", "andesite_pillar"), ANDESITE_PILLAR);
        Registry.register(Registries.BLOCK, new Identifier("compose", "diorite_pillar"), DIORITE_PILLAR);
        Registry.register(Registries.BLOCK, new Identifier("compose", "deepslate_pillar"), DEEPSLATE_PILLAR);
        Registry.register(Registries.BLOCK, new Identifier("compose", "mud_pillar"), MUD_PILLAR);
        Registry.register(Registries.BLOCK, new Identifier("compose", "end_stone_pillar"), END_STONE_PILLAR);
        Registry.register(Registries.BLOCK, new Identifier("compose", "sandstone_pillar"), SANDSTONE_PILLAR);
        Registry.register(Registries.BLOCK, new Identifier("compose", "red_sandstone_pillar"), RED_SANDSTONE_PILLAR);
        Registry.register(Registries.BLOCK, new Identifier("compose", "prismarine_pillar"), PRISMARINE_PILLAR);
        Registry.register(Registries.BLOCK, new Identifier("compose", "netherrack_pillar"), NETHERRACK_PILLAR);
        Registry.register(Registries.BLOCK, new Identifier("compose", "blackstone_pillar"), BLACKSTONE_PILLAR);
        Registry.register(Registries.BLOCK, new Identifier("compose", "calcite_pillar"), CALCITE_PILLAR);
        Registry.register(Registries.BLOCK, new Identifier("compose", "tuff_pillar"), TUFF_PILLAR);

        Registry.register(Registries.ITEM, new Identifier("compose", "stone_pillar"), new BlockItem(STONE_PILLAR, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "granite_pillar"), new BlockItem(GRANITE_PILLAR, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "andesite_pillar"), new BlockItem(ANDESITE_PILLAR, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "diorite_pillar"), new BlockItem(DIORITE_PILLAR, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "deepslate_pillar"), new BlockItem(DEEPSLATE_PILLAR, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "mud_pillar"), new BlockItem(MUD_PILLAR, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "end_stone_pillar"), new BlockItem(END_STONE_PILLAR, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "sandstone_pillar"), new BlockItem(SANDSTONE_PILLAR, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "red_sandstone_pillar"), new BlockItem(RED_SANDSTONE_PILLAR, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "prismarine_pillar"), new BlockItem(PRISMARINE_PILLAR, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "netherrack_pillar"), new BlockItem(NETHERRACK_PILLAR, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "blackstone_pillar"), new BlockItem(BLACKSTONE_PILLAR, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "calcite_pillar"), new BlockItem(CALCITE_PILLAR, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "tuff_pillar"), new BlockItem(TUFF_PILLAR, new Item.Settings()));

    }
}
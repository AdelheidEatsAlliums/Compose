package net.adelheideatsalliums.compose.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ComposePillarSlabs {
    public static final Block STONE_PILLAR_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.STONE).requiresTool());
    public static final Block GRANITE_PILLAR_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.GRANITE).requiresTool());
    public static final Block ANDESITE_PILLAR_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.ANDESITE).requiresTool());
    public static final Block DIORITE_PILLAR_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.DIORITE).requiresTool());
    public static final Block DEEPSLATE_PILLAR_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.DEEPSLATE).requiresTool());
    public static final Block MUD_PILLAR_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.PACKED_MUD).requiresTool());
    public static final Block END_STONE_PILLAR_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.END_STONE).requiresTool());
    public static final Block SANDSTONE_PILLAR_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.SANDSTONE).requiresTool());
    public static final Block RED_SANDSTONE_PILLAR_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.RED_SANDSTONE).requiresTool());
    public static final Block PRISMARINE_PILLAR_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.PRISMARINE).requiresTool());
    public static final Block NETHERRACK_PILLAR_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.NETHERRACK).requiresTool());
    public static final Block BLACKSTONE_PILLAR_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.BLACKSTONE).requiresTool());
    public static final Block CALCITE_PILLAR_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.CALCITE).requiresTool());
    public static final Block TUFF_PILLAR_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.TUFF).requiresTool());

    public static void registerBlock() {
        Registry.register(Registries.BLOCK, new Identifier("compose", "stone_pillar_slab"), STONE_PILLAR_SLAB);
        Registry.register(Registries.BLOCK, new Identifier("compose", "granite_pillar_slab"), GRANITE_PILLAR_SLAB);
        Registry.register(Registries.BLOCK, new Identifier("compose", "andesite_pillar_slab"), ANDESITE_PILLAR_SLAB);
        Registry.register(Registries.BLOCK, new Identifier("compose", "diorite_pillar_slab"), DIORITE_PILLAR_SLAB);
        Registry.register(Registries.BLOCK, new Identifier("compose", "deepslate_pillar_slab"), DEEPSLATE_PILLAR_SLAB);
        Registry.register(Registries.BLOCK, new Identifier("compose", "mud_pillar_slab"), MUD_PILLAR_SLAB);
        Registry.register(Registries.BLOCK, new Identifier("compose", "end_stone_pillar_slab"), END_STONE_PILLAR_SLAB);
        Registry.register(Registries.BLOCK, new Identifier("compose", "sandstone_pillar_slab"), SANDSTONE_PILLAR_SLAB);
        Registry.register(Registries.BLOCK, new Identifier("compose", "red_sandstone_pillar_slab"), RED_SANDSTONE_PILLAR_SLAB);
        Registry.register(Registries.BLOCK, new Identifier("compose", "prismarine_pillar_slab"), PRISMARINE_PILLAR_SLAB);
        Registry.register(Registries.BLOCK, new Identifier("compose", "netherrack_pillar_slab"), NETHERRACK_PILLAR_SLAB);
        Registry.register(Registries.BLOCK, new Identifier("compose", "blackstone_pillar_slab"), BLACKSTONE_PILLAR_SLAB);
        Registry.register(Registries.BLOCK, new Identifier("compose", "calcite_pillar_slab"), CALCITE_PILLAR_SLAB);
        Registry.register(Registries.BLOCK, new Identifier("compose", "tuff_pillar_slab"), TUFF_PILLAR_SLAB);

        Registry.register(Registries.ITEM, new Identifier("compose", "stone_pillar_slab"), new BlockItem(STONE_PILLAR_SLAB, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "granite_pillar_slab"), new BlockItem(GRANITE_PILLAR_SLAB, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "andesite_pillar_slab"), new BlockItem(ANDESITE_PILLAR_SLAB, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "diorite_pillar_slab"), new BlockItem(DIORITE_PILLAR_SLAB, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "deepslate_pillar_slab"), new BlockItem(DEEPSLATE_PILLAR_SLAB, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "mud_pillar_slab"), new BlockItem(MUD_PILLAR_SLAB, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "end_stone_pillar_slab"), new BlockItem(END_STONE_PILLAR_SLAB, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "sandstone_pillar_slab"), new BlockItem(SANDSTONE_PILLAR_SLAB, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "red_sandstone_pillar_slab"), new BlockItem(RED_SANDSTONE_PILLAR_SLAB, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "prismarine_pillar_slab"), new BlockItem(PRISMARINE_PILLAR_SLAB, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "netherrack_pillar_slab"), new BlockItem(NETHERRACK_PILLAR_SLAB, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "blackstone_pillar_slab"), new BlockItem(BLACKSTONE_PILLAR_SLAB, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "calcite_pillar_slab"), new BlockItem(CALCITE_PILLAR_SLAB, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "tuff_pillar_slab"), new BlockItem(TUFF_PILLAR_SLAB, new Item.Settings()));

    }
}

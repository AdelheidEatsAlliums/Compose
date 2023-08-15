package net.adelheideatsalliums.compose.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ComposeSlabs {
    public static final Block DIRT_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.DIRT));
    public static final Block COARSE_DIRT_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.COARSE_DIRT));
    public static final Block ROOTED_DIRT_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.ROOTED_DIRT));
    public static final Block GRASS_BLOCK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.GRASS_BLOCK));
    public static final Block SNOWY_GRASS_BLOCK_SLAB  = new SlabBlock(FabricBlockSettings.copy(Blocks.GRASS_BLOCK));
    public static final Block DIRT_PATH_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.DIRT_PATH));
    public static final Block PODZOL_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.PODZOL));
    public static final Block MYCELIUM_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.MYCELIUM));
    public static final Block NETHERRACK_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.NETHERRACK).requiresTool());
    public static final Block WARPED_NYLIUM_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.WARPED_NYLIUM).requiresTool());
    public static final Block CRIMSON_NYLIUM_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.CRIMSON_NYLIUM).requiresTool());
    public static final Block DEEPSLATE_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.DEEPSLATE).requiresTool());
    public static final Block CALCITE_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.CALCITE).requiresTool());
    public static final Block TUFF_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.TUFF).requiresTool());
    public static final Block END_STONE_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.END_STONE).requiresTool());

    public static void registerBlock() {
        Registry.register(Registries.BLOCK, new Identifier("compose", "dirt_slab"), DIRT_SLAB);
        Registry.register(Registries.ITEM, new Identifier("compose", "dirt_slab"), new BlockItem(DIRT_SLAB, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("compose", "coarse_dirt_slab"), COARSE_DIRT_SLAB);
        Registry.register(Registries.ITEM, new Identifier("compose", "coarse_dirt_slab"), new BlockItem(COARSE_DIRT_SLAB, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("compose", "rooted_dirt_slab"), ROOTED_DIRT_SLAB);
        Registry.register(Registries.ITEM, new Identifier("compose", "rooted_dirt_slab"), new BlockItem(ROOTED_DIRT_SLAB, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("compose", "grass_block_slab"), GRASS_BLOCK_SLAB);
        Registry.register(Registries.ITEM, new Identifier("compose", "grass_block_slab"), new BlockItem(GRASS_BLOCK_SLAB, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("compose", "snowy_grass_block_slab"), SNOWY_GRASS_BLOCK_SLAB);
        Registry.register(Registries.ITEM, new Identifier("compose", "snowy_grass_block_slab"), new BlockItem(SNOWY_GRASS_BLOCK_SLAB, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("compose", "dirt_path_slab"), DIRT_PATH_SLAB);
        Registry.register(Registries.ITEM, new Identifier("compose", "dirt_path_slab"), new BlockItem(DIRT_PATH_SLAB, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("compose", "podzol_slab"), PODZOL_SLAB);
        Registry.register(Registries.ITEM, new Identifier("compose", "podzol_slab"), new BlockItem(PODZOL_SLAB, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("compose", "mycelium_slab"), MYCELIUM_SLAB);
        Registry.register(Registries.ITEM, new Identifier("compose", "mycelium_slab"), new BlockItem(MYCELIUM_SLAB, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("compose", "netherrack_slab"), NETHERRACK_SLAB);
        Registry.register(Registries.ITEM, new Identifier("compose", "netherrack_slab"), new BlockItem(NETHERRACK_SLAB, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("compose", "warped_nylium_slab"), WARPED_NYLIUM_SLAB);
        Registry.register(Registries.ITEM, new Identifier("compose", "warped_nylium_slab"), new BlockItem(WARPED_NYLIUM_SLAB, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("compose", "crimson_nylium_slab"), CRIMSON_NYLIUM_SLAB);
        Registry.register(Registries.ITEM, new Identifier("compose", "crimson_nylium_slab"), new BlockItem(CRIMSON_NYLIUM_SLAB, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("compose", "deepslate"), DEEPSLATE_SLAB);
        Registry.register(Registries.ITEM, new Identifier("compose", "deepslate"), new BlockItem(DEEPSLATE_SLAB, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("compose", "calcite_slab"), CALCITE_SLAB);
        Registry.register(Registries.ITEM, new Identifier("compose", "calcite_slab"), new BlockItem(CALCITE_SLAB, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("compose", "tuff_slab"), TUFF_SLAB);
        Registry.register(Registries.ITEM, new Identifier("compose", "tuff_slab"), new BlockItem(TUFF_SLAB, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier("compose", "end_stone_slab"), END_STONE_SLAB);
        Registry.register(Registries.ITEM, new Identifier("compose", "end_stone_slab"), new BlockItem(END_STONE_SLAB, new FabricItemSettings()));

    }
}

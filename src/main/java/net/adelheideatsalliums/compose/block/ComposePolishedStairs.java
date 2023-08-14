package net.adelheideatsalliums.compose.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.adelheideatsalliums.compose.block.blockClass.ComposeStairsBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ComposePolishedStairs {
    public static final Block POLISHED_CALCITE_STAIRS = new ComposeStairsBlock(ComposePolished.POLISHED_CALCITE.getDefaultState(), FabricBlockSettings.copy(Blocks.CALCITE).requiresTool());
    public static final Block POLISHED_DRIPSTONE_STAIRS = new ComposeStairsBlock(ComposePolished.POLISHED_DRIPSTONE.getDefaultState(), FabricBlockSettings.copy(Blocks.DRIPSTONE_BLOCK).requiresTool());
    public static final Block POLISHED_MUD_STAIRS = new ComposeStairsBlock(ComposePolished.POLISHED_MUD.getDefaultState(), FabricBlockSettings.copy(Blocks.PACKED_MUD).requiresTool());
    public static final Block POLISHED_TUFF_STAIRS = new ComposeStairsBlock(ComposePolished.POLISHED_TUFF.getDefaultState(), FabricBlockSettings.copy(Blocks.TUFF).requiresTool());
    public static final Block POLISHED_END_STONE_STAIRS = new ComposeStairsBlock(ComposePolished.POLISHED_END_STONE.getDefaultState(), FabricBlockSettings.copy(Blocks.END_STONE).requiresTool());
    public static final Block POLISHED_PRISMARINE_STAIRS = new ComposeStairsBlock(ComposePolished.POLISHED_END_STONE.getDefaultState(), FabricBlockSettings.copy(Blocks.PRISMARINE).requiresTool());

    public static void registerBlock() {
        Registry.register(Registries.BLOCK, new Identifier("compose", "polished_calcite_stairs"), POLISHED_CALCITE_STAIRS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "polished_dripstone_stairs"), POLISHED_DRIPSTONE_STAIRS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "polished_mud_stairs"), POLISHED_MUD_STAIRS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "polished_tuff_stairs"), POLISHED_TUFF_STAIRS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "polished_end_stone_stairs"), POLISHED_END_STONE_STAIRS);
        Registry.register(Registries.BLOCK, new Identifier("compose", "polished_prismarine_stairs"), POLISHED_PRISMARINE_STAIRS);

        Registry.register(Registries.ITEM, new Identifier("compose", "polished_calcite_stairs"), new BlockItem(POLISHED_CALCITE_STAIRS, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "polished_dripstone_stairs"), new BlockItem(POLISHED_DRIPSTONE_STAIRS, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "polished_mud_stairs"), new BlockItem(POLISHED_MUD_STAIRS, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "polished_tuff_stairs"), new BlockItem(POLISHED_TUFF_STAIRS, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "polished_end_stone_stairs"), new BlockItem(POLISHED_END_STONE_STAIRS, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "polished_prismarine_stairs"), new BlockItem(POLISHED_PRISMARINE_STAIRS, new FabricItemSettings()));

    }
}

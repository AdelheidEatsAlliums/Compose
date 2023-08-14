package net.adelheideatsalliums.compose.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.WallBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ComposePolishedWalls {
    public static final Block POLISHED_CALCITE_WALL = new WallBlock(FabricBlockSettings.copy(Blocks.CALCITE).requiresTool());
    public static final Block POLISHED_DRIPSTONE_WALL = new WallBlock(FabricBlockSettings.copy(Blocks.DRIPSTONE_BLOCK).requiresTool());
    public static final Block POLISHED_MUD_WALL = new WallBlock(FabricBlockSettings.copy(Blocks.PACKED_MUD).requiresTool());
    public static final Block POLISHED_TUFF_WALL = new WallBlock(FabricBlockSettings.copy(Blocks.TUFF).requiresTool());
    public static final Block POLISHED_END_STONE_WALL = new WallBlock(FabricBlockSettings.copy(Blocks.END_STONE).requiresTool());
    public static final Block POLISHED_PRISMARINE_WALL = new WallBlock(FabricBlockSettings.copy(Blocks.PRISMARINE).requiresTool());

    public static void registerBlock() {
        Registry.register(Registries.BLOCK, new Identifier("compose", "polished_calcite_wall"), POLISHED_CALCITE_WALL);
        Registry.register(Registries.BLOCK, new Identifier("compose", "polished_dripstone_wall"), POLISHED_DRIPSTONE_WALL);
        Registry.register(Registries.BLOCK, new Identifier("compose", "polished_mud_wall"), POLISHED_MUD_WALL);
        Registry.register(Registries.BLOCK, new Identifier("compose", "polished_tuff_wall"), POLISHED_TUFF_WALL);
        Registry.register(Registries.BLOCK, new Identifier("compose", "polished_end_stone_wall"), POLISHED_END_STONE_WALL);
        Registry.register(Registries.BLOCK, new Identifier("compose", "polished_prismarine_wall"), POLISHED_PRISMARINE_WALL);

        Registry.register(Registries.ITEM, new Identifier("compose", "polished_calcite_wall"), new BlockItem(POLISHED_CALCITE_WALL, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "polished_dripstone_wall"), new BlockItem(POLISHED_DRIPSTONE_WALL, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "polished_mud_wall"), new BlockItem(POLISHED_MUD_WALL, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "polished_tuff_wall"), new BlockItem(POLISHED_TUFF_WALL, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "polished_end_stone_wall"), new BlockItem(POLISHED_END_STONE_WALL, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "polished_prismarine_wall"), new BlockItem(POLISHED_PRISMARINE_WALL, new FabricItemSettings()));

    }
}

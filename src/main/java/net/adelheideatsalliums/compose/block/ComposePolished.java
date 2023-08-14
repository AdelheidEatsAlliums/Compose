package net.adelheideatsalliums.compose.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ComposePolished {
    public static final Block POLISHED_TUFF = new Block(FabricBlockSettings.copy(Blocks.TUFF).requiresTool());
    public static final Block POLISHED_CALCITE = new Block(FabricBlockSettings.copy(Blocks.CALCITE).requiresTool());
    public static final Block POLISHED_DRIPSTONE = new Block(FabricBlockSettings.copy(Blocks.DRIPSTONE_BLOCK).requiresTool());
    public static final Block POLISHED_MUD = new Block(FabricBlockSettings.copy(Blocks.PACKED_MUD).requiresTool());
    public static final Block POLISHED_END_STONE = new Block(FabricBlockSettings.copy(Blocks.END_STONE).requiresTool());
    public static final Block POLISHED_PRISMARINE = new Block(FabricBlockSettings.copy(Blocks.PRISMARINE).requiresTool());

    public static void registerBlock() {
        Registry.register(Registries.BLOCK, new Identifier("compose", "polished_tuff"), POLISHED_TUFF);
        Registry.register(Registries.BLOCK, new Identifier("compose", "polished_calcite"), POLISHED_CALCITE);
        Registry.register(Registries.BLOCK, new Identifier("compose", "polished_dripstone"), POLISHED_DRIPSTONE);
        Registry.register(Registries.BLOCK, new Identifier("compose", "polished_mud"), POLISHED_MUD);
        Registry.register(Registries.BLOCK, new Identifier("compose", "polished_end_stone"), POLISHED_END_STONE);
        Registry.register(Registries.BLOCK, new Identifier("compose", "polished_prismarine"), POLISHED_PRISMARINE);

        Registry.register(Registries.ITEM, new Identifier("compose", "polished_tuff"), new BlockItem(POLISHED_TUFF, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "polished_calcite"), new BlockItem(POLISHED_CALCITE, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "polished_dripstone"), new BlockItem(POLISHED_DRIPSTONE, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "polished_mud"), new BlockItem(POLISHED_MUD, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "polished_end_stone"), new BlockItem(POLISHED_END_STONE, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "polished_prismarine"), new BlockItem(POLISHED_PRISMARINE, new Item.Settings()));

    }
}

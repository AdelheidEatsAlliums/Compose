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

public class ComposePolishedSlabs {
    public static final Block POLISHED_CALCITE_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.CALCITE).requiresTool());
    public static final Block POLISHED_DRIPSTONE_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.DRIPSTONE_BLOCK).requiresTool());
    public static final Block POLISHED_MUD_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.PACKED_MUD).requiresTool());
    public static final Block POLISHED_TUFF_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.TUFF).requiresTool());
    public static final Block POLISHED_END_STONE_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.END_STONE).requiresTool());
    public static final Block POLISHED_PRISMARINE_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.PRISMARINE).requiresTool());

    public static void registerBlock() {
        Registry.register(Registries.BLOCK, new Identifier("compose", "polished_calcite_slab"), POLISHED_CALCITE_SLAB);
        Registry.register(Registries.BLOCK, new Identifier("compose", "polished_dripstone_slab"), POLISHED_DRIPSTONE_SLAB);
        Registry.register(Registries.BLOCK, new Identifier("compose", "polished_mud_slab"), POLISHED_MUD_SLAB);
        Registry.register(Registries.BLOCK, new Identifier("compose", "polished_tuff_slab"), POLISHED_TUFF_SLAB);
        Registry.register(Registries.BLOCK, new Identifier("compose", "polished_end_stone_slab"), POLISHED_END_STONE_SLAB);
        Registry.register(Registries.BLOCK, new Identifier("compose", "polished_prismarine_slab"), POLISHED_PRISMARINE_SLAB);

        Registry.register(Registries.ITEM, new Identifier("compose", "polished_calcite_slab"), new BlockItem(POLISHED_CALCITE_SLAB, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "polished_dripstone_slab"), new BlockItem(POLISHED_DRIPSTONE_SLAB, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "polished_mud_slab"), new BlockItem(POLISHED_MUD_SLAB, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "polished_tuff_slab"), new BlockItem(POLISHED_TUFF_SLAB, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "polished_end_stone_slab"), new BlockItem(POLISHED_END_STONE_SLAB, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "polished_prismarine_slab"), new BlockItem(POLISHED_PRISMARINE_SLAB, new FabricItemSettings()));

    }
}

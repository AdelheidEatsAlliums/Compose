package net.adelheideatsalliums.compose.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static net.minecraft.block.PressurePlateBlock.ActivationRule.EVERYTHING;

public class ComposePolishedPressurePlates {
    public static final Block POLISHED_CALCITE_PRESSURE_PLATE = new PressurePlateBlock(EVERYTHING,FabricBlockSettings.copy(Blocks.CALCITE).requiresTool(), BlockSetType.STONE);
    public static final Block POLISHED_DRIPSTONE_PRESSURE_PLATE = new PressurePlateBlock(EVERYTHING,FabricBlockSettings.copy(Blocks.DRIPSTONE_BLOCK).requiresTool(), BlockSetType.STONE);
    public static final Block POLISHED_MUD_PRESSURE_PLATE = new PressurePlateBlock(EVERYTHING,FabricBlockSettings.copy(Blocks.PACKED_MUD).requiresTool(), BlockSetType.STONE);
    public static final Block POLISHED_TUFF_PRESSURE_PLATE = new PressurePlateBlock(EVERYTHING,FabricBlockSettings.copy(Blocks.TUFF).requiresTool(), BlockSetType.STONE);
    public static final Block POLISHED_END_STONE_PRESSURE_PLATE = new PressurePlateBlock(EVERYTHING,FabricBlockSettings.copy(Blocks.END_STONE).requiresTool(), BlockSetType.STONE);
    public static final Block POLISHED_PRISMARINE_PRESSURE_PLATE = new PressurePlateBlock(EVERYTHING,FabricBlockSettings.copy(Blocks.PRISMARINE).requiresTool(), BlockSetType.STONE);

    public static void registerBlock() {
        Registry.register(Registries.BLOCK, new Identifier("compose", "polished_calcite_pressure_plate"), POLISHED_CALCITE_PRESSURE_PLATE);
        Registry.register(Registries.BLOCK, new Identifier("compose", "polished_dripstone_pressure_plate"), POLISHED_DRIPSTONE_PRESSURE_PLATE);
        Registry.register(Registries.BLOCK, new Identifier("compose", "polished_mud_pressure_plate"), POLISHED_MUD_PRESSURE_PLATE);
        Registry.register(Registries.BLOCK, new Identifier("compose", "polished_tuff_pressure_plate"), POLISHED_TUFF_PRESSURE_PLATE);
        Registry.register(Registries.BLOCK, new Identifier("compose", "polished_end_stone_pressure_plate"), POLISHED_END_STONE_PRESSURE_PLATE);
        Registry.register(Registries.BLOCK, new Identifier("compose", "polished_prismarine_pressure_plate"), POLISHED_PRISMARINE_PRESSURE_PLATE);

        Registry.register(Registries.ITEM, new Identifier("compose", "polished_calcite_pressure_plate"), new BlockItem(POLISHED_CALCITE_PRESSURE_PLATE, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "polished_dripstone_pressure_plate"), new BlockItem(POLISHED_DRIPSTONE_PRESSURE_PLATE, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "polished_mud_pressure_plate"), new BlockItem(POLISHED_MUD_PRESSURE_PLATE, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "polished_tuff_pressure_plate"), new BlockItem(POLISHED_TUFF_PRESSURE_PLATE, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "polished_end_stone_pressure_plate"), new BlockItem(POLISHED_END_STONE_PRESSURE_PLATE, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("compose", "polished_prismarine_pressure_plate"), new BlockItem(POLISHED_PRISMARINE_PRESSURE_PLATE, new FabricItemSettings()));

    }
}

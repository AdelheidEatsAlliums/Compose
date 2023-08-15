package net.adelheideatsalliums.compose;

import net.adelheideatsalliums.compose.block.ComposeSlabs;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.impl.blockrenderlayer.BlockRenderLayerMapImpl;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.color.world.GrassColors;
import net.minecraft.client.render.RenderLayer;

public class ComposeClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            if (world == null || pos == null) {
                return GrassColors.getColor(0.5, 1.0);
            }
            return BiomeColors.getGrassColor(world, pos);
        }, ComposeSlabs.GRASS_BLOCK_SLAB);

        ColorProviderRegistry.ITEM.register((stack, layer) -> {
            return GrassColors.getColor(0.5, 1.0);
        }, ComposeSlabs.GRASS_BLOCK_SLAB);

        BlockRenderLayerMapImpl.INSTANCE.putBlock(ComposeSlabs.GRASS_BLOCK_SLAB, RenderLayer.getCutoutMipped());

    }
}

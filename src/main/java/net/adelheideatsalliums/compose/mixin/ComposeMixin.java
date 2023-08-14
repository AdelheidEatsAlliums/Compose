package net.adelheideatsalliums.compose.mixin;

import net.adelheideatsalliums.compose.Compose;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class ComposeMixin {

    @Inject(at = @At("HEAD"), method = "init()V")
    private void init(CallbackInfo info) {
            Compose.LOGGER.info("This line is printed by a compose mixin!");
        }
}

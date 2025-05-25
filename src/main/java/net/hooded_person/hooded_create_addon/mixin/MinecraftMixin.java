package net.hooded_person.hooded_create_addon.mixin;

import net.hooded_person.hooded_create_addon.CreateAddonMod;


import net.minecraft.client.MinecraftClient;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftClient.class)
public class MinecraftMixin {
	@Inject(method = "<init>", at = @At("TAIL"))
	private void init(CallbackInfo ci) {
		CreateAddonMod.LOGGER.info("Hello from {}", CreateAddonMod.NAME);
	}
}

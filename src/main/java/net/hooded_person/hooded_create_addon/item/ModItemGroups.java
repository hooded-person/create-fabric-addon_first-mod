package net.hooded_person.hooded_create_addon.item;

import net.hooded_person.hooded_create_addon.CreateAddonMod;

import net.hooded_person.hooded_create_addon.block.ModBlocks;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
	public static final ItemGroup CREATE_ADDON_GROUP = Registry.register(Registries.ITEM_GROUP,
			new Identifier(CreateAddonMod.MOD_ID, "create_addon"),
			FabricItemGroup.builder().displayName(Text.translatable("itemgroup.create_addon"))
					.icon(() -> new ItemStack(Items.BREAD))
					.entries((displayContext, entries) -> {
						entries.add(ModBlocks.WEIRD_BLOCK);
						entries.add(Blocks.ACACIA_LOG);
					})
					.build()
	);

	public static void registerItemGroups() {
		CreateAddonMod.LOGGER.info("Registering ModItemsGroups for " + CreateAddonMod.MOD_ID);
	}
}

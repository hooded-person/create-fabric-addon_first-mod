package net.hooded_person.hooded_create_addon.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.hooded_person.hooded_create_addon.CreateAddonMod;


import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
	public static final Item WEIRD_BALL = registerItem(
			"weird_ball",
			new Item(new FabricItemSettings())
	);

	private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
		entries.add(WEIRD_BALL);
	}

	private static Item registerItem(String name, Item item) {
		return Registry.register(Registries.ITEM, CreateAddonMod.id(name), item);
	}

	public static void registerModItems() {
		CreateAddonMod.LOGGER.info("Registering ModItems for " + CreateAddonMod.MOD_ID);

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
	}
}

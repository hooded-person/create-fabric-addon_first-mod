package net.hooded_person.hooded_create_addon.item;

import net.hooded_person.hooded_create_addon.CreateAddonMod;


import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
	private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
//		entries.add();
	}

	private static Item registerItem(String name, Item item) {
		return Registry.register(Registries.ITEM, new Identifier(CreateAddonMod.MOD_ID, name), item);
	}

	public static void registerModItems() {
		CreateAddonMod.LOGGER.info("Registering ModItems for " + CreateAddonMod.MOD_ID);

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
	}
}

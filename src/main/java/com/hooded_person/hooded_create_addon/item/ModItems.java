package com.hooded_person.hooded_create_addon.item;

import com.hooded_person.hooded_create_addon.CreateAddonMod;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraft.util.Identifier;

public class ModItems {
	public static Item registerItem(Item item, String id) {
		Identifier itemID = new Identifier(CreateAddonMod.MOD_ID, id);
		return Registry.register(Registries.ITEM, itemID, item);
	}
}

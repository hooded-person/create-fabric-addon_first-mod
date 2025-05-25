package net.hooded_person.hooded_create_addon.block;

import net.hooded_person.hooded_create_addon.CreateAddonMod;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.hooded_person.hooded_create_addon.block.custom.WeirdBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
	public static final Block WEIRD_BLOCK = registerBlock("weird_block",
			new WeirdBlock( FabricBlockSettings.copyOf(Blocks.IRON_BLOCK) ));

	private static Block registerBlock(String name, Block block) {
		registerBlockItem(name, block);
		return Registry.register(Registries.BLOCK, CreateAddonMod.id(name), block);
	}

	private static Item registerBlockItem(String name, Block block) {
		return Registry.register(Registries.ITEM, CreateAddonMod.id(name),
				new BlockItem(block, new FabricItemSettings())
		);
	}

	public static void registerModBlocks() {
		CreateAddonMod.LOGGER.info("Registering ModBlocks for " + CreateAddonMod.MOD_ID);
	}
}

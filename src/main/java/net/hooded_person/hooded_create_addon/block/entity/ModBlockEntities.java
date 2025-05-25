package net.hooded_person.hooded_create_addon.block.entity;

import com.simibubi.create.Create;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.hooded_person.hooded_create_addon.CreateAddonMod;
import net.hooded_person.hooded_create_addon.block.ModBlocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
	public static final BlockEntityType<WeirdBlockEntity> WEIRD_BLOCK_ENTITY =
			Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(CreateAddonMod.MOD_ID, "weird_block_entity"),
					FabricBlockEntityTypeBuilder.create(WeirdBlockEntity::new, ModBlocks.WEIRD_BLOCK).build()
					);
	public static void registerBlockEntites() {
		CreateAddonMod.LOGGER.info("Registering Block Entities for " + CreateAddonMod.MOD_ID);
	}
}

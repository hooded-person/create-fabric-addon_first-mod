package net.hooded_person.hooded_create_addon;

import net.hooded_person.hooded_create_addon.block.ModBlocks;
import net.hooded_person.hooded_create_addon.block.entity.ModBlockEntities;
import net.hooded_person.hooded_create_addon.item.ModItemGroups;
import net.hooded_person.hooded_create_addon.item.ModItems;
import com.simibubi.create.Create;

import io.github.fabricators_of_create.porting_lib.util.EnvExecutor;
import net.fabricmc.api.ModInitializer;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateAddonMod implements ModInitializer {
	public static final String MOD_ID = "hooded_create_addon";
	public static final String NAME = "Hooded's create addon";
	public static final Logger LOGGER = LoggerFactory.getLogger(NAME);

	@Override
	public void onInitialize() {
		LOGGER.info("Create addon mod [{}] is loading alongside Create [{}]!", NAME, Create.VERSION);
		LOGGER.info(EnvExecutor.unsafeRunForDist(
				() -> () -> "{} is accessing Porting Lib from the client!",
				() -> () -> "{} is accessing Porting Lib from the server!"
		), NAME);

		ModItemGroups.registerItemGroups();

		ModBlocks.registerModBlocks();
		ModItems.registerModItems();

		ModBlockEntities.registerBlockEntites();
	}
}

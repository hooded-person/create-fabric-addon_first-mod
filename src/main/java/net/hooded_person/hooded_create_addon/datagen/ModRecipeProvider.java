package net.hooded_person.hooded_create_addon.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.hooded_person.hooded_create_addon.block.ModBlocks;
import net.hooded_person.hooded_create_addon.item.ModItems;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
	public ModRecipeProvider(FabricDataOutput output) {
		super(output);
	}

	@Override
	public void generate(Consumer<RecipeJsonProvider> consumer) {
		ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.WEIRD_BLOCK, 1)
				.pattern(" B ")
				.pattern(" R ")
				.pattern(" M ")
				.input('B', ModItems.WEIRD_BALL)
				.input('R', Items.MANGROVE_ROOTS)
				.input('M', Items.MOSS_BLOCK)
				.criterion(hasItem(ModItems.WEIRD_BALL), conditionsFromItem((ModItems.WEIRD_BALL)))
				.criterion(hasItem(Items.MANGROVE_ROOTS), conditionsFromItem((Items.MANGROVE_ROOTS)))
				.criterion(hasItem(Items.MOSS_BLOCK), conditionsFromItem((Items.MOSS_BLOCK)))
				.offerTo(consumer, new Identifier(getRecipeName(ModBlocks.WEIRD_BLOCK)));
	}
}

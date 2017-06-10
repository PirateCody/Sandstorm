package com.piratecody.sandstorm.crafting;

import com.piratecody.sandstorm.init.ModBlocks;
import com.piratecody.sandstorm.init.SandstormItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {
	
	public static void registerRecipes() {
		

		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.compressedSand), new Object[] 
				{"AAA", "AAA", "AAA", 'A', Blocks.sand});
		
		GameRegistry.addShapedRecipe(new ItemStack(SandstormItems.SandShard), new Object[] 
				{" A ", " A ", "A A", 'A', ModBlocks.compressedSand});
		
		GameRegistry.addShapedRecipe(new ItemStack(SandstormItems.darudeEssence), new Object[] 
				{"ABA", "BAB", "ABA", 'A', SandstormItems.SandShard, 'B', Blocks.gold_block});
		
		GameRegistry.addShapedRecipe(new ItemStack(SandstormItems.sandstormFrag), new Object[] 
				{"ABA", "BAB", "ABA", 'A', SandstormItems.darudeEssence, 'B', SandstormItems.SandShard});
		
		GameRegistry.addShapedRecipe(new ItemStack(SandstormItems.primordialSS), new Object[] 
				{"AAA", "AAA", "AAA", 'A', SandstormItems.sandstormFrag});
		
		GameRegistry.addShapelessRecipe(new ItemStack(SandstormItems.SandstormRecord), new Object[] 
				{new ItemStack(SandstormItems.primordialSS), Items.nether_star});

		
		
	}

}

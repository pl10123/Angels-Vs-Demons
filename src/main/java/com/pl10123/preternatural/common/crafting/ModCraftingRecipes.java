package com.pl10123.preternatural.common.crafting;

import com.pl10123.preternatural.common.block.ModBlocks;
import com.pl10123.preternatural.common.item.ModItems;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCraftingRecipes {
	
	public static void initRecipes(){
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.silverBlock), 
				new Object [] {
						"###",
						"###",
						"###", 
						'#', ModItems.silverIngot
				});
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.silverIngot, 9), 
				new Object [] {
						ModBlocks.silverBlock
				});
	}

}

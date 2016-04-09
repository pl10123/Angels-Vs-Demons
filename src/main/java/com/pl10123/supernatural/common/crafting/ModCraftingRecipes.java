package com.pl10123.supernatural.common.crafting;

import com.pl10123.supernatural.common.block.SNBlocks;
import com.pl10123.supernatural.common.item.SNItems;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCraftingRecipes {
	
	public static void initRecipes(){
		
		GameRegistry.addRecipe(new ItemStack(SNBlocks.silverBlock), 
				new Object [] {
						"###",
						"###",
						"###", 
						'#', SNItems.silverIngot
				});
		GameRegistry.addShapelessRecipe(new ItemStack(SNItems.silverIngot, 9), 
				new Object [] {
						SNBlocks.silverBlock
				});
	}

}

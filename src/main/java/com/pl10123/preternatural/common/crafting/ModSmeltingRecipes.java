package com.pl10123.preternatural.common.crafting;

import com.pl10123.preternatural.common.block.ModBlocks;
import com.pl10123.preternatural.common.item.ModItems;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModSmeltingRecipes {
	
	public static void initSmelting(){
		GameRegistry.addSmelting(ModBlocks.silverOre, new ItemStack(ModItems.silverIngot), 0);
	}

}

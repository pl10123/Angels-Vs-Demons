package com.pl10123.supernatural.common.crafting;

import com.pl10123.supernatural.common.block.SNBlocks;
import com.pl10123.supernatural.common.item.SNItems;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModSmeltingRecipes {
	
	public static void initSmelting(){
		GameRegistry.addSmelting(SNBlocks.silverOre, new ItemStack(SNItems.silverIngot), 0);
	}

}

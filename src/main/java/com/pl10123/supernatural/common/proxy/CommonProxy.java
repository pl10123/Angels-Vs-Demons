package com.pl10123.supernatural.common.proxy;

import com.pl10123.supernatural.common.block.SNBlocks;
import com.pl10123.supernatural.common.crafting.ModCraftingRecipes;
import com.pl10123.supernatural.common.crafting.ModSmeltingRecipes;
import com.pl10123.supernatural.common.item.SNItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent preEvent) {
        SNBlocks.initBlocks();
        SNItems.initItems();
        
        ModCraftingRecipes.initRecipes();
        ModSmeltingRecipes.initSmelting();
    }

    public void init(FMLInitializationEvent event) {
    }

    public void postInit(FMLPostInitializationEvent postEvent) {

    }
}

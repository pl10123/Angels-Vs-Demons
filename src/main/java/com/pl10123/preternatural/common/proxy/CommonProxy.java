package com.pl10123.preternatural.common.proxy;

import com.pl10123.preternatural.common.Preternatural;
import com.pl10123.preternatural.common.block.ModBlocks;
import com.pl10123.preternatural.common.crafting.ModCraftingRecipes;
import com.pl10123.preternatural.common.crafting.ModSmeltingRecipes;
import com.pl10123.preternatural.common.item.ModItems;
import com.pl10123.preternatural.common.network.GuiHandler;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent preEvent) {
        ModBlocks.initBlocks();
        ModItems.initItems();
        
        ModCraftingRecipes.initRecipes();
        ModSmeltingRecipes.initSmelting();
    }

    public void init(FMLInitializationEvent event) {
    	NetworkRegistry.INSTANCE.registerGuiHandler(Preternatural.instance, new GuiHandler());
    }

    public void postInit(FMLPostInitializationEvent postEvent) {

    }
}

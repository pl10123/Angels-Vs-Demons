package com.pl10123.supernatural.common.proxy;

import com.pl10123.supernatural.common.SuperNatural;
import com.pl10123.supernatural.common.block.SNBlocks;
import com.pl10123.supernatural.common.crafting.ModCraftingRecipes;
import com.pl10123.supernatural.common.crafting.ModSmeltingRecipes;
import com.pl10123.supernatural.common.item.SNItems;
import com.pl10123.supernatural.common.network.GuiHandler;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent preEvent) {
        SNBlocks.initBlocks();
        SNItems.initItems();
        
        ModCraftingRecipes.initRecipes();
        ModSmeltingRecipes.initSmelting();
    }

    public void init(FMLInitializationEvent event) {
    	NetworkRegistry.INSTANCE.registerGuiHandler(SuperNatural.instance, new GuiHandler());
    }

    public void postInit(FMLPostInitializationEvent postEvent) {

    }
}

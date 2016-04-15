package com.pl10123.preternatural.client.proxy;

import com.pl10123.preternatural.client.render.ModBlockRender;
import com.pl10123.preternatural.client.render.ModItemRender;
import com.pl10123.preternatural.common.proxy.CommonProxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {

    @Override
    public void init(FMLInitializationEvent event) {
        super.init(event);
    }

    @Override
    public void postInit(FMLPostInitializationEvent postEvent) {
        super.postInit(postEvent);
        ModBlockRender.registerBlockRender();
        ModItemRender.registerItemRender();
    }

    @Override
    public void preInit(FMLPreInitializationEvent preEvent) {
        super.preInit(preEvent);
    }
}

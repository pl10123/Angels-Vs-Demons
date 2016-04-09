package com.pl10123.supernatural.client.proxy;

import com.pl10123.supernatural.client.render.SNBlockRender;
import com.pl10123.supernatural.client.render.SNItemRender;
import com.pl10123.supernatural.common.proxy.CommonProxy;
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
        SNBlockRender.registerBlockRender();
        SNItemRender.registerItemRender();
    }

    @Override
    public void preInit(FMLPreInitializationEvent preEvent) {
        super.preInit(preEvent);
    }
}

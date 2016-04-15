package com.pl10123.supernatural.common;

import com.pl10123.supernatural.common.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Constants.MODID, name = Constants.MODNAME, version = Constants.VERSION)
public class SuperNatural {

    @Mod.Instance(Constants.MODID)
    public static SuperNatural instance;

    @SidedProxy(clientSide = Constants.CLIENT_PROXY, serverSide = Constants.COMMON_PROXY)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent preEvent){
        this.proxy.preInit(preEvent);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        this.proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent postEvent){
        this.proxy.postInit(postEvent);
    }

}

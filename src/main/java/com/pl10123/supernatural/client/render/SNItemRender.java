package com.pl10123.supernatural.client.render;

import com.pl10123.supernatural.common.Constants;
import com.pl10123.supernatural.common.item.SNItems;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class SNItemRender {

    public static void registerItemRender(){

        regItem(SNItems.silverIngot);
        regItem(SNItems.saltDust);
    }

    public static void regItem(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(new ResourceLocation(Constants.MODID, item.getRegistryName().getResourcePath()), "inventory"));
    }
    
   
}

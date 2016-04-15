package com.pl10123.preternatural.client.render;

import com.pl10123.preternatural.common.Constants;
import com.pl10123.preternatural.common.item.ModItems;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class ModItemRender {

    public static void registerItemRender(){

        regItem(ModItems.silverIngot);
        regItem(ModItems.saltDust);
        regItem(ModItems.demonBook);
    }

    public static void regItem(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(new ResourceLocation(Constants.MODID, item.getRegistryName().getResourcePath()), "inventory"));
    }
    
   
}

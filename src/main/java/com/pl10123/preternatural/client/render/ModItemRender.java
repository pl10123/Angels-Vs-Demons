package com.pl10123.preternatural.client.render;

import java.util.ArrayList;

import com.pl10123.preternatural.common.Constants;
import com.pl10123.preternatural.common.item.ItemChalk;
import com.pl10123.preternatural.common.item.ModItems;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class ModItemRender {

    public static void registerItemRender(){

        regItem(ModItems.silverIngot);
        regItem(ModItems.saltDust);
        regItem(ModItems.demonBook);
        regSubTypes(ModItems.chalk, ItemChalk.chalkTypes);
    }

    public static void regItem(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(new ResourceLocation(Constants.MODID, item.getRegistryName().getResourcePath()), "inventory"));
    }
    
    public static void regSubTypes(Item item, String[] types){

    	for(int i = 0; i < types.length; i ++){
    		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, i, new ModelResourceLocation(new ResourceLocation(Constants.MODID, item.getRegistryName().getResourcePath() + "_" + types[i]), "inventory"));
    	}
    	ArrayList<ResourceLocation> locations = new ArrayList();
    	for(int i = 0; i < types.length; i ++){
    		locations.add(new ResourceLocation(Constants.MODID, item.getRegistryName().getResourcePath() + "_" + types[i]));
    	}
    	ResourceLocation[] locs = new ResourceLocation[locations.size()];
    	locs = locations.toArray(locs);
    	ModelBakery.registerItemVariants(item, locs);
    }
    
   
}

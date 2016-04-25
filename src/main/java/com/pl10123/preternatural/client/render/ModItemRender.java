package com.pl10123.preternatural.client.render;

import com.pl10123.preternatural.common.Constants;
import com.pl10123.preternatural.common.item.ItemChalk;
import com.pl10123.preternatural.common.item.ModItems;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.client.renderer.color.ItemColors;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class ModItemRender {

    public static void registerItemRender(){

        regItem(ModItems.silverIngot);
        regItem(ModItems.saltDust);
        regItem(ModItems.demonBook);
        regSubTypes(ModItems.chalk, ItemChalk.chalkTypes);
        
        initColors();
    }

    public static void regItem(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(new ResourceLocation(Constants.MODID, item.getRegistryName().getResourcePath()), "inventory"));
    }
    
    public static void regSubTypes(Item item, String[] types){

    	for(int i = 0; i < types.length; i ++){
    		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, i, new ModelResourceLocation(new ResourceLocation(Constants.MODID, item.getRegistryName().getResourcePath() + "_" + types[i]), "inventory"));
    		ModelBakery.registerItemVariants(item, new ResourceLocation(Constants.MODID, item.getRegistryName().getResourcePath() + "_" + types[i]));
            ModelLoader.setCustomModelResourceLocation(item, i, new ModelResourceLocation(new ResourceLocation(Constants.MODID, item.getRegistryName().getResourcePath() + "_" + types[i]), "type=" + types[i]));
    	}    	
    }
    
    public static void initColors(){
    	ItemColors colors = Minecraft.getMinecraft().getItemColors();
    	
    	colors.registerItemColorHandler(new IItemColor() {
			
			@Override
			public int getColorFromItemstack(ItemStack stack, int tintIndex) {
				return ItemChalk.getColorFromStack(stack);
			}
		}, ModItems.chalk);
    }
    
   
}

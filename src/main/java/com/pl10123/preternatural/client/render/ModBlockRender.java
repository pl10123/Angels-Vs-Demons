package com.pl10123.preternatural.client.render;


import com.pl10123.preternatural.common.Constants;
import com.pl10123.preternatural.common.block.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public final class ModBlockRender {

    public static void registerBlockRender(){

        //Ores
        registerBlock(ModBlocks.saltOre);
        registerBlock(ModBlocks.silverOre);
        
        //Metal blocks
        registerBlock(ModBlocks.silverBlock);
        
        registerBlock(ModBlocks.chalkBlock);
    }

    private static void registerBlock(Block block) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(new ResourceLocation(Constants.MODID, block.getRegistryName().getResourcePath()), "inventory"));

    }
}

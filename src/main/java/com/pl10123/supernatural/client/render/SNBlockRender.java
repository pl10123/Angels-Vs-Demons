package com.pl10123.supernatural.client.render;


import com.pl10123.supernatural.common.Constants;
import com.pl10123.supernatural.common.block.SNBlocks;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public final class SNBlockRender {

    public static void registerBlockRender(){

        //Ores
        registerBlock(SNBlocks.saltOre);
        registerBlock(SNBlocks.silverOre);
        
        //Metal blocks
        registerBlock(SNBlocks.silverBlock);
    }

    private static void registerBlock(Block block) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(Constants.MODID + ":" + block.getUnlocalizedName().substring(5), "inventory"));

    }
}

package com.pl10123.preternatural.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {

	//Ores
    public static Block saltOre = new ModBlock("saltOre", Material.rock, 2, 10);
    public static Block silverOre = new ModBlock("silverOre", Material.rock, 3, 15);
    
    //Metal Blocks
    public static Block silverBlock = new ModBlock("silverBlock", Material.rock, 3, 15);
    
    

    public static void initBlocks(){
        //Ores
        GameRegistry.register(saltOre);
        GameRegistry.register(new ItemBlock(saltOre), saltOre.getRegistryName());
        GameRegistry.register(silverOre);
        GameRegistry.register(new ItemBlock(silverOre), silverOre.getRegistryName());
        GameRegistry.register(silverBlock);
        GameRegistry.register(new ItemBlock(silverBlock), silverBlock.getRegistryName());
    }

}

package com.pl10123.supernatural.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.IForgeRegistryEntry;

import java.util.ArrayList;

public class SNBlocks {

	//Ores
    public static Block saltOre = new SuperNaturalBlock("saltOre", Material.rock, 2, 10);
    public static Block silverOre = new SuperNaturalBlock("silverOre", Material.rock, 3, 15);
    
    //Metal Blocks
    public static Block silverBlock = new SuperNaturalBlock("silverBlock", Material.rock, 3, 15);
    
    

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

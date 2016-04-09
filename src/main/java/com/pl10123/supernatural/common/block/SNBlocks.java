package com.pl10123.supernatural.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.IForgeRegistryEntry;

import java.util.ArrayList;

public class SNBlocks {

	//Ores
    public static Block saltOre;
    public static Block silverOre;
    
    //Metal Blocks
    public static Block silverBlock;
    
    

    public static void initBlocks(){
        //Ores
        GameRegistry.registerBlock(saltOre = new SuperNaturalBlock("saltOre", Material.rock, 2, 10), "saltOre");
        GameRegistry.registerBlock(silverOre = new SuperNaturalBlock("silverOre", Material.rock, 3, 15), "silverOre");
        GameRegistry.registerBlock(silverBlock = new SuperNaturalBlock("silverBlock", Material.rock, 3, 15), "silverBlock");
    }

}

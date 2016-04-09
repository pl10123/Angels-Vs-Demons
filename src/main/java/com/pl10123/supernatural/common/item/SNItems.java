package com.pl10123.supernatural.common.item;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SNItems {

    //Ingots
    public static Item silverIngot;

    //Dusts
    public static Item saltDust;
    
    //Chalks
    public static Item whiteChalk;

    public static void initItems(){
    	
        GameRegistry.registerItem(silverIngot = new SuperNaturalItem("silverIngot"), "silverIngot");

        GameRegistry.registerItem(saltDust = new SuperNaturalItem("saltDust"), "saltDust");
        
       // GameRegistry.registerItem(whiteChalk = new ItemChalk(), "chalk"); 
    }

}

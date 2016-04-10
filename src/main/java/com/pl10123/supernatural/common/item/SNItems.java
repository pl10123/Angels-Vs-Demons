package com.pl10123.supernatural.common.item;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SNItems {

    //Ingots
    public static Item silverIngot = new SuperNaturalItem("silverIngot");

    //Dusts
    public static Item saltDust = new SuperNaturalItem("saltDust");
    
    //Chalks
    public static Item whiteChalk;

    public static void initItems(){
    	
    	GameRegistry.register(silverIngot);

        GameRegistry.register(saltDust);
        
       // GameRegistry.registerItem(whiteChalk = new ItemChalk(), "chalk"); 
    }

}

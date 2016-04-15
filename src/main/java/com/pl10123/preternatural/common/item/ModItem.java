package com.pl10123.preternatural.common.item;

import com.pl10123.preternatural.common.Constants;

import net.minecraft.item.Item;

public class ModItem extends Item {

    public ModItem(String name){
        super();
        this.setUnlocalizedName(Constants.MODID + "." + name);
        this.setCreativeTab(Constants.BASIC_TAB);
        this.setRegistryName(name);
    }

}

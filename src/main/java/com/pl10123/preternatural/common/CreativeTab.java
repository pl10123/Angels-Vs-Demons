package com.pl10123.preternatural.common;

import com.pl10123.preternatural.common.item.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTab extends CreativeTabs {

    public CreativeTab(String string) {
        super(string);

    }

    @Override
    public Item getTabIconItem() {
        return ModItems.saltDust;
    }
}

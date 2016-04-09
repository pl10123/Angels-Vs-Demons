package com.pl10123.supernatural.common;

import com.pl10123.supernatural.common.item.SNItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTab extends CreativeTabs {

    public CreativeTab(String string) {
        super(string);

    }

    @Override
    public Item getTabIconItem() {
        return SNItems.saltDust;
    }
}

package com.pl10123.supernatural.common.item;

import com.pl10123.supernatural.common.Constants;
import net.minecraft.item.Item;

public class SuperNaturalItem extends Item {

    public SuperNaturalItem(String name){
        super();
        this.setUnlocalizedName(name);
        this.setCreativeTab(Constants.BASIC_TAB);

    }

}

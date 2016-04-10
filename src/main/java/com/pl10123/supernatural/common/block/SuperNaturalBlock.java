package com.pl10123.supernatural.common.block;


import java.util.Random;

import com.pl10123.supernatural.common.Constants;
import com.pl10123.supernatural.common.item.SNItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class SuperNaturalBlock extends Block {

    public SuperNaturalBlock(String unLocalizedName, Material material, float hardness, float resistance){
        super(material);

        this.setUnlocalizedName(Constants.MODID + "." + unLocalizedName);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setCreativeTab(Constants.BASIC_TAB);
        this.setRegistryName(unLocalizedName);
    }

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return this == SNBlocks.saltOre ? SNItems.saltDust : Item.getItemFromBlock(this);
	}

	@Override
	public int quantityDroppedWithBonus(int fortune, Random random) {
		return this == SNBlocks.saltOre ? 2 + random.nextInt(2) : 1;
	}
	
	
    
    

}

package com.pl10123.preternatural.common.item;

import com.pl10123.preternatural.common.Constants;
import com.pl10123.preternatural.common.Preternatural;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class DemonBook extends ModItem{

	public DemonBook(String name) {
		super(name);
	}

	@Override
	public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos,
			EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		playerIn.openGui(Preternatural.instance, Constants.GUI_BOOK_ID, worldIn, 0,0,0);
		return EnumActionResult.SUCCESS;
	}
	
	

	
	
	
	
	

}

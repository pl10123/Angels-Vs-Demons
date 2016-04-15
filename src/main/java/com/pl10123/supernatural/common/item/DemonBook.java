package com.pl10123.supernatural.common.item;

import com.pl10123.supernatural.common.Constants;
import com.pl10123.supernatural.common.SuperNatural;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class DemonBook extends SuperNaturalItem{

	public DemonBook(String name) {
		super(name);
	}

	@Override
	public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos,
			EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		playerIn.openGui(SuperNatural.instance, Constants.GUI_BOOK_ID, worldIn, 0,0,0);
		return EnumActionResult.SUCCESS;
	}
	
	

	
	
	
	
	

}

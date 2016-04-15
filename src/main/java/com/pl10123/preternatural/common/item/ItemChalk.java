package com.pl10123.preternatural.common.item;

import java.util.List;

import com.pl10123.preternatural.common.Constants;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemChalk extends ModItem {


	public ItemChalk() {
		super("chalk");
		setHasSubtypes(true);
		setNoRepair();
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return super.getUnlocalizedName() + "." + (stack.getItemDamage() == 0 ? "white" : "yellow");
	}

	@Override
	public double getDurabilityForDisplay(ItemStack stack) {
		return stack.getTagCompound().getInteger(Constants.KEY_CHALK_DAMAGE)/Constants.MAX_CHALK_USES;
	}

	@Override
	public boolean showDurabilityBar(ItemStack stack) {
		return (stack.getTagCompound().getInteger(Constants.KEY_CHALK_DAMAGE) == 0) ? false : true;
	}

	@Override
	public void getSubItems(Item itemIn, CreativeTabs tab, List<ItemStack> subItems) {
		subItems.add(new ItemStack(itemIn, 1, 0));
		subItems.add(new ItemStack(itemIn, 1, 1));
	}
	
	
	@Override
	public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos,
			EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		if(facing == EnumFacing.UP){
			if(stack.getItemDamage() == 0){
			
				
				
				decreaseStackUsesLeft(stack, playerIn);
				return EnumActionResult.SUCCESS;
			} else if(stack.getItemDamage() == 1){
				
				
				
				decreaseStackUsesLeft(stack, playerIn);
				return EnumActionResult.SUCCESS;
			}
		} 
			return EnumActionResult.FAIL;
	}

	private void decreaseStackUsesLeft(ItemStack stack, EntityLivingBase entity){
		int left = stack.getTagCompound().getInteger(Constants.KEY_CHALK_DAMAGE);
		--left;
		if(left == 0){
			entity.renderBrokenItemStack(stack);
			--stack.stackSize;
		}else {
			NBTTagCompound nbt = new NBTTagCompound();
			nbt.setInteger(Constants.KEY_CHALK_DAMAGE, left);
			stack.setTagCompound(nbt);
		}
	}

	
	
	
	
	
	
	
	
	
	

	

}

package com.pl10123.preternatural.common.item;

import java.util.List;

import com.pl10123.preternatural.common.Constants;
import com.pl10123.preternatural.common.block.ModBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemChalk extends ModItem {

	public final static String[] chalkTypes = { "white", "yellow", "red" };
	public final static String NBT_KEY_TYPE = "CHALK_COLOR";
	public final static String NBT_KEY_USES = "CHALK_USES";
	
	public ItemChalk() {
		super("chalk");
		setHasSubtypes(true);
		setNoRepair();
		setMaxDamage(30);
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
		if (stack.hasTagCompound()){
			NBTTagCompound itemData = stack.getTagCompound();
			if(itemData.hasKey(NBT_KEY_TYPE)) return super.getUnlocalizedName() + "." + itemData.getString(NBT_KEY_TYPE);
		}
		return super.getUnlocalizedName();
	}
	
	

	@Override
	public void getSubItems(Item itemIn, CreativeTabs tab, List<ItemStack> subItems) {
		for(int i = 0; i < chalkTypes.length; i ++){
			NBTTagCompound tag = new NBTTagCompound();
			tag.setString(NBT_KEY_TYPE, chalkTypes[i]);
			tag.setInteger(NBT_KEY_USES, 30);
			ItemStack newChalk = new ItemStack(itemIn);
			newChalk.setTagCompound(tag);
			subItems.add(newChalk);
		}
	}
	
	
	@Override
	public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos,
			EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		
		boolean flag = worldIn.getBlockState(pos).getBlock().isReplaceable(worldIn, pos);
        BlockPos blockpos = flag ? pos : pos.offset(facing);

        if (playerIn.canPlayerEdit(blockpos, facing, stack) && worldIn.canBlockBePlaced(worldIn.getBlockState(blockpos).getBlock(), blockpos, false, facing, (Entity)null, stack) && Blocks.redstone_wire.canPlaceBlockAt(worldIn, blockpos))
        {
			stack.damageItem(1, playerIn);
			String type = stack.getTagCompound().getString(NBT_KEY_TYPE);
			int meta = 0;
			for(int i = 0; i < chalkTypes.length; i ++){
				if(type.equals(chalkTypes[i])) meta = i;
				break;
			}
            worldIn.setBlockState(blockpos, ModBlocks.chalkBlock.getStateFromMeta(meta));
            return EnumActionResult.SUCCESS;
        }
        else
        {
            return EnumActionResult.FAIL;
        }
	}

	private void decreaseStackUsesLeft(ItemStack stack, EntityLivingBase entity){
		int left = stack.getTagCompound().getInteger(NBT_KEY_USES);
		left = left -1;
		if(left == 0){
			entity.renderBrokenItemStack(stack);
			stack.stackSize = stack.stackSize -1;
			
		}else {
			NBTTagCompound nbt = new NBTTagCompound();
			nbt.setInteger(NBT_KEY_USES, left);
			stack.setTagCompound(nbt);
		}
} 

	

}

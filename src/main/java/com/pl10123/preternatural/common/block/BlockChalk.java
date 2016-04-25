package com.pl10123.preternatural.common.block;

import java.util.List;

import com.pl10123.preternatural.common.Constants;
import com.pl10123.preternatural.common.item.ItemChalk;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockChalk extends Block{

	public static final PropertyEnum TYPE = PropertyEnum.create("type", BlockChalk.EnumType.class);
	
	public BlockChalk() {
        super(Material.carpet);

        this.setUnlocalizedName(Constants.MODID + "." + "blockChalk");
        this.setHardness(0.5F);
        this.setResistance(0.3F);
        this.setRegistryName("blockChalk");
        this.setDefaultState(this.blockState.getBaseState().withProperty(TYPE, EnumType.WHITE));
	}	
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return new AxisAlignedBB(0,0,0,1,0.1,1);
	}

	@Override
	public void getSubBlocks(Item itemIn, CreativeTabs tab, List list) {
	    list.add(new ItemStack(itemIn, 1, 0)); 
	    list.add(new ItemStack(itemIn, 1, 1)); 
	    list.add(new ItemStack(itemIn, 1, 2)); 
	}
	
	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, new IProperty[] { TYPE });
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta) {
		switch(meta){
		case 0:
			return getDefaultState().withProperty(TYPE, EnumType.WHITE);
		case 1:
			return getDefaultState().withProperty(TYPE, EnumType.YELLOW);
		case 2:
			return getDefaultState().withProperty(TYPE, EnumType.RED);
		}
		return null;
	}

	@Override
	public int getMetaFromState(IBlockState state) {
		EnumType type = (EnumType) state.getValue(TYPE);
	    return type.getID();
	}

	@Override
	public int damageDropped(IBlockState state) {
		return getMetaFromState(state);
	}
	
	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos,
			EntityPlayer player) {
		ItemStack item = new ItemStack(new ItemChalk());
		NBTTagCompound tag = new NBTTagCompound();
		String name =  ((EnumType) state.getValue(TYPE)).getName();
		tag.setString(ItemChalk.NBT_KEY_TYPE, name);
		item.setTagCompound(tag);
		return item;
	}

	@Override
    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.CUTOUT;
    }
//
//    @Override
//    public boolean isFullCube(IBlockState state)
//    {
//        return false;
//    }
	@Override
	public boolean shouldSideBeRendered(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos,
			EnumFacing side) {
		return(side == EnumFacing.UP);
	}

	@Override
    public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }

	public enum EnumType implements IStringSerializable {
		WHITE(0, "white"),
		YELLOW(1, "yellow"),
		RED(2, "red");
		
		private int ID;
		private String name;
		
		private EnumType(int id, String name){
			this.ID = id;
			this.name = name;
		}

		@Override
		public String getName() {
			return name;
		}
		
		public int getID(){
			return ID;
		}
		
		@Override
		public String toString(){
			return name;
		}
		
	}
}

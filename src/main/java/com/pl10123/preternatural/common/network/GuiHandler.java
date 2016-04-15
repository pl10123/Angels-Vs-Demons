package com.pl10123.preternatural.common.network;

import com.pl10123.preternatural.client.gui.book.GuiDemonBook;
import com.pl10123.preternatural.common.Constants;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		switch(ID){
		case Constants.GUI_BOOK_ID:
			return new GuiDemonBook();
		}
		return null;
	}

}

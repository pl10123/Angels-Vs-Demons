package com.pl10123.supernatural.client.gui.book;

import com.pl10123.supernatural.common.Constants;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;

public class GuiDemonBook extends GuiScreen{

	ResourceLocation resource = new ResourceLocation(Constants.GUI_BOOK_RES);
	
	int guiWidth = 256;
	int guiHeight = 180;
	int x, y;
	
	
	@Override
	public void initGui() {
		super.initGui();
		x = width/2 - guiWidth/2;
		y = height/2 - guiHeight/2;
		
	}
	
	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks) {
		mc.renderEngine.bindTexture(resource);
		drawTexturedModalRect(x, y, 0, 0, guiWidth, guiHeight);		
	}


	@Override
	public boolean doesGuiPauseGame() {
		return false;
	}
	
	

	
	

}

package com.pl10123.preternatural.client.gui.book;

import java.io.IOException;
import java.util.ArrayList;

import com.pl10123.preternatural.api.PreternaturalAPI;
import com.pl10123.preternatural.api.book.BookCategory;
import com.pl10123.preternatural.client.gui.book.button.GuiCategoryButton;
import com.pl10123.preternatural.common.Constants;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;

public class GuiDemonBook extends GuiScreen{

	ResourceLocation resource = new ResourceLocation(Constants.GUI_BOOK_RES);
	
	int guiWidth = 256;
	int guiHeight = 180;
	int x, y;
	ArrayList<BookCategory> categories;
	
	
	@Override
	public void initGui() {
		super.initGui();
		x = width/2 - guiWidth/2;
		y = height/2 - guiHeight/2;
		
		categories = PreternaturalAPI.getAllRegisteredCategories();
		buttonList.clear();
		
		int catSize = categories.size();
		for(int i = 0; i < catSize; i ++){
			BookCategory category = null;
			if(categories.get(i) != null){
				category = categories.get(i);
				
				GuiCategoryButton catButton = new GuiCategoryButton(i, x + 10, y + 10, category);
				buttonList.add(catButton);
			}
		}
	}
		
	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks) {
		mc.renderEngine.bindTexture(resource);
		drawTexturedModalRect(x, y, 0, 0, guiWidth, guiHeight);		
	}
	
	@Override
	protected void actionPerformed(GuiButton button) throws IOException {
		if(button instanceof GuiCategoryButton){
			BookCategory category = ((GuiCategoryButton) button).getCategory();
//	TODO	mc.displayGuiScreen(guiScreenIn);
		}
	}



	@Override
	public boolean doesGuiPauseGame() {
		return false;
	}
	
	

	
	

}

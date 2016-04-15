package com.pl10123.preternatural.client.gui.book.button;

import com.pl10123.preternatural.api.book.BookCategory;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.util.ResourceLocation;

public class GuiCategoryButton extends GuiButton{
	
	ResourceLocation image = null;
	BookCategory category;
	
	public GuiCategoryButton(int buttonId, int x, int y, BookCategory category) {
		super(buttonId, x, y, 24, 24, "");
		this.category = category;
	}

	@Override
	public void drawButton(Minecraft mc, int mouseX, int mouseY) {
		super.drawButton(mc, mouseX, mouseY);
	}
	
	public BookCategory getCategory(){
		return category;
	}
	
	

}

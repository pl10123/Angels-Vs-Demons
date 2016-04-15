package com.pl10123.supernatural.api.book;

import java.util.ArrayList;

import net.minecraft.util.ResourceLocation;

public class BookCategory {
	
	/** The <b>Unlocalized</b> name of the category which is viewed as a tooltip in the main screen */
	String categoryName;
	
	/** The location of the image to be rendered as an icon*/
	ResourceLocation categoryImage;
	
	/** The category priority. Vanilla categories are always put first. This is optional.
	 * If it is not set, it will be randomly ordered. NOTE: This must not be negative or it will not be registered.*/
	int categoryPriority;
	
	ArrayList<BookEntry> entries;
	
	public BookCategory(String unlocalizedName, ResourceLocation image){
		this.categoryName = unlocalizedName;
		this.categoryImage = image;
	}
	public BookCategory(String unlocalizedName, ResourceLocation image, int priority){
		this.categoryName = unlocalizedName;
		this.categoryImage = image;
		this.categoryPriority = priority;
	}
	/**
	 * Sets the entries of the category. <b>This method overrites any previous entries.</b> You have been warned
	 * @param entries The entries to set
	 * @return the BookCategory object for chaining
	 */
	public BookCategory setEntries(ArrayList<BookEntry> entries){
		this.entries = entries;
		return this;
	}
	
	/**
	 * Sets the entries of the category. <b>This method adds to any previous entries.</b> You have been warned
	 * @param entries The entries to add
	 * @return true if everything worked properly
	 */
	public boolean addEntries(ArrayList<BookEntry> entries){
		return this.entries.addAll(entries);
	}

}

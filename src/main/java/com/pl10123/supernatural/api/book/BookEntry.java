package com.pl10123.supernatural.api.book;

import java.util.ArrayList;

public class BookEntry {
	
	public ArrayList<BookPage> pages;
	public String name;
	//TODO add leveling if-statement stuff.
	
	public BookEntry(String unlocName){
		this.name = unlocName;
	}

}

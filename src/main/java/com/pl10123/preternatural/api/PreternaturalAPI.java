package com.pl10123.preternatural.api;

import java.util.ArrayList;
import java.util.List;

import com.pl10123.preternatural.api.book.BookCategory;

public class PreternaturalAPI {
	
	public static ArrayList<BookCategory> categories = new ArrayList<BookCategory>();
	
	public static void registerBookCategory(BookCategory cat){
		categories.add(cat);
	}
	
	public static ArrayList<BookCategory> getAllRegisteredCategories(){
		return categories;
	}
 
}

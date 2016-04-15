package com.pl10123.preternatural.common;

public class Constants {

    public static final String MODNAME = "Preternatural";
    public static final String MODID = "preternatural";
    public static final String VERSION = "@version@";

    public static final String CLIENT_PROXY = "com.pl10123." + MODID + ".client.proxy.ClientProxy";
    public static final String COMMON_PROXY = "com.pl10123." + MODID + ".common.proxy.CommonProxy";

    public static final CreativeTab BASIC_TAB = new CreativeTab("modBasicTab");
    
    public static final String KEY_CHALK_DAMAGE = "chalkUses";
    public static final int MAX_CHALK_USES = 20;
    
    public static final int GUI_BOOK_ID = 1;
    
    public static final String GUI_TEXTURES = MODID + ":" + "textures/gui/";
    
    public static final String GUI_BOOK_RES = GUI_TEXTURES + "book.png";
}

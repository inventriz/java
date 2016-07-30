package com.inventriz.json.util;

public class InventJsonUtil {
	
	private InventJsonUtil() {}
	
	private static final InventJsonUtil inventJsonUtil = new InventJsonUtil();
	
	public static InventJsonUtil getInstance(){
		return inventJsonUtil;
	}
	
	public String changeFirstChar(String str){
		char c = str.charAt(0);
		str = str.replaceFirst(String.valueOf(c), String.valueOf(c).toUpperCase());
		return str;
	}

}

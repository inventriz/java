package com.tci.tridib;

public class ConvertToJson {
	
	public String[] convertStringToJson(String jsonStr){
		
		String str[] = null;		
		str = jsonStr.split("\n");
		System.out.println("ConvertToJson.convertStringToJson() === "+str.toString());
		System.out.println("Length === "+str.length);
		return str;
	}

}

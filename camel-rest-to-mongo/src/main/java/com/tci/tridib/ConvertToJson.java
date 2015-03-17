package com.sapient.tridib;

import com.tci.item.provider.CC;

public class ConvertToJson {
	
	public String[] convertStringToJson(String jsonStr){
		
		String str[] = null;		
		str = jsonStr.split("\n");
		System.out.println("ConvertToJson.convertStringToJson() === "+str.toString());
		System.out.println("Length === "+str.length);
		return str;
	}
	
		
	public void checkProductAvailability(CC cc){
		
		System.out.println("ProductAvailable == "+cc..getProduct());
		
	}

}

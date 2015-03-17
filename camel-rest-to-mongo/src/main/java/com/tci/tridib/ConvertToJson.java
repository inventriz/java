package com.sapient.tridib;

import com.tci.item.bnt.ContentCafe;

public class ConvertToJson {
	
	public String[] convertStringToJson(String jsonStr){
		
		String str[] = null;		
		str = jsonStr.split("\n");
		System.out.println("ConvertToJson.convertStringToJson() === "+str.toString());
		System.out.println("Length === "+str.length);
		return str;
	}
	
	public String removeNameSpace(String str){
		
		//str.replace("<ContentCafe xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns=\"http://ContentCafe2.btol.com\"", "<ContentCafe ");
		if(str.contains("<Product>true</Product>")){
			return "true";
		} else {
			return "false";
		}
		//System.out.println("ConvertToJson.removeNameSpace() === "+str);		
		
	}
	
	public void checkProductAvailability(ContentCafe cc){
		
		System.out.println("ProductAvailable == "+cc.getRequestItems().getRequestItem().getAvailableContent().getProduct());
		
	}

}

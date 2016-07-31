package com.inventriz.json;

import java.lang.reflect.Field;

import com.inventriz.json.serialize.ClassScanner;
import com.inventriz.json.serialize.JsonSerializerFactory;

public class InventJson {
	
	private InventJson(){}
	
	private static final InventJson inventJson = new InventJson();
	
	ClassScanner classScanner = new ClassScanner();
	JsonSerializerFactory serFactory = new JsonSerializerFactory();
	
	public static InventJson getInstance(){
		return inventJson;
	}
	
	public String convertToJson(Object o){
		if (o!=null) {
			String fieldName = null;
			String fieldType = null;
			Object fieldValue = null;
			String fieldSer = null;
			Field[] fields = classScanner.scanFields(o);
			
			for (int i = 0; i < fields.length; i++) {
				fieldName = fields[i].getName();
				fieldType = fields[i].getType().getName();
				fieldValue = classScanner.invokeMethod(o, classScanner.getMethodName(fieldName, fieldType));
				fieldSer = serFactory.getSerializedJson(fieldName, fieldValue);
				System.out.println(fieldSer);
			}
		}
		return null;
	}

}

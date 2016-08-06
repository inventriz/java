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
		StringBuilder sb = null;
		String res = null;
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
				if (fieldValue != null && fieldName != null) {
					fieldSer = serFactory.getSerializedJson(fieldName,
							fieldValue);
					if(fieldSer!=null){
						if(sb == null){
							sb = new StringBuilder("{");
						}
						sb.append(fieldSer);
						if(i<fields.length-1){
							sb.append(",");
						}
					}
				}
			}
			if(sb!=null){
				sb.append("}");
				res = sb.toString();
			}
			//System.out.println(res);
		}
		return res;
	}

}

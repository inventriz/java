package com.inventriz.json.serialize;

import java.lang.reflect.Field;

import com.inventriz.json.util.InventJsonUtil;

public class ClassScanner implements IInventClassScanner{
	
	static final String _get = "get";
	
	static final String _is = "is";
	
	static final InventJsonUtil inventJsonUtil = InventJsonUtil.getInstance();

	@Override
	public Field[] scanFields(Object o) {
		Field[] fields = null;
		if(o!=null){
			fields = o.getClass().getFields();
		}
		return fields;
	}
	
	String getMethodName(String fieldName, String type){		
		if(fieldName!=null && !"".equals(fieldName.trim()) 
				&& type!=null && !"".equals(type.trim())){
			if("boolean".equalsIgnoreCase(type)){
				if(fieldName.startsWith("is")){
					return fieldName;
				} else {
					fieldName = inventJsonUtil.changeFirstChar(fieldName);
					return _is.concat(fieldName);
				}
			} else{
				fieldName = inventJsonUtil.changeFirstChar(fieldName);
				return _get.concat(fieldName);
			}
		}
		
		return null;
	}

}

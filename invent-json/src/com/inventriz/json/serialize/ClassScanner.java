package com.inventriz.json.serialize;

import java.lang.reflect.Field;

public class ClassScanner implements IInventClassScanner{

	@Override
	public Field[] scanFields(Object o) {
		Field[] fields = null;
		if(o!=null){
			fields = o.getClass().getFields();
		}
		return fields;
	}
	
	String getMethodName(String fieldName){
		
		
		
		return null;
	}

}

package com.inventriz.json.serialize;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.inventriz.json.config.ParameterType;
import com.inventriz.json.util.InventJsonUtil;

public class ClassScanner implements IInventClassScanner {

	static final String _get = "get";

	static final String _is = "is";

	static final InventJsonUtil inventJsonUtil = InventJsonUtil.getInstance();

	@Override
	public Field[] scanFields(Object o) {
		Field[] fields = null;
		if (o != null) {
			fields = o.getClass().getDeclaredFields();
		}
		return fields;
	}

	public Object invokeMethod(Object obj, String methodName) {

		Method m = null;
		Object response = null;
		if (obj != null && methodName != null && !"".equals(methodName.trim())) {
			try {
				m = obj.getClass().getMethod(methodName);
				response = m.invoke(obj);
			} catch (NoSuchMethodException | SecurityException
					| IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return response;
	}

	public String getMethodName(String fieldName, String type) {
		if (fieldName != null && !"".equals(fieldName.trim()) && type != null
				&& !"".equals(type.trim())) {
			if (ParameterType.Boolean.type().equalsIgnoreCase(type)) {
				if (fieldName.startsWith(_is)) {
					return fieldName;
				} else {
					fieldName = inventJsonUtil.changeFirstChar(fieldName);
					return _is.concat(fieldName);
				}
			} else {
				fieldName = inventJsonUtil.changeFirstChar(fieldName);
				return _get.concat(fieldName);
			}
		}

		return null;
	}

}

package com.inventriz.json.test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestInventJson {

	public static void main(String arg[]) {
		Car c = new Car("Hundai", "i10", "manual", 2012);
		TestInventJson tj = new TestInventJson();

		System.out.println(tj.makeJson(c));
	}

	String makeJson(Object obj) {

		StringBuilder sb = null;
		if (obj != null) {
			sb = new StringBuilder("{");
			Field[] fields = obj.getClass().getDeclaredFields();
			for (Field f : fields) {
				// System.out.println(f.getName());
				sb.append("{");
				sb.append("\"" + f.getName() + "\"");
				sb.append(":");
				
				String fieldName = f.getName();
				char c = fieldName.charAt(0);
				fieldName = fieldName.replaceFirst(String.valueOf(c), String.valueOf(c).toUpperCase());
				System.out.println("Method = get"+fieldName);
				
				sb.append(getValue(obj, "get"+fieldName));
				sb.append("}");
				sb.append(",");
			}
			sb.replace(sb.lastIndexOf(","), sb.lastIndexOf(",") + 1, "");
			sb.append("}");
		}

		if (sb != null) {
			return sb.toString();
		}

		return "{}";
	}

	Object getValue(Object obj, String str) {

		Object o = null;
		if (obj != null) {
			try {

				Method m = obj.getClass().getMethod(str);
				o = m.invoke(obj);
				System.out.println("from method = " + o);

			} catch (SecurityException | IllegalArgumentException
					| IllegalAccessException | NoSuchMethodException
					| InvocationTargetException e) {
				e.printStackTrace();
			}
		}

		return o;
	}

}

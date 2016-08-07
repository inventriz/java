package com.inventriz.json.serialize;

public class JsonSerializerFactory {
	
	IInventJsonSerializer<String> stringSer = null;	
	IInventJsonSerializer<Integer> intSer = null;
	IInventJsonSerializer<Boolean> boolSer = null;
	IntegerArraySerializer intArrSer = null;
	ArraySerializer stringArrSer = null;
	

	public String getSerializedJson(String k, Object o){
		
		
		String res=null;
		if (o != null) {
			String ins = o.getClass().getTypeName();
			res = null;
			switch (ins) {
			case "java.lang.String":
				if (stringSer == null) {
					stringSer = new StringSerializer();
				}
				res = stringSer.serialize(k, (String) o);
				break;
			case "java.lang.String[]":
				if (stringArrSer == null) {
					stringArrSer = new ArraySerializer();
				}
				res = stringArrSer.serialize(k, (String[]) o);
				break;
			case "int":
				if (intSer == null) {
					intSer = new NumericSerializer();
				}
				res = intSer.serialize(k, (Integer) o);
				break;
			case "java.lang.Integer":
				if (intSer == null) {
					intSer = new NumericSerializer();
				}
				res = intSer.serialize(k, (Integer) o);
				break;
			case "java.lang.Integer[]":
				if (intArrSer == null) {
					intArrSer = new IntegerArraySerializer();
				}
				res = intArrSer.serialize(k, (int[]) o);
				break;
			case "int[]":
				if (intArrSer == null) {
					intArrSer = new IntegerArraySerializer();
				}
				res = intArrSer.serialize(k, (int[]) o);
				break;
			case "boolean":
				if (boolSer == null) {
					boolSer = new BooleanSerializer();
				}
				res = boolSer.serialize(k, (Boolean) o);
				break;
			case "java.lang.Boolean":
				if (boolSer == null) {
					boolSer = new BooleanSerializer();
				}
				res = boolSer.serialize(k, (Boolean) o);
				break;
			default:
				res = "{}";
				break;
			}
			{

			}
		}
		return res;
	}
}

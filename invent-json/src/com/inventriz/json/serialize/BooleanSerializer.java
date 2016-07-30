package com.inventriz.json.serialize;

public class BooleanSerializer implements IInventJsonSerializer<Boolean> {

	@Override
	public String serialize(String k, Boolean v) {
		StringBuilder sb = new StringBuilder("{");
		if(k!=null){
			sb.append("\""+k+"\"");
			sb.append(":");
			if(v!=null){
				sb.append(v);
			} else {
				sb.append("false");
			}
			sb.append("}");
			return sb.toString();
		}
		return null;
	}

}

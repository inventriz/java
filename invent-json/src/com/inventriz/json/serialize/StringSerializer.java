package com.inventriz.json.serialize;

public class StringSerializer implements IInventJsonSerializer<String> {

	@Override
	public String serialize(String k, String v) {
		StringBuilder sb = new StringBuilder("{");
		if(k!=null){
			sb.append("\""+k+"\"");
			sb.append(":");
			if(v!=null){
				sb.append("\""+v+"\"");
			} else {
				sb.append("null");
			}
			sb.append("}");
			return sb.toString();
		}
		return null;
	}

}

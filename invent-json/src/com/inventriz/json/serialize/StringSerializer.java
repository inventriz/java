package com.inventriz.json.serialize;

public class StringSerializer extends BaseSerializer<String> {

	@Override
	public String serialize(String k, String v) {
		if(baseJsonSerialize(k)!=null){
			return baseJsonSerialize(k).concat(serialize(v));
		}		
		return null;
	}

	@Override
	public String serialize(String v) {
		if(v!=null){
			return "\""+v+"\"";
		} else {
			return "null";
		}
	}

}

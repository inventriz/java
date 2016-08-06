package com.inventriz.json.serialize;

public class NumericSerializer implements IInventJsonSerializer<Integer> {

	@Override
	public String serialize(String k, Integer v) {
		StringBuilder sb = new StringBuilder();
		if(k!=null){
			sb.append("\""+k+"\"");
			sb.append(":");
			if(v!=null){
				sb.append(v);
			} else {
				sb.append(0);
			}
			
			return sb.toString();
		}
		return null;
	}

}

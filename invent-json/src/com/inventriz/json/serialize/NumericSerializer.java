package com.inventriz.json.serialize;

public class NumericSerializer extends BaseSerializer<Integer> {

	@Override
	public String serialize(String k, Integer v) {
		if(baseJsonSerialize(k)!=null){
			return baseJsonSerialize(k).concat(serialize(v));
		}		
		return null;
	}

	@Override
	public String serialize(Integer v) {
		if(v!=null){
			return v.toString();
		} else {
			return "0";
		}
	}
	
	/*@Override
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
*/
}

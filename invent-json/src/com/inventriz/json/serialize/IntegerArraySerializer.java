package com.inventriz.json.serialize;



public class IntegerArraySerializer extends NumericSerializer{

	public String serialize(String k, int[] t){
		String key = baseJsonSerialize(k);
		StringBuilder sb = null;
		if(key!=null){
			for(int i=0; i<t.length; i++){
				if(sb ==null){
					sb = new StringBuilder("[");
				}
				sb.append(serialize(t[i]));
				if(i < t.length-1){
					sb.append(",");
				}
			}
			if(sb!=null){
				sb.append("]");
				return key.concat(sb.toString());
			}
		}
		return null;
	}

	

}

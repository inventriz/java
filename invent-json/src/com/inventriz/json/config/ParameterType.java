package com.inventriz.json.config;

/**
 * @author Tridib Chakraborty
 *
 */
public enum ParameterType {
	
	Integer("int"),
	Boolean("boolean"),
	String("java.lang.String"),
	Long("long"),
	Array("Array");
	
	private String value;
	
	ParameterType(String value){
		this.value = value;
	}
	
	public String type(){
		return value;
	}

}

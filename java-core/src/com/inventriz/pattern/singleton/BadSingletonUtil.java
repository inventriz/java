package com.inventriz.pattern.singleton;

public class BadSingletonUtil {
	
	private BadSingletonUtil(){} // private constructor to prevent object initialization from outside
	
	private static BadSingletonUtil singleUtil = null;// to implement lazy initialization
	
	public static BadSingletonUtil getInstance(){
		if(singleUtil == null){
			singleUtil = new BadSingletonUtil();
		}		
		return singleUtil;
	}
	
	public String toString(){
		return "Hashcode = "+this.hashCode();
	}

}

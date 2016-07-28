package com.inventriz.pattern.singleton;

public class BadSingletonUtil {
	
	private BadSingletonUtil(){} // private constructor to prevent object initialization from outside
	
	private static BadSingletonUtil singleUtil ;//= new BadSingletonUtil();
	
	public static BadSingletonUtil getInstance(){
		BadSingletonUtil singleUtil = new BadSingletonUtil();
		return singleUtil;
	}
	
	public String toString(){
		return "Hashcode = "+this.hashCode();
	}

}

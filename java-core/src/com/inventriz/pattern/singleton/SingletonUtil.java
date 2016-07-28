package com.inventriz.pattern.singleton;

public class SingletonUtil {
	
	private SingletonUtil(){} // private constructor to prevent object initialization from outside
	
	private static final SingletonUtil singleUtil = new SingletonUtil(); // instance variable thread safe
	
	public static SingletonUtil getInstance(){
		return singleUtil;
	}
	
	public String toString(){
		return "Hashcode = "+singleUtil.hashCode();
	}

}

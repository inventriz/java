package com.inventriz.pattern.prototype;

import java.util.Date;
import java.util.List;

public class TestRobotClone {

	public static void main(String args[]){
		Robot r = new Robot(4, "Intel", "Android");
		int i=1;
		int n=4;
				
		System.out.println("Object creation started == "+ new Date());
		List<Object> objs = r.getClones(n);
		for(Object o:objs){
			System.out.println(i++ + "th robot "+ (Robot)o);
		}
		System.out.println("Object creation ended == "+ new Date());
	}
}

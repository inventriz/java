package com.inventriz.json.test;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.inventriz.json.serialize.ClassScanner;
import com.inventriz.json.util.InventJsonUtil;

public class InventJsonUtilTest {
	
	InventJsonUtil inventJsonUtil = InventJsonUtil.getInstance();
	ClassScanner cs = new ClassScanner();

	@Test
	public void testGetInstance() {
		InventJsonUtil inventJsonUtil1 = InventJsonUtil.getInstance();
		assertTrue(inventJsonUtil1.hashCode() == inventJsonUtil.hashCode());
	}

	@Test
	public void testChangeFirstChar() {
		String str = "getMake";
		str = inventJsonUtil.changeFirstChar(str);
		System.out.println("str =="+str);
		assertTrue("GetMake".equalsIgnoreCase(str));
	}
	
	@Test
	public void testCSGetMethodName() {
		
		String naMe = "blank";
		boolean isHatchback = false;
		//int noOfYear = 0;
		System.out.println(cs.getMethodName("NaMe", naMe.getClass().getTypeName()));
		System.out.println(cs.getMethodName("isHatchback", "boolean"));
		//System.out.println(((Object)noOfYear).getClass());
		assertTrue("isHAtchback".equalsIgnoreCase(cs.getMethodName("HAtchback", "boolean")));
		//assertTrue("GetMake".equalsIgnoreCase(str));
	}
	
	@Test
	public void testCSGetMethodNameNull() {		
		assertNull(cs.getMethodName(null, "boolean"));
		//assertTrue("GetMake".equalsIgnoreCase(str));
	}

}

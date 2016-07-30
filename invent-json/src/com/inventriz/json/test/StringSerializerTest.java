package com.inventriz.json.test;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.inventriz.json.serialize.IInventJsonSerializer;
import com.inventriz.json.serialize.StringSerializer;

public class StringSerializerTest {

	IInventJsonSerializer<String> intSer = new StringSerializer();
	
	@Test
	public void testSerialize() {		
		String exOp = "{\"key\":\"sample\"}";
		System.out.println(exOp);
		assertTrue(exOp.equals(intSer.serialize("key", "sample")));		
	}
	
	@Test
	public void testSeriliazeNull() {
		String exOp = "{\"key\":null}";
		System.out.println(exOp);
		assertTrue(exOp.equals(intSer.serialize("key", null)));	
	}
	
	@Test
	public void testSeriliazeKeyNull() {
		assertNull(intSer.serialize(null, "sample"));	
	}
	
	@Test
	public void testSeriliazeEmpty() {
		String exOp = "{\"key\":\"\"}";
		System.out.println(exOp);
		assertTrue(exOp.equals(intSer.serialize("key", "")));	
	}

}

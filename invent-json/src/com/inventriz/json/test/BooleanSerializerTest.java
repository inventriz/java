package com.inventriz.json.test;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.inventriz.json.serialize.BooleanSerializer;
import com.inventriz.json.serialize.IInventJsonSerializer;

public class BooleanSerializerTest {

	IInventJsonSerializer<Boolean> intSer = new BooleanSerializer();
	
	@Test
	public void testSerialize() {		
		String exOp = "{\"key\":true}";
		System.out.println(exOp);
		assertTrue(exOp.equals(intSer.serialize("key", true)));		
	}
	
	@Test
	public void testSeriliazeNull() {
		String exOp = "{\"key\":false}";
		System.out.println(exOp);
		assertTrue(exOp.equals(intSer.serialize("key", null)));	
	}
	
	@Test
	public void testSeriliazeKeyNull() {
		assertNull(intSer.serialize(null, true));	
	}
	
	@Test
	public void testSeriliazeEmpty() {
		String exOp = "{\"key\":false}";
		System.out.println(exOp);
		assertTrue(exOp.equals(intSer.serialize("key", false)));	
	}

}

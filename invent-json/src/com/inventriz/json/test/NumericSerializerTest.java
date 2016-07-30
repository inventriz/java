package com.inventriz.json.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.inventriz.json.serialize.IInventJsonSerializer;
import com.inventriz.json.serialize.NumericSerializer;

public class NumericSerializerTest {

	IInventJsonSerializer<Integer> intSer = new NumericSerializer();
	
	@Test
	public void testSerialize() {		
		String exOp = "{\"key\":123}";
		assertTrue(exOp.equals(intSer.serialize("key", 123)));		
	}
	
	@Test
	public void testSeriliazeNull() {
		String exOp = "{\"key\":0}";
		assertTrue(exOp.equals(intSer.serialize("key", null)));	
	}
	
	@Test
	public void testSeriliazeKeyNull() {
		assertNull(intSer.serialize(null, 23));	
	}
	
	@Test
	public void testSeriliazeBigInt() {
		String exOp = "{\"key\":999999999}";
		assertTrue(exOp.equals(intSer.serialize("key", 999999999)));	
	}

}

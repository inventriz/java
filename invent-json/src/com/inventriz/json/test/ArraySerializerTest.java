package com.inventriz.json.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.inventriz.json.serialize.ArraySerializer;

public class ArraySerializerTest {

	ArraySerializer as = new ArraySerializer();
	@Test
	public void testSerializeStringStringArray() {
		String exp = "\"k\" : [\"abc\",\"efg\",\"cdf\"]";
		String str = as.serialize("k", new String[]{"abc", "efg", "cdf"});
		System.out.println(str);
		System.out.println(exp);
		assertTrue(exp.equalsIgnoreCase(str));
		
	}

}

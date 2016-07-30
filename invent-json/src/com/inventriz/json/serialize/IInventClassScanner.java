package com.inventriz.json.serialize;

import java.lang.reflect.Field;

/**
 * @author Tridib Chakraborty
 *
 */
public interface IInventClassScanner {
	
	public Field[] scanFields(Object o);

}

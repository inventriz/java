package com.inventriz.json.serialize;


/**
 * @author Tridib Chakraborty
 *
 */
public interface IInventJsonSerializer<T> {

	/**
	 * @param o
	 * @return
	 */
	public String serialize(String k, T t);
}

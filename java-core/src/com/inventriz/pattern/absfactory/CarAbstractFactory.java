package com.inventriz.pattern.absfactory;

/**
 * @author Tridib Chakraborty
 *
 */
public abstract class CarAbstractFactory {
	
	/**
	 * @return
	 */
	abstract IBattery getBattery();
	
	/**
	 * @return
	 */
	abstract IEngineOil getEngineOil();

}

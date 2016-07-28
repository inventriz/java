package com.inventriz.pattern.absfactory;

public class ViscocityOil implements IEngineOil {

	@Override
	public String getOilMake() {
		return "Bosch";
	}

	@Override
	public String getKilometer() {
		return "22";
	}

}

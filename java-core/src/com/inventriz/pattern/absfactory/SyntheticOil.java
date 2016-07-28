package com.inventriz.pattern.absfactory;

public class SyntheticOil implements IEngineOil {

	@Override
	public String getOilMake() {
		return "Exide";
	}

	@Override
	public String getKilometer() {
		return "23";
	}

}

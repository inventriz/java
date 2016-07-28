package com.inventriz.pattern.absfactory;

public class AGMBattery implements IBattery{

	@Override
	public String getMake() {		
		return "Amaron";
	}

	@Override
	public String getType() {
		return "AGM";
	}

}

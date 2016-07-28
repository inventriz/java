package com.inventriz.pattern.absfactory;

public class VRLABattery implements IBattery {

	@Override
	public String getMake() {
		return "Exide";
	}

	@Override
	public String getType() {
		return "VRLA";
	}

}

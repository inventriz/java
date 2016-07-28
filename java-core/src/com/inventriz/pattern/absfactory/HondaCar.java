package com.inventriz.pattern.absfactory;

public class HondaCar extends CarAbstractFactory {

	@Override
	IBattery getBattery() {
		IBattery battery = new VRLABattery();
		return battery;
	}

	@Override
	IEngineOil getEngineOil() {
		IEngineOil engineOil = new SyntheticOil();
		return engineOil;
	}

}

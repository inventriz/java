package com.inventriz.pattern.absfactory;

public class HundaiCar extends CarAbstractFactory{

	@Override
	IBattery getBattery() {
		IBattery battery = new AGMBattery();
		return battery;
	}

	@Override
	IEngineOil getEngineOil() {
		IEngineOil engineOil = new ViscocityOil();
		return engineOil;
	}

}

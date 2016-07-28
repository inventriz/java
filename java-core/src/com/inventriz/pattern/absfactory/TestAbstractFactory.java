package com.inventriz.pattern.absfactory;

public class TestAbstractFactory {
	
	public static void main(String args[]){
		CarAbstractFactory hundai = new HondaCar();
		System.out.println("Battery::make == "+hundai.getBattery().getMake());
		System.out.println("Battery::type == "+hundai.getBattery().getType());
		System.out.println("Engine Oil::make == "+hundai.getEngineOil().getOilMake());
		System.out.println("Engine Oil::km == "+hundai.getEngineOil().getKilometer());
	}

}

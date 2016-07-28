package com.inventriz.pattern.factory;

public class WoodenFrame extends PhotoFrame{

	private String madeOfWood;
	
	public WoodenFrame(double len, double ht, String madeOfWood) {
		super(len, ht);
		this.madeOfWood = madeOfWood;
	}

	public String getMadeOfWood() {
		return madeOfWood;
	}

	public void setMadeOfWood(String madeOfWood) {
		this.madeOfWood = madeOfWood;
	}

	@Override
	public String toString() {
		return "WoodenFrame [madeOfWood=" + madeOfWood + "]";
	}
	
	
}

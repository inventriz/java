package com.inventriz.pattern.factory;

public class AluminiumFrame extends PhotoFrame{
	
	private String alQuality;

	public AluminiumFrame(double len, double ht, String alQuality) {
		super(len, ht);
		this.alQuality = alQuality;
	}

	@Override
	public String toString() {
		return "AluminiumFrame [alQuality=" + alQuality + "]";
	}
	
	

}

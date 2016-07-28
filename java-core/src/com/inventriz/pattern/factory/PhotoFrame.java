package com.inventriz.pattern.factory;

public class PhotoFrame {
	
	private double length;
	private double height;
	
	public PhotoFrame(double len, double ht){
		this.length = len;
		this.height = ht;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "PhotoFrame [length=" + length + ", height=" + height + "]";
	}
	
	

}

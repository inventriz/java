package com.inventriz.json.test;

public class SmallCar {
	
	private String make;
	private String model;
	private String transmissionType;
	private int year;
	private int id;
	private boolean isHacthBack;//	private boolean hasRoofTop;	
	private String color;
	private int noOfPersonTravel;
	private String[] keyFeatures;
	
		
	public SmallCar() {
		super();
	}
	public SmallCar(String make, String model, String transmissionType, int year) {
		super();
		this.make = make;
		this.model = model;
		this.transmissionType = transmissionType;
		this.year = year;
	}
	public SmallCar(String make, String model, String transmissionType, int year,
			int id, boolean isHacthBack, long kmDriven, double length,
			double height, String color, int noOfPersonTravel) {
		super();
		this.make = make;
		this.model = model;
		this.transmissionType = transmissionType;
		this.year = year;
		this.id = id;
		this.isHacthBack = isHacthBack;
		this.color = color;
		this.noOfPersonTravel = noOfPersonTravel;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getTransmissionType() {
		return transmissionType;
	}
	public void setTransmissionType(String transmissionType) {
		this.transmissionType = transmissionType;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isHacthBack() {
		return isHacthBack;
	}
	public void setHacthBack(boolean isHacthBack) {
		this.isHacthBack = isHacthBack;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getNoOfPersonTravel() {
		return noOfPersonTravel;
	}
	public void setNoOfPersonTravel(int noOfPersonTravel) {
		this.noOfPersonTravel = noOfPersonTravel;
	}
	public String[] getKeyFeatures() {
		return keyFeatures;
	}
	public void setKeyFeatures(String[] keyFeatures) {
		this.keyFeatures = keyFeatures;
	}
	
	

}

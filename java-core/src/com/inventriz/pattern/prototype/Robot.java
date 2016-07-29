package com.inventriz.pattern.prototype;

import java.util.ArrayList;
import java.util.List;

public class Robot implements Cloneable {
	
	private int noOfBatteries;
	private String make;
	private String osUsed;
	
		
	public Robot(int noOfBatteries, String make, String osUsed) {
		super();
		this.noOfBatteries = noOfBatteries;
		this.make = make;
		this.osUsed = osUsed;
	}

	public Object getClone(){
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public List<Object> getClones(int n){
		List<Object> objs = null;
		if(n>0){
			objs = new ArrayList<>();
			for(int i=0; i<n; i++){
				objs.add(getClone());				
			}			
		}
		return objs;
	}
	
	public int getNoOfBatteries() {
		return noOfBatteries;
	}
	public void setNoOfBatteries(int noOfBatteries) {
		this.noOfBatteries = noOfBatteries;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getOsUsed() {
		return osUsed;
	}
	public void setOsUsed(String osUsed) {
		this.osUsed = osUsed;
	}

	@Override
	public String toString() {
		return "Robot [noOfBatteries=" + noOfBatteries + ", make=" + make
				+ ", osUsed=" + osUsed + ", hashcode="+ this.hashCode() +"]";
	}
	
	

}

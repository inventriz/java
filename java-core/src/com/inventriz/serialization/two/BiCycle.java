package com.inventriz.serialization.two;

import java.io.Serializable;
import java.util.Date;

public class BiCycle extends Vehicle implements Serializable{
	
	private String color;
	private String length;
	private Date manufactureDate;
	private int noOfGear;
	private boolean hasSitCover;
	
	public BiCycle(){}
	
	public BiCycle(String color, String length, Date manufactureDate,
			int noOfGear, boolean hasSitCover) {
		super();
		this.color = color;
		this.length = length;
		this.manufactureDate = manufactureDate;
		this.noOfGear = noOfGear;
		this.hasSitCover = hasSitCover;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getLength() {
		return length;
	}
	public void setLength(String length) {
		this.length = length;
	}
	public Date getManufactureDate() {
		return manufactureDate;
	}
	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	public int getNoOfGear() {
		return noOfGear;
	}
	public void setNoOfGear(int noOfGear) {
		this.noOfGear = noOfGear;
	}
	public boolean isHasSitCover() {
		return hasSitCover;
	}
	public void setHasSitCover(boolean hasSitCover) {
		this.hasSitCover = hasSitCover;
	}
	@Override
	public String toString() {
		return "BiCycle [color=" + color + ", length=" + length
				+ ", manufactureDate=" + manufactureDate + ", noOfGear="
				+ noOfGear + ", hasSitCover=" + hasSitCover + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + (hasSitCover ? 1231 : 1237);
		result = prime * result + ((length == null) ? 0 : length.hashCode());
		result = prime * result
				+ ((manufactureDate == null) ? 0 : manufactureDate.hashCode());
		result = prime * result + noOfGear;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BiCycle other = (BiCycle) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (hasSitCover != other.hasSitCover)
			return false;
		if (length == null) {
			if (other.length != null)
				return false;
		} else if (!length.equals(other.length))
			return false;
		if (manufactureDate == null) {
			if (other.manufactureDate != null)
				return false;
		} else if (!manufactureDate.equals(other.manufactureDate))
			return false;
		if (noOfGear != other.noOfGear)
			return false;
		return true;
	}
	
	

}

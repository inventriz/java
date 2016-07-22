package com.inventriz.serialization.two;

import com.inventriz.serialization.two.BiCycle2;;

public class HybridCycle extends BiCycle2 {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8782547824022093071L;
	private int noOfBreaks;
	private String backSitColor;
	
	public HybridCycle(int noOfBreaks){
		this.noOfBreaks = noOfBreaks;
	}
	
	public int getNoOfBreaks() {
		return noOfBreaks;
	}

	public void setNoOfBreaks(int noOfBreaks) {
		this.noOfBreaks = noOfBreaks;
	}
	
	

	public String getBackSitColor() {
		return backSitColor;
	}

	public void setBackSitColor(String backSitColor) {
		this.backSitColor = backSitColor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + noOfBreaks;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		HybridCycle other = (HybridCycle) obj;
		if (noOfBreaks != other.noOfBreaks)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Printing HybridCycle [noOfBreaks=" + noOfBreaks + "]";
	}
	
	

}

package com.sap.practice;

public class WideningPrimitive {
	
	public static void main(String[] args){
		WideningPrimitive wp = new WideningPrimitive();
		wp.widenCharToInt();
		wp.widenIntToDouble();
	}
	
	void widenCharToInt(){
		System.out.println("L" + "O"); // LO
		System.out.println('L' - 'O'); // 76 - 79 // L and O (chars) converted to int
		System.out.println("L" + 'O'); // LO // O converted to String not int
	}
	
	void widenIntToDouble(){
		System.out.println(2 + 3.0f); // 5.0 - 2 is converted to float
		System.out.println(2 + 6.04d); // 8.04 - 2 is converted to double
	}

}

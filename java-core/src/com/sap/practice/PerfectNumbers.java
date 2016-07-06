package com.sap.practice;


public class PerfectNumbers {
	
	
	
	public boolean isPerfectNumber(int number){
		
		int temp = returnSame(number);
        if(temp == number){
            System.out.println("It is a perfect number");
            return true;
        } else {
            System.out.println("It is not a perfect number");
            return false;
        }
		
		
	}

	public int returnSame(int number) {
		int temp = 0;
        for(int i=1;i<=number/2;i++){
            if(number%i == 0){
                temp += i;
            }
        }
		return temp;
	}
	
	public static void main(String args[]){
		
		PerfectNumbers perfectNumbers = new PerfectNumbers();
		System.out.println(perfectNumbers.isPerfectNumber(6));
		
	}
	

}

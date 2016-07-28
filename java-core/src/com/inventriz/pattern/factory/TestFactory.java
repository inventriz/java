package com.inventriz.pattern.factory;

public class TestFactory {
	
	public static void main(String args[]){
		PhotoFrameFactory frameFactory = PhotoFrameFactory.getInstance();
		
		PhotoFrame pf1 = frameFactory.getPhotoFrame("W");
		PhotoFrame pf2 = frameFactory.getPhotoFrame("A");
		System.out.println(pf1);
		System.out.println(pf2);
	}

}

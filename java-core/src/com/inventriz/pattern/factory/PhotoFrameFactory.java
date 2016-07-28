package com.inventriz.pattern.factory;

public class PhotoFrameFactory {
	
	private PhotoFrameFactory(){}
	
	private static final PhotoFrameFactory frameFactory = new PhotoFrameFactory();
	
	public static PhotoFrameFactory getInstance(){
		return frameFactory;
	}
	
	public PhotoFrame getPhotoFrame(String type){
		if("W".equalsIgnoreCase(type)){
			return new WoodenFrame(2.2, 3.2, "Pine");
		} else if("A".equalsIgnoreCase(type)){
			return new AluminiumFrame(2.2, 3.2, "High");
		} else return null;
	}

}

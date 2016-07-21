package com.inventriz.serialization.two;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class TestSerialization {
	
	String path="D:\\Tridib";
	
	void serialize(String file, Object obj) throws IOException{
		FileOutputStream fos = new FileOutputStream(path.concat(file));
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);		
		oos.close();
	}
	
	Object deserialize(String file) throws IOException, ClassNotFoundException{		
		FileInputStream fis = new FileInputStream(path.concat(file));
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object obj = ois.readObject();
		ois.close();
		return obj;
	}
	
	public static void main(String args[]){
		TestSerialization ts = new TestSerialization();
		HybridCycle biCycle = new HybridCycle();
		try {
			ts.serialize("high-bicycle.txt", biCycle);
			
			//BiCycle deBc = (BiCycle)ts.deserialize("bicycle.txt");
			//System.out.println(deBc.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block  | ClassNotFoundException
			e.printStackTrace();
		}
	}

}

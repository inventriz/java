package com.inventriz.serialization.two;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerialization2 {
	
	String path="D:\\path\\to\\write";
	
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
		TestSerialization2 ts = new TestSerialization2();
		HybridCycle biCycle = new HybridCycle(2);
		try {
			ts.serialize("high-bicycle.txt", biCycle);
			
			HybridCycle deBc = (HybridCycle)ts.deserialize("high-bicycle.txt");
			System.out.println(deBc.toString());
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block  | ClassNotFoundException
			e.printStackTrace();
		}
	}

}

package com.inventriz.serialization.one;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class TestSerialization1 {
	
	String path="D:\\path\\to\\write\\";
	
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
		TestSerialization1 ts = new TestSerialization1();
		BiCycle1 biCycle = new BiCycle1("blue","20", new Date(), 4, true);
		try {
			ts.serialize("bicycle.txt", biCycle);
			
			BiCycle1 deBc = (BiCycle1)ts.deserialize("bicycle.txt");
			System.out.println(deBc.toString());
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

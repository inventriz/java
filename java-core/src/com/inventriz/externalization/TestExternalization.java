package com.inventriz.externalization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.sun.xml.internal.fastinfoset.util.StringArray;

public class TestExternalization {
	
	String path = "D:\\Tridib\\";
	
	void serialize(Object obj) throws IOException{
		FileOutputStream fos = new FileOutputStream(path.concat(obj.getClass().getName()).concat(".tcf"));
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);
		oos.close();
		fos.close();
	}
	
	Object deserialize(String file) throws IOException, ClassNotFoundException{
		
		FileInputStream fis = new FileInputStream(path.concat(file).concat(".tcf"));
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object obj = ois.readObject();
		ois.close();
		fis.close();
		return obj;
	}
	
	public static void main(String[] args){		
		TestExternalization te = new TestExternalization();
		try {
			String[] arr = {"Puri", "Sabji"};
			Person p = new Person(34, 123, GENDER.MALE, "9886466447", true, arr);
			te.serialize(p);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Person p = (Person) te.deserialize(Person.class.getName());
			System.out.println(p.toString());
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}

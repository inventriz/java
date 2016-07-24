package com.inventriz.externalization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Arrays;

public class Person implements Externalizable {
	
	private static final long serialVersionUID = 34597349573457943L;
		
	private int age;
	private int id;
	private String gender;
	private String contact;
	private boolean hasSpect;
	private String[] foodLikes;
	
	public Person(){} // default constructor must be present if there is a custom constructor defined
	
	public Person(int id, String gender, boolean hasSpect) {
		super();
		this.id = id;
		this.gender = gender;
		this.hasSpect = hasSpect;
	}
	
	
	public Person(int age, int id, String gender, String contact,
			boolean hasSpect, String[] foodLikes) {
		super();
		this.age = age;
		this.id = id;
		this.gender = gender;
		this.contact = contact;
		this.hasSpect = hasSpect;
		this.foodLikes = foodLikes;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		//out.writeObject(id);
		out.writeInt(id);
		out.writeInt(age);
		out.writeObject(gender); // no encoding
		out.writeObject(contact);
		out.writeBoolean(hasSpect);
		out.writeObject(foodLikes);
	}

	

	@Override
	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {
		id = in.readInt();
		age = in.readInt();
		gender = (String)in.readObject();
		contact = (String)in.readObject();
		hasSpect = in.readBoolean();
		foodLikes = (String[])in.readObject();
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", id=" + id + ", gender=" + gender
				+ ", contact=" + contact + ", hasSpect=" + hasSpect
				+ ", foodLikes=" + Arrays.toString(foodLikes) + "]";
	}

	
	
	

}

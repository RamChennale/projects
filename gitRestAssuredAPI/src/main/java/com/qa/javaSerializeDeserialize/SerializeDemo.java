package com.qa.javaSerializeDeserialize;

import java.io.FileInputStream;
//Static data members and transient data members are not saved via Serialization process.
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class DemoStaticSerializable implements Serializable {

	private static final long serialVersionUID = 1L;

	transient int a;
	static int b;
	String name;
	int age;

	public DemoStaticSerializable(int a, int b, String name, int age) {
		this.a = a;
		this.b = b;
		this.name = name;
		this.age = age;
	}
}

public class SerializeDemo {

	public static void printData(DemoStaticSerializable obj) {
		System.out.println(" a transient : " + obj.a);
		System.out.println(" b static : " + obj.b);
		System.out.println(" name : " + obj.name);
		System.out.println(" age : " + obj.age);
	}

	public static void main(String[] args) {
		String fileName = "ram.txt";
		DemoStaticSerializable object = new DemoStaticSerializable(10, 100, "Ram", 26);
		// Serialization
		try {
			FileOutputStream file = new FileOutputStream(fileName);
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(object);
			out.close();
			file.close();
			System.out.println("Befor Serializable");
			printData(object);
			object.b = 2000;
		} catch (FileNotFoundException fnf) {
			fnf.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		// De-Serialization
		DemoStaticSerializable object1 = null;
		try {
			FileInputStream file = new FileInputStream(fileName);
			ObjectInputStream in = new ObjectInputStream(file);
			object1 = (DemoStaticSerializable) in.readObject();
			System.out.println("After De-serializable.");
			printData(object1);
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
	}

}

/*
 * transient variables:- A variable defined with transient keyword is not
 * serialized during serialization process.This variable will be initialized
 * with default value during deserialization. (e.g: for objects it is null, for
 * int it is 0). 
 * 
 * static Variables:- A variable defined with static keyword is
 * not serialized during serialization process.This variable will be loaded with
 * current value defined in the class during deserialization.
 */
package com.qa.javaSerializeDeserialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class TestSerializableDeserialization implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int no;
	String name;

	public TestSerializableDeserialization(int no, String name) {
		this.no = no;
		this.name = name;
	}
}

public class Demo {
	public static void main(String[] args) {
		TestSerializableDeserialization object = new TestSerializableDeserialization(1, "Ram Chennale");
		String fileName = "file.ser";
		try {
			FileOutputStream file = new FileOutputStream(fileName);
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(object);
			out.close();
			file.close();
			System.out.println("Obect serialized.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Deserialization
		TestSerializableDeserialization object1 = null;
		try {
			FileInputStream fileIn = new FileInputStream(fileName);
			ObjectInputStream in = new ObjectInputStream(fileIn);
			object1 = (TestSerializableDeserialization) in.readObject();
			in.close();
			fileIn.close();
			System.out.println("Deserialized object is :");
			System.out.println(object1.no);
			System.out.println(object1.name);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
	}
}

/*
 * TestSerializable object2= new TestSerializable(2, "object2");
 * System.out.println(" Data passed in constructor :"+
 * object2.no+" "+object2.name); TestSerializable object1=null;
 * System.out.println("null object "+object1.no+" "+object1.name); //Exception
 * in thread "main" java.lang.NullPointerException
 * 
 */

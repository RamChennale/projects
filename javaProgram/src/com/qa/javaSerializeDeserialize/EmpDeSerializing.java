package com.qa.javaSerializeDeserialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EmpDeSerializing {

	static EmpPOJO object;
	static FileInputStream file;
	static ObjectInputStream in;
	
	public static void main(String[] args) {
		try {
		file= new FileInputStream("Employee.ser");
		in= new ObjectInputStream(file);
		object=(EmpPOJO) in.readObject();
		System.out.println("Serialized data is restored from Employee.ser file");
		in.close();
		file.close();
		
		}catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}catch(ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
		System.out.println(object.getNo());
		System.out.println(object.getName());
	}
}

package com.qa.javaSerializeDeserialize;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmpSerialize {

	static FileOutputStream file;
	static ObjectOutputStream out;
	static EmpPOJO object;
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		object= new EmpPOJO();
		object.setName("Ram Chennale");
		object.setNo(26);
		file= new FileOutputStream("Employee.ser");
		out= new ObjectOutputStream(file);
		out.writeObject(object);
		out.close();
		file.close();
		System.out.println("Serialized data is saved in Employee.ser file");
	}
}

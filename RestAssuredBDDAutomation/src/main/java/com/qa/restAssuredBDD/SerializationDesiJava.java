package com.qa.restAssuredBDD;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import org.testng.annotations.Test;

public class SerializationDesiJava implements Serializable{

	static int a=100, b=1000;
	static String name="Ram chennale";
	
	@Test(priority=1)
	public void serialization() throws FileNotFoundException,IOException{
		SerializationDesiJava obj= new SerializationDesiJava();
		
		FileOutputStream fileOutputStream= new FileOutputStream("text.ser");
		ObjectOutputStream objectOutputStream= new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(obj);
		objectOutputStream.flush();
		objectOutputStream.close();
	}
	
	@Test(priority=2, enabled=true)
	public void Deserialization() {
		try {
		FileInputStream fileInputStream= new FileInputStream("text.ser");
		ObjectInputStream objectInputStream= new ObjectInputStream(fileInputStream);
		SerializationDesiJava obj=(SerializationDesiJava)objectInputStream.readObject();
		System.out.println("a :"+obj.a+" b: "+obj.b);
		System.out.println("Name: "+obj.name);
		fileInputStream.close();
		}catch(FileNotFoundException f) {
			f.printStackTrace();
		}catch (IOException io) {
			io.printStackTrace();
		}catch (ClassNotFoundException cls) {
			cls.printStackTrace();
		}
		}
}

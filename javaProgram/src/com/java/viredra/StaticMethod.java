package com.java.viredra;

public class StaticMethod {

	public static void show() {
		System.out.println("I am static method show()");
	}
	public static void main(String[] args) {
		StaticMethod obj=null;// no output- for this line
		//obj.show(); //I am static method show()- static method called
	}
	
}

package com.java.constructors;

public class DefConstructor {

	int globalVar= 100;
	String name="Ram";
/*	public DefConstructor() {
		System.out.println("This is Default Constructor : ");
		globalVar=1010;
		System.out.println("Default number initialization : "+globalVar+" For everyone");
		name="Bharat_name";
		System.out.println("Default name initialization : "+name);
	}*/
	
	public void method1(int num, String name) {
		System.out.println("Student number is : "+num);
		System.out.println("Name is :"+name);
	}
	
	public static void main(String [] args) {
		DefConstructor dc= new DefConstructor();
		System.out.println();
		System.out.println("Global var value :  "+dc.globalVar);
		System.out.println("Global var name :"+dc.name);
		System.out.println();
		dc.method1(999, "Name_In_Method");
		
	}
}

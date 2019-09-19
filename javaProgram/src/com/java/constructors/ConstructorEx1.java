package com.java.constructors;

public class ConstructorEx1 {

	
	static byte byteNum;
	static short shortNum;
	static int num;
	static long longNum;
	static float floatNum;
	static double doubleNum;
	static char charCharacter;
	static String name;
	
	public static void defaultValues() {
		System.out.println("Defalut values for PRIMARY DataTypes   byte: " +byteNum);
		System.out.println("Defalut values for PRIMARY DataTypes short  :" +shortNum);
		System.out.println("Defalut values for PRIMARY DataTypes int :" +num);
		System.out.println("Defalut values for PRIMARY DataTypes long :" +longNum);
		System.out.println("Defalut values for PRIMARY DataTypes float :" +floatNum );
		System.out.println("Defalut values for PRIMARY DataTypes double :" +doubleNum );
		System.out.println("Defalut values for PRIMARY DataTypes char :" +charCharacter);
		System.out.println("Defalut values for PRIMARY DataTypes string :" +name);
	}
	
	ConstructorEx1() {
		System.out.println("Default constructor :default constructor is used to provide the default values to the object like 0, null, etc., depending on the type ");
	}
	
	public static void main(String[] args) {
		ConstructorEx1 o1= new ConstructorEx1();
		o1.defaultValues();
		System.out.println(o1.shortNum);
	}
}

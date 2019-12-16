package com.java.stringMethods;

public class StringNew {

	public static void test() {

	}

	public static void main(String args[]) {
		String string = "java";
		char[] stringArray = { 'J', 'a', 'v', 'A' };
		String string1 = new String("Hello world");// creates two objects and one reference variable
		System.out.println(string);
		System.out.println(stringArray);
		System.out.println(string1);// converting char array to string
	}

}

/*
 * String string1 = new String("Hello world");//creates two objects and one
 * reference variable
 * 
 * In such case, JVM will create a new string object in normal (non-pool) heap
 * memory, and the literal "Welcome" will be placed in the string constant pool.
 * The variable s will refer to the object in a heap (non-pool).
 * 
 */
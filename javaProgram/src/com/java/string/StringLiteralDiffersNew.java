package com.java.string;

public class StringLiteralDiffersNew {

	public static void main(String[] args) {
		String s = new String("ram"); // New
		String s2 = new String("ram"); // New
		String s1 = "ram"; // Literal
		System.out.println("By new String(\"ram\");" + s);
		System.out.println(" By String s1=\"ram\"" + s1);
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		/*
		 * Why Java uses the concept of String literal? To make Java more memory
		 * efficient **** (because no new objects are created if it exists already in
		 * the string constant pool).
		 */

		System.out.println("BUT=============BUT");
		String s3 = new String("Welcome");//
		String s4 = new String("Welcome");// creates two objects and one reference variable
		System.out.println("s3 and s4 same strings using New() : " + s3.hashCode() + " " + s4.hashCode());

		// In such case, JVM will create a new string object in normal (non-pool) heap
		// memory, and the literal "Welcome" will be placed in the string constant pool.
		// The variable s will refer to the object in a heap (non-pool).
	}
}

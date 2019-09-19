package com.java.oopsPrograms;

//Object and Class Example: Initialization through reference

class Student1 {
	int id;
	String name;
}

public class TestStudent2 {
	public static void main(String args[]) {
		Student1 s1 = new Student1();
		s1.id = 101;
		s1.name = "Sonoo";
		System.out.println(s1.id + " " + s1.name);// printing members with a white space
	}
}
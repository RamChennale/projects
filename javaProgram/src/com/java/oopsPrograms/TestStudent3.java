package com.java.oopsPrograms;

//

class Student2 {
	int id;
	String name;
}

public class TestStudent3 {
	public static void main(String args[]) {
		Student2 s1 = new Student2();
		Student2 s2 = new Student2();

		// Initializing objects
		s1.id = 101;
		s1.name = "Sonoo";
		s2.id = 102;
		s2.name = "Amit";

		System.out.println(s1.id + " " + s1.name);
		System.out.println(s2.id + " " + s2.name);
	}
}
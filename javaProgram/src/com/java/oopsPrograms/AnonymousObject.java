package com.java.oopsPrograms;

public class AnonymousObject {

	static void fact(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println("factorial is " + fact);
	}

	public static void main(String args[]) {
		new AnonymousObject().fact(3);// calling method with anonymous object
		AnonymousObject.fact(9);
		AnonymousObject a1 = new AnonymousObject(), a2 = new AnonymousObject(); // creating two objects
		System.out.println("obj a1 :" + a1 + "," + a1.getClass());
		System.out.println("obj a2 :" + a2 + "," + a2.getClass());
	}
}

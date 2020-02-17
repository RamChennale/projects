package com.java.viredra;

class BaseClass {

	public String method() {
		return "I am from base class";
	}
}

public class ChildClass extends BaseClass {

	public String method() {
		return "Derived Class - ChildClass";
	}

	public static void main(String[] args) {
		// ChildClass bg = new BaseClass();//compilation problem: Type mismatch: cannot
		// convert from BaseClass to ChildClass
		BaseClass bg = new ChildClass();
		System.out.println(bg.method());// Derived Class - ChildClass
		BaseClass bc = new BaseClass();
		System.out.println(bc.method());// I am from base class

	}
}

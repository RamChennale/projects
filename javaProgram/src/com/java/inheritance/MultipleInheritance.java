package com.java.inheritance;

interface InterfaceA {
	public void abc();

	default void test() {
		System.out.println("test() in InterfaceA");
	}
}

interface InterfaceB {
	default void test() {
		System.out.println("test() in InterfaceB");
	}
}

class MultipleInheritanceByInterface implements InterfaceA, InterfaceB {

	public void abc() {
		System.out.println("abc()");
	}

	/*
	 * @Override // AMBIGUITY problem One way solution: by Overriding method in
	 * implementation class executes method from implementation class public void
	 * test() { System.out.println("test() in MultipleInheritanceByInterface"); }
	 */

	@Override // AMBIGUITY problem second way solution: by calling method
				// "InterfaceA.super.test()" WRT corresponding interface method
	public void test() {
		InterfaceA.super.test();
	}
}

public class MultipleInheritance {
	public static void main(String[] args) {
		InterfaceA interfaceA = new MultipleInheritanceByInterface();
		interfaceA.abc();
		interfaceA.test();
		/*
		 * InterfaceB interfaceB= new MultipleInheritanceByInterface();
		 * interfaceB.test(); // Output - test() in InterfaceA
		 */
	}
}

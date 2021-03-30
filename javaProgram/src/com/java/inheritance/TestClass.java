package com.java.inheritance;

public class TestClass {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		ClassA classA= new ClassB();
		classA.start();
		classA.staticStart();
		System.out.println("===============");
		ClassB classB= new ClassB();
		classB.start();
		classB.staticStart();
	}
}

/*Output
ClassA classA= new ClassB();
start() in ClassB
staticStart() in ClassA

ClassB classA= new ClassB();
start() in ClassB
staticStart() in ClassB


start() in ClassB
staticStart() in ClassA
===============
start() in ClassB
staticStart() in ClassB

*/
package com.java.inheritance;

public class TestClass {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		ClassA classA= new ClassB();
		classA.start();
		classA.staticStart();
	}
}

/*Output
start() in ClassB
staticStart() in ClassA*/
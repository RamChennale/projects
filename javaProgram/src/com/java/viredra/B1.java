package com.java.viredra;

public class B1 {
	B1 b = new B1(); //Exception in thread "main" java.lang.StackOverflowError

	public int show() {
		return (true ? null : 0);//Exception in thread "main" java.lang.NullPointerException
	}

	public static void main(String[] args) {
		B1 b = new B1();
		b.show();
	}
}

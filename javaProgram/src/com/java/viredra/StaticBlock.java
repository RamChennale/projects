package com.java.viredra;

//Note: static block executed without calling 
public class StaticBlock {
	static int i = 9;//if not static -Exception in thread "main" java.lang.Error: Unresolved compilation problem: 

	static {
		System.out.println(i);
	}
	static {
		System.out.println("I am from static BLOCK");
	}

	public static void main(String[] args) {

	}
}
// OUTPUT:
//9
//I am from static BLOCK

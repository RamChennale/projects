package com.java.stringMethods;

import org.testng.annotations.Test;

public class StringLiteral {

	public static String sl1 = "Hello world";

	@Test
	public void test() {
		System.out.println(sl1);
	}
}

/*
 * create a string literal, the JVM checks the "string constant pool" first. If
 * the string already exists in the pool, a reference to the pooled instance is
 * returned. If the string doesn't exist in the pool, a new string instance is
 * created and placed in the pool. For example:
 * 
 * String s1="Welcome"; String s2="Welcome";//It doesn't create a new instance
 */
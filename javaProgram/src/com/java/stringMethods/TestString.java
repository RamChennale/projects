package com.java.stringMethods;

import org.testng.annotations.Test;

public class TestString {

	public static String sl1 = "Hello world";
	public static String sl2 = "Hello world";
	public static String strNew1 = new String("Hello world");
	public static String strNew2 = new String("Hello world");

	@Test
	public void test() {
		 System.out.println(sl1);
		 System.out.println(sl1.charAt(0));
		 System.out.println(sl1.compareTo(sl2));
	}
}

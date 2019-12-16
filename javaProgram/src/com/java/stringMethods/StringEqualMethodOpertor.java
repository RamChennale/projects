package com.java.stringMethods;

import org.testng.annotations.Test;

public class StringEqualMethodOpertor {
	public static String strLiteral = "Hello world";
	public static String strNewString = new String("Hello world");

	@Test
	public void test() {
		System.out.println("strLiteral : " + strLiteral);
		System.out.println("strNewString : " + strNewString);
		System.out.println("=========");
		System.out.println("strLiteral.hashCode() : " + strLiteral.hashCode());
		System.out.println("strNewString.hashCode() : " + strNewString.hashCode());
		System.out.println("=========");
		if (strLiteral == strNewString) {//false
			System.out.println("strLiteral==strNewString");
		}
		if (strLiteral.equalsIgnoreCase(strNewString)) {//true
			System.out.println("strLiteral.equalsIgnoreCase(strNewString)");
		}

		System.out.println("=========");
		String s1 = new String("HELLO");
		String s2 = new String("HELLO");
		System.out.println(s1 == s2); // false
		System.out.println(s1.equals(s2)); // true
		System.out.println("=========");

		String sl1 = "HELLO";
		String sl2 = "HELLO";
		System.out.println(sl1 == sl2); // true because of literal string saved in string pool before creating new
										// literal it will check into pool.
		System.out.println(sl1.equals(sl2)); // true
		System.out.println("=========");

	}
}

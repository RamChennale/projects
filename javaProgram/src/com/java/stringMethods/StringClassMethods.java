package com.java.stringMethods;

public class StringClassMethods {

	public static void main(String args[]) {
		String string = "java";
		String string2 = new String("java");
		String s = "hello";

		System.out.println(string.charAt(1));
		System.out.println(string.length());
		System.out.println(string.substring(1));
		System.out.println(string.substring(1, 2));
		System.out.println(string.contains(string2));
		System.out.println(string.equalsIgnoreCase(string2));
		System.out.println(string.equals(string2));
		System.out.println(string.isEmpty());
		System.out.println(string.concat(string2));
		System.out.println(string.replace('a', 'A'));
		System.out.println(string.intern());
		System.out.println(string.indexOf("j"));
		System.out.println(string.indexOf(0, 1));
		System.out.println(string.indexOf("av", 1));
		System.out.println(string.toLowerCase());
		System.out.println(string.toUpperCase());
		System.out.println(string.trim());
		System.out.println(string.valueOf(65));
		//System.out.println(string.split("j"));
		
		s.charAt(0);
		s.chars();
		s.compareTo(string);
		s.compareToIgnoreCase(string);
		s.concat(string);
		s.contains(string);
		s.contentEquals(string);
		s.endsWith(string);
		s.equals(s);
		s.equalsIgnoreCase(s);
		s.getBytes();
	}
}

/*
 * System.out.println(string.intern()); It follows that for any two strings s
 * and t, s.intern() == t.intern() is true if and only if s.equals(t) is true.
 * 
 */
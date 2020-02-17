package com.java.viredra;

import org.apache.log4j.net.SyslogAppender;
import org.testng.annotations.Test;

public class TestJavaString {

	@Test(enabled = false)
	public void concatStringAfterAssigning() {
		String s1 = "java";
		s1 = s1.concat("knowledge");// Assigning to String s1
		System.out.println("Value of s1 is : " + s1);
		// Output: Value of s1 is : javaknowledge
	}

	@Test(enabled = false)
	public void concatStringBeforeAssigning() {
		String s2 = "java";
		s2.concat("knowledge");// NOT assigning to String s2
		System.out.println("Value of s2 is : " + s2);
		// Output:Value of s2 is : java
	}

	@Test(enabled = false)
	public void assignmentOperatorSTRINGliteral() {
		String s1 = "abc";
		String s2 = "abc";
		System.out.println("s1: " + s1 + " s2: " + s2);// s1: abc s2: abc
		System.out.println("s1: " + s1.toString() + " s2: " + s2.toString());// s1: abc s2: abc
		System.out.println(s1 == s2);// true
		System.out.println(s1.hashCode());// 96354
		System.out.println(s2.hashCode());// 96354
	}

	@Test(enabled = false)
	public void equalsSTRING() {
		String s3 = "abc";
		System.out.println("s3: " + s3);
		System.out.println("s3.hashCode(): " + s3.hashCode());// 96354
		String s4 = new String("abc");// abc
		System.out.println("new s4: " + s4);// abc
		System.out.println("new s4.hashCode(): " + s4.hashCode());// 96354
		s3 = s3.intern();
		s4 = s4.intern();
		System.out.println("s3.equals(s4): " + s3.equals(s4)); // true
		System.out.println(s3.toString());// abc
		System.out.println(s4.toString());// abc
	}
	
	@Test(enabled = false)
	public void replaceSTRING() {
		String s="JAVA";
		s=s.replace("A", "a");
		System.out.println(s);
	}
	
	
	@Test(enabled = false)
	public void reverseString() {
		String s="ramaji";
		System.out.println("s.length(): "+s.length());//4
		char[] ch=s.toCharArray();
		System.out.println("ch.length: "+ch.length);
		for(int i=ch.length-1;i>=0;i--) {
			System.out.print(ch[i]);
		}
		System.out.println();
	}
	
	@Test(enabled = false)
	public static String reverseString1(String s) {
		//String s="ramaji";
		String s2 = new String();
		for(int i=s.length()-1;i>=0;i--) {
			s2 = s.substring(i, i-1);
		}
		return s2;
	}
	
	@Test(enabled = false)
	public void concat() {
		String s = "Nagpur ";
		s.concat("M");
		System.out.println(s);
		s = s.concat(" Nagpur M");
		System.out.println(s);
	}
	
	@Test(enabled = true)
	public void assignmentOp() {
		String s1 = "abc";
		String s2 = "abc";
		System.out.println(s1.intern());//Output:abc - a string that has the same contents as this string, but is guaranteed to be from a pool of unique strings.
		String string1=new String("abc");
		String string2=new String("abc");
		System.out.println(s1==string1);		//false
		System.out.println(s1.equals(string1)); //true
		//System.out.println(s1==s2);				//true
		System.out.println(string1==string2);	//false
	}
}

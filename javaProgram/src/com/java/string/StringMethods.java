package com.java.string;

public class StringMethods {

	public static void main(String[] args) {

		String s1 = "Ram";
		char[] arr = { 'r', 'a', 'm', '1' };

		try {
		for (int i = 0; i <= arr.length; i++) {
			System.out.println(arr[i]);
		}
		}catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("ArrayIndexOutOfBoundsException  : "+ae);
		}
		String s2 = new String(arr);
		String s3 = new String("ram2");

		System.out.println("STRING LITERAL 			:	 " + s1);
		System.out.println("CHAR ARRAY TO STR 		:	 " + s2);
		System.out.println("STRING WITH NEW OPERATOR:	 " + s3);
	}
}

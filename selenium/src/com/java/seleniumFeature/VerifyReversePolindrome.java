package com.java.seleniumFeature;

import java.util.Scanner;

public class VerifyReversePolindrome {

	public void verifyReversePolindrome() {
		System.out.println("Enter a string to verify whether it is polindrome or not ?");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String s1 = scanner.nextLine();
		StringBuffer sb = new StringBuffer(s1);
		System.out.println("Given string : " + s1);
		// System.out.println("String reveresed by StringBuffer:"+ sb.reverse());
		String revString = sb.reverse().toString();
		System.out.println("String reveresed by StringBuffer & fetched by toString() : " + revString);
		if (s1.equalsIgnoreCase(revString)) {
			System.out.println(s1 + " : IS POLINDROME :" + revString);
		} else {
			System.out.println(s1 + " : IS not POLINDROME :" + revString);
		}

		// REVERS THE STRING WITHOUT USING PREDEFINED METHODS
		System.out.println("Given string is : " + s1);
		char[] ca = s1.toCharArray();
		System.out.println("STRING reversed WITHOUT USING PREDEFINED METHODS :");
		for (int i = ca.length - 1; i >= 0; i--) {
			System.out.print(ca[i]);
		}
	}

	public static void main(String[] args) {
		VerifyReversePolindrome verifyReversePolindrome = new VerifyReversePolindrome();
		verifyReversePolindrome.verifyReversePolindrome();
	}
}

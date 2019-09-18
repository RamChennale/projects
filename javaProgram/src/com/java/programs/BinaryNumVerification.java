package com.java.programs;

import java.util.Scanner;

import org.testng.annotations.Test;

public class BinaryNumVerification {

	public static boolean isItBinaryNum(int num) {
		while (num != 0) {
			if (num % 10 > 1) {
				return false;
			}
			num = num / 10;
		}
		return true;
	}

	@Test
	public void binaryNumVerification() {
		int a = 10, b = 20;
		String result = a > b ? "a is greater > than b TRUE " : "a is less < than b FALSE";
		System.out.println("a =" + a + " and b =" + b + " Result = " + result);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number : ");
		int num = scanner.nextInt();
		System.out.println(isItBinaryNum(num) ? num + "Is a binary number" : num + "Is not a binary number");
	}
	
	/*public static boolean isBinaryORnot(int n) {
		while (n != 0) {
			if (n % 10 > 1) { 		// n%10 => gives last digit reminder
				return false; 		// number containing any digit greater than 1 means its not binary.
			}
			n = n / 10; 			// n=n/10 =>gives complete number except last digit
		}
		return true; 				// All 0 and 1 is a binary number only
	}

	public static void main(String[] args) {

		int n=101010010;
		System.out.println("What?:True:False");
		System.out.println(isBinaryORnot(n)?n+" : Is a binary number ":n+" : Is not a binary number");
		n=111111;
		System.out.println(isBinaryORnot(n)?n+" : Is a binary number ":n+" : Is not a binary  number");
		n=0000000;
		System.out.println(isBinaryORnot(n)?n+" : Is a binary number ":n+" : Is not a binary  number");
		n=1;
		System.out.println(isBinaryORnot(n)?n+" : Is a binary number ":n+" : Is not a binary  number");
		n=12000010;
		System.out.println(isBinaryORnot(n)?n+" : Is a binary number ":n+" : Is not a binary  number");
		n=32344;
		System.out.println(isBinaryORnot(n)?n+" : Is a binary number ":n+" : Is not a binary  number");
	}*/
	
}

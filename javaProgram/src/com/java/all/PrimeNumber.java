package com.java.all;

import java.util.Scanner;

public class PrimeNumber {

	public static boolean isPrimeNumber(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				System.out.println(" It's not prime number :" + n);
				return false;
			}
		}
		return true; // means number wasn't divisible by any other than that given number, it's a prime number.
	}

	public static void main(String[] args) {
		int n;
		System.out.println();
		System.out.println("a?b:c  ???? How it works ");
		System.out.println();
		System.out.println("if a is TRUE  ? b is CORRECT : c WRONG");
		System.out.println("if a is FALSE ? b is WRONG   : c CORRECT");
		System.out.println();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number to verify whether it is PRIME or not ? ");
		n = scanner.nextInt();
		System.out.println(isPrimeNumber(n) ? n + " is prime number." : n + " is not prime number.");
	}

}

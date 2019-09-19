package com.java.programs;

public class PrimeNumber {
	public static void main(String[] args) {

		int n = 11;
		System.out.println("a?b:c =>  true?correct:wrong AND false?wrong:correct");
		System.out.println(isPrimeNumber(n) ? n + " is prime number." : n + " is not prime number.");
		n = 12;
		System.out.println(isPrimeNumber(n) ? n + " is prime number." : n + " is not prime number.");
		n = 13;
		System.out.println(isPrimeNumber(n) ? n + " is prime number." : n + " is not prime number.");
		n = 14;
		System.out.println(isPrimeNumber(n) ? n + " is prime number." : n + " is not prime number.");
	}

	/**
	 * returns true if number is prime.
	 */
	public static boolean isPrimeNumber(int n) {
		// for (int i = 2; i <= Math.sqrt(n); i++) good as per performance
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true; // means number wasn't divisible by any of the number, it's a prime number.
	}
}

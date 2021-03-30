package com.java.interview;

public class PrimeNumBetweenMtoN {
	
	public static boolean isPrime(int n) {
		if(n<=1) {
			System.out.println(n);
			return false;
		}
		
		for(int i=2; i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		System.out.print(n+",");
		return true;
	}

	public static void main(String args[]) {
		int m=10, n=100;
		for(int i=m; i<n;i++) {
			isPrime(i);
		}
	}
}
// 11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,
// 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
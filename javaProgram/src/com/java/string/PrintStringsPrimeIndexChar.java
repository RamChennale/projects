package com.java.string;

public class PrintStringsPrimeIndexChar {

	
	public static boolean isPrime(int n) {
		if(n<=1) return false;
		
		for(int i=2; i<n; i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	
	public static void printPrimeIndexChar(String str) {
		int n=str.length();
		for(int i=2; i<=n; i++) {
			if(isPrime(i)){
				System.out.print(str.charAt(i-1));
			}
		}
	}
	
	public static void main(String args[]) {
		printPrimeIndexChar("GeeksforGeeks");
	}
}
//output -> eesoes
//GeeksforG e  e  k  s
//123456789 10 11 12 13
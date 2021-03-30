package com.java.array;

public class PrintArraysPrimeIndexNum {

	public static boolean isPrime(int n) {
		if (n <= 1) return false;
		for (int i = 2; i < n; i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	//print prime index element
	public static void printPrimeIndex(int arr[]) {
		
		int n=arr.length;
		//loop to check if index is prime or not 
		for(int i=2; i<=n;i++) {
			if(isPrime(i)) {
				System.out.println(arr[i-1]);
			}
		}
		
	}
	
	public static void main(String args[]) {
		int arrays[]= {1,2,3,4,5,6,7,8,9,10}; //1,2,3,5,7

		printPrimeIndex(arrays);
	}
	
}

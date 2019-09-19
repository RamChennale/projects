package com.java.programs;

import java.util.Scanner;



/*Perfect number is a positive integer that is equal to the sum of its positive divisors excluding the number itself.

Example-
6= 1+2+3
28= 1+2+4+7+14
496= 1+2+4+8+16+31+62+124+248*/
public class PerfectNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter a num to verify i=whether it is perfect or not ? ");
		Scanner scanner= new Scanner(System.in);
		int num=scanner.nextInt();
		System.out.println(isPerfectNum(num)?num+" Is the perfect number ":num+"is not a perfect number ");
	}
	
	public static boolean isPerfectNum(int num) {
		int sumOfDivisor=1;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				sumOfDivisor=sumOfDivisor+i;
			}
		}
		if (sumOfDivisor==num)
			return true;
		else
			return false;
	}

}
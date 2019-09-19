package com.java.programs;

import java.util.Scanner;

/*Find Factorial of a given number
Factorial(5)=5*4*3*2*1;
Factorial of 5 is : 120*/
public class FactorialNumber {
	
	public static void findFactorial(int num) {
		int factorial=1;
		while(num>0) {
			factorial=factorial*num;
			num--;
		}
		System.out.println("Factorial of "+num+"is "+factorial);
	}

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter number to find Factorial : ");
		int num=scanner.nextInt();
		findFactorial(num);
	}

}

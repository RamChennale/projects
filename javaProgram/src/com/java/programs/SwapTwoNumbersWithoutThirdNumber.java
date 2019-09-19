package com.java.programs;

import java.util.Scanner;

public class SwapTwoNumbersWithoutThirdNumber {
public static void main(String[] args) {
		
		System.out.println("Please enter 2 numbers to swap.");
		Scanner scanner= new Scanner(System.in);
		int n1=scanner.nextInt();
		int n2=scanner.nextInt();
		System.out.println("Before swapping n1="+n1+" and n2="+n2);
		n1=n1+n2;//20+30=50=n1
		n2=n1-n2;//50-30=20=n2
		n1=n1-n2;//50-20=30=n1
		System.out.println("After swapping n1="+n1+" and n2="+n2);
	}
}

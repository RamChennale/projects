package com.java.all;

import java.util.Scanner;

public class SumOfGivenNum {
	
	public static void main(String[] args) {
		System.out.println("Enter num :");
		Scanner scanner= new Scanner(System.in);
		int num=scanner.nextInt();
		int sum=0, reminder;
		while(num>0) {
			reminder=num%10;
			num=num/10;
			sum=sum+reminder;
		}
		System.out.println("Sum of given num : "+sum);
	}
	
	}

/*
	int num=12345; 
	int sum=0;
	int rem;
	 
	while(num>0) {
		rem=num%10;
		num=num/10;
		sum=sum+rem;
	}
*/
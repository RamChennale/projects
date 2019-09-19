package com.java.all;

public class SumOfGivenNum {

	public static void main(String[] args) {
		
		int num=12345; //15
		int sum=0;
		int rem;
		 
		while(num>0) {
			rem=num%10;
			num=num/10;
			sum=sum+rem;
		}
		
		System.out.println("sum of given num is : "+sum);
	}
	}
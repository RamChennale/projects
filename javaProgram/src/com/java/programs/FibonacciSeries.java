package com.java.programs;

/*Fibonacci Series: Adding a next number to a previous number
Fibonacci Series: 0 1 1 2 3 5 8 13 21 34 55 89 */
public class FibonacciSeries {

	public static void fibonacciSeries(int n) {
		int first=0,second=1;
		int temp;
		System.out.print("fibonacci Series of "+n+" is : "+first+","+second+",");
		while(n>0) {
			temp=first+second;
			first=second;
			second=temp;
			n--;
			System.out.print(temp+",");
		}
	}

	public static void main(String[] args) {
		int n = 10;
		fibonacciSeries(n);
	}
}

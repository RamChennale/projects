package com.java.programs;

import java.util.Scanner;

public class LargestOfThreeNum {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter value of a, b and c :");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int c=scanner.nextInt();
		if(a>b&&a>c) {
			System.out.println(a+"is bigger");
		}else if(b>a&&b>c) {
			System.out.println(b+"is bigger ");
		}else if(c>a&&c>b){
			System.out.println(c+"is bigger");
		}else {
			System.out.println("All are equal : "+a+","+b+","+c);
		}
		
	}

}

package com.java.exceptions;

import java.util.Scanner;

public class DivideByZero {

	public static void main(String args[]) {
		try {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter first number : ");
			int a = s.nextInt(); // Integer.parseInt(input);
			System.out.println("Enter second number : ");
			int b = s.nextInt();
			int div = a / b;
		} catch (CustomException ce) {
			throw new CustomException("Enter only integer number." + ce.getMessage());
		}
finally {
	System.out.println("MUST AND SHOULD EXECUTED");
}
	}
}

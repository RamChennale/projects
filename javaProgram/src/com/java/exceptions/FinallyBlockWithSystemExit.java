package com.java.exceptions;

import java.util.Scanner;

public class FinallyBlockWithSystemExit {

	public static void main(String args[]) {
		try {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter first number : ");
			int a = s.nextInt(); // Integer.parseInt(input);
			System.out.println("Enter second number : ");
			int b = s.nextInt();
			int div = a / b;
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("ArithmeticException Occured");
			System.exit(2);//finally block ignored as JVM terminating current running program 
		}
finally {
	System.out.println("MUST AND SHOULD EXECUTED");
}
	}
}

package com.java.exceptions;

import java.util.Scanner;

public class TestThrow1 {
	public static int  age;
	public static String var=null;
	public static void validate(int age) {
		if (age < 18) {
			throw new ArithmeticException(
					"You are not allowed to cast your Vote because you are only  : " + age + " years old");
		} else {
			System.out.println("You are eligible : Welcome to  VOTE");
		}
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter voter age : ");
		age = scanner.nextInt();
		validate(age);
		System.out.println("Do you want continue Yes/No.");
		var=scanner.nextLine();
		
	}
}

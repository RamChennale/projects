package com.java.all;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		System.out.println("Hello java");

		Armstrongnum();
	}

	public static void Armstrongnum() {

		// int num = 153;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter num to verify is it  Armstrong num ??");
		float num = scanner.nextInt();

		float temp = num;
		float rem = 0;
		float sum = 0;

		while (num > 0) {
			rem = num % 10;
			sum = sum + (rem * rem * rem);
			num = num / 10;
		}
		if (sum == temp) {
			System.out.println(temp + ": is armstrong num");
		} else {
			System.out.println(temp + "is not armstrong num" + "");
		}
	}
}

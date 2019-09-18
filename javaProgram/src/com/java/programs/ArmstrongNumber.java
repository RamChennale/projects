package com.java.programs;

import java.util.Scanner;

/*A arm strong number is a number such that the sum of the cubes of its digits is equal to the number 
 * itself.
1(3) + 5(3) + 3(3) = 1 + 125 + 27 = 153.
Armstrong numbers 
0   =0
1   =1
153 =1+125+27
370 =27+343
371 =27+343+1
407 =64+0+343 */

public class ArmstrongNumber {

	public static void findArmstrongNumber(int num) {
		int temp = num;
		int rem=0;
		int sum = 0;
		while (num > 0) {
			rem = num % 10;
			sum = sum + (rem * rem * rem);
			num = num / 10;
		}
		if (sum == temp) {
			System.out.println(temp + ": is a Armstrong Number");
		} else {
			System.out.println(temp + ": is not a Armstrong Number");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number :");
		int num = scanner.nextInt();
		findArmstrongNumber(num);
	}
}

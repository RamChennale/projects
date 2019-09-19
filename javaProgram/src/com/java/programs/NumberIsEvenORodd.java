package com.java.programs;
/*Write a program to find number is odd or even without % operator in java.

LOGIC in java>
We will convert our decimal number into binary, binary number consists of only 0 and 1's ,
if its last digit is 1, then number is ODD in java.
if its last digit is 0, then number is EVEN in java*/
import java.util.Scanner;

public class NumberIsEvenORodd {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num=scanner.nextInt();
		if((num&1)==0) {
			System.out.println(num+" is a even number.");
		}else {
			System.out.println(num+" is a odd number. ");
		}
	}
}

/*It's a little trick: every binary number that has the least significantive bit to 0 is even and odd otherwise. This because the powers of two are 1,2,4,8,16,... so what happens is that when you do bitwise AND with 1 you obtain 0 if the least significative bit was 0 and 1 otherwise. So you can easily recognize if a number if even by doing that.

Of course this works just because the arithmetic used in CPUs is binary, otherwise it would be just crap..

just an example

161 = 10100001 &
1   = 00000001
--------------
      00000001 -> odd

84  = 01010100 &
1   = 00000001 
--------------
      00000000 -> even*/
package com.java.all;

import java.util.Scanner;

public class ReverseGivenNum {

	public static void main(String[] args) {
		System.out.println("Enter a num :");
		Scanner scanner= new Scanner(System.in);
		int n=scanner.nextInt();
		int rev=0, reminder=0;
		while(n>0) {
			reminder=n%10;
			n=n/10;
			rev=rev*10+reminder;
		}
		System.out.println("Reverse num is : "+rev);
	}
}


/*public static int reverseNum(int num) {
			int rev=0;
			int reminder=0;
			while(num>0) {
				reminder=num%10;
				num=num/10;
				rev=rev*10+reminder;
			}
			return rev;
		}
		
		public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("Enter a integer num to reverse : ");
		int num=s.nextInt();
		System.out.println("Given num is : "+num);
		System.out.println("Reverse num is : "+reverseNum(num));
	}
*/

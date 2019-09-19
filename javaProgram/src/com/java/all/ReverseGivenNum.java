package com.java.all;

import java.util.Scanner;

public class ReverseGivenNum {

/*		int i=12345, j=10;
		int idiv=i/j;
		System.out.println(idiv);
		
		float k=1, l=10;
		float fdiv=k/l;
		System.out.println(fdiv);*/
		
		public static int reverseNum(int num) {
			int rev=0;
			int reminder;
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
}

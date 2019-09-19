package com.java.string;

import java.util.Scanner;

public class ReverseGivenString {
	public static void main(String[] args) {

		System.out.println("=========");
		String original_string="Hello Ram";
		StringBuffer sb=new StringBuffer(original_string);
		//StringBuffer sb=new StringBuffer("Hello Ram");
		System.out.println("original string : " + original_string);
		System.out.println("Reversed string  : " + sb.reverse());
		
		
		System.out.println("=========");
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter the string ");
		String str=s.nextLine();
		StringBuilder sb1=new StringBuilder(str);
		System.out.println(sb1.reverse());
		System.out.println("=========");
		
		String var="Hello"; //hello  :string length is=5  but stored in array [0,1,2,3,4][h,e,l,l,o]
		char[] strChar=var.toCharArray();
		System.out.println(strChar.length);//5 string length is=5
		System.out.println(strChar.length-1);//4 array length is=4
		for(int i=strChar.length-1; i>=0; i--) {
			System.out.print(strChar[i]);
		}
		
	/*	for(int i=10-1; i>=1; i--){
            System.out.println("The value of i is: "+i);
       }*/
	}
}

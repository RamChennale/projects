package com.java.string;

public class CharToStringToCharConversion {
	public static void main(String[] args) {
	// CharToString
			char ch='a';
			String str1=Character.toString(ch);
			System.out.println(str1);
			System.out.println();
			String string=String.valueOf(ch);
			System.out.println(string);
			
			//StringToChar
			String str="Hello";
			for(int i=0;i<=str.length()-1;i++) {
				char ch1=str.charAt(i);
				System.out.print(" "+ch1);
			}
		}
}

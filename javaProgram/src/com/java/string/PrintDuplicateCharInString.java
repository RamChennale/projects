package com.java.string;

public class PrintDuplicateCharInString {

	public static void printDupCharacters(String str) {
		String temp="";
		for(int i=0; i<str.length();i++) {
			char current=str.charAt(i);
			if(temp.indexOf(current)<0) {
				temp=temp+current;
			}
		}
		
		System.out.println(temp);

	}
	public static void main(String args[]) {
		printDupCharacters("maIma");
	}
}



/*
 * public static void printOnlyUniqueCharacters(String str) { String temp=""; for(int
 * i=0; i<str.length();i++) { char current=str.charAt(i);
 * if(temp.indexOf(current)<0) { temp=temp+current; }else {
 * temp=temp.replace(String.valueOf(current), ""); } }
 * 
 * System.out.println(temp);
 * 
 * }
 */
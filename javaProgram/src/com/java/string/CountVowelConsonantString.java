package com.java.string;

public class CountVowelConsonantString {
	public static void main(String[] args) {
		String str= "Count num of vowels and consonents";
		str=str.toLowerCase();
		int countV = 0, countC = 0, numofCharacters=0;
		System.out.println(str);
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				countV++;
			}else if (str.charAt(i)>='a' && str.charAt(i)<='z') {
				countC++;
			} 
		}
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				numofCharacters++;
			}
		}
		System.out.println("Total num of characters : "+numofCharacters);
		System.out.println("Num of vowels : "+countV);
		System.out.println("Num of consonents : "+countC);
	}
}

package com.java.string;

public class CharacterCountInString {
	public static void main(String[] args) {
		/*String str="The best of both worlds";
		System.out.println(str.length());
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				count++;
			}
		}
		System.out.println("The num of characters : "+count);*/
	
		int count=0;
		String str="The who  hey";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				count++;
			}
		}
		System.out.println("The number of characters : "+count);
	}
}

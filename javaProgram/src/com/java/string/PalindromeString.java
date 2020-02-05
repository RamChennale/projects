package com.java.string;

public class PalindromeString {
	public static boolean isPalindrome(String inputStr) {
		char charArr[]=inputStr.toCharArray(); //charArr ['a','a','b','a','a']
		for(int i=0,j=charArr.length-1;i<(charArr.length/2);i++,j--) {
			System.out.println(charArr.length);
			if(charArr[i]!=charArr[j]) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
	String inputStr="aabaa"; 
	System.out.println(isPalindrome(inputStr)?inputStr+" : String is panlindrome ":inputStr+" : String is not paliandrom");
	
	
		
	/*String originalString="rams";
	String temp=originalString;
	System.out.println("Given string "+originalString);
	StringBuffer stringBuffer=new StringBuffer(originalString);
	//System.out.println("Revered string by StringBuffer is: "+stringBuffer.reverse());
	String revStr=stringBuffer.reverse().toString();
	if (temp.equalsIgnoreCase(revStr)) {
		System.out.println(revStr+" : String is palindrome ");
	}else {
		System.out.println(revStr+" : String is not palindrome ");
	}
	System.out.println();*/
	
	
	
	
	/*
	StringBuilder stringBuilder=new StringBuilder(originalString);
	System.out.println("Original String is : "+originalString);
	System.out.println("Revered String by StringBuilder is : "+stringBuilder.reverse());
	System.out.println();
	System.out.println("Revered String without predefined method");
	char charArr[]=originalString.toCharArray(); //['R','a','m']
	int strlenth=charArr.length;
	System.out.println("String length :  "+strlenth);
	for(int i=strlenth-1;i>=0;i--) {
		System.out.print(charArr[i]);
	}
	System.out.println();
	System.out.println();
	for(int i=charArr.length-1;i>=0;i--) {
		System.out.print(charArr[i]);
	}*/
	}
}

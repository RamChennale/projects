package com.java.string;

public class ReverseStringUsingStringBuffer_Builder {

	public static void main(String[] args) {

		String originalString="Ram";
		StringBuffer stringBuffer=new StringBuffer(originalString);
		System.out.println("Original String is : "+originalString);
		System.out.println("Revered string by StringBuffer is: "+stringBuffer.reverse());
		System.out.println();
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
		}
		
	}
}

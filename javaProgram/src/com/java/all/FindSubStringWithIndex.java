package com.java.all;

import java.util.Scanner;

public class FindSubStringWithIndex {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in); 
		System.out.println("Enter a string ");
		String is=scanner.nextLine(); //"Welcome to java";
		System.out.println("Enter string to search ?");//
		String ss=scanner.nextLine();//"to";
		int sindex=findSubstring(is, ss);
		System.out.println(sindex>-1?ss+" : is substring at "+sindex:ss+" : is not substring.");
		//System.out.println(sindex>-1 ?is+"contains substring : "+ss+" at index of "+sindex:is+" dose not contains  "+ss);
	}
	
	public static int findSubstring(String is, String ss) {
		char isArr[]= is.toCharArray();
		char[] ssArr= ss.toCharArray();
		int count =0;
		for (int i=0;i<isArr.length;i++) {
			if(String.valueOf(isArr[i]).equalsIgnoreCase(String.valueOf(ssArr[count]))) {
				count++;
				if(count==ssArr.length) {
					return i-count+1;
				}
			}else {
				if(count>0) {
					count=0;
					i--;
				}//if
			}//else
		}//for
		return -1;
	}//findSubstring(String is, String ss)
}

/*public static void main(String[] args) {

	String inputString;
	String searchSubString;
	int foundIndex; // index at which subString is found by our method.
	inputString = "Java Hello world";
	searchSubString = "Hello";
	foundIndex = isSubString(inputString, searchSubString);
	System.out.println(foundIndex > -1
			? inputString + " - contains -" + searchSubString + "- as substring at index " + foundIndex
			: inputString + "doesn't contains " + searchSubString);
}

*//**
 * Below method returns subString index in given inputString. Returns -1 if
 * subString is not found.
 *//*
public static int isSubString(String inputString, String searchSubString) {
	char inputStringAr[] = inputString.toCharArray();
	char searchSubStringAr[] = searchSubString.toCharArray();
	int count = 0; // if count matches searchSubStringAr length,then sub string is found in string
	for (int i = 0; i < inputStringAr.length; i++) {
		if (String.valueOf(inputStringAr[i]).equals(String.valueOf(searchSubStringAr[count]))) {
			count++; // index of searchSubStringAr
			if (count == searchSubStringAr.length) {
				return i - count + 1; // substring found, return starting index of it.
			}
		} else {
			
			 * Below if condition comes into role, when some part of searchSubString is
			 * present before whole searchSubString. Eg= searchSubString=tiger &
			 * inputString="tigtiger" [here, (tig) is present before (tiger)]
			 
			if (count > 0) {
				count = 0;
				i--;
			}
		}

	}
	return -1; // substring not found.
}*/


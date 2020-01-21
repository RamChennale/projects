package com.java.all;

import java.util.Scanner;

public class FindSubStringWithIndex {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in); 
		System.out.println("Enter a string ");
		String is=scanner.nextLine(); //"Welcome to java";
		System.out.println("Enter string to search ?");//
		String ss=scanner.nextLine();//"to";
		System.out.println(findSubstring(is, ss)?ss+" is substring of "+is:ss+" is not substring");
	}
	
	public static boolean findSubstring(String is, String ss) {
		char stringArray[]= is.toCharArray();
		char[] subStringArray= ss.toCharArray();
		int count =0;
		for (int i=0;i<stringArray.length;i++) {
			if(String.valueOf(stringArray[i]).equalsIgnoreCase(String.valueOf(subStringArray[count]))) {
				count++;
				if(count==subStringArray.length) {
					return true;
				}
			}else {
				if(count>0) {
					count=0;
					i--;
				}//if
			}//else
		}//for
		return false;
	}//findSubstring(String is, String ss)
}


/*
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
}//findSubstring(String is, String ss)*/
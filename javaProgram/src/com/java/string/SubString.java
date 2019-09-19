package com.java.string;

public class SubString {
	public static void main(String[] args) {

		String inputString = "Ram chennale lotus";
		String searchSubstring = "chennale";
		int foundIndex = isSubString(inputString, searchSubstring);
		System.out.println(foundIndex > -1 ? inputString + "contains " + searchSubstring + " at index " + foundIndex
				: inputString + "dose not contains substring " + searchSubstring);
	}

	public static int isSubString(String inputString, String searchSubstring) {
		char[] inputStringArray = inputString.toCharArray();
		char searchSubstringArray[] = searchSubstring.toCharArray();
		int count = 0;
		for (int i = 0; i < inputStringArray.length; i++) {
			if (String.valueOf(inputStringArray[i]).equals(String.valueOf(searchSubstringArray[count]))) {
				count++;
				if (count == searchSubstringArray.length) {
					return i - count + 1;
				}
			} else {
				if (count > 0) {
					count = 0;
					i++;
				}
			}

		}
		return -1;
	}
}

/*
 * String var="Hello Ram"; System.out.println("Given string is :"+var);
 * System.out.println("Given string lenght is : "+var.length()); //Substring is
 * System.out.println(); String a=var.substring(2); //substring(int start)
 * including 2nd onwards String b=var.substring(2, 4);//substring(int start, int
 * end) including 2nd onwards and excluding 4
 * System.out.println("substring is : "+var.substring(2));
 * System.out.println("substring in middle : "+b);
 * 
 * 
 * //Reverse the given string System.out.println("Reverse string is : "); char[]
 * strVar=var.toCharArray();
 * System.out.println("String char array object address after conversion : "
 * +strVar.toString()); for(int i=strVar.length-1;i>=0;i--) {
 * System.out.print(strVar[i]); }
 */

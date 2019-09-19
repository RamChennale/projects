package com.java.all;

public class FindSubStringWithIndex {
	public static void main(String[] args) {

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

	/**
	 * Below method returns subString index in given inputString. Returns -1 if
	 * subString is not found.
	 */
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
				/*
				 * Below if condition comes into role, when some part of searchSubString is
				 * present before whole searchSubString. Eg= searchSubString=tiger &
				 * inputString="tigtiger" [here, (tig) is present before (tiger)]
				 */
				if (count > 0) {
					count = 0;
					i--;
				}
			}

		}
		return -1; // substring not found.
	}
}

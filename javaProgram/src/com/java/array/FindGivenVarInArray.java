package com.java.array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FindGivenVarInArray {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };
		int num = 5;
		System.out.println("Array having 5 element size of the Array[] is :" + arr.length);
		boolean found = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				found = true;
				break;
			}
		}
		if (found)
			System.out.println("Yes");
		else {
			System.out.println("No");
		}
		System.out.println("*****************************");
		System.out.println();

		String strArr[] = { "kald", "Ram", "chennale" };
		String varToFind = "Ram";
		boolean findStr = false;

		for (int i = 0; i < strArr.length; i++) {
			if (String.valueOf(strArr[i]).equals(varToFind)) {
				findStr = true;
				break;
			}
		}
		if (findStr)
			System.out.println("Yes, string found");
		else {
			System.out.println("No, string not found");
		}
		System.out.println("*****************************");
		System.out.println();
		// 2nd way Check if an array contains given value using Stream

		int[] number = { 1, 2, 3, 4, 5 };
		int toFind = 7;

		boolean foundNumber = IntStream.of(number).anyMatch(n -> n == toFind);
		if (foundNumber)
			System.out.println(toFind + " is found.");
		else
			System.out.println(toFind + " is not found.");

		System.out.println("*****************************");
		System.out.println();
		// Check if an array contains a given value for non-primitive types

		String[] strings = { "One", "Two", "Three", "Four", "Five" };
		String toFindStr = "Four";

		boolean foundStr = Arrays.stream(strings).anyMatch(t -> t.equals(toFindStr));

		if (foundStr)
			System.out.println(toFindStr + " is found.");
		else
			System.out.println(toFindStr + " is not found.");
	}
}

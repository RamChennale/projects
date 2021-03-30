package com.java.string;

public class StringCaseConversion {
	public static void main(String[] args) {
		String inputString = "ram CHENNALE";
		System.out.println(inputString);
		System.out.println();
		System.out.println(changeStringCharactersCase(inputString));
	}

	public static String changeStringCharactersCase(String str) {
		char charArray[] = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] >= 65 && charArray[i] <= 90) {
				charArray[i] = (char) (charArray[i] + 32);
			} else if (charArray[i] >= 97 && charArray[i] <= 122) {
				charArray[i] = (char) (charArray[i] - 32);
			}
		}
		return new String(charArray);
	}
}

/*
 * ram CHENNALE
 * 
 * RAM chennale
 */

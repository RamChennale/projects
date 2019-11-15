package com.java.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharactersInString {
	public void countDuplicateChar(String str) {
		// Create a HashMap
		Map<Character, Integer> map = new HashMap<>();
		// Convert the String to char array
		char[] chars = str.toCharArray();
		/*
		 * logic: char are inserted as keys and their count as values. If map contains
		 * the char already then increase the value by 1
		 */
		for (Character character : chars) {
			if (map.containsKey(character)) {
				map.put(character, map.get(character) + 1);
			} else {
				map.put(character, 1);
			}
		}
		// Obtaining set of keys
		Set<Character> keys = map.keySet();
		/*
		 * Display count of chars if it is greater than 1. All duplicate chars would be
		 * having value greater than 1.
		 */
		for (Character ch : keys) {
			if (map.get(ch) > 1) {
				System.out.println("Char :" + ch + " " + map.get(ch));
			} else {
				System.out.println("char :" + ch + " " + map.get(ch));
			}
		}
	}

	public static void main(String[] args) {

		DuplicateCharactersInString duplicate = new DuplicateCharactersInString();
		duplicate.countDuplicateChar("Ram Chennale");
	}
}

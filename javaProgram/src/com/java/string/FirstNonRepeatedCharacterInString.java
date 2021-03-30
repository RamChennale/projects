package com.java.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacterInString {
	public static void main(String[] args) {
		String inputString = "this is it";
		System.out.println("The first non repeated character in inputString(" + inputString + ") is :  "+firstNonRepeatedCharacter(inputString));
	}
	
	public static Character firstNonRepeatedCharacter(String inputString) {
		Map<Character, Integer> map= new LinkedHashMap<Character,Integer>();
		char array[]=inputString.toCharArray();
		
		  for(Character ch1:array) {
			  if(map.containsKey(ch1)) {
				  map.put(ch1,  map.get(ch1)+1);
				  }else { 
					  map.put(ch1, 1); 
				 } 
			  }
		
		for(Character character:array) {
			if(map.get(character)==1)
				return character;
		}
		return null;
	}
}

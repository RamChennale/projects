package com.java.string;

public class PrintStringsUniqueCharacters {

	public static void uniqueCharacters(String test){
	    String temp = "";
	    for (int i = 0; i < test.length(); i++){
	        char current = test.charAt(i);
	        if (temp.indexOf(current) < 0){ // if (-1<0) true and (1<0) false
	            temp = temp + current;
	        } else {   
	            temp = temp.replace(String.valueOf(current), "");
	        }
	    }

	    System.out.println(temp + " ");

	}
	
	public static void main(String args[]) {
		PrintStringsUniqueCharacters.uniqueCharacters("maIma"); //I
	}
}


/*Logic-
 * First time a fresh character added into a "temp" string which on occurring
 * same character second time, the same character removed from same "temp"
 * string with "" empty in else block.
 */
/*
 * temp.indexOf(current) ->
 * 
 * @param ch a character (Unicode code point).
 * 
 * @return the index of the first occurrence of the character in the character
 * sequence represented by this object( i,e. in the range from 0 to 0xFFFF), or 
 * {@code -1} if the character does not occur (i,e. first time fresh all unique characters added as dose not exist in "temp" string).
 * 
 * Returns:the index of the first occurrence of the character in the character 
 * sequence represented by this object( i,e. in the range from 0 to 0xFFFF), or -1 if the character does not occur.
 */
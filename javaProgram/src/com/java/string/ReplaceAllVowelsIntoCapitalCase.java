package com.java.string;

public class ReplaceAllVowelsIntoCapitalCase {
	public static void main(String[] args) {
		String str="Ram Chennale aeiou";
		System.out.println(str);
		char charArray[]=str.toCharArray();
		for(int i=1;i<charArray.length;i++) {
			switch (charArray[i]) {
			case 'a':
				charArray[i]=(char)(charArray[i]-32);
				break;
			case 'e':
				charArray[i]=(char) (charArray[i]-32);
				break;
			case 'i':
				charArray[i]-=32;
				break;
			case 'o':
				charArray[i]=(char)(charArray[i]-32);
				break;
			case 'u':
				charArray[i]-=32;
				break;
			}
		}
		str= new String(charArray);
		System.out.println("After replacing all vowels into capital case = "+str);
	}
}

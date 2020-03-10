package com.java.string;

/*The string split() method breaks a given string around matches of the given regular expression.

For Example:

Input String: 016-78967
Regular Expression: - 
Output : {"016", "78967"}*/
public class SplitStringMethod {

	public static void main(String[] args) {

		String name = "Ram-chennale";
		String[] Arrname = name.split("-");
		System.out.println(Arrname[0] + " " + Arrname[1]);//Ram chennale
		System.out.println("==============================");
		
		
		String str = "GeeksforforGeeksfor   ";
		String[] arrOfStr = str.split("for");

		for (String a : arrOfStr) {
			System.out.println(a);
		}

	/*	Geeks

		Geeks*/
		System.out.println("==============================");
		 String str1 = "word1, word2 word3@word4?word5.word6"; 
	        String[] arrOfStr1 = str1.split("[, ?.@]+"); 
	  
	        for (String a : arrOfStr1) 
	            System.out.println(a); 
	 /*       word1
	        word2
	        word3
	        word4
	        word5
	        word6*/
		System.out.println("==============================");
	       String str2 = "Geekssss"; 
	        String[] arrOfStr2 = str1.split("s"); 
	  
	        for (String a : arrOfStr1) 
	            System.out.println(a); 
	        //Geek
		System.out.println("==============================");
	       String str3 = "GeeksforGeeks:A Computer Science Portal"; 
	        String[] arrOfStr3 = str3.split(":"); 
	  
	        for (String a : arrOfStr3) 
	            System.out.println(a); 
	         /*GeeksforGeeks
	         A Computer Science Portal*/
		System.out.println("==============================");
		 String str4 = "GeeksforGeeksforStudents"; 
	        String[] arrOfStr4 = str4.split("for"); 
	  
	        for (String a : arrOfStr4) 
	            System.out.println(a); 
	      /*  Geeks
	        Geeks
	        Students*/
		System.out.println("==============================");
		  String str5 = "Geeks for Geeks"; 
	        String[] arrOfStr5 = str5.split(" "); 
	  
	        for (String a : arrOfStr5) 
	            System.out.println(a);
	        
	       /* Geeks 
	        for 
	        Geeks*/
		System.out.println("==============================");

	}
}

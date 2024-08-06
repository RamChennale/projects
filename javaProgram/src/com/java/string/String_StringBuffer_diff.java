package com.java.string;

public class String_StringBuffer_diff {
	
	public static void main(String[] args) {
		
		String s1= "Ram";
		String s2 = "Ram";
		StringBuffer sb1 = new StringBuffer( "Ram") ;
		System.out.println("String s1 - "+s1 );
		System.out.println("String  s2 - "+s2 );
		System.out.println("StringBuffer sb1 - "+sb1 );
		System.out.println();
		System.out.println();
		
		if (s1.equals(s2)) {
			System.out.println(s1+"-  s1 the string is  EQAUL  s2 -   -- s1.equals(s2) -- "+s2);
		}
				
		if (s1.equals(sb1)) {
			System.out.println(s1+"-  s1 the string and  - StringBuffer are EQUAL sb1 -  "+s2);
		}else {
			System.out.println(s1+"-  s1  string is NOT   EQUAL  StringBuffer  sb1 --tried like--- s1.equals(sb1) ---  "+s2);
			System.out.println(" sb1.equals(sb1); " +  sb1.equals(sb1));
			System.out.println(" s1.equals(sb1); " +  s1.equals(sb1));
			System.out.println(" sb1.equals(s1); " +  sb1.equals(s1));
			
		}
	}

}

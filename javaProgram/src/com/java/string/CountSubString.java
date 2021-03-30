package com.java.string;

import java.awt.Font;

public class CountSubString {
	 static int countFreq(String pat, String txt) {         
	        int M = pat.length();         
	        int N = txt.length();         
	        int res = 0; 
	  
	        /* A loop to slide pat[] one by one */
	        for (int i = 0; i <= N - M; i++) { 
	            /* For current index i, check for  
	        pattern match */
	            int j;             
	            for (j = 0; j < M; j++) { 
	                if (txt.charAt(i + j) != pat.charAt(j)) { 
	                    break; 
	                } 
	            } 
	  
	            // if pat[0...M-1] = txt[i, i+1, ...i+M-1]  
	            if (j == M) {                 
	                res++;                 
	                j = 0;                 
	            }             
	        }         
	        return res;         
	    } 
	  
	    /* Driver program to test above function */
	    static public void main(String[] args) { 
	        String txt = "dhimanman";         
	        String pat = "man";         
	        System.out.println(countFreq(pat, txt));         
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

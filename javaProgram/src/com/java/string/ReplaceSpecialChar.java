package com.java.string;

public class ReplaceSpecialChar {
public static void main(String[] args) {
        
        String input="java$#$made$#$so$#$easy";
        //input="java$#$made$#$so$#$easy$";      //for testing
        //input="$java$#$made$#$so$#$easy$#";   //for testing
        //input="$#java$#$made$#$so$#$easy$#";  //for testing
        
        System.out.println("entered string = "+input);
        System.out.println("output string  = "+replaceSpecialChar(input));
        
 }

 /*
  * Method replaces '$#$' with space.
  */

 public static String replaceSpecialChar(String input) {
        char ch[]=input.toCharArray();
        int length=ch.length;
        
        for (int i = 0; i < length-2; i++) {
               if ( i+2<length && ch[i] == '$' && ch[i+1] =='#' && ch[i+2] == '$' ) {
                     ch[i]=' ';
                     int iRef=i+1;
                     while(iRef<length-2){
                            ch[iRef]=ch[iRef+2];
                            iRef++;
                     }
                     length-=2;
               }
        }
        
        char chNew[]=new char[length] ;
        for (int i = length - 1; i >= 0; i--) {
               chNew[i]=ch[i];
        }
        return(new String(chNew));
 }
}

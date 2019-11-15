package com.java.all;

import java.util.Scanner;

//Number is divisible by 1 or itself example : 0,1,2,3,5,7,11,13....
public class PrimeNum {
	
	public static boolean isPrime(int n) {
		for(int i=2; i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		
		System.out.println("Enter a num ?");
		Scanner scanner= new Scanner(System.in);
		int i= scanner.nextInt();
		System.out.println(isPrime(i)?+i+" is the prime num":+i+" is not prime num");
		
	}
	 
}
/*public static void main(String args[]){    
	  int i,m=0,flag=0;      
	  int n=2;//it is the number to be checked    
	  m=n/2;      
	  if(n==0||n==1){  
	   System.out.println(n+" is not prime number");      
	  }else{  
	   for(i=2;i<=m;i++){      
	    if(n%i==0){      
	     System.out.println(n+" is not prime number");      
	     flag=1;      
	     break;      
	    }      
	   }      
	   if(flag==0)  { System.out.println(n+" is prime number"); }  
	  }//end of else  
	}	
*/
package com.java.all;

import java.util.Scanner;

//Number is divisible by 1 or itself example : 0,1,2,3,5,7,11,13....
public class PrimeNum2 {
	
	public static boolean isPrimeNum(int n) {
		
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	 public static void main(String args[]){    

		 Scanner scanner=new Scanner(System.in);
		 System.out.println("Please enter number to check prime or not .");
		 int n=scanner.nextInt();
		 System.out.println("a?b:c => true?correct:wrong   OR   false?wrong:correct");
		 System.out.println(isPrimeNum(n)?+n+"is the prime number":+n+"is not a prime number");
	 }
}

	 

/*int i,m=0,flag=0;      
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
}*///end of else  

/*static void checkPrime(int n) {
	int flag = 0;
	if (n == 0 || n == 1) {
		System.out.println(n + " is not prime number");
	} else {
			if (n % 2 == 0) {
				System.out.println(n + " is not prime number");
				flag = 1;
			}
		if (flag == 0) {
			System.out.println(n + " is prime number");
		}
	} // end of else
}

public static void main(String args[]) {
	//checkPrime(1);
	//checkPrime(3);
	checkPrime(2);  //2, 3, 5, 7, 11, 13, 17..
	//checkPrime(20);
}*/
package com.java.all;

//Number is divisible by 1 or itself example : 0,1,2,3,5,7,11,13....
public class PrimeNum {
	
	 public static void main(String args[]){    
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

}


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
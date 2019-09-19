package com.java.all;
//0,1  0+1=1   1+1=2   2+1=3   2+3=5   3+5=8 .......
//0,1,1,2,3,5,8,13....

public class FibonacciSeries {

	public static void main(String[] args) {
		
		/*int a=0, b=1, n=10;
		int temp;
		System.out.print("Fibonacci series is : "+a+","+b+",");
		for(int i=0; i<=n; i++) {
			temp=a+b;
			a=b;
			b=temp;
			System.out.print(temp+ ",");
		}*/
		
		//0,1,1,2,3,5
		int a=0, b=1, temp;
		System.out.print("Fibonacci series is : "+a+","+b+",");
		for(int i=0; i<=6;i++) {
			temp=a+b;
			a=b;
			b=temp;
			System.out.print(temp+",");
		}
		System.out.println();
		System.out.println("Program exits()");
	}
	
	/*public static void main(String[] args) {
        
        int n=10;  //number of elements in series.
        generateFibonacciSeries(n);
 }
 
 public static void generateFibonacciSeries(int n){
        int first=0;  //first number of series
        int second=1; //second number of series
        int temp;
        
        System.out.print("FibonacciSeries: "+ first+" "+second+" ");
        for(int i=0;i<n;i++){
               temp=first+second;
               first=second;
               second=temp;            
               System.out.print(temp+" ");
        }
 }*/
	
	
}

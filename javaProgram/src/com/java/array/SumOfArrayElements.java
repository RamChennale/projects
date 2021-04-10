package com.java.array;

public class SumOfArrayElements {

	public static void main(String[] args) {
		int arr[]=new int[5];
		arr[0]=0;
		arr[1]=1;
		arr[2]=2;
		arr[3]=3;
		arr[4]=4;
		int sum=0;
		
		System.out.println("arr.length : "+arr.length);
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println("Sum of Array : "+sum);
	}
}

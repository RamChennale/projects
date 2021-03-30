package com.java.array;

public class FindMaxNumInArray {

	public static int findMax(int arr[]) {
		int max=arr[0];
		for(int i=0; i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}
	
	public static void main(String args[]) {
		int  arr[]= {14,23,23,11,36,87,2};
		//System.out.println(findMax(new int [] {14,23,23,11,36,87,2})); //works fine
		System.out.println(findMax(arr));
	}
}

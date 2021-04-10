package com.java.array;

import java.util.Scanner;

public class SortArrayAscendingOrd {

	public static void main(String[] args) {

		int n = 0;
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter num element to add into array: ");
		n=scanner.nextInt();
		int arr[]= {1,2,3,4,5,3,2,3,4,1};		
		for(int i=0;i<n;i++) {
			arr[i]=scanner.nextInt(i);
		}
		
		System.out.println("Array content : ");
		for(int i=0; i<arr.length;i++) {
			System.out.println(", "+arr[i]);
		}
	}
}

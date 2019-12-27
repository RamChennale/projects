package com.java.array;

public class AnonymousArray {

	public static void min(int arr[]) {
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		min(new int[]{1,2,3,4,5});//passing anonymous array to method  
	}
}

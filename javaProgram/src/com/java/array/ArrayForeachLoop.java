package com.java.array;

public class ArrayForeachLoop {

	public static void main(String[] args) {
		int a1[]= {1,2,3,4,5};
		int[] array1= {11,22,33,44,55};

		for(int i:a1) {
			System.out.println(a1[i]);
		}
		
		for(int j:array1) {
			System.out.println(array1[j]);
		}
	}
}

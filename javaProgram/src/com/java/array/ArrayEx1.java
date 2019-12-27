package com.java.array;

public class ArrayEx1 {

	public static void main(String[] args) {
		
		int a1[]= {1,1,1,1};
		int[] a2= {2,2,2,2};
		int a3[]= {3,3,3,3};
		
		for(int i=0;i<=a1.length;i++) {
			System.out.println(a1[i]);
		}
		
		
		int[] array1= new int[2];
		int []array2= new int[2];
		int array3[]=new int[2];
		
		array1[0]=1;
		array1[1]=2;
		array1[2]=3;
		System.out.println(array1.length);
		for(int i=0;i<=array1.length;i++) {
			System.out.println(array1[i]);
		}
	}
}

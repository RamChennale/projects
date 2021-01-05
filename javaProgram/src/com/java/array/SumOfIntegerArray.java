package com.java.array;


public class SumOfIntegerArray {

	public static int sum(int num[]) {
		int sum = 0;

		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}
		return sum;
	}

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30 };
		System.out.println("Array Length: "+arr.length);
		SumOfIntegerArray s = new SumOfIntegerArray();
		System.out.println(s.sum(arr));
	}

}

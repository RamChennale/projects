package com.java.array;

public class TestReturnArray {

	static int[] retArray() {
		return new int[] { 2, 2, 2, 2, 2 };
	}

	public static void main(String[] args) {
		int array1[] = retArray();
		for (int j : array1) {
			System.out.println(j);
		}
		for (int j = 0; j < array1.length; j++) {
			System.out.println(array1[j]);
		}
	}
}

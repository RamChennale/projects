package com.java.array;

public class PassingArrayInMethod {

	public static void min(int array[]) {
		int min = array[0];
		for (int i = 0; i <array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}
		System.out.println(min);
	}

	public static void minByForEach(int array[]) {
		int min = array[0];
		for (int j : array) {
			if (min > j)
				min = j;
		}
		System.out.println(min);
	}

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5 };
		int array1[] = new int[4];
		array1[0] = 11;
		array1[1] = 22;
		array1[2] = 33;
		array1[3] = 44;
		min(array);
		minByForEach(array1);
	}
}

package com.java.loops;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		int n = 10;
		while (n > 0) {
			list.add(n);
			n--;
		}
		System.out.println(list);
		System.out.println();
		for (int list1 : list) {
			System.out.print(list1);
		}
		System.out.println();
		System.out.println();
		int array[]= {1,2,3,4,5,6,10,6,7,8,9,9};
		System.out.print("[");
		for(int array1:array) {
			System.out.print(array1+",");
		}
		System.out.println("]");
		
		System.out.println();
		System.out.println();
		int x[][]= {{1,2,3},{4,5,6}};
		for(int[] x1:x) {
			for(int x2:x1) {
				System.out.println(x2);
			}
		}
	}
}

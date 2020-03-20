package com.java.loops;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class ForEachLoop {

	@Test(enabled=false)
	public  void forEachLoop() {

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
	
	@Test(enabled=true)
	public void forEachIncrement() {
		int num[]= {1,2,3,4,5,6,7,8,9,10};
		for(int i:num) { //it can  only iterate over an array or an instance of java.lang.Iterable
			System.out.println(i);
		}
	}
}

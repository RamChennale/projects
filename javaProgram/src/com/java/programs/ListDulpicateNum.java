package com.java.programs;

import java.util.ArrayList;
import java.util.List;

public class ListDulpicateNum {

	public static List<Integer> dulpicateNum(List<Integer> dList) {
		List<Integer> withoutDuplicate = new ArrayList<Integer>();
		for (int i : dList) {
			if (withoutDuplicate.contains(i)) {
				System.out.print(","+i);
			} else {
				withoutDuplicate.add(i);
			}
		}
		return withoutDuplicate;
	}

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i <= 10; i++) {
			list.add(i);
		}
		list.add(2);
		list.add(4);
		list.add(8);
		list.add(10);
		System.out.println(list);
		System.out.println(dulpicateNum(list));

	}
}

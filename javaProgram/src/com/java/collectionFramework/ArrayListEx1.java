package com.java.collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.Test;

public class ArrayListEx1 {

	@Test
	public void ArrayListMethod() {
		ArrayList<String> arrayListStr = new ArrayList<String>();
		List<Integer> arrayListInt = new ArrayList<Integer>();
		ArrayList<Character> arrayListChar = new ArrayList<Character>();

		arrayListStr.add("A");
		arrayListStr.add("B");
		arrayListStr.add("C");
		arrayListStr.add("A");
		System.out.println("Printing array list direclty");
		System.out.println(arrayListStr);
		arrayListInt.add(1);
		arrayListInt.add(2);
		arrayListInt.add(1);
		arrayListInt.add(1);
		System.out.println(arrayListInt);
		arrayListChar.add('r');
		arrayListChar.add('a');
		arrayListChar.add('r');
		arrayListChar.add('r');
		System.out.println(arrayListChar);
		System.out.println();
		System.out.println("Printing array list using while loop");
		Iterator<String> iterator = arrayListStr.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println();
		System.out.println("Printing array list using foreach loop");
		for (String str : arrayListStr) {
			System.out.println(str);
		}
	}
}

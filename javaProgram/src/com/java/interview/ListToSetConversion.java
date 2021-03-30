package com.java.interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListToSetConversion {

	public static void main(String args[]) {
		
		List<Integer> list1= new ArrayList();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(3);
		list1.add(2);
		list1.add(1);
		
		
		Set<Integer> set1= new HashSet<>();
		
		for(Integer list:list1) {
			System.out.println("Value from List: "+list);
			set1.add(list);
		}
		
		System.out.println("Converted HashSet :  ");
		
		for(Integer i:set1) {
			System.out.println("Value from Set: "+i);
		}
	}
}

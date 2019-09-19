package com.java.programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListDulpicateUsingSet {

	public static Set<Integer> findDuplicateList(List<Integer> dList){
		Set<Integer> setWithoutDup= new HashSet<Integer>();
		Set<Integer> set= new HashSet<Integer>();
		for(int i:dList) {
			if(!set.contains(i)) {
				setWithoutDup.add(i);
			}
		}
		return setWithoutDup;
	}
	
	public static void main(String[] args) {
		
		List<Integer>  list= new ArrayList<Integer>();
		for(int i=0;i<10; i++) {
			list.add(i);
		}
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);
		System.out.println(findDuplicateList(list));
	}
}

package com.java.collectionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.testng.annotations.Test;

public class FindDuplicate {

	@Test
	public void findDuplicate() {
		List<Integer> arrayListInt = new ArrayList<Integer>();
		arrayListInt.add(2);
		arrayListInt.add(1);
		arrayListInt.add(1);	
		arrayListInt.add(2);
		arrayListInt.add(1);
		arrayListInt.add(1);
		arrayListInt.add(2);
		arrayListInt.add(1);
		arrayListInt.add(1);
		System.out.println(arrayListInt);
		
		Set<Integer> set= new HashSet<>();
		for(int i=0;i<arrayListInt.size();i++) {
			set.add(arrayListInt.get(i));
		}
		
		System.out.println(set);
	}
}

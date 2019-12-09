package com.java.generics;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericArrayList {

	public static void main(String args[]) {

		ArrayList<String> stringArrayList = new ArrayList<String>();
		ArrayList<Integer> integersArrayList = new ArrayList<>();
		
		stringArrayList.add("a");
		stringArrayList.add("b");
		stringArrayList.add("a");
		//stringArrayList.add(1);//compile time error 
		String a=	(String) stringArrayList.get(0); // type casting is not required 
		System.out.println(a);
		
		
		integersArrayList.add(1);
		integersArrayList.add(2);
		integersArrayList.add(1);
		//integersArrayList.add("a")//compile time error 
		int i=(int)integersArrayList.get(0);//type casting is not required 
		System.out.println(i);
		
		Iterator<String>	iterator= stringArrayList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		
		Iterator<Integer> iterator2= integersArrayList.iterator();
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
		
	}
}

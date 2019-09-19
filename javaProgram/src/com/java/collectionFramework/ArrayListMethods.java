package com.java.collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.Test;
import collectionsExamples.ArrayListEx1;


public class ArrayListMethods {

	@Test
	public void method() {
		ArrayListEx1 arrayList= new ArrayListEx1();
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(1, 2);
		list.add(3);
		list.add(2);
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(0);
		list1.add(0);
		list.addAll(list1);
		
		System.out.println();
		System.out.println(list);
		System.out.println();
		
		System.out.println("list.contains(1): "+list.contains(1));
		System.out.println("list.contains(list1) : "+list.contains(list1));
		System.out.println("list.containsAll(list) : "+list.containsAll(list));	
		System.out.println("list.equals(\"1\") "+ list.equals("1"));
		System.out.println("list.indexOf(3) : "+list.indexOf(3));
		System.out.println("list.isEmpty() :  "+list.isEmpty());
		System.out.println("list.lastIndexOf(list) :  "+list.lastIndexOf(list));
		System.out.println("list.remove(\"3\") " + list.remove("3"));
		System.out.println("list.set(5, 55) " + list.set(5, 55));
		System.out.println("list.removeAll(list) : " + list.removeAll(list));
		System.out.println("list.retainAll(list1) : " + list.retainAll(list1));
		System.out.println(" list.size() : " +list.size());
		System.out.println("list.toString()  : " + list.toString());
		//System.out.println("list.get(0)  : "  +list.get(0));
		System.out.println("list.getClass() : " +list.getClass());
		System.out.println("list.iterator() : " + list.iterator());
		System.out.println("list.listIterator() : "+ list.listIterator());
		//System.out.println("list.remove(1) : " +list.remove(1));
		//System.out.println("list.subList(fromIndex, toIndex) : " + list.subList(0, 2));
		System.out.println("list.toArray() : "+ list.toArray());
		list.clear();
		
		Iterator<Integer> intlist=list.iterator();
		while(intlist.hasNext()){
			System.out.println(intlist.next());
		}
		
		/*System.out.println(list.get(0));
		System.out.println(list.contains(1));
		list.remove(0);
		list.remove("3");
		System.out.println("After removing items : "+list);
		list.clear();
		System.out.println("All list element after removing : "+list);*/
	}
}

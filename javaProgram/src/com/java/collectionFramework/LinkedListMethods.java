package com.java.collectionFramework;

import java.util.LinkedList;
import java.util.List;

import org.testng.annotations.Test;

public class LinkedListMethods {

	@Test
	public void method() {
		LinkedList<Integer> ll= new LinkedList<Integer>();
		List<Integer> ll1= new LinkedList<Integer>();
		for(int i=0;i<10;i++) {
			ll.add(i);
		}
		ll.add(10, 100);
		System.out.println(ll.addAll(ll1));
		System.out.println(ll.addAll(11, ll1));
		ll.addFirst(1);
		ll.addLast(1111);
		System.out.println(ll.clone());
		System.out.println(ll.contains(0));
		System.out.println("  : "+ll.get(1));
		System.out.println("  : "+ll.lastIndexOf(0));
		System.out.println("  : "+ll.lastIndexOf(ll1));
		System.out.println("  : "+ll.size());
		System.out.println("  : "+ll.getFirst());
		System.out.println("  : "+ll.getLast());
		System.out.println("  : "+ll.peek());
		ll.clear();
	}
}

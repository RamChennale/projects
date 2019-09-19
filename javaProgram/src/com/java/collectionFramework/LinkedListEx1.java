package com.java.collectionFramework;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.testng.annotations.Test;

public class LinkedListEx1 {

	@Test	
	public void method(){
		LinkedList<Integer> linkedList= new LinkedList<Integer>();
		List<String> strlinklist= new LinkedList<String>();
		Deque<Integer> deque= new LinkedList<Integer>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(1);
		linkedList.add(3);
		strlinklist.add("RAM");
		strlinklist.add("ram");
		strlinklist.add("RAM");
		strlinklist.add("chennale");
		for(int i=0; i<=10;i++) {
			deque.add(i);
		}
		deque.add(1);
		deque.add(5);
		
		Iterator<Integer> i= linkedList.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println();
		for(String str :strlinklist) {
			System.out.println(str);
		}
		System.out.println();
		int listSize=deque.size();
		System.out.println("deque size : "+listSize);
		System.out.println(deque);
		
	}
}

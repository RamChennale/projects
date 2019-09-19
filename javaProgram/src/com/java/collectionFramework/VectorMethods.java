package com.java.collectionFramework;

import java.util.List;
import java.util.Vector;

import org.testng.annotations.Test;

public class VectorMethods {

	@Test
	public void name() {
		Vector<Integer> vList1=new Vector<Integer>();
		for(int i=20;i<=25;i++) {
			vList1.add(i);
		}
		List<Integer> vList= new Vector<Integer>();
		int i=0;
		while(i<10) {
			vList.add(i);
			i++;
		}
		System.out.println(vList);
		System.out.println();
		System.out.println("vList.indexOf(5)  : "+vList.indexOf(5));
		System.out.println(vList);
		System.out.println();
		System.out.println("vList.lastIndexOf(4)  : "+vList.lastIndexOf(4));
		System.out.println(vList);
		System.out.println();
		System.out.println("vList.size()  : "+vList.size());
		System.out.println(vList);
		System.out.println();
		System.out.println("vList.get(0)  : "+vList.get(0));
		System.out.println(vList);
		System.out.println();
		System.out.println("vList.remove(3)  : "+vList.remove(3));
		System.out.println(vList);
		System.out.println();
		System.out.println("vList.set(5, 55)  : "+vList.set(5, 55));
		System.out.println(vList);
		System.out.println();
		System.out.println("vList.add(10101)  : "+vList.add(10101));
		System.out.println(vList);
		System.out.println();
		System.out.println("vList.addAll(vList1)  : "+vList.addAll(vList1));
		System.out.println(vList);
		System.out.println();
		System.out.println("vList.addAll(9, vList1)  : "+vList.addAll(9, vList1));
		System.out.println(vList);
		System.out.println();
		System.out.println("vList.contains(2)  : "+vList.contains(2));
		System.out.println(vList);
		System.out.println();
		System.out.println("vList.containsAll(vList1)  : "+vList.containsAll(vList1));
		System.out.println(vList);
		System.out.println();
		System.out.println("vList.equals(vList)  : "+vList.equals(vList));
		System.out.println(vList);
		System.out.println();
		System.out.println("vList.getClass()  : "+vList.getClass());
		System.out.println(vList);
		System.out.println();
		System.out.println("vList.isEmpty()  : "+vList.isEmpty());
		System.out.println(vList);
		System.out.println();
		System.out.println("vList.iterator()  : "+vList.iterator());
		System.out.println(vList);
		System.out.println();
		System.out.println("vList.listIterator()  : "+vList.listIterator());
		System.out.println(vList);
		System.out.println();
		System.out.println("vList.remove(vList1)  : "+vList.remove(vList1));
		System.out.println(vList);
		System.out.println();
		System.out.println("vList.subList(0, 4)  : "+vList.subList(0, 4));
		System.out.println(vList);
		System.out.println();
		System.out.println("vList.toArray()  : "+vList.toArray());
		System.out.println(vList);
		System.out.println();
		System.out.println("vList.removeAll(vList1)  : "+vList.removeAll(vList1));
		System.out.println(vList);
		System.out.println();
		vList.clear();
		System.out.println(vList);
		System.out.println();
	}
}

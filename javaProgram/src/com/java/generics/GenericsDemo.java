package com.java.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo {

	public static void main(String args[]) {

		List list = new ArrayList();
		list.add(10);
		list.add("10");
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(10);
		// list1.add("10");// compile-time error

		List list11 = new ArrayList();
		list11.add("hello");
		String s = (String) list11.get(0);// type casting not required
		List<String> list111 = new ArrayList<String>();
		list111.add("hello");
		String s1 = list111.get(0);
		List<String> list1111 = new ArrayList<String>();
		list1111.add("hello");
		// list1111.add(32);//Compile Time Error

	}

}
/*
 * The Java Generics programming is introduced to deal with type-safe objects.
 * It makes the code stable by detecting the bugs at compile time. Before
 * generics, we can store any type of objects in the collection, i.e.,
 * non-generic. Now generics force the java programmer to store a specific type
 * of objects. 
 * Syntax to use generic collection 1. ClassOrInterface<Type>
 * 
 * Example to use Generics in java 1. ArrayList<String>
 * 
 * Advantage of Java Generics
 * 
 * 1) Type-safety: We can hold only a single type of objects in generics. It
 * doesn?t allow to store other objects.
 * 
 * 2) Type casting is not required: There is no need to typecast the object.
 * Before Generics, we need to type cast.
 * 
 * 3) Compile-Time Checking: It is checked at compile time so problem will not
 * occur at runtime. The good programming strategy says it is far better to
 * handle the problem at compile time than runtime.
 */

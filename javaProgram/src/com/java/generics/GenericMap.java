package com.java.generics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class GenericMap {

	public static void main(String args[]) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "a");
		map.put(1, "a");
		map.put(2, "b");

		// Now use Map.Entry for Set and Iterator
		Set<Entry<Integer, String>> set = map.entrySet();

		Iterator<Entry<Integer, String>> iterator = set.iterator();
		while (iterator.hasNext()) {
			Entry<Integer, String> ent = iterator.next();
			System.out.println(ent.getKey() + " and " + ent.getValue());
		}

		System.out.println("=========================");
		
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "vijay");
		map1.put(4, "umesh");
		map1.put(2, "ankit");

		// Now use Map.Entry for Set and Iterator
		Set<Map.Entry<Integer, String>> set1 = map.entrySet();

		Iterator<Map.Entry<Integer, String>> itr1 = set1.iterator();
		while (itr1.hasNext()) {
			Map.Entry<Integer, String> e = itr1.next();// no need to typecast
			System.out.println(e.getKey() + " " + e.getValue());
		}

	}
}

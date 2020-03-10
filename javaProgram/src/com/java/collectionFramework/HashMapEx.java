package com.java.collectionFramework;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class HashMapEx {

	@Test
	public void hashMapEx() {
		Map<Integer, String> map= new HashMap<Integer, String>();
		map.put(1, "AA");
		map.put(1, "AA");
		map.put(2, "BB");
		map.put(null, "null");
		map.put(null, "null");
		System.out.println(map);
	}
}

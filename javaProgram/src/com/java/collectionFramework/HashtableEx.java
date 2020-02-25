package com.java.collectionFramework;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.testng.annotations.Test;

public class HashtableEx {

	@Test(enabled=false)
	public void hashTableDemo() {
		Map<String, String> map= new Hashtable<>();
		map.put("a", "Ram");
		map.put("a", "Ram");
		map.put("b", "RamB");
		map.put("c", "RamC");
		//Set<Entry<String, String>> set= map.entrySet();
		System.out.println("Hashtable: "+map);
		System.out.println();
		Set<Map.Entry<String, String>> set=	map.entrySet();
		System.out.println(set);
	}
	
	
	@Test(enabled=false)
	public void getKeyshashTable() {
		Map<String, String> hashtable= new Hashtable<>();
		hashtable.put("a", "Ram");
		hashtable.put("a", "Ram");
		hashtable.put("b", "RamB");
		hashtable.put("c", "RamC");
		
		Set<String> keys=	hashtable.keySet();
		System.out.println("Keys: "+keys);
	}
	
	@Test(enabled=true)
	public void getValuesHashTable() {
		Map<Integer, String> hashtable= new Hashtable<>();
		hashtable.put(1, "Ram");
		hashtable.put(1, "Ram");
		hashtable.put(2, "RamB");
		hashtable.put(3, "RamC");
		
		System.out.println(hashtable.values());
		Set<Entry<Integer,String>> set=	hashtable.entrySet();
	}
	
	@Test(enabled=false)// not working
	public void hashTableEnumeration() {
		Map<String, String> hashtable= new Hashtable<>();
		hashtable.put("a", "Ram");
		hashtable.put("a", "Ram");
		hashtable.put("b", "RamB");
		hashtable.put("c", "RamC");
		//Set<Entry<String, String>> set= map.entrySet();
		Enumeration e= (Enumeration) hashtable.keySet();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}
}

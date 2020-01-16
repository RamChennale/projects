package com.java.collectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Vector;
import java.util.function.Consumer;

import org.testng.annotations.Test;

public class ColleEx1 {

	@Test(enabled=false)
	public void collectionClassesInterfaces() {
		List<Integer> list;
		Set<Integer> set;
		Queue<Integer> queue;
		
		Map<Integer, String> map;
		Vector<Integer> vector;
		
	}
	
	@Test(enabled=false)
	public void collectionMethods() {
		Collection collection = null;
		Iterator iterator;
		String name = "name";
		boolean status;
		int size;
		Consumer action = null;

		status = collection.add(name);
		status = collection.addAll(collection);
		collection.clear();
		status = collection.contains(name);
		status = collection.containsAll(collection);
		status = collection.equals(collection);
		collection.forEach(action);
		status = collection.isEmpty();
		status = collection.remove(name);
		status = collection.removeAll(collection);
		size = collection.size();
		Object[] array = collection.toArray();
		status = collection.retainAll(collection);
		collection.spliterator();
		iterator = collection.iterator();

		status = iterator.hasNext();
		collection = (Collection) iterator.next();
		iterator.remove();
	}

	@Test(enabled=true)
	public void listTypes() {
		List<Integer> arrayList= new ArrayList<>();
		arrayList.add(1);
		arrayList.add(1);
		arrayList.add(1);
		
		Iterator<Integer> iterator= arrayList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}

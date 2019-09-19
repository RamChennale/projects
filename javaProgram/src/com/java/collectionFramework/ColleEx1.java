package com.java.collectionFramework;

import java.util.Iterator;

public class ColleEx1 {

		
}

interface Collection<E> extends Iterable<E>{
	int size();
	boolean isEmpty();
	boolean contains(Object parObj);
	Iterator<E> iterator();
	Object[] toArray();
	boolean add(E paramE);
	boolean remove(Object paramObj);
	//boolean ContainAll(Collections<?> paramCollection);
	
}
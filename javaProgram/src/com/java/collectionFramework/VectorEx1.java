package com.java.collectionFramework;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import org.testng.annotations.Test;

public class VectorEx1 {

	@Test
	public void name() {
		Vector<Integer> vector= new Vector<Integer>();
		List<Integer> veIntegers= new Vector<>();
		for(int i=0; i<10;i++) {
			vector.add(i);
		}
		System.out.println();
		System.out.println(vector);
		Iterator<Integer> vi=vector.iterator();
		while(vi.hasNext()) {
			System.out.println(vi.next());
		}
				
		int vsize= vector.size();
		for(int i=0;i<vsize;i++) {
			System.out.print(","+vector.get(i));
		}
	}
}

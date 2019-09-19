package com.java.oopsPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrintLog {

	public static void main(String[] args) {
		
		/*List<String> lst= new ArrayList<String>();
		List<String> as = new ArrayList<String>();
		lst.add("ram");
		lst.add("ram1");
		lst.add("ram3");
		lst.add("ram4");
		lst.add("ram5");
		lst.add("ram6");
		System.out.println(lst);
		Iterator<String> it = lst.iterator();
		while (it.hasNext()) {
			String string = (String) it.next();
			System.out.println(as.add(string));;
			
		}*/
		
		
		List<String> myList = new ArrayList<String>();
		  List<String> meterList = new ArrayList<String>();

		  myList.add("1");
		  myList.add("2");
		  myList.add("3");
		  myList.add("4");
		  myList.add("5");

		  Iterator<String> it = myList.iterator();
		  while (it.hasNext()) {
		   String value = it.next();
		   meterList.add(value);
		   System.out.println(meterList);
		   
		  }
				
	}
}

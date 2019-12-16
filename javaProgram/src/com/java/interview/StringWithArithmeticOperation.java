package com.java.interview;

import org.testng.annotations.Test;

public class StringWithArithmeticOperation {

	@Test
	public  void stringWithAddition() {
		System.out.println(10+20+"rrr");//30rrr
		System.out.println("ram"+20+10);//ram2010
		
		System.out.println();
		System.out.println(10*20+"ram");//200ram
		System.out.println("ram"+10*20);//ram200
	}
}

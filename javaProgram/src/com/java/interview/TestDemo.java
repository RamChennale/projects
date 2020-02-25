package com.java.interview;

import org.testng.annotations.Test;

public class TestDemo {

	@Test(enabled=false)
	public void test() {
		for(int i=4; i>=1;i--) {
			System.out.print(i);
		}
		System.out.println();
		for(int i=3; i>=1;i--) {
			System.out.print(i);
		}
		System.out.println();
		for(int i=2; i>=1;i--) {
			System.out.print(i);
		}
		System.out.println();
		for(int i=1; i>=1;i--) {
			System.out.print(i);
		}
		System.out.println();
	}
	
	@Test
	public void test1() {
	
		char last = 'E', alphabet = 'A';
		for (int j = 1; j <= (last - 'A' + 1); ++j) {
			System.out.print(alphabet + " ");
		}
		++alphabet;
		
	}
}

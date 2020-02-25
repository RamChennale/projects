package com.qa.PyramidandPattern;

import org.testng.annotations.Test;

public class HalfPyramidTriangleDupNum {

	int rows=5;
	@Test
	public void halfPyramidTriangleDupNum() {
		for(int i=1; i<=rows;i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}

package com.qa.PyramidandPattern;

import org.testng.annotations.Test;

public class HalfPyramidTriangleIncNum {

	int rows=5;
	@Test
	public void halfPyramidTriangleIncNum() {
		for (int i = 1; i <= rows; i++) {
			for(int j=1; j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}

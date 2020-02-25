package com.qa.PyramidandPattern;

import org.testng.annotations.Test;

public class HalfRevNumPyramidTriangle {

	int rows=5;
	public void halfRevNumPyramidTriangle() {
		for(int i=rows;i<=1;i--) {
			for(int j=i;j>=1;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	@Test(enabled=true)
	public void halfRevNumPyramidTriangle1() {

		int rows = 1;
		for (int i = 5; i >= rows; --i) {
			for (int j = i; j >= 1; --j) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}

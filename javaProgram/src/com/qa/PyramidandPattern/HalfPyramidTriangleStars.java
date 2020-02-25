package com.qa.PyramidandPattern;

import org.testng.annotations.Test;

public class HalfPyramidTriangleStars {

	@Test(enabled=true)
	public void halfTriangle() {

		int rows = 5;
		for (int i = 1; i <= rows; ++i) {
			for (int j = 1; j <= i; ++j) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

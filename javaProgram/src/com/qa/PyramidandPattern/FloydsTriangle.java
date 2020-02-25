package com.qa.PyramidandPattern;

import org.testng.annotations.Test;

public class FloydsTriangle {

	@Test
	public void floydsTriangle() {
		int rows=5, number=1;
		for (int i = 1; i <=rows; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(number+" ");
				number++;
			}
			System.out.println();
		}
	}
}

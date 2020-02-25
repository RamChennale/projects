package com.qa.PyramidandPattern;

import org.testng.annotations.Test;

public class HalfPyramidAlphabets {

	@Test
	public void halfPyramidAlphabets() {
		char last = 'E', alphabet = 'A';
		for (int i = 1; i <= (last - 'A' + 1); ++i) {
			for (int j = 1; j <= i; ++j) {
				System.out.print(alphabet + " ");
			}
			++alphabet;
			System.out.println();
		}
	}
}

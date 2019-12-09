package com.java.oopsPrograms;

public class OverloadingInJava {

	int a, b, c;

	public int add(int a, int b) {
		return a + b;
	}

	public int add(int a, int b, int c) {
		return a + b + c;
	}

	OverloadingInJava() {
	}

	OverloadingInJava(int a, int b) {
		System.out.println(a + b);
	}

	public OverloadingInJava(int i, int j, int k) {
		System.out.println(i + j + k);
	}

	public static void main(String[] args) {

		OverloadingInJava overloadingInJava = new OverloadingInJava();
		OverloadingInJava overloadingInJava1 = new OverloadingInJava(4, 6);
		OverloadingInJava over1 = new OverloadingInJava(11, 22, 33);
		over1.add(1, 2, 3);
	}
}

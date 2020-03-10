package com.java.viredra;

class X {
	static int x = 1234;

	static class Y {
		static int y = x++; //if ++x then 1235

		static class Z {
			static int z = y++; //if ++y then 1236
		}
	}
}

public class MainClass {
	public static void main(String[] args) {
		System.out.println(X.x);// 1234
		System.out.println(X.Y.y);// 1234
		System.out.println(X.Y.Z.z);// 1234
	}
}
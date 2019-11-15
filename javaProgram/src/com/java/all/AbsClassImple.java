package com.java.all;

public class AbsClassImple extends AbsClass implements InterfaceInJava {

	public int sub(int a, int b) {
		int sub = a - b;
		System.out.println("Abstract class method implemented in class which is extended a abstract class " + sub);
		return sub;
	}

	@Override
	public int add(int a, int b, int c) {
		return a + b + c;
	}

	public static void main(String[] args) {
		AbsClassImple absClass0 = new AbsClassImple();
		absClass0.sub(20, 10);
		absClass0.add(2, 3);
		AbsClass absClass2 = new AbsClassImple();
		absClass2.add(11, 11);
		absClass2.add(1, 1, 1);
		((AbsClassImple) absClass2).sub(32, 3);
		
		AbsClass absClass3 = new AbsClass() {
			public int add(int a, int b, int c) {
				return 0;
			}
		};
		absClass3.add(1, 1);
		absClass3.add(1, 1, 1);
	}

	@Override
	public void baseIterface() {

	}

	@Override
	public void closeBrowser() {
		// TODO Auto-generated method stub

	}
}

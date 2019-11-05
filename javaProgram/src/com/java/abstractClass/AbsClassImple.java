package com.java.abstractClass;

public class AbsClassImple extends AbsClass {

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
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public void closeBrowser() {
				// TODO Auto-generated method stub

			}

			@Override
			public void baseInterface() {
				// TODO Auto-generated method stub

			}
		};
		absClass3.add(1, 1);
	}

	@Override
	public void closeBrowser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void baseInterface() {
		// TODO Auto-generated method stub
		
	}

}

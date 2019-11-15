package com.java.all;

public abstract class AbsClass {

	public int add(int a, int b) {
		return a + b;
	}
	public abstract int add(int a, int b, int c);
	
	public static void main(String[] args) {
		AbsClass annonymousInnerClassObj= new AbsClass() {
			@Override
			public int add(int a, int b, int c) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
		annonymousInnerClassObj.add(1, 2);
		annonymousInnerClassObj.add(1, 2, 2);
	}
}

/*public abstract class AbsClass {

	public int add(int a, int b) {
		a=a+b;
		System.out.println("a= a+b in abstract class :"+ a);
		return a;
	}
	
	public abstract int sub(int a, int b);
}
*/

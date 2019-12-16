package com.java.abstractClass;
//public abstract final class AbsClass implements InterfaceInJava //The class AbsClass can be either abstract or final, not both
public abstract class AbsClass implements InterfaceInJava {

	public int add(int a, int b) {
		System.out.println(a + b);
		return a + b;
	}

	public abstract int add(int a, int b, int c);

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

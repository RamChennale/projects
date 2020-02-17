package com.java.viredra;

public class TestOverride {

	void m1() {
		System.out.println("From m1");
	}

	void m2() {
		System.out.println("From m2");
	}

	private void m3() {
		System.out.println("From m3");
	}
}
/*How to override / overload from above code?
public class Test{
void m1(){
System.out.println("From m1");
}void m2 ()
{System.out.println("From m2");
}static void m2 ()
{ System.out.println("inside static");
m1 ();
}private void m3()
{System.out.println("From m3");
}}*/
package com.java.all;

public interface InterfaceInJava {

	int MAX_MARKS=100;
	public void closeBrowser();
	
	public static final float PI_VALUE = 3.14f;
	public abstract void baseIterface();
	public default void defaultMethod() {
		System.out.println(" Method( with default sepecifire can be defined)");
	}
}

/*The Java compiler adds public and abstract keywords before the interface method. Moreover, it adds 
 * public, static final keywords before data members.*/

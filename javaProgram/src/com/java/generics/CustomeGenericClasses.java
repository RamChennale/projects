package com.java.generics;

import org.testng.annotations.Test;

class Container<T>{
	T var;
	public T getVar() {
		return var;
	}
	public void setVar(T var) {
		this.var = var;
	}
	
	public void show() {
		System.out.println(var.getClass().getName());
	}
}

public class CustomeGenericClasses {

	@Test
	public void CustomeGenericClass() {
		Container container= new Container();
		container.var=10;
		container.show();
	}
	
	@Test
	public void GenericClassWorksWith_onlyWrapperClasses() {
		Container container= new Container();
		container.var=10;
		container.show();
	}
}

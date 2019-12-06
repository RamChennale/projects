package com.java.looseCoupling;

public class Car implements Vehicle{

	@Override
	public void start() {
		System.out.println("car started");
	}

}

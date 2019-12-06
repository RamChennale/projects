package com.java.looseCoupling;

public class Journey {

	public static void main(String[] args) {
		Vehicle vc = new Car();
		vc.start();
		Vehicle vb = new Bike();
		vb.start();

	}
}
/*
 * Journey and Car objects are loosely coupled. It means Vehicle is an interface
 * and we can inject any of the implemented classes at run time and we can
 * provide service to the end user.
 */
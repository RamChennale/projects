package com.java.tightCoupling;

public class Journey {
	Car car = new Car();

	public void startJourney() {
		car.travel();
	}
}

/*
 * In the above code the Journey class is dependents on Car class to provide
 * service to the end user(main class to call this Journey class). In the above
 * case Journey class is tightly coupled with Car class it means if any change
 * in the Car class requires Journey class to change
 */
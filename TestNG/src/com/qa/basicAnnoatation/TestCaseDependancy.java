package com.qa.basicAnnoatation;

import org.testng.annotations.Test;

public class TestCaseDependancy {

	@Test
	public void startApp() {
		System.out.println("Application started");
	}

	@Test(dependsOnMethods = "startApp")
	public void login() {
		System.out.println("User logged in app");
	}

	@Test(dependsOnMethods = "{startApp,login}")
	public void logout() {
		System.out.println("User logged out");
	}
}

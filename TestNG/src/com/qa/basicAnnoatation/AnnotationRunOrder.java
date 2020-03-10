package com.qa.basicAnnoatation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationRunOrder {

	 /*OUTPUT
	 @BeforeSuite
	 @BeforeTest
	 @BeforeClass
	 
	 @BeforeMethod
	 test()@Test
	 @AfterMethod
	 
	 @BeforeMethod
	 testPriority()@Test(priority = -1, dependsOnMethods = "test"
	 @AfterMethod
	 
	 @AfterClass
	 @AfterTest
	 @AfterSuite
	 
	 PASSED: test
	 PASSED: testPriority*/
	@Test
	public void test() {
System.out.println("test()");
	}

	@Test(priority = -1, dependsOnMethods = "test")
	public void testPriority() {
		System.out.println("testPriority() @Test(priority = -1, dependsOnMethods = \"test\"");
	}
	@BeforeSuite
	public void beforeSuite() {
		System.out.println(" @BeforeSuite annotated method will be run before all tests in this suite have run.");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("@AfterSuite annotated method will be run after all tests in this suite have run");
	}

	@BeforeClass
	public void beforClass() {
		System.out.println("@BeforeClass annotated method will be run before the first test method in the current class is invoked.");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("@AfterClass annotated method will be run after all the test methods in the current class have been run.");
	}

	@BeforeGroups
	public void beforeGroups() {
		System.out.println("@BeforeGroups The list of groups that this configuration method will run before. This method is guaranteed to run shortly before the first test method that belongs to any of these groups is invoked.");
	}

	@AfterGroups
	public void afterGroups() {
		System.out.println("@AfterGroups The list of groups that this configuration method will run after. This method is guaranteed to run shortly after the last test method that belongs to any of these groups is invoked.");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("@BeforeMethod annotated method will be run before each test method.");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("@AfterMethod annotated method will be run after each test method.");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("@BeforeTest annotated method will be run before any test method belonging to the classes inside the <test> tag is run");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("@AfterTest annotated method will be run after all the test methods belonging to the classes inside the <test> tag have run");
	}


}

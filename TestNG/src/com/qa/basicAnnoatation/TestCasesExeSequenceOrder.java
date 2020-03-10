package com.qa.basicAnnoatation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCasesExeSequenceOrder {

/*	
    beforeSuite			-1
	beforeTest			-2
	beforeClass			-3
	beforeMethod		-4
	FirstTestCasesExe	-5	(456, 456, ....)
	afterMethod			-6
	afterClass			-7
	afterTest			-8
	afterSuite			-9
	*/
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("beforeSuite");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod");
	}
	
	@Test
	public void FirstTestCasesExe() {
		System.out.println("FirstTestCasesExe");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("afterClass");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("afterTest");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("afterSuite");
	}

}

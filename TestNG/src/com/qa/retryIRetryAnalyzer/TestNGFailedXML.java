package com.qa.retryIRetryAnalyzer;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
//Only one testCase will considered while retrying on failure of that test case.
public class TestNGFailedXML {
	
	public static SoftAssert softAssert;
	
	@Test(priority=0, retryAnalyzer=RetryAnalyzer.class)
	public void test() {
		softAssert= new SoftAssert();
		System.out.println("test() started.");
		Assert.assertEquals(10, 11);
		System.out.println("test() completed.");
		softAssert.assertAll();
	}
	@Test(priority=1,retryAnalyzer=RetryAnalyzer.class)
	public void test1() {
		softAssert= new SoftAssert();
		System.out.println("test1() started.");
		softAssert.assertEquals("Ram", "Ram","Assertion failed Ram not found.");
		System.out.println("test1() completed.");
		softAssert.assertAll();
	}
	@Test(priority=2,retryAnalyzer=RetryAnalyzer.class)
	public void test2() {
		softAssert= new SoftAssert();
		System.out.println("test()2 started.");
		Assert.assertEquals(10, 11);
		System.out.println("test()2 completed.");
		softAssert.assertAll();
	}
	@Test(priority=3,retryAnalyzer=RetryAnalyzer.class)
	public void test3() {
		softAssert= new SoftAssert();
		System.out.println("test()3 started.");
		softAssert.assertEquals("Ram", "ram","Assertion failed Ram not found.");
		System.out.println("test()3 completed.");
		softAssert.assertAll();
	}
	@Test(priority=4, testName="TestCaseWithPriority4",retryAnalyzer=RetryAnalyzer.class)
	public void test4() {
		System.out.println("test()4 started.");
		Assert.assertEquals(10, 11);
		System.out.println("test()4 completed.");
	}
	

	@Test(priority=5,retryAnalyzer=RetryAnalyzer.class)
	public void softAsset() {
		softAssert= new SoftAssert();
		System.out.println("softAsset() started ");
		softAssert.assertEquals(10, 20);
		System.out.println("softAsset completed : this line executed even after failure of assertion.");
		softAssert.assertAll(); // It is mandatory to call assertAll() method for applying Soft assert to a method
	}

	@Test(priority=6,retryAnalyzer=RetryAnalyzer.class)
	public void hardAsset() {
		System.out.println("hardAsset() started");
		Assert.assertEquals(1, 11);
		System.out.println("hardAsset() completed");//Will not execute this line
		
	}
}

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
import org.testng.annotations.DataProvider;
import org.testng.annotations.ExpectedExceptions;
import org.testng.annotations.Factory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.TestInstance;

import com.qa.testNGListerner.TestNGListener;

@SuppressWarnings({ "deprecation", "unused" })
@Listeners(TestNGListener.class)
public class BasicTestNGAnnotations {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println(" @BeforeSuite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("@AfterSuite");
	}

	@BeforeClass
	public void beforClass() {
		System.out.println("@BeforeClass");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("@AfterClass)");
	}

	@BeforeGroups
	public void beforeGroups() {
		System.out.println("@BeforeGroups");
	}

	@AfterGroups
	public void afterGroups() {
		System.out.println("@AfterGroups");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("@BeforeMethod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("@AfterMethod");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("@BeforeTest");
	}

	@Test(priority = -1, dependsOnMethods = "test")
	public void testPriority() {
		System.out.println("@Test(priority = -1, dependsOnMethods = \"test\"");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("@AfterTest");
	}

	@DataProvider
	public void dataDrivenTestDataProvider() {
		System.out.println("@DataProvider");
	}

	/*
	 * @TestInstance public void testInstance() {
	 * 
	 * }
	 */
	@ExpectedExceptions(value = {})
	public void expectedExceptions() {
		System.out.println("@ExpectedExceptions(value = {})");
	}

	@Factory
	public BasicTestNGAnnotations factoryAnnoReturnsOBJECT() {
		System.out.println("@Factory");
		System.out.println("factoryAnno Returns OBJECT ");
		System.out.println(
				"Marks a method as a factory that returns objects that will be used by TestNG as Test classes. The method must return Object[].\r\n"
						+ "");
		return null;

	}

	@Parameters
	public void parameters() {
		System.out.println("@Parameters");
	}

	@Test
	public void test() {

	}

}

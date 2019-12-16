package com.qa.assertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftHardAssertion {

	@Test(priority=1)
	public void softAsset() {
		System.out.println("softAsset() started ");
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(10, 20);
		System.out.println("actual"+ "expected"+"message");//Will execute this line below all throws error at the end
		System.out.println("softAsset completed ");
		softAssert.assertAll(); // It is mandatory to call assertAll() method for applying Soft assert to a method
	}

	@Test(priority=2)
	public void hardAsset() {
		System.out.println("hardAsset() started");
		Assert.assertEquals(1, 11);
		System.out.println("hardAsset() completed");//Will not execute this line
	}
}

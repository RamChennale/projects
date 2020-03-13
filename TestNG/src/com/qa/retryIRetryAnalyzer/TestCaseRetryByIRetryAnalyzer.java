package com.qa.retryIRetryAnalyzer;

/*Retry at test level need to provide 'retryAnalyzer = RetryAnalyzer.class' for each test case*/
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCaseRetryByIRetryAnalyzer {

	public static SoftAssert softAssert;

	// Retry at test level
	@Test(priority = 0, retryAnalyzer = RetryAnalyzer.class)
	public void testRetry() {
		softAssert = new SoftAssert();
		System.out.println("test() started.");
		Assert.assertEquals(10, 11);
		System.out.println("test() completed.");
		softAssert.assertAll();
	}

}
/*
 * There are multiple reasons why the test fails.
 * 
 * Due to the network issue. Due to application down time. Due to loading issue
 * and etc. Random browser issues or browser becoming unresponsive Random
 * machine issues Server issues like unexpected delay in the response from
 * sserver
 */
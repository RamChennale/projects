package com.qa.retryFailedTCUsingListener;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCaseRetryByListerner {

	@Test
	public void Test1ByListerner() {
		System.out.println("Test1ByListerner() started.");
		Assert.assertEquals(true, true);
	}

	@Test
	public void Test2ByListerner() {
		System.out.println("Test2ByListerner() started.");
		Assert.assertEquals(false, true);
	}
}

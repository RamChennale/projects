package com.qa.basicAnnoatation;

import org.testng.annotations.Test;

public class ThreadPoolSizeIgnoredWithoutInvocationCount {

	@Test(threadPoolSize = 5, invocationCount = 5, timeOut = 5000)
	public void test() {
		System.out.println("threadPoolSize = 5: Wll create 5 threads to run mutiple test methods");
		System.out.println("invocationCount = 5: will be called/invoked 5 times");
		System.out.println("timeOut = 5000: Within 5 sec need to complete the test");

		System.out.println("=====================");
		System.out.println("ThreadPoolSize will Ignored Without the InvocationCount feature.");
		System.out.println("=====================");
	}
}

package com.qa.retryFailedTCUsingIRetryAnalyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryUsingIRetryAnalyzer implements IRetryAnalyzer {

	static int minRetryCount=1;
	static int maxRetryCount=5;
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
	
		if (minRetryCount<=maxRetryCount) {
			System.out.println("Following test case failing VERIFIED: "+result.getName());
			System.out.println("Retry test count : "+(minRetryCount+1));
			minRetryCount++;
			return true;
		}
		return false;
	}

}

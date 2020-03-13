package com.qa.retryIRetryAnalyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

	  int minRetryCount=1;
	  int maxRetryCount=2;
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
	
		if (minRetryCount<=maxRetryCount) {
			System.out.println("Test case : "+result.getName()+" Failed.");
			//System.out.println("Retry test count : "+(minRetryCount+1));
			minRetryCount++;
			return true;
		}
		return false;
	}

}

package com.qa.interfaces;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.ITestResult;

public interface TestBaseI {

	public abstract void initiate() throws IOException ;
	public abstract void reportSetup();
	public abstract void getTestCaseName(Method method);
	public abstract void getTestCaseResult(ITestResult result) throws IOException;
	public abstract void flushReport();
	public abstract void tearDown();
}

package testNGlisterner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListener implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test case started and test case details are : "+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case success and test case details are : "+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case failed and test case details are : "+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case skipped and test case the detals are : "+result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Test case Failed But Within SuccessPercentage and the test case detals are : "+result.getName());
	}

	@Override
	public void onStart(ITestContext result) {
		System.out.println("Test case started and the test case detals are : "+result.getName());
	}

	@Override
	public void onFinish(ITestContext result) {
		System.out.println("Test case finished and the test case detals are : "+result.getName());
	}

	
}

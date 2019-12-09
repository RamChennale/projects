package basicAnnoatation;

import org.testng.annotations.Test;

public class InvocationCountAndInvocationTimeOut {

	@Test(priority = 1, 
			invocationCount = 2, 
			invocationTimeOut = 4, 
			ignoreMissingDependencies = false, 
			description = "Num of times a test executed in given time")
	public void invocationCountAndInvocationTimeOut() {

	}
}

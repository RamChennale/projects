package basicAnnoatation;

import org.testng.annotations.Test;

public class TimeOutTest {

	@Test(invocationCount=10,timeOut=100)
	public void timeOutTest() {
		
	}
}

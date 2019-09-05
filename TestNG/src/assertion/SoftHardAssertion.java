package assertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftHardAssertion {

	@Test
	public void softAsset() {
		System.out.println("softAsset() started ");
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(10, 10);
		System.out.println("actual"+ "expected"+"message");
		System.out.println("softAsset completed ");
		softAssert.assertAll(); // It is mandatory to call assertAll() method for applying Soft assert to a method
	}

	@Test
	public void hardAsset() {
		System.out.println("hardAsset() started");
		Assert.assertEquals("actual", "actual");
		System.out.println("hardAsset() completed");
	}
}

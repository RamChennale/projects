package com.rupeelog.manualTxnAdjTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;

public class LoginTest extends TestBase {

	@Test(enabled = true)
	public void testLogin() {
		Assert.assertEquals(driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).getText(), "Logout");
		System.out.println("Log in successgull.");
	}
}

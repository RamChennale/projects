package com.qa.waits;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.qa.base.DynamicBaseClass;

public class ImplicitWaitFeatures extends DynamicBaseClass{

	@Test
	public void implicitWaitFeatures() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
}

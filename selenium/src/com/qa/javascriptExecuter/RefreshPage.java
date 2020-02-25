package com.qa.javascriptExecuter;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.qa.base.DynamicBaseClass;

public class RefreshPage extends DynamicBaseClass{

	@Test(enabled = true)
	public void refreshBy() {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("history.go(0)");
	}
}

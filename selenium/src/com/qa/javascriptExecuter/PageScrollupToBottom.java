package com.qa.javascriptExecuter;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.qa.base.DynamicBaseClass;

public class PageScrollupToBottom extends DynamicBaseClass{

	@Test(enabled = true)
	public void pageScrollupToBottom() {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
}

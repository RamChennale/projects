package com.qa.javascriptExecuter;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.qa.base.DynamicBaseClass;

public class GetPageTitle extends DynamicBaseClass{

	@Test(enabled = true)
	public void getPageTitle() {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String title = js.executeScript("return document.title").toString();
		System.out.println("Page title: "+title);
	}
}

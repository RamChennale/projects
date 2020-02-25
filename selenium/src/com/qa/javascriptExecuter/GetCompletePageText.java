package com.qa.javascriptExecuter;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.qa.base.DynamicBaseClass;

public class GetCompletePageText extends DynamicBaseClass{

	@Test(enabled = true)
	public void getCompletePageText() {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String wholePageText = js.executeScript("return document.documentElement.innerText").toString();
		System.out.println(wholePageText);
	}
}

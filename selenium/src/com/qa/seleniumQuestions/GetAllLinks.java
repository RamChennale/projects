package com.qa.seleniumQuestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.qa.base.DynamicBaseClass;

public class GetAllLinks extends DynamicBaseClass{

	@Test(enabled=true)
	public void getAllLinks() {
		DynamicBaseClass.NavigateToUrl("https://www.twitter.com");
		List<WebElement> list=driver.findElements(By.tagName("a"));
		System.out.println("Num of links: "+list.size());
	}
}

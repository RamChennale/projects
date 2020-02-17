package com.qa.seleniumQuestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.qa.base.DynamicBaseClass;

public class GetAllLinksCount extends DynamicBaseClass{

	@Test(enabled=true)
	public void getAllLinksText() {
		DynamicBaseClass.NavigateToUrl("https://www.twitter.com");
		List<WebElement> list=driver.findElements(By.tagName("a"));
		System.out.println("Num of links: "+list.size());
		for(int i=0; i<list.size();i++) {
			String linkText=list.get(i).getText();
		}
	}
}

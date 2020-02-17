package com.qa.seleniumQuestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.qa.base.DynamicBaseClass;

public class GetLinkToLogIn extends DynamicBaseClass{

	String login="Log in";
	
	@Test(enabled=true)
	public void getLinkToLogIn() throws InterruptedException{
		DynamicBaseClass.NavigateToUrl("https://www.twitter.com");
		List<WebElement> list=driver.findElements(By.tagName("a"));
		for(int i=0; i<list.size();i++) {
			String linkText=list.get(i).getText();
			if(linkText.equalsIgnoreCase(login)) {
				 WebElement login= list.get(i);
				 login.click();
				Thread.sleep(2000);
			}
		}
	}
}

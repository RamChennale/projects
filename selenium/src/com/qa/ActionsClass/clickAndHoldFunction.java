package com.qa.ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.qa.base.DynamicBaseClass;

public class clickAndHoldFunction extends DynamicBaseClass{

	Actions actions;
	String url="http://uitestpractice.com/";
	
	@Test(enabled=true)
	public void clickAndHoldFun() {
		actions= new Actions(driver);
		DynamicBaseClass.NavigateToUrl(url);
		WebElement from=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement to= driver.findElement(By.xpath("//div[@id='droppable']"));
		actions.clickAndHold(from).moveToElement(to).release().build().perform();
	}
}

package com.qa.ExpectedConditionsClass;
//Wait till 
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.qa.utility.ScrollPageToFindElement;
import com.qa.base.DynamicBaseClass;

public class AlertIsPresent_ExpectedConditions extends DynamicBaseClass {

	@Test(enabled=true)
	public void alertIsPresentVerify() {
		//DynamicBaseClass.NavigateToUrl("http://only-testing-blog.blogspot.com/2014/01/textbox.html");
		WebElement alertElement = driver.findElement(By.xpath("//button[contains(text(),'Show Me Confirmation')]"));
		ScrollPageToFindElement.findElementByPageScrolling(driver, alertElement);
		alertElement.click();
		//DynamicWaitToClickElement.clickOn(alertElement, 10); //clicking on alert link with wait
		Alert alert = new WebDriverWait(driver, 20).until(ExpectedConditions.alertIsPresent());
		String alertText = alert.getText();
		System.out.println(alertText);
		//alert.accept();
		
		System.out.println("One more way: ======");
		WebDriverWait wait = new WebDriverWait(driver, 30 /*timeout in seconds*/);
		if(wait.until(ExpectedConditions.alertIsPresent())==null)
		    System.out.println("alert was not present");
		else
		    System.out.println("alert was present");
	}
	
}

/*******************If Element not found:
org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"xpath","selector":"//button[contains(text(),'Show Me Confirmation')]"}
  (Session info: chrome=80.0.3987.132)*/

package com.qa.xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.qa.base.DynamicBaseClass;

public class DynamicXpathToDynamicSearchText extends DynamicBaseClass {

	@Test
	public void dynamicXpathToDynamicSearchText() {
		DynamicBaseClass.navigateToUrl("https://www.google.com/");
		WebElement googleSearch = driver.findElement(By.xpath("//input[@name='q']"));
		googleSearch.sendKeys("test");
		List<WebElement> searchResultList = driver
				.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));

		System.out.println(searchResultList.size());
		for(int i=0;i<searchResultList.size();i++) {
			System.out.println(searchResultList.get(i).getText());
			if(searchResultList.get(i).getText().contains("Test plan")) {
				searchResultList.get(i).click();
				break;
			}
		}
	}
}

package com.qa.utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.qa.base.DynamicBaseClass;

public class DropDownBootStrapWithoutSelectClass extends DynamicBaseClass{

	@Test
	public void bootStrapDropDownNoSelectClass() {
		DynamicBaseClass.NavigateToUrl("https://www.w3schools.com/bootstrap/bootstrap_dropdowns.asp");
		WebElement dropDownButton= driver.findElement(By.xpath("//button[@id='menu1']"));
		dropDownButton.click();
		List<WebElement> dropDownlist= driver.findElements(By.xpath("//div[@class='dropdown open']//ul//li"));
		System.out.println(dropDownlist.size());
		for(int i=0;i<dropDownlist.size();i++) {
			System.out.println(dropDownlist.get(i).getText());
			if(dropDownlist.get(i).getText().contains("CSS")) {
				dropDownlist.get(i).click();// click to select the drop down value
				break;
			}
			if(dropDownlist.get(i).getText().contains("HTML")) {
				dropDownlist.get(i).click();// click to select the drop down value
				break;
			}
		}
	}
}

package com.qa.seleniumFunctionality;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;

import com.qa.base.TestBase;

public class SelectFunctionality extends TestBase {

	public void selectFunctionality() {
		Select select = new Select(webElement);
		int index = (Integer) null;
		String value = "KA";
		String text = "Male";

		select.selectByIndex(index);
		select.selectByValue(value);
		select.selectByVisibleText(text);

		select.deselectAll();
		select.deselectByIndex(index);
		select.deselectByValue(value);
		select.deselectByVisibleText(text);
		
		List<WebElement> webElementsList = select.getOptions();
		Iterator iterator=	webElementsList.iterator();
		
		WebElement locator = select.getFirstSelectedOption();
		List<WebElement> list = select.getOptions();
		for(WebElement element:list) {
			element.click();
		}
		Iterator<WebElement> elements= list.iterator();
		
	}
}

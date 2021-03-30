package com.qa.seleniumExceptions;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;

public class ElementClickInterceptedExceptionSelenium {

	@SuppressWarnings("null")
	public void createRTARevTypeMapping() {

		WebElement element=null;
		WebElement element1=null;

		element.click();
		
		/*
		 * Indicates that a click could not be properly executed because the target
		 * element was obscured in some way.
		 */
		try {
		element1.sendKeys("ram");
		}catch (ElementClickInterceptedException e) {
			e.printStackTrace();
		}
	}
	
}

/* line 15 - ElementClickInterceptedException 
 * 
 * org.openqa.selenium.ElementClickInterceptedException: element click
 * intercepted: Element <input type="button" name="create" id="create"
 * value="Create" onclick="createScreen()" class="btn-small btn-warning"> is not
 * clickable at point (60, 483). Other element would receive the click: <th
 * class="sorting_desc" tabindex="0" aria-controls="viewTable" rowspan="1"
 * colspan="1" aria-label="...: activate to sort column ascending"
 * style="width: 93px;" aria-sort="descending">Id</th>
 */
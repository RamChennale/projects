package com.qa.seleniumFunctionality;

import com.qa.base.TestBase;

public class Frames extends TestBase{

	@SuppressWarnings("null")
	public void frames() {
		int index=(Integer) null;
		String nameOrId = null;
		
		driver.switchTo().frame(index);
		driver.switchTo().frame(nameOrId);
		driver.switchTo().frame(webElement);
		driver.switchTo().parentFrame();//control switch back to immediate parent frame
		driver.switchTo().defaultContent();//control switch back to initial first parent frame
	}
}

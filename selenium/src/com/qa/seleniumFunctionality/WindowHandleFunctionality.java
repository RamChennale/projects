package com.qa.seleniumFunctionality;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import com.qa.base.TestBase;

public class WindowHandleFunctionality extends TestBase {

	public void windowHandleFunctionality() {

		String windName = driver.getWindowHandle();
		driver.switchTo().window(windName);
		
		for(String handle:driver.getWindowHandles()) {
			driver.switchTo().window(handle);
		}

		Set<String> set = driver.getWindowHandles();
		Iterator<String> iterator = set.iterator();
		ArrayList<String> arrayList = new ArrayList<String>();
		while (iterator.hasNext()) {
			arrayList.add(iterator.next());
		}
		driver.switchTo().window(arrayList.get(3));
		driver.close();
	}
}

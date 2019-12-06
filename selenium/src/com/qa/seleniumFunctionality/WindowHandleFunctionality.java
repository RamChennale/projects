package com.qa.seleniumFunctionality;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Dimension;

import com.qa.base.TestBase;

public class WindowHandleFunctionality extends TestBase {

	public void windowHandleFunctionality() {

		String windName = driver.getWindowHandle();
		driver.switchTo().window(windName);

		Set<String> set = driver.getWindowHandles();
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String windListName=	iterator.next();
			driver.switchTo().window(windListName);
		}

		ArrayList<String> arrayList = new ArrayList<String>();
		Iterator<String> wl = iterator;
		while (wl.hasNext()) {
			arrayList.add(wl.next());
		}
		
		driver.switchTo().window(arrayList.get(3));
		driver.close();
		
		
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		Dimension dimension=driver.manage().window().getSize();
		int height= dimension.getHeight();
		int width=dimension.getWidth();

		driver.manage().window().setSize(dimension);
		
	}
}

package com.qa.getWindowHandles;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.base.DynamicBaseClass;

public class GetWindowHandlesAllInArrayList extends DynamicBaseClass{

	@Test
	public void getAllWindowsInArrayList() {
		WebElement popUpLocator=driver.findElement(By.xpath("//font[1]/b/a[contains(text(),'Multi-PopUp Test')]"));
		popUpLocator.click();
		Set<String> set=	driver.getWindowHandles();
		ArrayList<String> arrayWindList= new ArrayList<>();
		Iterator<String> iterator=	set.iterator();
		while(iterator.hasNext()) {
			arrayWindList.add(iterator.next());
		}
		System.out.println("Total num of windows: "+arrayWindList.size()+" Parent Wind: "+arrayWindList.get(0));
		System.out.println("Wind list: "+arrayWindList);
		//Switching to child/secondwind 
		driver.switchTo().window(arrayWindList.get(1));
		String title= driver.getTitle();
		Assert.assertEquals("PopupTest Wednesday February, 19 2020", title);
	}
}

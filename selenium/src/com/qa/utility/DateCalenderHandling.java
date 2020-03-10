package com.qa.utility;

import java.sql.Driver;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.qa.base.DynamicBaseClass;

public class DateCalenderHandling extends DynamicBaseClass {//

	@Test
	public void dateCalenderHandling() {

		DynamicBaseClass.NavigateToUrl("https://jqueryui.com/datepicker/");
		String date = "01-February-2020";
		String[] dateArray = date.split("-");

		System.out.println(dateArray[0]);
		System.out.println(dateArray[1]);
		System.out.println(dateArray[2]);
		String day = dateArray[0];
		String month = dateArray[1];
		String year = dateArray[2];

		WebElement calender = driver.findElement(By.xpath("//input[@id='datepicker']"));
		calender.click();

		Select selectMonth = new Select(driver.findElement(By.xpath("")));
		selectMonth.selectByVisibleText(month);

		Select selectYear = new Select(driver.findElement(By.xpath("")));
		selectYear.selectByVisibleText(year);

		
		int rows = 7;
		int columns = 7;
		// rowsVsCol
		// *[@id='ui-datepicker-div']/table/tbody/tr[2]/td[1]/a //td[1]-1,2,3,4,5,6,7
		// *[@id='ui-datepicker-div']/table/tbody/tr[3]/td[1]/a //td[1]-1,2,3,4,5,6,7
		// *[@id='ui-datepicker-div']/table/tbody/tr[4]/td[1]/a //td[1]-1,2,3,4,5,6,7
		String beforeXpath = "//*[@id='ui-datepicker-div']/table/tbody/tr[";
		String afterXpath = "]/td[s";
		String constantXpath="]/a";
		boolean flag=false;
		String daySelection= null;
		for(int rCOUNT=2; rCOUNT<=rows;rCOUNT++) {
			for(int cCOUNT=1;cCOUNT<=columns;cCOUNT++) {
				try {
				daySelection =driver.findElement(By.xpath(beforeXpath+rCOUNT+afterXpath+cCOUNT+constantXpath)).getText();
				}catch(NoSuchElementException e) {
					System.out.println("Please enter correct day value");
					flag=false;
					break;
				}
				if(daySelection.equals(day)) {
					driver.findElement(By.xpath(beforeXpath+rCOUNT+afterXpath+cCOUNT+constantXpath)).click();
					flag=true;// this is for if the date not found in single inner loop
					break;
				}
			if(flag) {
				break;
			}
			}
		}
	}
}

/*
 * String dateDiff = "01/feb/2020"; String[] dateArrayDiff = date.split("/");
 */
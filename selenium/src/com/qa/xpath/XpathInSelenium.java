package com.qa.xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/*
1.	Contains
2.	Sibling
3.	Ancestor
4.	And & OR
5.	Parent
6.	Starts-with and ends-with: to catch dynamic locators which are changes at 
7.	XPath Axes
8.	Text()
 * 		
 * Contains: we can find/extract all the web elements/locators which matches a particular text
 *  value.
  	//a[contains(text(),'SAP M')]
	//input[contains(@id,'test-12')]

 * sibling: to fetch a web element which is related to some other element
 * //div[@class='canvas- graph']//a[@href='/accounting.html']/following-sibling::h4
 * 
 * Ancestor:To find an element on the basis of the parent element 
 * //div[//a[text()='SELENIUM']]/ancestor::div[@class='rt-omega']/following-sibling::div
 * 
 * AND and OR: you can put 2 conditions in our XPath expression.
 * Xpath=//*[@type='submit' OR @name='btnReset']
 * Xpath=//input[@type='submit' and @name='btnLogin']
 * 
 * Parent: to find the parent node of the current node in the web page.
 * Xpath=//*[@id='rt-feature']//parent::div
 * 
 * Starts-with: to find the element whose attribute dynamically changes on refresh or other operations like click, submit, etc.
 *	Xpath=//label[starts-with(@id,'test_')] test_132, test_211, test_634, test_543 ,test_122 etc
 *ends-with:to find the element whose attribute dynamically changes on refresh or other operations like click, submit, etc.
 *	Xpath=//label[ends-with(@id,'test_')] 132tes_, 211test, 634test, 543test ,212test etc
 *
 *
 * */
import com.qa.base.DynamicBaseClass;

public class XpathInSelenium extends DynamicBaseClass{

	String url="http://uitestpractice.com/";
	
	@Test
	public void XpathTypes() {
		DynamicBaseClass.NavigateToUrl(url);
		WebElement containsXpathText=driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
		WebElement  containsXpathid=driver.findElement(By.xpath("//input[(contains(@id,'FirstName'))]"));
		WebElement  Starts_withXpath=driver.findElement(By.xpath("//input[starts-with(@id,'FirstName')]"));
		WebElement  ends_withXpath=driver.findElement(By.xpath("//input[ends-with(@id,'LastName')]"));
		WebElement orXpath =driver.findElement(By.xpath("//input[@id='FirstName' or @id='lastName']"));
		WebElement andXpath=driver.findElement(By.xpath("//input[@id='FirstName' and @id='FirstName']"));
		
	}
	
}

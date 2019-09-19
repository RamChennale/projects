package com.java.selenium;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.swing.text.Document;

import org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner.noneDSA;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.server.handler.ExecuteScript;
import org.openqa.selenium.remote.server.handler.interactions.touch.Scroll;
import org.openqa.selenium.security.Credentials;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SeleniumAlert {

	/**
	1. How to work with alert
	2. How to work with iframe
	3. How to work with select
	4. How to execute java script
	 */
	
	@Test
	public void seleniumAlert() {
		
		WebDriver driver= new InternetExplorerDriver();
		
		//1. How to work with alert
		Alert alert= driver.switchTo().alert();
		alert.accept();
		alert.dismiss();
		
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		driver.findElement(By.tagName("")).getSize();
		
		//2. How to work with iframe
		driver.switchTo().frame(1);
		driver.switchTo().frame("googleMap");
		driver.switchTo().frame(driver.findElement(By.id("id")));
		
		//3. How to work with select
		Select select = new Select(driver.findElement(By.id("")));
		select.selectByValue("Male");
		select.selectByIndex(1);
		select.selectByVisibleText("EPS");
		
		select.deselectAll();
		select.deselectByIndex(1);
		select.deselectByValue("male");
		select.deselectByVisibleText("EPS");
		
		List<WebElement> list= select.getOptions();
		Iterator<WebElement> iterator= list.iterator();
		
		ArrayList<WebElement> arrayList = new ArrayList<WebElement>();
		
		while(iterator.hasNext()) {
			arrayList.add(iterator.next());
		}
		
		driver.switchTo().frame(arrayList.get(1));
		driver.switchTo().frame(arrayList.get(3));
		
		
		//4. How to execute java script
		
		WebDriver driver1= new FirefoxDriver();
		EventFiringWebDriver eventFiringWebDriver=  new EventFiringWebDriver(driver1);
		eventFiringWebDriver.executeScript(" document.getElementById(\"inputSuccess\").value=\"test\"   ");
		
		JavascriptExecutor javascriptExecutor = (org.openqa.selenium.JavascriptExecutor) ((JavascriptExecutor)driver).executeScript("document.getElementById(\"idName\")");

		
		WebDriver driver11= new WebDriver() {
			
			@Override
			public TargetLocator switchTo() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void quit() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public Navigation navigate() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Options manage() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Set<String> getWindowHandles() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getWindowHandle() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getTitle() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getPageSource() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getCurrentUrl() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void get(String arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public List<WebElement> findElements(By arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public WebElement findElement(By arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void close() {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		Alert al = new Alert() {

			public void setCredentials(Credentials arg0) {

			}

			public void sendKeys(String arg0) {

			}

			public String getText() {
				return null;
			}

			public void dismiss() {

			}

			public void authenticateUsing(Credentials arg0) {
			}

			public void accept() {

			}
		};
	}

	private JavascriptExecutor JavascriptExecutor(WebDriver driver) {
		// TODO Auto-generated method stub
		return null;
	}
}

package com.qa.base;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.Logs;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;

public class TestClass extends TestBase {

	public static WebElement element;
	public static WebDriver driver;
	public static List<WebElement> elements;
	public static String url = "http://www.google.com";
	public static String currentUrl;
	public static String pageSource;
	public static String currentTitle;
	public static String windowID;
	public static Set<String> windowIDSet;
	public static Options optionsI;
	public static Navigation navigationI;
	public static TargetLocator targetLocatorI;

	public void webDriverMethods() {
		driver = new ChromeDriver();
		driver.close();
		element = driver.findElement(By.id("id"));
		elements = driver.findElements(By.id("id"));
		driver.get(url);
		currentUrl = driver.getCurrentUrl();
		pageSource = driver.getPageSource();
		currentTitle = driver.getTitle();
		windowID = driver.getWindowHandle();
		windowIDSet = driver.getWindowHandles();
		optionsI = driver.manage();
		navigationI = driver.navigate();
		driver.quit();
		targetLocatorI=driver.switchTo();
	}
	
	public void windowFunctions() {
		driver.switchTo().window(windowID);
		
		ArrayList<String> arrayWindList= new ArrayList<>();
		Iterator<String> iterator=	windowIDSet.iterator();
		while(iterator.hasNext()) {
			arrayWindList.add(iterator.next());
		}
		System.out.println("Total num of windows: "+arrayWindList.size()+" Parent Wind: "+arrayWindList.get(0));
		System.out.println("Wind list: "+arrayWindList);
		//Switching to child/second wind 
		driver.switchTo().window(arrayWindList.get(1));
	}
	
	public void manageFunctions() {
		optionsI.timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
		driver.manage().window().maximize();
		Logs logs=	optionsI.logs();
	}

	public void navigateFunctions() {
		navigationI.back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.navigate().to(url);
	}
	
	public void switchToFunctions() {
		targetLocatorI.alert().accept();
		driver.switchTo().alert().dismiss();
		driver.switchTo().alert().getText();
		driver.switchTo().alert().sendKeys("keysToSend");
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.switchTo().frame("nameOrId");
		driver.switchTo().frame(element);
		driver.switchTo().parentFrame();
		driver.switchTo().window(windowID);
	}
}

package com.qa.headlessBrowser;
/*1. set phantomjs path 
2. create phantomjs browser object.
3. add phantomjs maven depandacy
4. create and execute test cases*/
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.Test;

public class PhantomJSHeadlessBrowser {

	@Test
	public void phantomJSHeadlessBrowser() {
		System.setProperty("phantomjs.binary.path", "/Users/ramchennale/git/projects/selenium/Driver/phantomjs.exe");
		WebDriver driver= new PhantomJSDriver();
		driver.get("https://phantomjs.org/download.html");
		String title=driver.getTitle();
		System.out.println("Title : "+title);
		 driver.findElement(By.xpath("//a[@href='/quick-start.html']")).click();
		 System.out.println("Title : "+driver.getTitle());
	}
}

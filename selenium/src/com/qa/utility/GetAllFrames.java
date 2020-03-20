package com.qa.utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.qa.base.DynamicBaseClass;

public class GetAllFrames extends DynamicBaseClass{

	@Test
	public void getAllFramesName() {
		DynamicBaseClass.NavigateToUrl("http://the-internet.herokuapp.com/nested_frames");
		System.out.println("************************* Home page frames ************************* ");
		List<WebElement> listOfHomepageFrames= driver.findElements(By.tagName("frame"));
		System.out.println("Num of home page frames: "+listOfHomepageFrames.size());
		for(WebElement element:listOfHomepageFrames) {
			System.out.println("Home frame name: "+element.getAttribute("name"));
		}
		
		System.out.println("************************* Top frames ************************* ");
		driver.switchTo().frame("frame-top");
		List<WebElement> listTopframes= driver.findElements(By.tagName("frame"));
		System.out.println("Num of top frames: "+listTopframes.size());
		for(WebElement element:listTopframes) {
			System.out.println("Top frame name: "+element.getAttribute("name"));
		}
		
	 	driver.switchTo().parentFrame(); // 
		
		System.out.println("************************* Bottom frames ************************* ");
		driver.switchTo().frame("frame-bottom");
		/*
		 * If no frame found:
		 * org.openqa.selenium.NoSuchFrameException: No frame element found by name or id frame-bottom*/
		List<WebElement> listBottomFrames =	driver.findElements(By.tagName("frame"));
		System.out.println("Num of Bottom Frames : "+listBottomFrames.size());
		for(WebElement element: listBottomFrames) {
			System.out.println(element.getAttribute("name"));
		}
		
		String bottomFrames= driver.findElement(By.xpath("//frame[@name='']")).getAttribute("name");
		
	}
	
	@Test(enabled=false)
	public void getIframe(final WebDriver driver, final String id) {
	    final List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
	    for (WebElement iframe : iframes) {
	        if (iframe.getAttribute("id").equals(id)) {
	        // TODO your stuff.
	        }
	    }
	}
}

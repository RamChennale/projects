package com.java.seleniumFeature;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.qa.base.DynamicBaseClass;
import com.qa.waits.WaitFor_visibilityOfAllElements;
public class FindBrokenLink extends DynamicBaseClass{

	@Test(enabled=false)
	public void findBrokenLink_allhref() throws MalformedURLException, IOException {
		DynamicBaseClass.NavigateToUrl("https://www.facebook.com/");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		//links		a<href http://www.google.com>
		//images	img<href=http://www.faceboo.com>
		 List<WebElement> linkList=	driver.findElements(By.tagName("a"));
		 List<WebElement> listImglinks=	driver.findElements(By.tagName("img"));
		
		linkList.addAll(listImglinks);
		List<WebElement> activeLinklist= new ArrayList<WebElement>();
		System.out.println("All links: "+linkList.size());

		for(int i=0; i<linkList.size(); i++) {
			if(linkList.get(i).getAttribute("href")!=null) {
				activeLinklist.add(linkList.get(i));	
				
				}
		}
		System.out.println("Active Link list: "+activeLinklist.size());
		System.out.println("==========================");
		for(int i=0; i<activeLinklist.size();i++) {
			System.out.println(activeLinklist.get(i).getAttribute("href"));
		}
		System.out.println("==========================");
		for(int j=0;j<activeLinklist.size();j++) {
		HttpURLConnection connection= (HttpURLConnection)new URL(activeLinklist.get(j).getAttribute("href")).openConnection();
		String response=	connection.getResponseMessage();
		connection.disconnect();
		System.out.println(activeLinklist.get(j).getAttribute("href")+"---->"+response);
		}
		
	}
	
	
	@Test(enabled=true)
	public void findBrokenLink_Onlyhref() throws MalformedURLException, IOException {
		DynamicBaseClass.NavigateToUrl("https://www.facebook.com/");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		//links		a<href http://www.google.com>
		//images	img<href=http://www.faceboo.com>
		 List<WebElement> linkList=	driver.findElements(By.tagName("a"));
		 List<WebElement> listImglinks=	driver.findElements(By.tagName("img"));
		
		linkList.addAll(listImglinks);
		List<WebElement> activeLinklist= new ArrayList<WebElement>();
		System.out.println("All links: "+linkList.size());

		for(int i=0; i<linkList.size(); i++) {
			if(linkList.get(i).getAttribute("href")!=null && (!linkList.get(i).getAttribute("href").contains("javaScript"))) {
				activeLinklist.add(linkList.get(i));	
				
				}
		}
		System.out.println("Active Link list: "+activeLinklist.size());
		System.out.println("==========================");
		for(int i=0; i<activeLinklist.size();i++) {
			System.out.println(activeLinklist.get(i).getAttribute("href"));
		}
		System.out.println("==========================");
		for(int j=0;j<activeLinklist.size();j++) {
		HttpURLConnection connection= (HttpURLConnection)new URL(activeLinklist.get(j).getAttribute("href")).openConnection();
		String response=	connection.getResponseMessage();
		connection.disconnect();
		System.out.println(activeLinklist.get(j).getAttribute("href")+"---->"+response);
		}
		
	}
}


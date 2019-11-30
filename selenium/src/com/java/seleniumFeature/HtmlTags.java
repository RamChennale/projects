package com.java.seleniumFeature;

import java.util.List;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.base.TestBase;

public class HtmlTags extends TestBase{
	
	public static WebDriver driver = null;
	public static WebDriverWait webDriverWait = null;
	
	public static Logger logger= Logger.getLogger(HtmlTags.class);
	
	@FindBy(xpath=".//*[@id='username']")
	private WebElement username;
	@FindBy(xpath=".//*[@id='password']")
	private WebElement password;
	@FindBy(xpath=".//*[@id='login-submit']")
	private WebElement login;
	
	public HtmlTags(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	public void login() {
		/*webDriverWait= new WebDriverWait(driver, 10);
		webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "")));
		webDriverWait.until(ExpectedConditions.visibilityOf(username));
		webDriverWait.until(ExpectedConditions.presenceOfElementLocated((By) username));// presenceOfElementLocated(By locator)
		*/
		username.clear();
		username.sendKeys("TestAdmin");
		//webDriverWait.until(ExpectedConditions.visibilityOf(password));
		password.clear();
		password.sendKeys("testAdmin");
		//webDriverWait.until(ExpectedConditions.visibilityOf(login));
		login.click(); //
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// OR login.submit();
	}
	
	
	public void html_tags() {

				/*
		 * driver.navigate().back(); driver.navigate().refresh();
		 * driver.navigate().forward();
		 */

		System.out.println("========Finding locators==========");
		WebElement idEle = driver.findElement(By.id("id_value"));
		List<WebElement> list_El = driver.findElements(By.name("button"));

		System.out.println("==================");
		driver.get("www.google.com");
		String current_page_URL = driver.getCurrentUrl();
		System.out.println("The current pointing URL is : "+ current_page_URL);

		System.out.println("==================");

		System.out.println("========TO accept the alert=========");
		driver.switchTo().alert().accept();

		System.out.println("========TO dismiss the alert =========");
		driver.switchTo().alert().dismiss();

		System.out.println("=======TO print alert TEXT==========");
		Alert alert = driver.switchTo().alert();
		System.out.println("ALert message is  " + alert.getText());

		System.out.println("============");
		String pageTitle = driver.getTitle();
		String id = driver.getWindowHandle();

		System.out.println("========Capture SCREENSHOT=========");
		try {
			File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file, new File("d:/" + System.currentTimeMillis() + ".png"));
			File file2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file2, new File("d:/"+System.currentTimeMillis()+".png"));
			
		} catch (IOException ioe) {
			System.out.println(ioe);
		}


		System.out.println("========To submit or Click on BUTTON==========");
		driver.findElement(By.className("")).click();
		driver.findElement(By.className("")).submit();
		driver.findElement(By.className("")).sendKeys(Keys.RETURN);
		driver.findElement(By.className("")).sendKeys(Keys.ENTER);
		
		
		System.out.println("=======To  close current TAB===========");
		driver.close();

		System.out.println("======To  close all TAB============");
		driver.quit();

		System.out.println("==================");

	}

	
}

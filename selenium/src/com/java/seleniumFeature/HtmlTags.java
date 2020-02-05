package com.java.seleniumFeature;

import java.util.List;
import java.util.Set;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
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

public class HtmlTags extends TestBase {

	public static WebDriver driver = null;
	public static WebDriverWait webDriverWait = null;

	public static Logger logger = Logger.getLogger(HtmlTags.class);

	@FindBy(xpath = ".//*[@id='username']")
	private WebElement username;
	@FindBy(xpath = ".//*[@id='password']")
	private WebElement password;
	@FindBy(xpath = ".//*[@id='login-submit']")
	private WebElement login;

	public HtmlTags(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void login() {
		/*
		 * webDriverWait= new WebDriverWait(driver, 10);
		 * webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
		 * ""))); webDriverWait.until(ExpectedConditions.visibilityOf(username));
		 * webDriverWait.until(ExpectedConditions.presenceOfElementLocated((By)
		 * username));// presenceOfElementLocated(By locator)
		 */
		username.clear();
		username.sendKeys("TestAdmin");
		// webDriverWait.until(ExpectedConditions.visibilityOf(password));
		password.clear();
		password.sendKeys("testAdmin");
		// webDriverWait.until(ExpectedConditions.visibilityOf(login));
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
		System.out.println("The current pointing URL is : " + current_page_URL);

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
			File file2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file2, new File("d:/" + System.currentTimeMillis() + ".png"));

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

		Object obj = null;
		driver.close();
		driver.equals(obj);
		WebElement element = driver.findElement(By.id("id"));
		List<WebElement> elements = driver.findElements(By.partialLinkText("partialLinkText"));
		driver.get("http://www.google.com");
		String currUrl = driver.getCurrentUrl();
		String pString = driver.getPageSource();
		String title = driver.getTitle();
		String windId = driver.getWindowHandle();
		Set<String> windSet = driver.getWindowHandles();
		driver.manage();
		driver.navigate();
		driver.quit();
		driver.switchTo();
		String toString = driver.toString();
		System.out.println("==================");
		String windId1 = driver.getWindowHandle();
		driver.switchTo().window(windId1);

		Set<String> windSet1 = driver.getWindowHandles();
		System.out.println("==================");
		driver.manage();
		// driver.manage().addCookie(cookie);
		driver.manage().deleteAllCookies();

		driver.manage().timeouts();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		driver.manage().window();
		driver.manage().window().fullscreen();
		Point point = driver.manage().window().getPosition();
		Dimension dimension = driver.manage().window().getSize();
		driver.manage().window().maximize();
		driver.manage().window().setPosition(point);
		driver.manage().window().setSize(dimension);
		System.out.println("==================");
		Navigation navigation=	driver.navigate();
		navigation.back();
		navigation.forward();
		navigation.refresh();
		navigation.to("http://www.google.com");
		System.out.println("==================");
		driver.switchTo();
		driver.switchTo().activeElement();//The WebElement with focus, or the body element if no element with focus can be detected.
		driver.switchTo().alert();
		alert=	driver.switchTo().alert();
		alert.accept();
		alert.dismiss();
		String alertText=alert.getText();
		alert.sendKeys("username");
		
		driver.switchTo().defaultContent();//This driver focused on the top window/first frame.
		driver.switchTo().frame(1);
		driver.switchTo().frame("nameOrId");
		driver.switchTo().parentFrame();//This driver focused on the top window/first frame.
		driver.switchTo().window(windId1);
		System.out.println("==================");
		System.out.println("==================");
	}
}

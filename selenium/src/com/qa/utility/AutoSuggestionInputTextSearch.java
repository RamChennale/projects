package com.qa.utility;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AutoSuggestionInputTextSearch {

	WebDriver driver;

	@BeforeClass
	public void init() {
		System.setProperty("webdriver.chrome.driver", ".//Driver//chromeDriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void autoSuggeTextSearch() {

		String textToSelect = "headlines today";
		WebElement autoOptions = driver.findElement(By.id("lst-ib"));
		autoOptions.sendKeys("he");

		List<WebElement> optionsToSelect = driver.findElements(By.xpath("//div[@class='sbqs_c']"));

		for (WebElement option : optionsToSelect) {
			System.out.println(option);
			if (option.getText().equals(textToSelect)) {
				System.out.println("Trying to select: " + textToSelect);
				option.click();
				break;

			}

		}
	}

	@AfterClass
	public void closeAllBrowser() {
		if (driver != null) {
			driver.quit();
		}
	}
}
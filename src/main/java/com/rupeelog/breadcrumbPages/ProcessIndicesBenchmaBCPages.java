package com.rupeelog.breadcrumbPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class ProcessIndicesBenchmaBCPages {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;

	@FindBy(linkText =  "Process")
	@CacheLookup
	private WebElement Process;
	
	@FindBy(xpath = "//body/div[@id='Maincontent']/div[@id='fluid']/div[1]/div[1]/div[3]/div[1]/div[1]/ul[1]/li[8]/ul[1]/li[14]/a[1]")
	@CacheLookup
	private WebElement IndicesBenchmark;
	
	@FindBy(xpath = "//li//li[14]//ul[1]//li[1]//a[1]")
	@CacheLookup
	private WebElement IndicesBenchmarkValues;

	@FindBy(xpath = "//ul[@class='breadcrumb']")
	@CacheLookup
	private WebElement breadcrumb;
	
	
	
	public ProcessIndicesBenchmaBCPages(WebDriver driver) {
		this.driver = driver;
	}

	public void indicesBenchmarkValues() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Process);
		actions.moveToElement(Process).perform();

		WebDriverWaitFunctions.waitToLoadElement(IndicesBenchmark);
		actions.moveToElement(IndicesBenchmark).perform();

		WebDriverWaitFunctions.waitToLoadElement(IndicesBenchmarkValues);
		actions.moveToElement(IndicesBenchmarkValues).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String IndicesBenchmarkValues = breadcrumb.getText();
		Assert.assertTrue(IndicesBenchmarkValues.contains(file.getBreadcrumb("IndicesBenchmarkValues")), "IndicesBenchmarkValues  not exits in breadcrumb");
		System.out.println(IndicesBenchmarkValues);
	}	
	
}

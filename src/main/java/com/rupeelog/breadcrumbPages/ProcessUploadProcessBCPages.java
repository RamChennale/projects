package com.rupeelog.breadcrumbPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class ProcessUploadProcessBCPages {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;

	@FindBy(linkText =  "Process")
	@CacheLookup
	private WebElement Process;
	
	@FindBy(xpath = "//body/div[@id='Maincontent']/div[@id='fluid']/div[1]/div[1]/div[3]/div[1]/div[1]/ul[1]/li[8]/ul[1]/li[17]/a[1]")
	@CacheLookup
	private WebElement UploadProcess;
	
	@FindBy(xpath = "//a[contains(text(),'General Upload')]")
	@CacheLookup
	private WebElement GeneralUpload;

	@FindBy(xpath = "//ul[@class='breadcrumb']")
	@CacheLookup
	private WebElement breadcrumb;
	
	@FindBy(xpath = "//a[contains(text(),'Pull from View')]")
	@CacheLookup
	private WebElement PullfromView;
	
	@FindBy(xpath = "//a[contains(text(),'Revalidate')]")
	@CacheLookup
	private WebElement Revalidate;
	
	@FindBy(xpath = "//a[contains(text(),'Specific Upload')]")
	@CacheLookup
	private WebElement SpecificUpload;
	
	public ProcessUploadProcessBCPages(WebDriver driver) {
		this.driver = driver;
	}

	public void generalUpload() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Process);
		actions.moveToElement(Process).perform();

		WebDriverWaitFunctions.waitToLoadElement(UploadProcess);
		actions.moveToElement(UploadProcess).perform();

		WebDriverWaitFunctions.waitToLoadElement(GeneralUpload);
		actions.moveToElement(GeneralUpload).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String GeneralUpload = breadcrumb.getText();
		Assert.assertTrue(GeneralUpload.contains(file.getBreadcrumb("GeneralUpload")), "GeneralUpload  not exits in breadcrumb");
		System.out.println(GeneralUpload);
	}	
	
	public void pullfromView() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Process);
		actions.moveToElement(Process).perform();

		WebDriverWaitFunctions.waitToLoadElement(UploadProcess);
		actions.moveToElement(UploadProcess).perform();

		WebDriverWaitFunctions.waitToLoadElement(PullfromView);
		actions.moveToElement(PullfromView).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String PullfromView = breadcrumb.getText();
		Assert.assertTrue(PullfromView.contains(file.getBreadcrumb("PullfromView")), " PullfromView not exits in breadcrumb");
		System.out.println(PullfromView);
	}	
	
	public void revalidate() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Process);
		actions.moveToElement(Process).perform();

		WebDriverWaitFunctions.waitToLoadElement(UploadProcess);
		actions.moveToElement(UploadProcess).perform();

		WebDriverWaitFunctions.waitToLoadElement(Revalidate);
		actions.moveToElement(Revalidate).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String Revalidate = breadcrumb.getText();
		Assert.assertTrue(Revalidate.contains(file.getBreadcrumb("Revalidate")), " Revalidate not exits in breadcrumb");
		System.out.println(Revalidate);
	}	
	
	public void specificUpload() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Process);
		actions.moveToElement(Process).perform();

		WebDriverWaitFunctions.waitToLoadElement(UploadProcess);
		actions.moveToElement(UploadProcess).perform();

		WebDriverWaitFunctions.waitToLoadElement(SpecificUpload);
		actions.moveToElement(SpecificUpload).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String SpecificUpload = breadcrumb.getText();
		Assert.assertTrue(SpecificUpload.contains(file.getBreadcrumb("SpecificUpload")), "SpecificUpload  not exits in breadcrumb");
		System.out.println(SpecificUpload);
	}	
}

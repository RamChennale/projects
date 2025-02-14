package com.rupeelog.mappingsPages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.rupeelog.utilty.ElementWait;
import com.rupeelog.utilty.FileReaderUtility;

public class FamilyRMmappingUploadPage {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;
	Alert alert;

	@FindBy(linkText = "Admin")
	@CacheLookup
	private WebElement Admin;

	@FindBy(linkText = "Mappings")
	@CacheLookup
	private WebElement Mappings;

	@FindBy(linkText = "Family RM Mappings Upload")
	@CacheLookup
	private WebElement FamilyRMMappingUpload;

	By overlay = By.cssSelector("#loader");

	@FindBy(id = "uploadFile")
	@CacheLookup
	private WebElement ChooseRMfmlyMappingFile;

	@FindBy(id = "upload")
	@CacheLookup
	private WebElement uploadBtn;

	@FindBy(id = "proceed")
	@CacheLookup
	private WebElement processBtn;

	public FamilyRMmappingUploadPage(WebDriver driver) {
		this.driver = driver;
	}

	public void createFamilyRMmappingUpload() {

		actions = new Actions(driver);
		file = new FileReaderUtility();

		ElementWait.isElementVisible(Admin);
		actions.moveToElement(Admin).perform();

		ElementWait.isElementVisible(Mappings);
		actions.moveToElement(Mappings).perform();

		ElementWait.isElementVisible(FamilyRMMappingUpload);
		actions.moveToElement(FamilyRMMappingUpload).click().build().perform();

		ElementWait.waitForOverlayDisappearExplicitly(overlay);

		ElementWait.isElementVisible(ChooseRMfmlyMappingFile);
		ChooseRMfmlyMappingFile.sendKeys(file.getAdminTestData("ChooseRMfmlyMappingFile"));

		ElementWait.isElementVisible(uploadBtn);
		uploadBtn.click();

		//ElementWait.waitForOverlayDisappearExplicitly(overlay);
		
		try {
			alert = driver.switchTo().alert();
			System.out.println("Ulpoad Family RM Mapping Upload  : " + alert.getText());
			alert.accept();
		} catch (NoAlertPresentException nape) {
			nape.printStackTrace();
		}

		ElementWait.isElementVisible(processBtn);
		processBtn.click();
		try {
			alert = driver.switchTo().alert();
			System.out.println("Process Family RM Mapping Upload  : " + alert.getText());
			alert.accept();
			alert = driver.switchTo().alert();
			System.out.println("Process Family RM Mapping Upload  : " + alert.getText());
			alert.accept();
		} catch (NoAlertPresentException nape) {
			nape.printStackTrace();
		}
		
		
	}
}

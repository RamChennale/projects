package com.rupeelog.processPages;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.rupeelog.utilty.ElementWait;
import com.rupeelog.utilty.FileReaderUtility;

public class UploadProcRevalidatePage {

	WebDriver driver;
	Alert alert;
	FileReaderUtility file;
	Actions action;

	@FindBy(linkText = "Process")
	@CacheLookup
	private WebElement Process;

	@FindBy(linkText = "Upload Process")
	@CacheLookup
	private WebElement UploadProcess;

	@FindBy(linkText = "Revalidate")
	@CacheLookup
	private WebElement Revalidate;
	
	By overlay= By.cssSelector("#loader");
	
	@FindBy(id = "fileType")
	@CacheLookup
	private WebElement revalidateSelectModule;
	
	@FindBy(id = "head_btnSave")
	@CacheLookup
	private WebElement RevalidateBtn;

	public UploadProcRevalidatePage(WebDriver driver){
		this.driver=driver;
	}
	
	public void uploadProcessRevalidate() {
		file = new FileReaderUtility();
		action = new Actions(driver);

		ElementWait.isElementVisible(Process);
		action.moveToElement(Process).perform();

		ElementWait.isElementVisible(UploadProcess);
		action.moveToElement(UploadProcess).perform();

		ElementWait.isElementVisible(Revalidate);
		action.moveToElement(Revalidate).click().build().perform();
		
		ElementWait.waitForOverlayDisappearExplicitly(overlay);
		
		ElementWait.isElementVisible(revalidateSelectModule);
		Select selectrevalidateSelectModule= new Select(revalidateSelectModule);
		selectrevalidateSelectModule.selectByVisibleText(file.getProcessTestData("revalidateSelectModule"));
		
		ElementWait.isElementVisible(RevalidateBtn);
		ElementWait.scrollToFindElement(driver, RevalidateBtn);
		RevalidateBtn.click();
		
		try {
			ElementWait.waitToPopUpAlert();
			alert=driver.switchTo().alert();
			System.out.println("Revalidate   : "+alert.getText());
			alert.accept();
		}catch (NoAlertPresentException nape) {
			nape.printStackTrace();
		}
	}
}

package com.rupeelog.accountingPages;

import java.io.File;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.internal.Utils;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WaitToLoadElement;

public class VoucherUploadPage {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;
	Alert alert;
	
	@FindBy(xpath = "//*[text()='Accounting']")
	@CacheLookup
	private WebElement AccountingMenu;
	
	@FindBy(xpath = "//*[text()='Voucher Upload']")
	@CacheLookup
	private WebElement VoucherUploadSubMenu;
	
	@FindBy(xpath = "//input[@id='uploadFile']")
	@CacheLookup
	private WebElement uploadChooseFile;
	
	@FindBy(xpath = "//input[@id='upload']")
	@CacheLookup
	private WebElement uploadButton;
	
	@FindBy(xpath = "//input[@id='proceed']")
	@CacheLookup
	private WebElement processButton;	
	
	public VoucherUploadPage(WebDriver ldriver) {
		this.driver=ldriver;
	}
	
	public void uploadVoucher() throws InterruptedException {
		file= new FileReaderUtility();
		actions= new Actions(driver);
		WaitToLoadElement.waitToLoadElement(AccountingMenu);
		actions.moveToElement(AccountingMenu).perform();
		WaitToLoadElement.waitToLoadElement(VoucherUploadSubMenu);
		actions.moveToElement(VoucherUploadSubMenu).click().build().perform();
		WaitToLoadElement.waitToLoadElement(uploadChooseFile);

	    File file = new File(System.getProperty("user.dir") + "/DataFiles/" + "Voucher_upload_template.xlsx");
	    Utils.log("file exists: " + file.exists());
	    String path = file.getAbsolutePath();
	    uploadChooseFile.sendKeys(path);
	 // working in local
		//uploadChooseFile.sendKeys("D:\\Upload file\\Accounting Voucher Upload\\Voucher_upload_template.xlsx");
		WaitToLoadElement.waitToLoadElement(uploadButton);
		uploadButton.click();
		Thread.sleep(3000);
		WaitToLoadElement.waitToLoadElement(processButton);
		processButton.click();
		Thread.sleep(3000);
		alert=driver.switchTo().alert();
		String alertText= alert.getText();
		System.out.println("Alert Message: "+alertText);
		alert.accept();
		Thread.sleep(5000);
	}
}

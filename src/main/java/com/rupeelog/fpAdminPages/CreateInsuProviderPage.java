package com.rupeelog.fpAdminPages;

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

public class CreateInsuProviderPage {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;
	Alert alert;

	@FindBy(linkText = "FP Admin")
	@CacheLookup
	private WebElement FPAdmin;

	@FindBy(linkText = "Insurance Provider")
	@CacheLookup
	private WebElement InsuranceProvider;

	By overlay = By.cssSelector("#loader");

	@FindBy(id = "create")
	@CacheLookup
	private WebElement createBtn;

	@FindBy(id = "PolicyName")
	@CacheLookup
	private WebElement iproPolicyProvider;

	@FindBy(id = "Address")
	@CacheLookup
	private WebElement iproAddress;
	
	@FindBy(id = "WebSite")
	@CacheLookup
	private WebElement iproWebSite;

	@FindBy(id = "Description")
	@CacheLookup
	private WebElement iproDescription;
	
	@FindBy(id = "save")
	@CacheLookup
	private WebElement saveBtn; 
	
	@FindBy(id = "view")
	@CacheLookup
	private WebElement viewBtn;
	
	@FindBy(xpath = "//td[contains(text(),'LIC India')]")
	@CacheLookup
	private WebElement selectProvider;
	
	@FindBy(xpath = "//input[@value='Back']")
	@CacheLookup
	private WebElement BackBtn;
	
	@FindBy(id = "edit")
	@CacheLookup
	private WebElement editBtn;
	
	@FindBy(id = "delete")
	@CacheLookup
	private WebElement DeleteBtn;

	public CreateInsuProviderPage(WebDriver driver) {
		this.driver = driver;
	}

	public void createInsuranceProvider() {

		actions = new Actions(driver);
		file = new FileReaderUtility();

		ElementWait.isElementVisible(FPAdmin);
		actions.moveToElement(FPAdmin).perform();

		ElementWait.isElementVisible(InsuranceProvider);
		actions.moveToElement(InsuranceProvider).click().build().perform();

		ElementWait.waitForOverlayDisappearExplicitly(overlay);

		ElementWait.scrollToFindElement(driver,createBtn );
		createBtn.click();

		ElementWait.isElementVisible(iproPolicyProvider);
		iproPolicyProvider.sendKeys(file.getDiscPMSTestData("iproPolicyProvider"));
		
		ElementWait.isElementVisible(iproAddress);
		iproAddress.sendKeys(file.getDiscPMSTestData("iproAddress"));

		ElementWait.isElementVisible(iproWebSite);
		iproWebSite.sendKeys(file.getDiscPMSTestData("iproWebSite"));

		ElementWait.isElementVisible(iproDescription);
		iproDescription.sendKeys(file.getDiscPMSTestData("iproDescription"));
		
		ElementWait.isElementVisible(saveBtn);
		saveBtn.click();
		
		try {
			ElementWait.waitToPopUpAlert();
			alert=driver.switchTo().alert();
			System.out.println("Insurance provider : "+alert.getText());
			alert.accept();
		}catch (NoAlertPresentException nape) {
			nape.printStackTrace();
		}
	}
	
	
	  public void viewInsuProvider() {
	  
	  actions = new Actions(driver); file = new FileReaderUtility();
	  
	  ElementWait.isElementVisible(FPAdmin);
	  actions.moveToElement(FPAdmin).perform();
	  
	  ElementWait.isElementVisible(InsuranceProvider);
	  actions.moveToElement(InsuranceProvider).click().build().perform();
	  
	  ElementWait.waitForOverlayDisappearExplicitly(overlay);
	  
	  ElementWait.isElementVisible(selectProvider); selectProvider.click();
	  
	  ElementWait.scrollToFindElement(driver,viewBtn); viewBtn.click();
	  
	  ElementWait.scrollToFindElement(driver,BackBtn ); BackBtn.click(); 
	  
	  }
	  
	  
		
		  public void editInsuProvider() {
		  
			  actions = new Actions(driver);
				file = new FileReaderUtility();

				ElementWait.isElementVisible(FPAdmin);
				actions.moveToElement(FPAdmin).perform();

				ElementWait.isElementVisible(InsuranceProvider);
				actions.moveToElement(InsuranceProvider).click().build().perform();

				ElementWait.waitForOverlayDisappearExplicitly(overlay);

				ElementWait.scrollToFindElement(driver,selectProvider );
				selectProvider.click();
				
				ElementWait.isElementVisible(editBtn);
				editBtn.click();

				ElementWait.isElementVisible(iproPolicyProvider);
				iproPolicyProvider.sendKeys(file.getDiscPMSTestData("iproPolicyProvider"));
				
				ElementWait.isElementVisible(iproAddress);
				iproAddress.sendKeys(file.getDiscPMSTestData("iproAddress"));

				ElementWait.isElementVisible(iproWebSite);
				iproWebSite.sendKeys(file.getDiscPMSTestData("iproWebSite"));

				ElementWait.isElementVisible(iproDescription);
				iproDescription.sendKeys(file.getDiscPMSTestData("iproDescription"));
				
				ElementWait.isElementVisible(saveBtn);
				saveBtn.click();
				
				try {
					ElementWait.waitToPopUpAlert();
					alert=driver.switchTo().alert();
					System.out.println("Edit Insurance provider : "+alert.getText());
					alert.accept();
				}catch (NoAlertPresentException nape) {
					nape.printStackTrace();
				}
		  
		  }
		  
	
	  public void deleteInsuPolicy() {
	  
	  actions = new Actions(driver); file = new FileReaderUtility();
	  
	  ElementWait.isElementVisible(FPAdmin);
	  actions.moveToElement(FPAdmin).perform();
	  
	  ElementWait.isElementVisible(InsuranceProvider);
	  actions.moveToElement(InsuranceProvider).click().build().perform();
	  
	  ElementWait.waitForOverlayDisappearExplicitly(overlay);
	  
	  ElementWait.isElementVisible(selectProvider); selectProvider.click();
	  
	  ElementWait.scrollToFindElement(driver,DeleteBtn); DeleteBtn.click();
	  
	  try { ElementWait.waitToPopUpAlert(); alert=driver.switchTo().alert();
	  System.out.println("Delete Insurance policy : "+alert.getText());
	  alert.accept(); }catch (NoAlertPresentException nape) {
	  nape.printStackTrace(); }
	  
	  }
	 
		 
	 
}

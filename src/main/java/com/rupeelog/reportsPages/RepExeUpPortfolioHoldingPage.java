package com.rupeelog.reportsPages;

import java.util.List;

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

public class RepExeUpPortfolioHoldingPage {

	WebDriver driver;
	Alert alert;
	FileReaderUtility file;
	Actions action;
	
	@FindBy(linkText = "Reports")
	@CacheLookup
	private WebElement Reports;
	
	@FindBy(linkText = "Large Report Execute")
	@CacheLookup
	private WebElement LargeReportExecute;

	@FindBy(id = "hldgPortfolio")
	@CacheLookup
	private WebElement holdingPortFRdoBtn;

	@FindBy(id = "hldgclientIdStr")
	@CacheLookup
	private WebElement holdingPortfolio;

	@FindBy(id = "holdingDate")
	@CacheLookup
	private WebElement holdingDate;

	@FindBy(id = "updateHolding")
	@CacheLookup
	private WebElement updateHoldingBtn;
	
	public RepExeUpPortfolioHoldingPage(WebDriver driver) {
			this.driver=driver;
	}
	
	public void updatePortfolioHolding() {
		file= new FileReaderUtility();
		action= new Actions(driver);
		
		ElementWait.isElementVisible(Reports);
		action.moveToElement(Reports).perform();
		
		ElementWait.isElementVisible(LargeReportExecute);
		action.moveToElement(LargeReportExecute).click().build().perform();
		
		ElementWait.isElementVisible(holdingPortFRdoBtn);
		if(holdingPortFRdoBtn.isSelected())
			System.out.println("Portfolio radio btn already selected");
		else {
			holdingPortFRdoBtn.click();
		}
		
		ElementWait.isElementVisible(holdingPortfolio);
		holdingPortfolio.sendKeys(file.getReportsTestData("holdingPortfolio"));
		
		List<WebElement> clientList=ElementWait.visibilityOfAllElements(driver.findElements(By.xpath("//ul[@id='ui-id-1']//li")));
		
		for(int i=0; i<clientList.size();i++) {
			if(clientList.get(i).getText().equalsIgnoreCase(file.getReportsTestData("portfolio")))
				clientList.get(i).click();
			System.out.println("Holding portfolio :  "+clientList.get(i).getText());
			break;
		}
		
		ElementWait.isElementVisible(holdingDate);
		holdingDate.sendKeys(file.getReportsTestData("holdingDate"));
		
		ElementWait.isElementVisible(updateHoldingBtn);
		updateHoldingBtn.click();
		
		ElementWait.waitToPopUpAlert();
		try {
		alert= driver.switchTo().alert();
		System.out.println("Update portfolio Holding : "+alert.getText());
		alert.accept();
		}catch (NoAlertPresentException nape) {
			nape.printStackTrace();
		}
	}
	
}

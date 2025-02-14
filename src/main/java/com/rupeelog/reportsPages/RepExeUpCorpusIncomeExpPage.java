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

import com.rupeelog.utilty.ElementWait;
import com.rupeelog.utilty.FileReaderUtility;

public class RepExeUpCorpusIncomeExpPage {

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

	@FindBy(id = "corpPortfolio")
	@CacheLookup
	private WebElement corpPortfolioRdoBtn;

	@FindBy(id = "corpClientIdStr")
	@CacheLookup
	private WebElement corpPortfolio;

	@FindBy(id = "corpIncExpDate")
	@CacheLookup
	private WebElement corpDate;

	@FindBy(id = "updateCorpIncExpense")
	@CacheLookup
	private WebElement updateCorpIncExpenseBtn;
	
	public RepExeUpCorpusIncomeExpPage(WebDriver driver) {
			this.driver=driver;
	}
	
	public void updateCorpusIncomeExp() {
		file= new FileReaderUtility();
		action= new Actions(driver);
		
		ElementWait.isElementVisible(Reports);
		action.moveToElement(Reports).perform();
		
		ElementWait.isElementVisible(LargeReportExecute);
		action.moveToElement(LargeReportExecute).click().build().perform();
		
		ElementWait.isElementVisible(corpPortfolioRdoBtn);
		if(corpPortfolioRdoBtn.isSelected())
			System.out.println("Portfolio radio btn already selected");
		else {
			corpPortfolioRdoBtn.click();
		}
		
		ElementWait.isElementVisible(corpPortfolio);
		corpPortfolio.sendKeys(file.getReportsTestData("corpPortfolio"));
		
		List<WebElement> clientList=ElementWait.visibilityOfAllElements(driver.findElements(By.xpath("//ul[@id='ui-id-3']//li")));
		
		for(int i=0; i<clientList.size();i++) {
			if(clientList.get(i).getText().equalsIgnoreCase(file.getReportsTestData("selectCorpPortfolio")))
				clientList.get(i).click();
			System.out.println("corp portfolio :  "+clientList.get(i).getText());
			break;
		}
		
		ElementWait.isElementVisible(corpDate);
		corpDate.sendKeys(file.getReportsTestData("corpDate"));
		
		ElementWait.isElementVisible(updateCorpIncExpenseBtn);
		updateCorpIncExpenseBtn.click();
		
		ElementWait.waitToPopUpAlert();
		try {
		alert= driver.switchTo().alert();
		System.out.println("Update corpus income expense : "+alert.getText());
		alert.accept();
		}catch (NoAlertPresentException nape) {
			nape.printStackTrace();
		}
	}
	
}
